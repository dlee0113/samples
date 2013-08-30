package test;

import java.sql.Timestamp;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class ConsumerListener {
	// URL of the JMS server
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

	// Name of the queue we will receive messages from
	private static String subject = "TESTQUEUE";

	public static void main(String[] args) throws JMSException {
		// Getting JMS connection from the server
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		connection.start();

		// Creating session for seding messages
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

		// Getting the queue 'TESTQUEUE'
		Destination destination = session.createQueue(subject);

		// MessageConsumer is used for receiving (consuming) messages
		MessageConsumer consumer = session.createConsumer(destination);

		// Here we receive the message.
		// By default this call is blocking, which means it will wait
		// for a message to arrive on the queue.
//		Message message = consumer.receive();

		// There are many types of Message and TextMessage
		// is just one of them. Producer sent us a TextMessage
		// so we must cast to it to get access to its .getText()
		// method.
//		if (message instanceof TextMessage) {
//			TextMessage textMessage = (TextMessage) message;
//			System.out.println("Received message '" + textMessage.getText() + "'");
//		}

//		ConsumerListener listener = new ConsumerListener();
//		consumer.setMessageListener(listener);
		
//		MessageListenerImpl listener = new MessageListenerImpl();
//		consumer.setMessageListener(listener);
		
		MyConsumer myConsumer = new MyConsumer();
		connection.setExceptionListener(myConsumer);
		consumer.setMessageListener(myConsumer);
		
		// commented out to keep a connection open
//		connection.close();
	}
	
//    public void onMessage(Message message){
//        try{
//            TextMessage textMessage = (TextMessage)message;
//            String text = textMessage.getText( );
//            System.out.println("MessageListenerImpl");
//            System.out.println(text);
//        } catch (JMSException jmse) {
//        	jmse.printStackTrace( );
//        }
//    }
	
	private static class MyConsumer implements MessageListener, ExceptionListener {

		synchronized public void onException(JMSException ex) {
			System.out.println("JMS Exception occured.  Shutting down client.");
			System.exit(1);
		}

		public void onMessage(Message message) {
			if (message instanceof TextMessage) {
				TextMessage textMessage = (TextMessage) message;
				try {
					java.util.Date date= new java.util.Date();
//					System.out.println(new Timestamp(date.getTime()));
					System.out.println(new Timestamp(date.getTime()) + " Received message: " + textMessage.getText());
				} catch (JMSException ex) {
					System.out.println("Error reading message: " + ex);
				}
			} else {
				System.out.println("Received: " + message);
			}
		}
	}
}
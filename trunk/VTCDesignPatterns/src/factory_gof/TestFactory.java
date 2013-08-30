package factory_gof;

public class TestFactory 
{
  public static void main(String args[])
  {
    SecureFactory factory;

    factory = new SecureFactory();
    Connection connection = factory.createConnection("Oracle");
    System.out.println("You're connecting with " +  connection.description());
    
    connection = factory.createConnection("SQL Server");
    System.out.println("You're connecting with " +  connection.description());
    
    connection = factory.createConnection("MySQL");
    System.out.println("You're connecting with " +  connection.description());
  }
}

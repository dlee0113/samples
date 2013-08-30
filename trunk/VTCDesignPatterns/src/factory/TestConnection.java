package factory;

public class TestConnection {
	public static void main(String args[]) {
		FirstFactory factory;

		factory = new FirstFactory("Oracle");
		Connection connection = factory.createConnection();
		System.out.println("You're connecting with " + connection.description());

		factory = new FirstFactory("SQL Server");
		connection = factory.createConnection();
		System.out.println("You're connecting with " + connection.description());

		factory = new FirstFactory("MySQL");
		connection = factory.createConnection();
		System.out.println("You're connecting with " + connection.description());

	}
}

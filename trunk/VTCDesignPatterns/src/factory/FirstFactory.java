package factory;

public class FirstFactory {
	String type;

	public FirstFactory(String t) {
		type = t;
	}

	// handle volatile code
	public Connection createConnection() {
		if (type.equals("Oracle")) {
			return new OracleConnection();
		} else if (type.equals("SQL Server")) {
			return new SqlServerConnection();
		} else {
			return new MySqlConnection();
		}
	}
}

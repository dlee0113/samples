package factory_gof;

public class SecureMySqlConnection extends Connection {
	public SecureMySqlConnection() {
	}

	public String description() {
		return "MySQL secure";
	}
}

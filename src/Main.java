import SingletonDesign.DoubleCheckLooking.DatabaseConnection;

public class Client {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}

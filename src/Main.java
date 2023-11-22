import SingletonDesign.DoubleCheckLooking.DatabaseConnection;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}

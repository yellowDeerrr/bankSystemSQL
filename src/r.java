import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class r {
    private final static String jdbcURL = "jdbc:mysql://root:CFkxSs41OCBFGtxtIc3S@containers-us-west-46.railway.app:7515/railway";
    private final static String userName = "root";
    private final static String password = "D4m5psyU8XArD2UGvalc";


    private static Connection connection;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(jdbcURL, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        viewAllInfoAboutUserCard();
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void viewAllInfoAboutUserCard() {
        Scanner in = new Scanner(System.in);

        try {
            Statement statement = getConnection().createStatement();
            statement.executeUpdate("create table taras (id integer)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

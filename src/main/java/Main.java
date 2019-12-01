import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//         hello from git
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/users";
        String user = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from person");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.print(resultSet.getString(1) + " ");
            System.out.print(resultSet.getString(2) + " ");
            System.out.println(resultSet.getString(3));
        }
        connection.close();

    }
}

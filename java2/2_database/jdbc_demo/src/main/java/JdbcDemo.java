import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection(
//                "jdbc:postgresql://localhost/emp",
//                "postgres",
//                "123,123");

        Connection connection = DriverManager.getConnection(
                "jdbc:h2:mem:serjer",
                "sa",
                "");



        Statement statement = connection.createStatement();

        statement.executeUpdate("DELETE FROM employees WHERE id = 7;");
//
//        statement.setInt(1, 6);
//        statement.execute();
//        statement.close();

//        PreparedStatement statement = connection.prepareStatement(
//                "DELETE FROM employees WHERE id = ? AND first_name = ?;");
//
//        statement.setInt(1, 1);
//        statement.setString(2, "Sergej");
//
//        statement.execute();

//        Statement statement = connection.createStatement();
//
//   //     statement.setInt(1, 1);
//
        ResultSet rs = statement.executeQuery("SELECT * FROM employees");
//
        while (rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("first_name"));
        }
//        System.out.println(rs.getType());

//        Statement statement =  connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_UPDATABLE);
//
//        ResultSet rs = statement.executeQuery("SELECT * FROM employees;");
//
//        while (rs.next()) {
//            System.out.println(rs.getString("first_name"));
//            rs.updateString("first_name", rs.getString("first_name").toUpperCase());
//            rs.updateRow();
//        }
//
//        System.out.println("DONE");
    }

}
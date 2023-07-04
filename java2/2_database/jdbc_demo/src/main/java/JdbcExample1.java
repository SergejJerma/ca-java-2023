import java.sql.*;

public class JdbcExample1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost/emp",
                "postgres",
                "123,123");

        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("select p.pavadinimas, d.vardas, d.pavarde\n" +
                "from projektas p \n" +
                "join darbuotojas d \n" +
                "on d.projektas_id = p.id");

        String temp = "";
        String dep = "";
        while (rs.next()) {
            dep = rs.getString(1);
            if (!temp.equalsIgnoreCase(dep)) {
                System.out.println("===========");
                System.out.println(dep);
                System.out.println("-----------");
                temp = dep;
            }
            System.out.println(rs.getString(2) + " " + rs.getString(3));
        }

        String sqlUpdate = "update darbuotojas\n" +
                "SET projektas_id = 3\n" +
                "WHERE asmenskodas = '38254115544';";

//        String sqlInsert = "INSERT INTO DARBUOTOJAS VALUES\n" +
//                "('38101122555', 'Sergej', 'Petraitis', DATE '2009-10-30', DATE '1981-01-11', 'Testuotojas', 'Testavimo', 1);";

//        statement.executeUpdate(sqlInsert);
        statement.executeUpdate(sqlUpdate);

//        PreparedStatement preparedStatement = connection.prepareStatement(
//                "INSERT INTO DARBUOTOJAS VALUES(?, ?, ?, ?, ?, ?, ?, ?);");
//
//        preparedStatement.setString(1,"38254115544");
//        preparedStatement.setString(2,"Sergej");
//        preparedStatement.setString(3,"Jonaitis");
//        preparedStatement.setDate(4, Date.valueOf("2009-10-30"));
//        preparedStatement.setDate(5, Date.valueOf("1981-01-11"));
//        preparedStatement.setString(6,"Dev");
//        preparedStatement.setString(7,"Dev");
//        preparedStatement.setInt(8,1);
//
//        preparedStatement.execute();

        statement.close();

//        PreparedStatement statement = connection.prepareStatement(
//                "DELETE FROM employees WHERE id = ? AND first_name = ?;");
//
//        statement.setInt(1, 7);
//        statement.setString(2, "Sergej");
//
//        statement.execute();
//
////        Statement statement = connection.createStatement();
////
////   //     statement.setInt(1, 1);
////
//        ResultSet rs = statement.executeQuery("SELECT * FROM employees");
//////
//        while (rs.next()) {
//            System.out.println(rs.getString("id"));
//            System.out.println(rs.getString("first_name"));
//        }
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
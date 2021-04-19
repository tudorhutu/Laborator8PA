import java.sql.*;

public class ConnectionConfiguration {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "1234");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        DatabaseMetaData dbmd = connection.getMetaData();
//        ResultSet rs = dbmd.getTables(null, null, null, null);
//        Statement stmt = connection.createStatement();
//        String sql = "SELECT * FROM world.city WHERE CountryCode = 'RUS'";
//        rs = stmt.executeQuery(sql);
//        while (rs.next()) {
//            String name = rs.getString("name");
//            String id = rs.getString("id");
//            String countryCode = rs.getString("CountryCode");
//            String district = rs.getString("District");
//            String pop = rs.getString("Population");
//            System.out.println(id + ", " + name + ", " + countryCode + ", " + district + ", " + pop);
//        }

//       String sql="SELECT id FROM movies";
//        rs = stmt.executeQuery(sql);
//        String id="asd";
//        while (rs.next()) {
//            id = rs.getString("id");
//        }
//        //System.out.println(id);
//        int aux = Integer.parseInt(id);
//        aux++;
//        id=Integer.toString(aux);
//        sql = "INSERT INTO `movies`.`movies` (`id`, `title`, `release_date`, `duration`, `Score`) VALUES ("+id+", 'amogus 3', '2019-06-15', '4 hours', '10')";
//        stmt.executeUpdate(sql);
        return connection;
    }
}

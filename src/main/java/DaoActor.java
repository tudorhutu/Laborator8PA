import java.sql.SQLException;
import java.sql.*;

public class DaoActor implements DAO {
    @Override
    public void insert(String s) throws SQLException {
        Connection connection;
        connection = ConnectionConfiguration.getConnection();
        DatabaseMetaData dbmd = connection.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, null, null);
        Statement stmt = connection.createStatement();
        String sql = "INSERT INTO `movies`.`actors` (`idfilm`, `stars`, `director`) VALUES (" + s;
        stmt.executeUpdate(sql);
    }

    @Override
    public void findid(String id) throws SQLException {
        System.out.println("The stars and director respectively from the movie with the id " + id + " are:\n");
        Connection connection;
        connection = ConnectionConfiguration.getConnection();
        DatabaseMetaData dbmd = connection.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, null, null);
        Statement stmt = connection.createStatement();
        String sql = "SELECT * FROM actors WHERE idfilm =" + id;
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String showId = rs.getString("idfilm");
            String showStars = rs.getString("stars");
            String showDirector = rs.getString("director");
            System.out.println(showId + " " + showStars + " " + showDirector);
        }
        System.out.println();
    }

    @Override
    public void findname(String name) throws SQLException {

    }
}

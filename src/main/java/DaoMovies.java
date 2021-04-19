import java.sql.*;

public class DaoMovies implements DAO {


    @Override
    public void insert(String s) throws SQLException {
        Connection connection;
        connection = ConnectionConfiguration.getConnection();
        DatabaseMetaData dbmd = connection.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, null, null);
        Statement stmt = connection.createStatement();
        String sql = "SELECT id FROM movies";
        rs = stmt.executeQuery(sql);
        String id = "0";
        while (rs.next()) {
            id = rs.getString("id");
        }
        //System.out.println(id);
        int aux = Integer.parseInt(id);
        aux++;
        id = Integer.toString(aux);
        sql = "INSERT INTO `movies`.`movies` (`id`, `title`, `release_date`, `duration`, `Score`) VALUES (" + id + s;
        stmt.executeUpdate(sql);

    }

    @Override
    public void findid(String id) throws SQLException {
        System.out.println("The movies with the id "+id+" are:\n");
        Connection connection;
        connection = ConnectionConfiguration.getConnection();
        DatabaseMetaData dbmd = connection.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, null, null);
        Statement stmt = connection.createStatement();
        String sql = "SELECT * FROM movies WHERE id ="+id;
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String showId = rs.getString("id");
            String showTitle = rs.getString("title");
            String showDate = rs.getString("release_date");
            String showDuration = rs.getString("duration");
            String showScore = rs.getString("Score");
            System.out.println(showId+" "+showTitle+" "+showDate+" "+showDuration+" "+showScore);
        }
        System.out.println();
    }

    @Override
    public void findname(String name) throws SQLException {
        System.out.println("The movies with the title "+name+" are:\n");
        Connection connection;
        connection = ConnectionConfiguration.getConnection();
        DatabaseMetaData dbmd = connection.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, null, null);
        Statement stmt = connection.createStatement();
        String sql = "SELECT * FROM movies WHERE title ="+name;
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String showId = rs.getString("id");
            String showTitle = rs.getString("title");
            String showDate = rs.getString("release_date");
            String showDuration = rs.getString("duration");
            String showScore = rs.getString("Score");
            System.out.println(showId+" "+showTitle+" "+showDate+" "+showDuration+" "+showScore);
        }
        System.out.println();
    }

}

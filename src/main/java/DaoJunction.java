import java.sql.*;

public class DaoJunction implements DAO {
    @Override
    public void insert(String s) throws SQLException {
        Connection connection;
        connection = ConnectionConfiguration.getConnection();
        DatabaseMetaData dbmd = connection.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, null, null);
        Statement stmt = connection.createStatement();
        String sql = "INSERT INTO `movies`.`junction` (`idmovies`, `idgenre`) VALUES (" + s;
        stmt.executeUpdate(sql);
    }

    @Override
    public void findid(String id) throws SQLException {

    }

    @Override
    public void findname(String name) throws SQLException {

    }
}

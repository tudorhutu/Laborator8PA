import java.sql.SQLException;

public interface DAO{
    public void insert(String s) throws SQLException;
    public void findid(String id) throws SQLException;
    public void findname(String name) throws SQLException;
}

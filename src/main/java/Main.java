import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //ConnectionConfiguration.getConnection();
        DaoMovies test = new DaoMovies();
        //test.insert(", 'the nice guys', '2016-09-15', '1 h 56 min', '10')");
        test.findid("4");
        test.findname("'fight club'");
        DaoGenres test1 = new DaoGenres();
        //test1.insert(", 'thriller')");
        test1.findid("1");
        test1.findname("'horror'");
        DaoActor test2 = new DaoActor();
        DaoJunction test3 = new DaoJunction();
        //adaugate deja
        //test2.insert("'1', 'Brad Pitt, Edward Norton','David Fincher')");
        //test2.insert("'2', 'Steve Buscemi, Quentin Tarantino','Quentin Tarantino')");
        //test2.insert("'3', 'Kurt Russell, Keith David','John Carpenter')");
        //test3.insert("'3','2')");
        //test3.insert("'4','1')");
        test2.findid("1");
        //TODO de adaugat la ascultare
        //test2.insert("'4', 'Ryan Gosling, Russel Crowe','Shane Black')");
        //test3.insert("'3','2')");
        //test3.insert("'4','1')");
        // test3.insert("'1','3')");
        // test3.insert("'2','3')");
        while (true)
        {test.insert(", 'test for visualVM', '2016-09-15', '1 h 56 min', '10')");}

    }
}

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Handler<E> {
    List<E> handle(ResultSet set) throws SQLException, ClassNotFoundException;
}

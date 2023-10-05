package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Handler<E> {
    //建议使用泛型
    List<E> handle(ResultSet set) throws SQLException;
}

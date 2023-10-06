package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Handler<E> {
    //建议使用泛型
    //写成这样的原因，apache DbUtil 就这么写的，纯粹抄而已
    E handle(ResultSet set) throws SQLException;
}

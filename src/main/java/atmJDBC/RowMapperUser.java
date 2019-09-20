package atmJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperUser {

    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Customer(resultSet.getInt(1),
                resultSet.getInt(2),
                resultSet.getDouble(3));
    }
}

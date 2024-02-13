package Models;

import java.sql.Connection;

public interface IConnector {
    Connection createConnection();
}

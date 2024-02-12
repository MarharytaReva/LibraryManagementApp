package Models;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class SqlConnector {
    private static String getConnectionString()
    {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String iconConfigPath = rootPath + "config.xml";
        Properties iconProps = new Properties();
        try {
            iconProps.loadFromXML(new FileInputStream(iconConfigPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String connectionStr = iconProps.getProperty("connection_string"); //DESKTOP-1QOI89H\Tat1a
        System.out.println(connectionStr);
        return connectionStr;
    }
    public static Connection createConnection()
    {
        String connectionString = getConnectionString();
        Connection sqlConnection;
        try {
            sqlConnection =
                    DriverManager.getConnection(connectionString);

            return sqlConnection;
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
            return null;
        }
    }
}

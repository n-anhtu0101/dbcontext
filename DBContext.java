/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DBContext {

    public DBContext() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:sqlserver://" + SERVER_NAME + ":" + PORT_NUMBER + ";databaseName=" + DB_NAME;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
    private final Connection connection;

    private final String SERVER_NAME    = "localhost";
    private final String DB_NAME        = "";
    private final String PORT_NUMBER    = "1433";
    private final String USERNAME       = "sa";
    private final String PASSWORD       = "123456";
}

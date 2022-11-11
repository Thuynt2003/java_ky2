package dataase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Connector {
    public final static String connectionString = "jdbc:mysql://localhost:3306/student";
    public final static String user = "root";
    public final static String pwd = "root";

    private Connection conn;

    public Connector()throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(connectionString, user, pwd);
    }

    private Statement getStatement() throws Exception{
        return this.conn.createStatement();
    }

    public ResultSet query(String sql) throws Exception{
        return this.getStatement().executeQuery(sql);
    }

    public boolean execute(String sql, ArrayList parameters) throws Exception{
        return this.getStatement().executeUpdate(sql) > 0;
    }
}


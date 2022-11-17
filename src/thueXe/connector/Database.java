package thueXe.connector;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    public final static String connectionString = "jdbc:mysql://localhost:3306/thuexe";
    public final static String user = "root";
    public final static String pwd = "";
    private Connection conn;
    public Database() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(connectionString, user, pwd);
    }

    private Statement getStatement() throws Exception{
        return this.conn.createStatement();
    }

    public ResultSet query(String sql) throws Exception{
        return this.getStatement().executeQuery(sql);
    }

    public void execute(String sql, ArrayList parameters) throws Exception{
        this.getStatement().executeUpdate(sql);
    }

    // prepared statement
    private PreparedStatement getPreparedStatement(String sql) throws Exception{
        return this.conn.prepareStatement(sql);
    }



}

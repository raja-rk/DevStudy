package Database;
import java.util.*;
import java.sql.DriverManager;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.driver");
        Connection con = DriverManager.getConnection("","", "");
    }
}

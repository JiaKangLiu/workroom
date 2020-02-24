package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	private static String DRIVERNAME = null;
    private static String URL = null;

    private static String USER = null;
    private static String PASSWORD = null;

    private static Connection conn = null;

    static {
        try {
            Properties props = new Properties();
            InputStream input = JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties");
            props.load(input);

            DRIVERNAME = props.getProperty("drivername");
            URL = props.getProperty("url");
            USER = props.getProperty("user");
            PASSWORD = props.getProperty("password");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws Exception {

        if (conn != null) {
            return conn;
        }

        Class.forName(DRIVERNAME);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;
    }

    public static void closeResource(Connection conn, ResultSet rs, PreparedStatement st) throws SQLException {
        st.close();
        rs.close();
        conn.close();
        st=null;
        rs=null;
        conn=null;
    }

    public static void closeResource(Connection conn, PreparedStatement st) throws SQLException {
        st.close();
        conn.close();
        st=null;
        conn=null;
    }
}

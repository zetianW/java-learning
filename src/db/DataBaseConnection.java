package db;

import java.sql.*;

/**
 * Description 数据库连接
 *
 * @author Zetian Wang
 * @date 2019/09/14
 **/
public class DataBaseConnection {
    /**
     * mysql驱动
     */
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";

    /**
     * 数据库的链接
     */
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test?";
    /**
     * 意思就是告诉JAVA你要连接的数据库的参数，你可以这样理解这个URL，
     * jdbc:sqlserver类似于网络协议，让Java知道要干什么；localhost:3306是主机地址及端口，
     * 让java知道目标在哪儿；后面的就是做这件事情不可缺少的东西，少了这些，数据库就会不理睬java的请求。
     */
    private static final String DB_USER = "root";
    /**
     * 密码
     */
    private static final String PASSWORD = "root";

    public void dbConnection(String sqlString) throws SQLException {
        Connection conn = null;
        ResultSet resultSet = null;
        try {
            //1.加载数据库连接驱动（mysql）
            Class.forName(DB_DRIVER);

            //2.获取数据库连接对象（已知连接哪个数据库）
            conn = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
            if (conn != null) {
                System.out.println("数据库连接成功");
            } else {
                System.out.println("数据库连接失败");
                return;
            }

            if (sqlString != null && !"".equals(sqlString)) {
                System.out.println("执行的sql语句：" + sqlString);
                //3.获取sql执行器（告诉要执行的sql语句）
                PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
                //4.sql执行器开始执行
                preparedStatement.execute();
            } else {
                System.out.println("sql为空");
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (conn != null) {
                //执行完，关闭连接以免占用内存资源
                conn.close();
                System.out.println("关闭连接");
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        final String updateSql = "UPDATE %s SET %s WHERE %s;";
        final String insertSql = "insert into %s (%s) values (%s)";

        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        String sql = String.format(insertSql, "user", "user_name,password", "'world','hello'");
        //String sql = String.format(updateSql, "user", "user_name='root4'", "id=2");
        dataBaseConnection.dbConnection(sql);

    }
}
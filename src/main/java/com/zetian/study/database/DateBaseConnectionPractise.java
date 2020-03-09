package com.zetian.study.database;

import java.sql.*;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/03/06
 **/
public class DateBaseConnectionPractise {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/practise?";
    private static final String DB_USER = "root";
    private static final String PASSWORD = "root";

    public void dbConnection(String sqlString) throws SQLException {
        Connection conn = null;
        ResultSet resultSet = null;
        try {
            Class.forName(DB_DRIVER);
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

        DateBaseConnectionPractise dataBaseConnection = new DateBaseConnectionPractise();
        String sql = String.format(insertSql, "math", "one,two", "'world','hello'");
        //String sql = String.format(updateSql, "math", "user_name='root4'", "id=2");
        dataBaseConnection.dbConnection(sql);

    }
}

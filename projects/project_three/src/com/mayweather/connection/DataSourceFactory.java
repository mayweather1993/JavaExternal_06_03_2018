package com.mayweather.connection;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

public class DataSourceFactory {
    public static DataSource getMySQLDataSource() {
        MysqlDataSource mysqlDS = new MysqlDataSource();
        mysqlDS.setURL("jdbc:mysql://localhost:3306/library");
        mysqlDS.setUser("root");
        mysqlDS.setPassword("password");
        return mysqlDS;
    }
}

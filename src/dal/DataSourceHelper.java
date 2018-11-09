/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.sql.DataSource;

/**
 *
 * @author ms
 */
public class DataSourceHelper {
      public static DataSource createDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setServerName(".\\SQLEXPRESS");
        dataSource.setDatabaseName("PPPK");
        dataSource.setUser("sa");
        dataSource.setPassword("SQL");
        return dataSource;
      }
}
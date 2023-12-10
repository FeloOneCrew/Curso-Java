package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private  DataSource datasource;
	
	public ConnectionFactory() {
		var poolDataSource = new ComboPooledDataSource();
		poolDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
		poolDataSource.setUser("root");
		poolDataSource.setPassword("**afgh3362**");
		
		this.datasource = poolDataSource;
	}
	
	 //Patron de diseño, encapsula la logica en un solo punto
	public Connection recuperaConexion() throws SQLException {
		  return this.datasource.getConnection();
	}
	
}

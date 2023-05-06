package jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private DataSource datasource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotelalura?useTimeZone=true&serverTimeZone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("nico1989");
		
		this.datasource = comboPooledDataSource;
	}
	
	public Connection recuperaConexion() {
		try {
			return this.datasource.getConnection();
		} catch (SQLException e) {			
			throw new RuntimeException(e);
		}
	}
	
}

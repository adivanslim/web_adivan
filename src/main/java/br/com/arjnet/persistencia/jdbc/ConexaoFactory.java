package br.com.arjnet.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fweb", "postgres", "postgre");
		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}

}

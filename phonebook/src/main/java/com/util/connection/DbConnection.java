package com.util.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbConnection {

	public static final Connection getConnection() throws NamingException,
			SQLException { 

		InitialContext ic = new InitialContext();
		Context envCtx = (Context) ic.lookup("java:comp/env");
		return ((DataSource) envCtx.lookup("jdbc/PhoneBook")).getConnection();
	}
 
}

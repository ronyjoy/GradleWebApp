package com.ws.rony;

import javax.naming.NamingException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.phonebook.Person;
import com.util.connection.DbConnection;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws java.io.IOException {
		String pathInfo = req.getPathInfo();
		System.out.println("Path" + pathInfo);
		Gson gson = new Gson();
		List<Person> phoneBook = null;
		try {
			phoneBook = getPhoneBook();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = res.getWriter();
		for (Person person : phoneBook) {
			String jsonOutput = gson.toJson(person);
			System.out.println("Phone Book do get" + jsonOutput);
			res.setContentType("application/json");
			out.print(jsonOutput);
			out.print("\n");
		}
		out.flush();

	}

	private static List<Person> getPhoneBook() throws NamingException, SQLException {
			Connection con = DbConnection.getConnection();
			System.out.println(con);
			Statement stmt = null;
			ResultSet rs = null;
			List<Person> phoneBook = new ArrayList<Person>();
			try {
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from person");
			
			while(rs.next()) {
				Person person = new Person( rs.getString("fname"), rs.getString("lname"),rs.getString("phonenumber"));
			    phoneBook.add(person);
			}
			} finally {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			}
			return phoneBook;
			}
}
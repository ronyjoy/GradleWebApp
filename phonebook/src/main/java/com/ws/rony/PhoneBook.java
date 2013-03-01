
package com.ws.rony;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.phonebook.Entry;
import java.io.PrintWriter;

public class PhoneBook extends HttpServlet {

	public void doGet (HttpServletRequest req, HttpServletResponse res) throws java.io.IOException{
		String pathInfo= req.getPathInfo();
		System.out.println("Path"+ pathInfo);
		Entry entry = new Entry("rony","joy");
		Gson gson = new Gson();
		String jsonOutput = gson.toJson(entry);
		System.out.println("Phone Book do get"+ jsonOutput);
		res.setContentType("application/json");
		PrintWriter out = res.getWriter();
		out.print(jsonOutput);
		out.flush();
		
	} 



}
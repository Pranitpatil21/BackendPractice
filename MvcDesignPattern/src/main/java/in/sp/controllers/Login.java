package in.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import in.sp.dbcon.DbConnection;
import in.sp.resource.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       PrintWriter pw = resp.getWriter();
	       resp.setContentType("text/html");
 
		String myemail = req.getParameter("email1");
	       String mypass = req.getParameter("pass1");
	       
	       try {
	    	   Connection con = DbConnection.getConnection();
	    	   
	    	   String select_sql_query = "SELECT * FROM register WHERE email=? AND password=?";
	    	   PreparedStatement ps = con.prepareStatement(select_sql_query);
	    	   ps.setString(1, myemail);
	    	   ps.setString(2, mypass);
	    	   
	    	   ResultSet rs = ps.executeQuery();
	    	   if(rs.next()) {
	    		   User user = new User();
	    		   user.setCity(rs.getString("city"));
	    		   user.setEmail(rs.getString("email"));
	    		   user.setName(rs.getString("name"));
	    		   
	    		   HttpSession hs = req.getSession();
	    		   hs.setAttribute("session_user", user);
	    		   
	    		   RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
	    		   rd.include(req, resp);
	    		   
	    	   }else {
	    		   pw.println("<h3 style='color:red'>Email Id And Password Doesn't mathch</h3>");
	    		   RequestDispatcher rd = req.getRequestDispatcher("/login.html");
	               rd.include(req, resp);
	    	   }
	       }catch(Exception e) {
	    	   e.printStackTrace();
	       }
	} 
}

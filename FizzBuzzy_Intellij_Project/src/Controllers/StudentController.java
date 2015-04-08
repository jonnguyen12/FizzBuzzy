package Controllers;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import Database.StudentDB;
import Models.Student;

public class StudentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "Login";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("Login")) {
            url = "/login_thanks.jsp";
        } 
        else if (action.equals("Register")) {
            // get parameters from the request
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            //store data in Student object
            Student student = new Student(username, password, email);
                              
            //validate the parameters
            String message = "";
            if (username == null || email == null || password == null | username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                message = "Please fill out all the text boxes";
                url = "/index.jsp";
            } else {
                message = null;
                url = "/profile.jsp";
                StudentDB.insert(student);
           
            }
            request.setAttribute("student", student);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
}
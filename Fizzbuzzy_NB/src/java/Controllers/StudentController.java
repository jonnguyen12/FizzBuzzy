package Controllers;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import Database.StudentDB;
import Database.StudentIO;
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
            // get parameters from the request
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            //store data in Student object
            Student student = null;
                              
            //validate the parameters
            String message = "";
            if (username == null || email == null || password == null | username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                message = "Please fill out all the text boxes";
                url = "/index.jsp";
            } else {
               
                student = StudentDB.selectStudent(email);
                
                if (student == null) {
                    message = "You don't have any profile yet. Please recheck your credentials"
                            + " and sign in again, or register for a new account.";
                    url = "/index.jsp";
                       
                } else {
                    message = "Sign in successfully";
                    url = "/profile.jsp";
                    registerStudent(request, response);
                }

            }
            request.setAttribute("student", student);
            request.setAttribute("message", message);
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
                message = "Register successfully";
                url = "/profile.jsp";
                StudentDB.insert(student);
                registerStudent(request, response); //add cookies

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
    
    
    private String registerStudent (HttpServletRequest request, HttpServletResponse response)
    {
        //get the student data
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        //store data in a student object
        Student student = new Student(username, password, email);
        
        //Write the student object to a file
        ServletContext sc = getServletContext();
        String path = sc.getRealPath("/WEB-INF/EmailList.txt");
        StudentIO.add(student, path);
        
       
        //store the student object as a session attribute
        HttpSession session = request.getSession();
        session.setAttribute("email", email );
        session.setAttribute("username", username);
        session.setAttribute("student", student);
        
        //add a cookie that stores the user's email to the browser
        Cookie c = new Cookie ("emailCookie", email);
        c.setMaxAge(60 * 60 * 24); // set age to 1 day
        c.setPath("/");
        response.addCookie(c);
        
        //create and return a URL for the appropriate page
        String url = "/profile.jsp";
        return url;
        
    }
    
    private String deleteCookies (HttpServletRequest request, HttpServletResponse response)
    {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies)
        {
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        String url = "/profile.jsp";
        return url;
    }
}
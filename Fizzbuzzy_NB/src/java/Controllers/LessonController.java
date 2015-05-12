/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.StudentDB;
import Models.Student;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author phucnguyen
 */
public class LessonController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/lesson/lesson0.html";
        
//        HttpSession session = request.getSession();
//        String username = (String) session.getAttribute("username");
//        String email = (String) session.getAttribute("email");
//        Student student = new Student(email, null, username);
//        String username = request.getParameter("username");
//        Student student = new Student();
//        student.setUsername(username);
//        request.setAttribute("student", student);
//        
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

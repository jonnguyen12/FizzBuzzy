/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.StudentDB;
import Database.StudentIO;
import Models.Student;
import Utilities.CookieUtil;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author phucnguyen
 */
public class ProgressController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/profile.jsp";
        
        //Get score
        String s = request.getParameter("quizscore");
        int score = Integer.parseInt(s);
        
        //Session and cookies
        HttpSession session = request.getSession();
        Student student = (Student) session.getAttribute("student");
        
        if (student == null) {
            Cookie[] cookies = request.getCookies();
            String email = CookieUtil.getCookieValue(cookies, "emailCookie");
            
            if (email == null || email.equals("")) {
                url = "";
            }
            else {
                ServletContext sc = getServletContext();
                String path = sc.getRealPath("/WEB-INF/EmailList.txt");
                student = StudentIO.getStudent(email, path);
                //Get student and update the score
//        student = StudentDB.selectStudent(student.getEmail());
        student.setScore(score);
        StudentDB.updateScore(student);
        
        request.setAttribute("student", student);
        
            }
        } else {
            //Get student and update the score
        student.setScore(score);
//        student = StudentDB.selectStudent(student.getEmail());
        StudentDB.updateScore(student);        
        request.setAttribute("student", student);
        
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

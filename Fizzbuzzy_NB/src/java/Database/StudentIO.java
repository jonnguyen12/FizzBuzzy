package Database;

import Models.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author phucnguyen
 */
public class StudentIO {
    public static boolean add (Student student, String filepath)
    {
        try {
            File file = new File(filepath);
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            out.println(student.getEmail() + "|"
                    + student.getUsername() + "|"
                    + student.getPassword());

            out.close();
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }        
    }
    
    public static Student getStudent(String email, String filepath) {
        try {
            File file = new File(filepath);
            BufferedReader in = new BufferedReader(
                    new FileReader(file));
            Student student = new Student();
            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                if (t.countTokens() < 3) {
                    return new Student("", "", "");
                }
                String token = t.nextToken();
                if (token.equalsIgnoreCase(email)) {
                    String username = t.nextToken();
                    String password = t.nextToken();
                    student.setEmail(email);
                    student.setUsername(username);
                    student.setPassword(password);
                }
                line = in.readLine();
            }
            in.close();
            return student;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}

package ServletPractice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPractice", urlPatterns = "/login")
public class ServletPractice extends HttpServlet {

    public void init(){

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("web/index.html");
        String email = request.getParameter("email");
        //name used inside the input tag
        String password = request.getParameter("password");
        if(password.isEmpty()){
            System.out.println("Please enter your password");
        }

        System.out.println("Your email is " + email + " Your password is: " + password);

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
    public void doDestroy(){

    }
}

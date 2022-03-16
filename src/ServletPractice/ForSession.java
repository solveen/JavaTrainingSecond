package ServletPractice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ForSession", urlPatterns = "/sessions")
public class ForSession extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    //first request then response on parameter
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriters = response.getWriter();
        HttpSession session = request.getSession();
        String Email = (String) session.getAttribute("email");
        String Password = (String) session.getAttribute("password");

        printWriters.println("<form >");
        printWriters.println("<p> Your e-mail  is : </p> " + Email + "<br>"
                + "<p>Your password is :</p> " + Password + "<br>" + "<p> Session id is <p> " + session.getId());
        printWriters.println("</form>");

        printWriters.close();

    }

}
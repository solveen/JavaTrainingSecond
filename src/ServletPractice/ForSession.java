package ServletPractice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPractice2", urlPatterns = "/sessions")
public class ForSession extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    //first request then response on parameter
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriters = response.getWriter();
        HttpSession session = request.getSession(false);

        String Email = (String) session.getAttribute("email");
        session.getAttribute(Email);
        printWriters.println("<form>");
        printWriters.println("<h1>Welcome " + Email + "</h1>");
        printWriters.println("</form>");
        printWriters.close();

    }

}
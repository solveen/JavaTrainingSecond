package ServletPractice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPractice3", urlPatterns = "/sessions2")
public class ForSession extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    //first request then response on parameter
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriters = response.getWriter();
        String name = request.getParameter("email");
        printWriters.println("<form>");
        printWriters.println("<h1>Welcome " + name + "</h1>");
        printWriters.println("</form>");
        printWriters.close();


    }

}
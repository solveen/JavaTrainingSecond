package ServletPractice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPractice2", urlPatterns = "/dash")

public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String email = request.getParameter("uName");
        String pass = request.getParameter("uPass");
        printWriter.println("Hey " + email + " Your password is " + pass);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriters = response.getWriter();
        Cookie cookies = null;
        Cookie cookie[] = request.getCookies();
        if (cookie != null) {
            for (int i = 0; i < cookie.length; i++) {
                cookies = cookie[i];
                String name = cookies.getName();
                String value = cookies.getValue();
                printWriters.print("Name : " + name + ",  ");
                printWriters.print("Value: " + value + " <br/>");
            }
        } else {
            printWriters.print("No Cookies Found");
        }


        printWriters.close();
    }


}

package ServletPractice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPractice", urlPatterns = "/login")
public class ServletPractice extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
        response.setContentType("text/html");

        String email = request.getParameter("email");
        //name used inside the input tag
        String password = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();
//        printWriter.println("Hello "  + email);
//        printWriter.println("Your password is " + password) ;
        //dash is the url patterns of the servlet you want to run (second servlet)
        //Url rewriting
        printWriter.println("<a href = 'dash?uName=" + email + "'>View Session Details</a>");
        printWriter.println("<a href = 'dash?uPass=" + password + "'>View Session Details</a>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //yo folder ko directory haina hai
        response.setContentType("text/html");

        String email = request.getParameter("email");
        //name used inside the input tag
        String password = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();

//
//        printWriter.println(ck.getValue());
//        printWriter.println("<form action='cookieTest' method = 'POST' >");
//        printWriter.println("<input type='submit' value = 'login' />");
//        printWriter.println("</form>");


        if (password.equals("123") && email.equals("admin@gmail.com")) {
            HttpSession session = request.getSession();
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/forSession.jsp");
            //             This creates cookies
            Cookie ck = new Cookie("email", email);
            response.addCookie(ck);
            System.out.println(ck.getValue());
            Cookie ckpw = new Cookie("password", password);
            response.addCookie(ckpw);
            System.out.println(ckpw.getValue());

            //yele session create garxa
            session.setAttribute("email", email);
            session.setAttribute("password", password);
            //request dispatcher tala hunu parxa natra cookie store hudaina
            requestDispatcher.forward(request, response);


        } else {

            printWriter.println("Incorrect Username or Password.");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request, response);

        }
//
//        System.out.println("Your email is " + email + " Your password is: " + password);
        printWriter.close();
    }

    public void doDestroy() {

    }
}

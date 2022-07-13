import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String firstName = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if (firstName == null) {
            out.println("<h1>Hello, world!</h1>");
        } else {
            out.println("<h1>Hello, " + firstName + "!</h1>");
        }
    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoseServlet", urlPatterns = "/incorrect")
public class LoseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lucky = req.getParameter("lucky");
        String guess = req.getParameter("guess");
        String message = req.getParameter("message");
        req.setAttribute("lucky", lucky);
        req.setAttribute("guess", guess);
        req.setAttribute("message", message);
        req.getRequestDispatcher("/guess-results.jsp").forward(req,resp);
    }
}

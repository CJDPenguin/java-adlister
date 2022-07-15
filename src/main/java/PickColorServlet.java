import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="PickColorServlet", urlPatterns = "/pick-color")
public class PickColorServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pick-color.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("yellow") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("indigo") || color.equalsIgnoreCase("violet")) {
            req.setAttribute("color", color);
            resp.sendRedirect("/view-color?color=" + color);
        } else {
            req.getRequestDispatcher("/pick-color.jsp").forward(req, resp);
        }
    }
}

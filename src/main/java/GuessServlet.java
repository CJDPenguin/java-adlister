import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/new-guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int lucky = (int) Math.floor(Math.random() *2 + 1);
        req.setAttribute("lucky", lucky);
        int guess;
        try {
            guess = parseInt(req.getParameter("guess"));
            req.setAttribute("guess", guess);
            if (guess == lucky) {
                resp.sendRedirect("/correct?lucky=" + lucky + "&guess=" + guess + "&message=Congratulations!!!<br>You won!");
            } else if (guess > 3 || guess < 1) {
                req.getRequestDispatcher("/new-guess.jsp").forward(req, resp);
            } else {
                resp.sendRedirect("/incorrect?lucky=" + lucky + "&guess=" + guess + "&message=Apologies,<br>Your guess was not correct");
            }
        } catch (NumberFormatException e) {
            req.getRequestDispatcher("/new-guess.jsp").forward(req, resp);
        }
    }
}

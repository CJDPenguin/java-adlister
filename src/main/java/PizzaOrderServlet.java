import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "PizzaOrderServlet", urlPatterns= "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String toppings =  req.getParameter("pepperoni") + req.getParameter("sausage") + req.getParameter("ham") + req.getParameter("cheese");
        String address = req.getParameter("address");
        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        System.out.println(toppings);
        System.out.println(address);

        req.setAttribute("crust", crust);
        req.setAttribute("sauce", sauce);
        req.setAttribute("size", size);
        req.setAttribute("toppings", toppings);
        req.setAttribute("address", address);

        req.getRequestDispatcher("/pizza-order.jsp").forward(req,resp);
    }
}

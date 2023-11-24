package jsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("ProductSuccess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data for Product1
        String name1 = request.getParameter("name1");
        String type1 = request.getParameter("type1");
        String price1 = request.getParameter("price1");
        String brand1 = request.getParameter("brand1");
        String quantity1 = request.getParameter("quantity1");

        // Retrieve form data for Product2
         String price2 = request.getParameter("price2");
        
        // Calculate the total price for Product1 and Product2
       

        // Set attributes for both products
        request.setAttribute("name1", name1);
        request.setAttribute("type1", type1);
        request.setAttribute("price1", price1);
        request.setAttribute("brand1", brand1);
        request.setAttribute("quantity1", quantity1);

        
        request.setAttribute("price2", price2);
        
        String totalPrice = price1 + price2;
        // Set the total price as a request attribute
        request.setAttribute("totalPrice", totalPrice);

        // Forward the request to "ProductSuccess.jsp"
        request.getRequestDispatcher("Product2.jsp").forward(request, response);
    }
}

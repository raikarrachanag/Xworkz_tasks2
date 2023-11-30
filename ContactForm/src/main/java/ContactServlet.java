import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String comment = request.getParameter("comment");

        // In a real-world scenario, you might want to store the data in a database here.

        // Set the form data as request attributes to be forwarded to ContactSuccess.jsp
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("mobile", mobile);
        request.setAttribute("comment", comment);

        // Forward the request to ContactSuccess.jsp
        request.getRequestDispatcher("ContactSuccess.jsp").forward(request, response);
    }
}

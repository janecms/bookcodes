package app01a;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        process(request, response);
    }

    public void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        process(request, response);
    }

    private void process(HttpServletRequest request,
            HttpServletResponse response) 
            throws IOException, ServletException {

        String uri = request.getRequestURI();
        /*
         * uri is in the form of /contextName/resourceName, 
         * for example: /app01a/Product_input.action. 
         * However, in the case of a default context, the 
         * context name is empty, and uri has this form
         * /resourceName, e.g.: /Product_input.action
         */
        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1); 
        // execute an action
        if (action.equals("Product_input.action")) {
            // there is nothing to be done
        } else if (action.equals("Product_save.action")) {
            // instantiate action class
            Product product = new Product();
            // populate action properties
            product.setProductName(request.getParameter("productName"));
            product.setDescription(request.getParameter("description"));
            product.setPrice(request.getParameter("price"));
            // execute action method
            product.save();
            // store action in a scope variable for the view
            request.setAttribute("product", product);
        }

        // forward to a view
        String dispatchUrl = null;
        if (action.equals("Product_input.action")) {
            dispatchUrl = "/jsp/ProductForm.jsp";
        } else if (action.equals("Product_save.action")) {
            dispatchUrl = "/jsp/ProductDetails.jsp";
        }
        if (dispatchUrl != null) {
            RequestDispatcher rd = request.getRequestDispatcher(dispatchUrl);
            rd.forward(request, response);
        }
    }
}

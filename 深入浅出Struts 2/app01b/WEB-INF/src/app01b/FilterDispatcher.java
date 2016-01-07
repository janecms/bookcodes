package app01b;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterDispatcher implements Filter {
    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest request, 
            ServletResponse response, FilterChain filterChain) 
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String uri = req.getRequestURI();
        System.out.println(uri);
        /*
         * uri is in the form of /contextName/resourceName, 
         * for example /app01b/Product_input.action 
         * However, in the case of a default context, 
         * the context name is empty, and uri has this form
         * /resourceName, e.g.: /Product_input.action
         */
        if (uri.endsWith(".action")) {
            // action processing
            int lastIndex = uri.lastIndexOf("/");
            String action = uri.substring(lastIndex + 1); 
            if (action.equals("Product_input.action")) {
                // do nothing
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
                RequestDispatcher rd = request
                        .getRequestDispatcher(dispatchUrl);
                rd.forward(request, response);
            }
        } else if (uri.indexOf("/css/") != -1
                && req.getHeader("referer") == null) {
            res.sendError(HttpServletResponse.SC_FORBIDDEN);
        } else {
            // other static resources, let it through
            filterChain.doFilter(request, response);
        }
    }
}

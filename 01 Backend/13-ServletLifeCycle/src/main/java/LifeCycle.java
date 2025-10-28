import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends GenericServlet {

    @Override
    public void init() {
        System.out.println("init() called");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service() called - handling request");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Hello from service method</h2>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called.");
    }
}

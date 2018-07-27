import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "BrowserDetectorServlet", urlPatterns = "/browser")
public class BrowserDetectorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userAgent = request.getHeader("User-Agent");
        String id = request.getRemoteAddr();
        String browser = "Unknow Browser";

        if (userAgent.contains("Firefox")) {
            browser = "Mozilla Firefox";
        } else if (userAgent.contains("Chrome")) {
            browser = "Chrome";
        } else if (userAgent.contains("Opera")) {
            browser = "Opera";
        } else if (userAgent.contains("Safari")) {
            browser = "Safari";
        }
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h2>Your User-Agent is:</h2> " + userAgent);
        pw.println("<h2>Your browser: " + browser + ".</h2>");
        pw.println("<h2>IP: " + id + "</h2>");
        pw.println("</html>");
    }
}

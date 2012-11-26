import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayUsers extends HttpServlet {

  public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

    request.getSession();

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.print("Users:"); //Posa sessions dimiourgountai
    out.print(ConcurrentUserTracker.getConcurrentUsers());
    out.print("</br>");
    out.print("Number of sessions which have uploaded photos:");//Posa apo ta sessions pou dimiourgountai kanoun upload
    out.print(UploadCounter.getNewAttributes());
    out.print("</br>");
    out.print("Total Uploads:");//Posa upload exoun ginei-poses eikones einai anevasmenes
    out.print(TotalUploadsCounter.getAccessions());
    out.println("</html>");
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entities.Item;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    if(session.getAttribute("LISTNAME") == null) {
        session.setAttribute("LISTNAME", new ArrayList<Item>());
    } else if ((request.getParameter("NEWITEMNAME") != null) && (request.getParameter("NEWITEMAMOUNT") != null )) {
        ArrayList<Item> items = (ArrayList<Item>) session.getAttribute("LISTNAME");
        
        Item newItem = new Item();
        newItem.setName(request.getParameter("NEWITEMNAME").toString());
        newItem.setAmount(Integer.getInteger(request.getParameter("NEWITEMAMOUNT").toString()));
        
        items.add(newItem);
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Items for all!</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("\t\t<input type=\"text\" value=\"Write something here\" name=\"NEWITEMNAME\" id=\"NEWITEMNAME\" />\n");
      out.write("\t\t<input type=\"text\" value=\"0\" name=\"NEWITEMAMOUNT\" id=\"NEWITEMAMOUNT\" />\n");
      out.write("\t\t<input type=\"submit\" value=\"Buy\" />\n");
      out.write("\t</form>\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Item</th>\n");
      out.write("                    <th>Amount</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    for(Item i : (ArrayList<Item>) session.getAttribute("LISTNAME")) {
                        System.out.println("<tr>");
                        System.out.println("<td>");
                        System.out.println(i.getName());
                        System.out.println("</td>");
                        System.out.println("<td>");
                        System.out.println(Integer.toString(i.getAmount()));
                        System.out.println("</td>");
                        System.out.println("</tr>");
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

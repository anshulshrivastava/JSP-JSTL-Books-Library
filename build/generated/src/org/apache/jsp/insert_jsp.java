package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Anshul NoteBook </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"my/style1.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"my/reset1.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"my/structure2.css\">\n");
      out.write("        <script src=\"js/config.js\"></script>\n");
      out.write("        <script src=\"js/skel.min.js\"></script>\n");
      out.write("        <noscript>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </noscript>\n");
      out.write("\n");
      out.write("        <style> \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Nav -->\n");
      out.write("        <nav id=\"nav\">\n");
      out.write("            <ul class=\"container\">\n");
      out.write("                <li><a href=\"http://localhost:8090/Assignment_2/index.html\">Home</a></li>\n");
      out.write("           <li><a href=\"http://localhost:8090/jspcustomtag/search.jsp\">Search</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8090/jspcustomtag/insert.jsp\">Insert</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8090/jspcustomtag/delete.jsp\">Delete</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8090/jspcustomtag/update.jsp\">Update</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form class=\"box login\" action=\"sqlUpdate.jsp\" method=\"post\">\n");
      out.write("            <fieldset class=\"fieldfield\">\n");
      out.write("                <strong><h2>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspInsert into <b>Book</b></h2></strong>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                            </td>\n");
      out.write("                        <td>\n");
      out.write("                <label>Enter AuthorID -</label>\n");
      out.write("                <input type=\"text\" tabindex=\"1\" name=\"insert1\" placeholder=\"Enter AuthorID...\" required>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                         <td>\n");
      out.write("                <label>Enter Author First Name -</label>\n");
      out.write("                <input type=\"text\" tabindex=\"1\" name=\"insert2\" placeholder=\"Enter First Name...\" required>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                            </td>\n");
      out.write("                        <td>\n");
      out.write("                <label>Enter Author Last Name -</label>\n");
      out.write("                <input type=\"text\" tabindex=\"1\" name=\"insert3\" placeholder=\"Enter Last Name...\" required>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                         <td>\n");
      out.write("                <label>Enter Book ISBN -</label>\n");
      out.write("                <input type=\"text\" tabindex=\"1\" name=\"insert4\" placeholder=\"Enter ISBN...\" required>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                            </td>\n");
      out.write("                        <td>\n");
      out.write("                <label>Enter Book Title -</label>\n");
      out.write("                <input type=\"text\" tabindex=\"1\" name=\"insert5\" placeholder=\"Enter Title...\" required>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" name=\"pageName\" values=\"login\"/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                         <td>\n");
      out.write("                <label>Enter Book Edition Number -</label>\n");
      out.write("                <input type=\"text\" tabindex=\"1\" name=\"insert6\" placeholder=\"Enter Edition Number...\" required>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                            </td>\n");
      out.write("                        <td>\n");
      out.write("                <label>Enter Book Copyright Year -</label>\n");
      out.write("                <input type=\"text\" tabindex=\"1\" name=\"insert7\" placeholder=\"Enter Copyright...\" required>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                        </td>\n");
      out.write("                      <td>\n");
      out.write("\t </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br></td>\n");
      out.write("                 \n");
      out.write("                        <td>\n");
      out.write("                            <fieldset>  <br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br><input type=\"submit\" name=\"insertion\" class=\"btnLogin\" value=\"Insert\" tabindex=\"4\"></fieldset>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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

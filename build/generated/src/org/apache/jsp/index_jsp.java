package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"./css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <p>1.- ¿Cúal es el nombre del aeropuerto que ha tenido mayor movimiento durante el año?</p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta1\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <p>2.- ¿Cúal es el nombre de la aerolinea que ha realizado mayor número de vuelos durante el año?</p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta2\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <p>3.-¿En qué día se han tenido mayor número de vuelos?<p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta3\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <p>4.-¿Cuáles son las aerolíneas que tienen mas de 2 vuelos por día?<p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta4\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <p>5.-¿Cuáles son las aerolíneas que tienen mas de 1 vuelo por día?<p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta5\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <p>6.- ¿Cúal es el nombre del aeropuerto que ha tenido menor movimiento durante el año?</p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta6\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <p>7.- ¿Cúal es el nombre de la aerolinea que ha realizado menor número de vuelos durante el año?</p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta7\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <p>8.-¿En qué día se han tenido menor número de vuelos?<p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta8\">RESPUESTA</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta9\">PREGUNTA 9</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=pregunta10\">PREGUNTA 10</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
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

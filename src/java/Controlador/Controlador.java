package Controlador;

import ModeloDAO.VuelosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    String pregunta1 = "vistas/pregunta1.jsp";
    String pregunta2 = "vistas/pregunta2.jsp";
    String pregunta3 = "vistas/pregunta3.jsp";
    String pregunta4 = "vistas/pregunta4.jsp";
    String pregunta5 = "vistas/pregunta5.jsp";
    String pregunta6 = "vistas/pregunta6.jsp";
    String pregunta7 = "vistas/pregunta7.jsp";
    String pregunta8 = "vistas/pregunta8.jsp";
    String pregunta9 = "vistas/pregunta9.jsp";
    String pregunta10 = "vistas/pregunta10.jsp";

    VuelosDAO dao = new VuelosDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("pregunta1")) {
            acceso = pregunta1;
        } else if (action.equalsIgnoreCase("pregunta2")) {
            acceso = pregunta2;
        } else if (action.equalsIgnoreCase("pregunta3")) {
            acceso = pregunta3;
        } else if (action.equalsIgnoreCase("pregunta4")) {
            acceso = pregunta4;
        } else if (action.equalsIgnoreCase("pregunta5")) {
            acceso = pregunta5;
        } else if (action.equalsIgnoreCase("pregunta6")) {
            acceso = pregunta6;
        } else if (action.equalsIgnoreCase("pregunta7")) {
            acceso = pregunta7;
        }else if (action.equalsIgnoreCase("pregunta8")) {
            acceso = pregunta8;
        }else if (action.equalsIgnoreCase("pregunta9")) {
            acceso = pregunta9;
        }else if (action.equalsIgnoreCase("pregunta10")) {
            acceso = pregunta10;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

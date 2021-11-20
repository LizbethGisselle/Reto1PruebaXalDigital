
<%@page import="Modelo.Aerolinea"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Vuelos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Aeropuerto"%>
<%@page import="ModeloDAO.VuelosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Nombre Aerolineas</th>
                    </tr>
                </thead>
                <%
                    VuelosDAO dao = new VuelosDAO();
                    List<Aerolinea> list = dao.pregunta5();
                    Iterator<Aerolinea> iter = list.iterator();
                    Aerolinea aerp = null;
                    while (iter.hasNext()) {
                        aerp = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= aerp.getNom_aerolinea()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

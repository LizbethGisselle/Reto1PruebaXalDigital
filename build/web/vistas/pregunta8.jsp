
<%@page import="Modelo.Vuelos"%>
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
                        <th class="text-center">Dia con menor número de vuelos</th>
                    </tr>
                </thead>
                <%
                    VuelosDAO dao = new VuelosDAO();
                    List<Vuelos> list = dao.pregunta8();
                    Iterator<Vuelos> iter = list.iterator();
                    Vuelos vuelos = null;
                    while (iter.hasNext()) {
                        vuelos = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= vuelos.getDia()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
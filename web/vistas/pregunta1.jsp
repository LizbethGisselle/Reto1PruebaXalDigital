
<%@page import="Modelo.Aeropuerto"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Vuelos"%>
<%@page import="java.util.List"%>
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
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Nombre Aeropuerto</th>
                    </tr>
                </thead>
                <%
                    VuelosDAO dao=new VuelosDAO();
                    List<Aeropuerto>list=dao.pregunta1();
                    Iterator<Aeropuerto>iter=list.iterator();
                    Aeropuerto aereop=null;
                    while(iter.hasNext()){
                        aereop=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= aereop.getNom_aeropuerto()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Aerolinea;
import Modelo.Aeropuerto;
import Modelo.Vuelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VuelosDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Aeropuerto aer = new Aeropuerto();

    @Override
    public List pregunta1() {
        ArrayList<Aeropuerto> list = new ArrayList<>();
        String sql = "select nombre_aeropuerto\n"
                + "from (select nombre_aeropuerto, count(id_aeropuerto) contador\n"
                + "from vuelos natural join aeropuertos\n"
                + "group by id_aeropuerto) AS T1\n"
                + "where contador in (select max(contador)\n"
                + "from (select id_aeropuerto,count(id_aeropuerto) contador\n"
                + "from vuelos natural join aeropuertos\n"
                + "group by id_aeropuerto) AS T2);";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aeropuerto aerop = new Aeropuerto();
                aerop.setNom_aeropuerto(rs.getString("nombre_aeropuerto"));
                list.add(aerop);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List pregunta2() {
        ArrayList<Aerolinea> list = new ArrayList<>();
        String sql = "select nombre_aerolinea\n"
                + "from (select nombre_aerolinea, count(id_aerolinea) contador\n"
                + "from vuelos natural join aerolineas\n"
                + "group by id_aerolinea) AS T1\n"
                + "where contador in (select max(contador)\n"
                + "from (select id_aerolinea,count(id_aerolinea) contador\n"
                + "from vuelos natural join aerolineas\n"
                + "group by id_aerolinea) AS T2);";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aerolinea aerol = new Aerolinea();
                aerol.setNom_aerolinea(rs.getString("nombre_aerolinea"));
                list.add(aerol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List pregunta3() {
        ArrayList<Vuelos> list = new ArrayList<>();
        String sql = "select dia from (select dia,count(dia) contador\n"
                + "from vuelos group by dia) AS T1\n"
                + "where contador in (select max(contador) from\n"
                + "(select dia, count(dia) contador from vuelos group by dia) AS T2);";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vuelos vuelos = new Vuelos();
                vuelos.setDia(rs.getString("DIA"));
                list.add(vuelos);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List pregunta4() {
        ArrayList<Aerolinea> list = new ArrayList<>();
        String sql = "Select nombre_aerolinea From vuelos natural join aerolineas Group By nombre_aerolinea, dia\n"
                + "Having count(*) > 2;";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aerolinea aerol = new Aerolinea();
                aerol.setNom_aerolinea(rs.getString("nombre_aerolinea"));
                list.add(aerol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List pregunta5() {
        ArrayList<Aerolinea> list = new ArrayList<>();
        String sql = "Select nombre_aerolinea From vuelos natural join aerolineas Group By nombre_aerolinea, dia\n"
                + "Having count(*) > 1;";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aerolinea aerol = new Aerolinea();
                aerol.setNom_aerolinea(rs.getString("nombre_aerolinea"));
                list.add(aerol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List pregunta6() {
        ArrayList<Aeropuerto> list = new ArrayList<>();
        String sql = "select nombre_aeropuerto\n"
                + "from (select nombre_aeropuerto, count(id_aeropuerto) contador\n"
                + "from vuelos natural join aeropuertos\n"
                + "group by id_aeropuerto) AS T1\n"
                + "where contador in (select min(contador)\n"
                + "from (select id_aeropuerto,count(id_aeropuerto) contador\n"
                + "from vuelos natural join aeropuertos\n"
                + "group by id_aeropuerto) AS T2);";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aeropuerto aerop = new Aeropuerto();
                aerop.setNom_aeropuerto(rs.getString("nombre_aeropuerto"));
                list.add(aerop);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public List pregunta7() {
        ArrayList<Aerolinea> list = new ArrayList<>();
        String sql = "select nombre_aerolinea\n"
                + "from (select nombre_aerolinea, count(id_aerolinea) contador\n"
                + "from vuelos natural join aerolineas\n"
                + "group by id_aerolinea) AS T1\n"
                + "where contador in (select min(contador)\n"
                + "from (select id_aerolinea,count(id_aerolinea) contador\n"
                + "from vuelos natural join aerolineas\n"
                + "group by id_aerolinea) AS T2);";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aerolinea aerol = new Aerolinea();
                aerol.setNom_aerolinea(rs.getString("nombre_aerolinea"));
                list.add(aerol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List pregunta8() {
        ArrayList<Vuelos> list = new ArrayList<>();
        String sql = "select dia from (select dia,count(dia) contador\n"
                + "from vuelos group by dia) AS T1\n"
                + "where contador in (select min(contador) from\n"
                + "(select dia, count(dia) contador from vuelos group by dia) AS T2);";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vuelos vuelos = new Vuelos();
                vuelos.setDia(rs.getString("DIA"));
                list.add(vuelos);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List pregunta9() {
        ArrayList<Aeropuerto> list = new ArrayList<>();
        String sql = "select nombre_aeropuerto,count(id_aeropuerto) numero_de_vuelos\n"
                + "from vuelos natural join AEROPUERTOS where nombre_aeropuerto = \"Benito Juarez\";";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aeropuerto aeropuerto = new Aeropuerto();
                aeropuerto.setNom_aeropuerto(rs.getString("nombre_aeropuerto"));
                aeropuerto.setNum_vuelos(rs.getInt("numero_de_vuelos"));
                list.add(aeropuerto);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public List pregunta10() {
                ArrayList<Aerolinea> list = new ArrayList<>();
        String sql = "select nombre_aerolinea , count(id_aerolinea) numero_de_vuelos\n" +
"from vuelos natural join aerolineas where nombre_aerolinea=\"Volaris\";";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aerolinea aerol = new Aerolinea();
                aerol.setNom_aerolinea(rs.getString("nombre_aerolinea"));
                aerol.setNum_vuelos(rs.getInt("numero_de_vuelos"));
                list.add(aerol);
            }
        } catch (Exception e) {
        }
        return list;

    }

}

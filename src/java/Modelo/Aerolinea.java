/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Aerolinea {
    int id_aerolinea;
    String nom_aerolinea;
    int num_vuelos;
    
    public Aerolinea(int id_aerolinea,String nom_aerolinea){
        this.id_aerolinea = id_aerolinea;
        this.nom_aerolinea = nom_aerolinea;
    }
    
    public Aerolinea(){
        
    }

    public int getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }

    public String getNom_aerolinea() {
        return nom_aerolinea;
    }

    public void setNom_aerolinea(String nombre_aerolinea) {
        this.nom_aerolinea = nombre_aerolinea;
    }

    public int getNum_vuelos() {
        return num_vuelos;
    }

    public void setNum_vuelos(int num_vuelos) {
        this.num_vuelos = num_vuelos;
    }
    
    
}

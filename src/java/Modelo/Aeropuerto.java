/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Aeropuerto {
    int id_aeropuerto;
    int num_vuelos;
    String nom_aeropuerto;
    
    
    public Aeropuerto(){
        
    }
    
    public Aeropuerto(int id_aeropuerto,String nom_aeropuerto,int num_vuelos){
        this.id_aeropuerto = id_aeropuerto;
        this.nom_aeropuerto = nom_aeropuerto;
        this.num_vuelos = num_vuelos;
    }

    public int getId_aeropuerto() {
        return id_aeropuerto;
    }

    public void setId_aeropuerto(int id_aeropuerto) {
        this.id_aeropuerto = id_aeropuerto;
    }

    public String getNom_aeropuerto() {
        return nom_aeropuerto;
    }

    public void setNom_aeropuerto(String nom_aeropuerto) {
        this.nom_aeropuerto = nom_aeropuerto;
    }

    public int getNum_vuelos() {
        return num_vuelos;
    }

    public void setNum_vuelos(int num_vuelos) {
        this.num_vuelos = num_vuelos;
    }
    
    
}

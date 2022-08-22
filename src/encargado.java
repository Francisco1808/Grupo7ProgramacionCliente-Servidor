/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fagol
 */
public abstract class encargado {
String Nomb;
int cedu;

public encargado(){
    this.Nomb="";
    this.cedu=0;
}
protected abstract String setNomb(String Nombre);
protected abstract int setCedu(int cedula);
public abstract String getNomb();
public abstract int getCedu();
public abstract void IngresarDatos();



        
    

}

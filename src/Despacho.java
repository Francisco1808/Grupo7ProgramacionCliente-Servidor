/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fagol
 */
public class Despacho{
orden provincia1=new orden("San Jose");
orden provincia2=new orden("Cartago");
orden provincia3=new orden("Puntarenas");
orden provincia4=new orden("Guanacaste");
orden provincia5=new orden("Limon");
orden provincia6=new orden("Alajuela");
orden provincia7=new orden("Heredia");
public void run(){
provincia1.start();
provincia2.start();
provincia3.start();
provincia4.start();
provincia5.start();
provincia6.start();
provincia7.start();
}

}

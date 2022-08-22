
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fagol
 */
public class orden extends Thread{
private String patrullaProvincia;

public orden(String patrullaProvincia){
    this.patrullaProvincia=patrullaProvincia;
}

    orden() {
this.patrullaProvincia="";
    }
@Override
public void run(){
JOptionPane.showMessageDialog(null,"la patrulla de la provincia: "+patrullaProvincia+" se aproxima al sitio del accidente");
}
}

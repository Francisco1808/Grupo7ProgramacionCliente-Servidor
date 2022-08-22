
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fagol
 */
public class multa extends vehiculo{
protected int total;
protected String fecha;

public multa(){
super.clase=0;
this.total=0;
this.fecha="";
}

@Override
    public int getClase() {
        return clase;
    }

@Override
    public void setClase(int clase) {
        this.clase = clase;
    }
public void calcularMulta(){
    JOptionPane.showMessageDialog(null,"calculo de multa");
}

}

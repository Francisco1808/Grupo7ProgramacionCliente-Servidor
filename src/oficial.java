
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fagol
 */
public class oficial extends encargado{

    @Override
    public void IngresarDatos(){
    cedu=Integer.parseInt(JOptionPane.showInputDialog(null,"escriba la cedula del oficial"));
    Nomb=JOptionPane.showInputDialog(null,"escriba el nombre del oficial");
}    

    @Override
    protected String setNomb(String Nombre) {
      this.Nomb=Nomb;
        return null;
      
    }

    @Override
    protected int setCedu(int cedula) {
     this.cedu=cedu;
        return 0;
    }

    @Override
    public String getNomb() {
        return Nomb;
    }

    @Override
    public int getCedu() {
        return cedu;
    }
}

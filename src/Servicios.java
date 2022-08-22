
import javax.swing.JOptionPane;


public class Servicios{
private int opcion;
public void MenuPrincipal(){
    cliente cl=new cliente();
    vehiculo v=new vehiculo();
    EditarUsuario EU= new EditarUsuario();
    multa m=new multa();
    while(opcion==3||opcion==2||opcion==1){
       try{ 
           opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Servicios\n"
        +"\n1. Registrar Usuario"
        +"\n2. Editar Usuario"
        +"\n3. Registrar Vehiculo"           
        +"\n4. Realizar Multa"
        +"\n5. Registro del Encargado"
        +"\n6. Solicitud de Despacho "
        +"\n7. Salir"));
    switch(opcion){
        case 1:
            cl.setNombre(JOptionPane.showInputDialog(null,"escriba su nombre"));
            cl.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,"escribba su edad")));
            cl.setCedula(Long.parseLong(JOptionPane.showInputDialog(null,"escriba su cedula")));
            cl.setDireccion(JOptionPane.showInputDialog(null,"escriba su direccion de residencia"));
            break;
        case 2:
            EU.MenuEditar();
            break;
        case 3:
            v.setModelo(JOptionPane.showInputDialog(null,"Escriba el modelo de su vehiculo"));
            v.setColor(JOptionPane.showInputDialog(null,"Escriba el Color de su vehiculo"));
            v.setPlaca(Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la placa de registro de su vehiculo")));
            v.setClase(Integer.parseInt(JOptionPane.showInputDialog(null,"escriba 1 si es clase normal, o escriba 2 si es de lujo")));
            break;
        case 4:
            if(v.getClase()==1){
                multa multa1=new carroEstandar();
                multa1.calcularMulta();
            }else{
                multa multa2=new multa();
                multa2.calcularMulta();
            }
            
        break;
        case 5:
        oficial of1=new oficial();
        of1.setCedu(Integer.parseInt(JOptionPane.showInputDialog(null,"escriba la cedula")));
        of1.setNomb(JOptionPane.showInputDialog(null,"escriba el nombre")); 
        case 6:
            orden o=new orden();
            o.run();
            break; 
        case 7:
            System.exit(0);
            break;
        default:
            JOptionPane.showMessageDialog(null,"error valor fuera del rango vuelva a intentar");
             MenuPrincipal();
    }
}catch(Exception e){
JOptionPane.showMessageDialog(null,"error debe ingresar numeros");
}
}
} 
}

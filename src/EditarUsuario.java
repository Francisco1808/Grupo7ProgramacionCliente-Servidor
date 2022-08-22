/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fagol
 */
import java.io.*;
import javax.swing.JOptionPane;
public class EditarUsuario {
private long Ced;
    private String Nom;
    private String Direc;
    private int Ed;

  
  public void agregar() {
      cliente cl=new cliente();
  try {
      DataOutputStream dd = new DataOutputStream(new FileOutputStream("cliente", true));
            dd.writeLong(cl.getCedula());
            dd.writeUTF(cl.getNombre());
            dd.writeUTF(cl.getDireccion());
            dd.writeInt(cl.getEdad());    
   dd.close();
  } catch (IOException ex01){
            JOptionPane.showMessageDialog(null,
                    "error");
  }}

    public void consultar() {
        int encontrado = 0;
        try {
            String nom = JOptionPane.showInputDialog(null, "Escriba el nombre del cliente a consultar");
            DataInputStream d = new DataInputStream(new FileInputStream("cliente"));
            try {
                while (true) {
                    Ced = d.readLong();
                    Nom = d.readUTF();
                    Direc = d.readUTF();
                    Ed = d.readInt();
                    if (Nom.equals(nom)) {
                        encontrado = 1;
                        JOptionPane.showMessageDialog(null, "\n1. Cliente " + Nom+  
                                                            "\n2. Cedula: " + Ced+
                                                            "\n3.  Direccion: " + Direc+  
                                                            "\n4. edad: "+ Ed);
                    }
                }
            } catch (EOFException ex02) {
                d.close();
                if (encontrado == 0) {
                    JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado");
                }
            }
        } catch (FileNotFoundException ex03) {
            JOptionPane.showMessageDialog(null, " los datos no se pueden encontrar");
        } catch (IOException ex04) {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }

    public void editar() {
        try {
            long ced;
            ced = Long.parseLong(JOptionPane.showInputDialog(null,
                    "Escriba la cédula del cliente"));
            try {
                DataInputStream d = new DataInputStream(new FileInputStream(
                        "cliente"));
                DataOutputStream dd = new DataOutputStream(new FileOutputStream(
                        "datos"));
                try {
                    while (true) {
                         Ced = d.readLong();
                    Nom = d.readUTF();
                    Direc = d.readUTF();
                    Ed = d.readInt();
                        if (ced == Ced) {
                            Nom = JOptionPane.showInputDialog(null,
                                    "Escriba el nuevo nombre del cliente");
                            Direc = JOptionPane.showInputDialog(null,
                                    "Escriba la nueva direccion del cliente");
                            Ed=Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la nueva edad del cliente"));
                            JOptionPane.showMessageDialog(null, "Los datos del cliente han sido cambiados con exito ");
                        }
                        dd.writeLong(Ced);
                        dd.writeUTF(Nom);
                        dd.writeUTF(Direc);
                        dd.writeInt(Ed);
                    }
                } catch (EOFException ex05) {
                    d.close();
                    d.close();
                    intercambiar();
                }
            } catch (FileNotFoundException ex06) {
                JOptionPane.showMessageDialog(null, "los datos no se pudieron encontrar");
            }
        } catch (IOException ex07) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

 

    public void intercambiar() {
        try {
            DataInputStream d = new DataInputStream(new FileInputStream("datos"));
            DataOutputStream dd = new DataOutputStream(new FileOutputStream("cliente"));
            try {
                while (true) {
                    Ced = d.readLong();
                    Nom = d.readUTF();
                    Direc = d.readUTF();
                    Ed = d.readInt();
                    dd.writeLong(Ced);
                    dd.writeUTF(Nom);
                    dd.writeUTF(Direc);
                    dd.writeInt(Ed);
                }
            } catch (EOFException ex05) {
                d.close();
                dd.close();
            }
        } catch (FileNotFoundException ex06) {
            JOptionPane.showMessageDialog(null, "los datos no se pudireron encontrar");
        } catch (IOException ex07) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void MenuEditar() {
        int opc = 0;
        while (opc == 1 || opc==2 ||opc== 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seccion se cambio y consultas del cliente"
                    + "1.Editar Datos Cliente\n"
                    + "2.Cosultar Datos del Cliente\n"
                    + "3.Salir\n"
                    + "Escriba el numero de su opcion:"));
            switch (opc) {
                case 1: {
                    agregar();
                    editar();
                    break;
                }
                case 2: {
                    editar();
                    break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "la opcion seleccionada no existe, porfavor vuelva a intentarlo");
                }
            }
        }
    }    
}

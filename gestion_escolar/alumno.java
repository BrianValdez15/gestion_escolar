import java.util.Scanner;
public class alumno {
    
   String Correo;
   String Nombre;
    String Alergias;
   String Contraseña;
   int TelPadre;
   
    public void Correo() { 
    String Correo;
       JOptionPane.showMessageDialog(null, "brian@gmail.com");
    }
    public void Nombre() { 
    String Nombre;
            JOptionPane.showMessageDialog(null, "Brian Valdez Garcia");
    }
    public void Contraseña() { 
    String Contraseña;
         Scanner entrada = new Scanner(System.in);
    }
    public void Alergias() { 
    String Alergias;
        JOptionPane.showMessageDialog(null, "Soy alergico al amor ");
    }
    public void TelPadre(){
    int Tel;
        JOptionPane.showMessageDialog(null, "El telefono del tutor es: "+"598679");
    }
     public void mostrar(){
      System.out.print(Nombre);
          System.out.print(Correo);
          System.out.print(Alergias);
          System.out.print(TelPadre);
     }
}

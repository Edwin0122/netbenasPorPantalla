
package ejemplo;

import javax.swing.JOptionPane;


public class Ejemplo {

   
    public static void main(String[] args) {
   
        String cadena;
        int edad;
        char sexo;
        double estatura;
        
        //digitar datos
        cadena=JOptionPane.showInputDialog("Ingrese su nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("digite su edad"));
        sexo=JOptionPane.showInputDialog("digite su sexo").charAt(0);
        estatura=Double.parseDouble(JOptionPane.showInputDialog("Estatura"));
        
        //imprimir datos
        JOptionPane.showMessageDialog(null, "El nombre es:  "+cadena);
        JOptionPane.showMessageDialog(null, "Su edad es : "+edad);
        JOptionPane.showMessageDialog(null, "Su sexo es:  "+sexo);
        JOptionPane.showMessageDialog(null, "Su estatura es: "+estatura);
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tareas.colas;
import javax.swing.JOptionPane;
/**
 *
 * @author kenet
 */
public class Cliente {
    int Max = 20, Frente = 0, Final = 0;
    int cola[] = new int[Max];
    String Dato;
    
            
    public static void main(String[] args) {
        Cliente Acceso = new Cliente();
    }
    
    public Cliente(){
        int op = 0;
        while(op!=4){
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Opciones disponibles para Clientes:"
                    + "\n 1 AGREGAR DATO"
                    + "\n 2 ELIMINAR DATO"
                    + "\n 3 MOSTRAR DATOS"
                    + "\n 4 TERMINAR"
            ));
            switch(op){
                case 1: {push();break;}
                case 2: {pop();break;}
                case 3: {imprimirCola();break;}
                case 4: {
                    JOptionPane.showMessageDialog(null,"Fin del programa, ten un buen día");
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null,"No existe esa opción");
                }
                    
            }
        }
    }
    
    public void push(){
        if(Final < Max){
            Dato = JOptionPane.showInputDialog("Código");
            cola[Final]=Integer.parseInt(Dato);
            Final++;
        }else{
            JOptionPane.showMessageDialog(null, "La cola está llena");
        }
    }
    
    public void pop(){
        System.out.print("Frente: "+Frente);
       
         if (Frente < Final) {
            JOptionPane.showMessageDialog(null, "Dato Eliminado: " + cola[Frente]);
            cola[Frente] = 0;
            Frente++;
        } else {
            JOptionPane.showMessageDialog(null, "La cola está vacía o el primer dato ya fue eliminado.");
        }
    }
    
    public void imprimirCola(){
        String Cadena = "";
        int i = 1;
        for(int datoCola: cola){
            Cadena += "Posición " + i + ": " + datoCola + "\n"; 
            i++;
        }
        JOptionPane.showMessageDialog(null, Cadena);
    }
}

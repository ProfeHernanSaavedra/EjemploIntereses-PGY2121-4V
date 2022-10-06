
package Datos;

import Negocio.Interes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USRVI-LC2
 */
public class Coleccion {
    
    private ArrayList<Interes> listaIntereses;

    public Coleccion() {
        
        listaIntereses = new ArrayList<>();
    }
    
    public void agregar(Interes interes)
    {
        listaIntereses.add(interes);
    }
    
    public void listar()
    {
        for (Interes interes : listaIntereses) {
            
            System.out.println(interes);
        }
    }
    
    public void masLike()
    {
        int mayor = 0;
        String clase = "";
        for (Interes interes : listaIntereses) {
            //if (interes.getLike() > mayor && interes.getTiempoConectado() > mayor) {
            if (interes.getLike() > mayor){
                mayor = interes.getLike();
                clase = interes.getClass().getSimpleName();
            }
        }
        System.out.println("El tema con mas likes es: " + clase);
    }
    
    public void masTiempoConexion()
    {
        int mayor = 0;
        String clase = "";
        for (Interes interes : listaIntereses) {
            if (interes.getTiempoConectado() > mayor) {
                mayor = interes.getTiempoConectado();
                clase = interes.getClass().getSimpleName();
            }
        }
        JOptionPane.showMessageDialog(null,"El tema con mas tiempo conectado es: " + clase , "Aviso", 1);
        System.out.println("El tema con mas tiempo conectado es: " + clase);
    }
    
}

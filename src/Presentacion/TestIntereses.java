
package Presentacion;

import Datos.Coleccion;
import Negocio.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USRVI-LC2
 */
public class TestIntereses {
    
    public static void main(String[] args) {
        
        String tipo = JOptionPane.showInputDialog(null, "Ingrese Tipo Musica: ","Ingreso",1);
        String tiempoDur = JOptionPane.showInputDialog(null, "Ingrese Tiempo duracion: ","Ingreso",1);
        int tiempoC = Integer.parseInt(tiempoDur);
        String likeStr = JOptionPane.showInputDialog(null, "Ingrese Likes: ","Ingreso",1);
        int likeInt = Integer.parseInt(likeStr);
        
        Interes musica = new Musica(tipo,tiempoC,likeInt);
        musica.setUsuario("Juanito");
        musica.setPass("123");
        RedSocial rs = new RedSocial("Instagram",240,10);
        TvSeries tv = new TvSeries("TERROR",180,20);
        
        Coleccion col = new Coleccion();
        col.agregar(musica);
        col.agregar(rs);
        col.agregar(tv);
        
        col.listar();
        System.out.println("******");
        col.masLike();
        col.masTiempoConexion();
        
    }
    
}

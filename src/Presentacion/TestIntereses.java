
package Presentacion;

import Datos.Coleccion;
import Negocio.*;

/**
 *
 * @author USRVI-LC2
 */
public class TestIntereses {
    
    public static void main(String[] args) {
        
        Interes musica = new Musica("POP",120,5);
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


package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class TvSeries extends Interes{
    
    private String genero;

    public TvSeries() {
    }

    public TvSeries(String genero, String usuario, String pass, int tiempoConectado) {
        super(usuario, pass, tiempoConectado);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "TvSeries{" + "genero=" + genero + '}';
    }
    
    
    
}

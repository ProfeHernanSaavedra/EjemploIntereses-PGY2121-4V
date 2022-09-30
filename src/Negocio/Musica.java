
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Musica extends Interes{
    
    private String tipoMusica;

    public Musica() {
    }

    public Musica(String tipoMusica, String usuario, String pass, int tiempoConectado) {
        super(usuario, pass, tiempoConectado);
        this.tipoMusica = tipoMusica;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}';
    }
    
    
    
    
    
    
    
}

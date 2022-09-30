
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class RedSocial extends Interes{
    private String nombreRedsocial;

    public RedSocial() {
    }

    public RedSocial(String nombreRedsocial, String usuario, String pass, int tiempoConectado) {
        super(usuario, pass, tiempoConectado);
        this.nombreRedsocial = nombreRedsocial;
    }

    public String getNombreRedsocial() {
        return nombreRedsocial;
    }

    public void setNombreRedsocial(String nombreRedsocial) {
        this.nombreRedsocial = nombreRedsocial;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombreRedsocial=" + nombreRedsocial + '}';
    }

    
    
    
}

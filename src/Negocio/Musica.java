
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Musica extends Interes implements ILike{
    
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
        return super.toString()+ " Musica{" + "tipoMusica=" + tipoMusica + '}';
    }

    @Override
    public void metodoSobreescrito() {
        //System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Tipo Musica: " + this.getTipoMusica());
    }

    @Override
    public void likes(int likes) {
        System.out.println(" Cantidad de Likes es: " + likes);
        System.out.println("Tiempo Conectado: " + this.getTiempoConectado());
    }
    
   
    
    
    
    
    
    
}

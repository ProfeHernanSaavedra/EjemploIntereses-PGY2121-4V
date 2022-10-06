
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public abstract class Interes {
    
    protected String usuario,pass;
    protected int tiempoConectado;
    protected int like;

    public Interes() {
    }

    public Interes(String usuario, String pass, int tiempoConectado) {
        this.usuario = usuario;
        this.pass = pass;
        this.tiempoConectado = tiempoConectado;
    }

    public Interes(int tiempoConectado, int like) {
        this.tiempoConectado = tiempoConectado;
        this.like = like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getLike() {
        return like;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    @Override
    public String toString() {
        return "Interes{" + "usuario=" + usuario + ", pass=" + pass + ", tiempoConectado=" + tiempoConectado + " Likes: " + like+'}';
    }
    
    public abstract void metodoSobreescrito();
    
    
}


package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public abstract class Interes {
    
    protected String usuario,pass;
    protected int tiempoConectado;

    public Interes() {
    }

    public Interes(String usuario, String pass, int tiempoConectado) {
        this.usuario = usuario;
        this.pass = pass;
        this.tiempoConectado = tiempoConectado;
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
        return "Interes{" + "usuario=" + usuario + ", pass=" + pass + ", tiempoConectado=" + tiempoConectado + '}';
    }
    
    public abstract void metodoSobreescrito();
    
    
}

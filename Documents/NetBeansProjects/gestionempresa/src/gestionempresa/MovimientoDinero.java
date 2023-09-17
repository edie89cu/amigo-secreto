
package gestionempresa;


public class MovimientoDinero {
     int Monto;
    String concepto, usuario;

    public MovimientoDinero(int Monto, String concepto, String usuario) {
        this.Monto = Monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public float getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}

package anna.ruiz.pmdm_ejercicioinmobiliaria.Modelos;

public class Inmueble {
    private String direccion;
    private int numero;
    private String ciudad;
    private String provincia;
    private String cp;
    private float valoracion;

    public Inmueble() {
    }

    public Inmueble(String direccion, int numero, String ciudad, String provincia, String cp, float valoracion) {
        this.direccion = direccion;
        this.numero = numero;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.cp = cp;
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "direccion: " + direccion + '\n' +
                ", numero: " + numero +
                ", ciudad: " + ciudad + '\n' +
                ", provincia: " + provincia + '\n' +
                ", cp: " + cp + '\n' +
                ", valoracion: " + valoracion +
                '}';
    }
}

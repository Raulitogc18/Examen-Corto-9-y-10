import java.util.Date;

public class publicacion {

    private String idPublicacion;
    private String contenido;
    private Date fecha;
    private usuario autor;
    private imagen Imagen;

    public publicacion(String idPublicacion, String contenido) {
        this.idPublicacion = idPublicacion;
        this.contenido = contenido;
        this.fecha = fecha;
        this.autor = autor;
        this.Imagen = Imagen;
    }

    public String getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(String idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public usuario getAutor() {
        return autor;
    }

    public void setAutor(usuario autor) {
        this.autor = autor;
    }

    public imagen getImagen() {
        return Imagen;
    }

    public void setImagen(imagen Imagen) {
        this.Imagen = Imagen;
    }

}

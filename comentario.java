import java.util.Date;

public class comentario {

    private String idComentario;
    private String texto;
    private Date fecha;
    private usuario autor;

    public comentario(String idComentario, String texto) {
        this.idComentario = idComentario;
        this.texto = texto;
        this.fecha = fecha;
        this.autor = autor;
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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
}
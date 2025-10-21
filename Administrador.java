public class Administrador extends usuario {
    private String nivelAcceso;
    private boolean puedeModerar;
    
    public Administrador(String nombre, String correo, String id, String password, String nivelAcceso) {
        super(nombre, correo, id, password);
        this.nivelAcceso = nivelAcceso;
        this.puedeModerar = true;
    }

    public void eliminarPublicacion(publicacion publicacion) {
    }

    public void banearUsuario(usuario usuario) {
    }

    public void moderarComentario(comentario comentario) {
    }

    // Getters y setters
    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public boolean isPuedeModerar() {
        return puedeModerar;
    }

    public void setPuedeModerar(boolean puedeModerar) {
        this.puedeModerar = puedeModerar;
    }
}
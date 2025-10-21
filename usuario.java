public class usuario {
    private String nombre;
    private String correo;
    private String id;
    private String password;

    public usuario(String nombre, String correo, String id, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login crearLogin() {
        return new Login(this.correo, this.password);
    }

    public Logout crearLogout() {
        return new Logout(this.id);
    }

    public publicacion crearPublicacion() {
        return new publicacion(this.nombre, this.correo);
    }

    public comentario crearComentario() {
        return new comentario(this.nombre, this.correo);
    }
}

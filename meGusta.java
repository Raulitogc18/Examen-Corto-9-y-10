public class meGusta implements reaccion {
    @Override
    public void reaccionar() {
        System.out.println("Me gusta esta publicación");
    }

    @Override
    public String getTipoReaccion() {
        return "Me gusta";
    }
}

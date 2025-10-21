public class noMeGusta implements reaccion {
    @Override
    public void reaccionar() {
        System.out.println("No me gusta esta publicación");
    }

    @Override
    public String getTipoReaccion() {
        return "No me gusta";
    }
}

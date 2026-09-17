public abstract class Formulario {
    public abstract CampoTexto crearCampoTexto();
    public void mostrar(){
        CampoTexto campo = crearCampoTexto();
        campo.dibujar();
    }
}

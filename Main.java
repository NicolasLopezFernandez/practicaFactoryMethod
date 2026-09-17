public class Main {
    public static void main(String[] args) {
        Formulario movil = new FormularioMovil();
        movil.mostrar();
        Formulario escritorio = new FormularioEscritorio();
        escritorio.mostrar();
    }
    //1) ¿Qué papel desempeña la interfaz CampoTexto?   Deja a CampoMovil y CampoOrdenador el metodo dibujar.
    //2) ¿Qué significa aquí “delegar” la creación? Significa que deja que cada subclase cree su propio CampoTexto, en lugar de que la clase padre lo haga.
    //3) ¿Por qué FormularioMovil y FormularioEscritorio redefinen crearCampoTexto()? Porque cada una necesita crear un Campotexto diferente
    //4) Si mañana añadimos una versión Web, ¿qué clases nuevas crearías y qué código existente no tendrías que modificar?    Hariamos una nuve CampoTextoWeb y tendria la misma estructura que CampoTextoMovil y CampoTextoOrdenador

}

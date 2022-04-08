package uneg_team_so.sietefilosofos.componentes;

public class Filosofo implements Runnable{ //Un objeto se puede crear dentro de un
                                            // hilo cuando se implementa Runabble
    int tiempoPensando; //Tiempo que se toma el filosofo en pensar
    int tiempoComiendo;
    boolean estaComiendo;
    boolean estaPensando;
    Palillo palilloIzq, palilloDer; //esto hace referencia a los palillos que el filosofo tiene a su derecha
    boolean usandopalilloIzq, UsandopalilloDer; // booleanos que indica si el filosofo esta usando alguno de los
    @Override
    public void run() { //@TODO Implementar una repeticion para que esto se repita N veces cada segundo
        if (estaPensando) {
            if (tiempoPensando > 0) {
                tiempoPensando--;
            }
            else
                alTerminarDePensar();
        }
        if (estaComiendo) { //@TODO Debemos imnplementar una condicion que el tiempo comiendo solo se reduja si el Filosofo tiene acesso a los dos palillos y que de not ser asi buscarlos
            tiempoComiendo--;
        }
            else alTerminarDeComer();
    }
    public void obtenerPalilloIzq (Palillo palillo){
        palilloIzq = palillo;
    }
    public void obtenerPalilloDer (Palillo palillo){
        palilloDer = palillo;
    }
    private void alTerminarDeComer (){
        estaComiendo = false;
        estaPensando = true;
        tiempoPensando = 10; //@TODO Debemos agregar un tiempo aleatorio de 0 a 10
    }
    private void alTerminarDePensar (){
        estaComiendo = true;
        estaPensando = false;
        tiempoComiendo = 10; //@TODO Debemos agregar un tiempo aleatorio de 0 a 10
    }
}

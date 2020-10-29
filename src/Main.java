import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        // Es importante que empiece el camarero ya que se queda esperando.

        while (true) {
            Cliente cliente = new Cliente();
            Camarero camarero = new Camarero();
            camarero.start();
            camarero.join();


            cliente.start();
            cliente.join();
        }
    }




}

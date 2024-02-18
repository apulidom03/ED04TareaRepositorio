package Entornos4;

public class Main {
    public static void main(String[] args) {
        NuevoMetodo();
    }

    public static void NuevoMetodo() {
        eCesta cesta;
        cesta = new eCesta("Pulido Martínez", 100, "20509007E", 10);

        try {
            cesta.comprar(50);

        } catch (Exception e) {
            System.out.println("No se puede pagar  ");
        }

        try {
            System.out.println("Solicitar actualización de bono");
            cesta.ActualizarBono(100);
        } catch (Exception e) {
            System.out.println("Error al recargar");
        }

        double bonoactual = cesta.bonificacion();
        System.out.println("Su bono actual es  " + bonoactual);
        
        try {
            System.out.println(" Modificación 1");
            cesta.ActualizarBono(-50);
        } catch (Exception e) {
            System.out.print("Fallo…….");
        }
    }
}

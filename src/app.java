import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String nombre = "Jonathan Muñoz";
        String tipoDeCuenta = "corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("***************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("tipo de cuenta: "  + tipoDeCuenta);
        System.out.println("saldo disponible: " + "$" + saldo);
        System.out.println("\n****************************************");

        String menu = """
                *** Escriba el numero de la opcion deseada: ***
                1- Consultar saldo
                2- Retirar
                3- Depositar
                9- SALIR
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("el saldo disponible es: " + "$" + saldo);
                    break;
                case 2:
                    System.out.println("cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextInt();
                    if (valorARetirar > saldo){
                        System.out.println("saldo insuficiente");
                    }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("saldo acutalizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("cuanto desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("saldo acutalizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios!!!");
                    break;

                default:
                    System.out.println("opcion no valida");
            }
        }
    }
}

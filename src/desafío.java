import java.util.Scanner;

public class desafío {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        Double saldo = 1599.99;
        int opcion = 0;


        System.out.println("******************");
        System.out.println("\nnombre del cliente: " + nombre);
        System.out.println("tipo de cuenta: "+ tipoDeCuenta);
        System.out.println("su saldo es :"+ saldo);
        System.out.println("\n*****************");

        String menu = """
                *** Escriba el número de la opción que desee ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println( menu );
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("el saldo actualizado es: "+ saldo);
                    break;
                case 2:
                    System.out.println("cual es la cantidad que desea retirar? ");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("saldo insuficiente");
                    }else {
                        saldo = saldo - valorARetirar;
                        System.out.println("el saldo actualizado es: "+ saldo);
                    }
                    break;
                case 3:
                    System.out.println("cual es la cantidad que desea depositar? ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("el saldo actualizado es: "+ saldo);
                    break;
                case 9:
                    System.out.println("gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("opcion no válida");
            }
        }


    }
}

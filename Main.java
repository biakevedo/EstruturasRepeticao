import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // colocar sempre antes
        Scanner sc = new Scanner(System.in);

    // Estrutura de repetição - While

     // Enquanto o nome for diferente de Vini
     // EU pergunto novamente

//        String nome = "Beatriz";
//        while (!nome.equals("Beatriz")); {
//             System.out.println("Incorreto!");
//             System.out.println("Insira o nome: ");
//             nome = sc.nextLine();
//        }
//    // exercicio while - repetir mensagem
//
//        int senha = 123456;
//        while (senha != 123456) {
//            System.out.println("Senha incorreta");
//            System.out.println("Insira a senha: ");
//            senha = sc.nextInt();
//        }
//
//        // contador crescente
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//
//        Random random = new Random();
//        System.out.println("Digite um número entre 1 e 100: ");
//        int numeroSecreto = random.nextInt(100) + 1;  // Gera um número entre 1 e 100
//        System.out.println("Número secreto gerado: " + numeroSecreto);
//
//        do {
//            System.out.println("Digite a senha: ");
//            senha = sc.nextInt();
//        } while(senha != 123456);
//
//
//        double saldoInicial = 2000;
//        while (saldoInicial > 0) {
//            System.out.println("Saldo atual: R$ " + saldoInicial);
//            System.out.println("Digite o valor que deseja sacar: R$: ");
//            saldoInicial = sc.nextInt();
//
//            double saque = sc.nextDouble();
//
//            if (saque > saldoInicial) {
//                System.out.println("Saldo insuficiente");
//            } else {
//                saldoInicial -= saque;
//                System.out.println("Saque R$: " + saque + "realizado.");
//                System.out.println("Saldo insuficiente. Encerrando...");
//
//            }
//
//
//        }
//
//    // somador de números
//
//        int soma = 0;
//        int numeroChute = 0;
//
//        do {
//            System.out.println("Digite um número inteiro (digite 0 para parar):  ");
//            numeroChute = sc.nextInt();
//            soma += numeroChute;
//        } while (numeroChute != 0);
//        System.out.println("A soma total dos números inseridos é: ");
//
//        // Mostrar os números de 1 a 10
//
//        int numero = 1;
//        while(numero < 10) {
//            System.out.println(numero);
//            numero = numero + 1;
//        }
//        // do while
//        int numero2 = 1;
//        do {
//            System.out.println(numero2);
//            // numero2 = numero2 + 1;
//            numero2++;
//
//        } while(numero2 <= 10);
//
//    // for
//        // Criar uma variável i valendo 1
//        // for (int i = 1; i < ; i++) {
//         //   System.out.println(i);
//      //  }

    // Contagem regressiva usando for

     for (int a = 1; a <= 11; a++) {
        int resultado = 7 * a;
        System.out.println(7 + " x " + a + " = " + resultado);
    }








}
}






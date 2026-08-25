import java.io.InputStream;
import java.util.Scanner;

public class Desafio {
    static void main(String[] args) {
        //inicializando os dados;
        String nome = "Daniel";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        //Dados iniciais;
        System.out.println("\n============================");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n============================");

        //Ler opcao digitada pelo usuario;
        Scanner scanner = new Scanner(System.in);

        String menu = """
                ** Digite a opção que deseja!**
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Finalizar
                """;

        Scanner leitura = new Scanner(System.in);

        //Criando menu com while;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}

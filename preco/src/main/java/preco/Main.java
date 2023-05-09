package preco;
import produto.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Informe o valor do produto: ");
        double valorProduto = produto.lerValor(scanner);

        if (valorProduto > 0) {
            double novoValor = produto.calcularNovoValor(valorProduto);
            System.out.println("Novo valor do produto: " + novoValor);
        } else {
            System.out.println("Número inválido, tente novamente.");
        }

        scanner.close();
    }
}


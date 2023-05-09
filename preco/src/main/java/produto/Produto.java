package produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Produto {
    public double calcularNovoValor(double valor) {
        return (valor/10) + valor; // Acrescenta 10% ao valor original
    }
    
    public double lerValor(Scanner scanner) {
        double valor = 0;
        try {
            valor = scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpar o buffer do scanner
            valor = -1; // Valor inválido
        }
        return valor;
    }
}

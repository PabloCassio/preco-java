package preco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import produto.Produto;
class PrecoTest {

	  @Test
	    public void testCalcularNovoValor() {
	        Produto produto = new Produto();

	        // Teste com valor positivo
	        double valor1 = 50.00;
	        double resultado1 = produto.calcularNovoValor(valor1);
	        assertEquals(55.0, resultado1);

	        // Teste com valor zero
	        double valor2 = 0.00;
	        double resultado2 = produto.calcularNovoValor(valor2);
	        assertEquals(0.00, resultado2);

	        // Teste com valor negativo
	        double valor3 = -100.00;
	        double resultado3 = produto.calcularNovoValor(valor3);
	        assertEquals(-110.00, resultado3);
	    }
	}

package br.com.estudos.solid.lsp;

public class CreditCard extends NubankCard {

	@Override
	public void validate() throws Exception {
		// Validação do cartão de crédito
		System.out.println("Validando limite");
		System.out.println("Limite Ok");
	}

	
}

package br.com.estudos.solid.lsp;

public class DebitCard extends NubankCard {

	@Override
	public void validate() throws Exception {
		System.out.println("Verificando saldo!");
		System.out.println("Saldo dsponível!");
	}

	
	
}

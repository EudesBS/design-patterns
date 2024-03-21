package br.com.estudos.solid.lsp;

public class NubankRewards implements IPaymentInstrument{

	@Override
	public void validate() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Limite ok, Rewards ok");
	}

	@Override
	public void collectPayment() {
		System.out.println("Pagamento realizado com sucesso!");
		System.out.println("Pontuação creditada no programa Rewards!");
	}

}

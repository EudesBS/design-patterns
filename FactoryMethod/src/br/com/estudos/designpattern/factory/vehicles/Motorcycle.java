package br.com.estudos.designpattern.factory.vehicles;

public class Motorcycle implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Em rota de entrga!");
	}

	@Override
	public void getCargo() {
		System.out.println("Encomenda coletada!");
	}

}

package br.com.estudos.designpattern.factory.vehicles;

public class Car implements IVehicle{

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando o trajeto!");
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiro abordo, pronto para a viagem!");
	}

}

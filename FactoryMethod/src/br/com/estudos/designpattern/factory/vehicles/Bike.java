package br.com.estudos.designpattern.factory.vehicles;

public class Bike implements IVehicle{

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando o delivery!");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Entrega coletada!");		
	}

	
}

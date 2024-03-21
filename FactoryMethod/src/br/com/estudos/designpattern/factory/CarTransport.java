package br.com.estudos.designpattern.factory;

import br.com.estudos.designpattern.factory.vehicles.Car;
import br.com.estudos.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport{

	@Override
	protected IVehicle createTransport() {
		return new Car();
	}

}

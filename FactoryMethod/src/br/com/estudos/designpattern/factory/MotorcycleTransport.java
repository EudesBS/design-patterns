package br.com.estudos.designpattern.factory;

import br.com.estudos.designpattern.factory.vehicles.IVehicle;
import br.com.estudos.designpattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

	@Override
	protected IVehicle createTransport() {
		return new Motorcycle();
	}

}

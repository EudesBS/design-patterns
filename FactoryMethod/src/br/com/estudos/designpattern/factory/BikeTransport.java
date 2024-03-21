package br.com.estudos.designpattern.factory;

import br.com.estudos.designpattern.factory.vehicles.Bike;
import br.com.estudos.designpattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Bike();
	}

}

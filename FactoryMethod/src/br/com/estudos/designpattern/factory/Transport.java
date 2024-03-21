package br.com.estudos.designpattern.factory;

import br.com.estudos.designpattern.factory.vehicles.IVehicle;

public abstract class Transport {

	void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRoute();
		
	}
	
	protected abstract IVehicle createTransport();
}

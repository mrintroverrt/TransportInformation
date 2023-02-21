package org.transport;

public class TransportInformation extends Road {

	public void TransportForm() {

	}

	@Override
	public void bike() {
		System.out.println("Honda");
	}

	@Override
	public void cycle() {
		System.out.println("Hero");
	}

	@Override
	public void bus() {
		System.out.println("Benz");
	}

	@Override
	public void car() {
		System.out.println("TATA");
	}

	@Override
	public void aeroPlane() {
		System.out.println("BMW");

	}

	@Override
	public void heliCopter() {
		System.out.println("Boeing Defense");
	}

	@Override
	public void boat() {
		System.out.println("Beneteau");
	}

	@Override
	public void ship() {
		System.out.println("Titanic");
	}

	public static void main(String[] args) {
		TransportInformation t = new TransportInformation();
		t.bike();
		t.cycle();
		t.bus();
		t.car();
		t.aeroPlane();
		t.heliCopter();
		t.boat();
		t.ship();
	}
}

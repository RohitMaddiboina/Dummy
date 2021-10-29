package abstractPattern;

public class AudiFactory extends Factory {

	@Override
	public HeadLight makeHeadLight() {
		// TODO Auto-generated method stub
		System.out.println("Making HeadLights");
		return new AudiHeadLight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		System.out.println("Making HeadLights");
		return new AudiTire();
	}

}

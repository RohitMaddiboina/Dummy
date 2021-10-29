package abstractPattern;

public class MercedesFactory extends Factory{

	@Override
	public HeadLight makeHeadLight() {
		// TODO Auto-generated method stub
		System.out.println("Making HeadLights");
		return new MercedesHeadLight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		System.out.println("Making Tires");
		return new MercedesTire();
	}

}

package abstractPattern;

public class Client {
	public static void main(String[] args) {
		Factory audiCar = FactoryGetter.createFactory("audi");
		audiCar.makeHeadLight();
		audiCar.makeTire();
		
	}
}

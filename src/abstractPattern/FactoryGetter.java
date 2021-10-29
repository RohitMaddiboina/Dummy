package abstractPattern;

public class FactoryGetter {
	
	public static Factory createFactory(String company){
		if(company.equalsIgnoreCase("mercedes")) {
			return new MercedesFactory();
		}else {
			return new AudiFactory();
		}
	}
	
}

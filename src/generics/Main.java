package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(new Urus(18352.12,2006L,"Lamborghini"));
		carros.add(new Civic(52000.31,2008L,"Honda"));
		carros.add(new Ferrari(38622.48,2010L,"Ferrari"));
		
		System.out.println(carros);
		
		
		
		
		
		

	}

}
package Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Parte1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite nomes separados por virgula:");
		String stringDigitada = sc.nextLine();
		String[] nomes = stringDigitada.split(",");
		
		List<String> lista = new ArrayList<>();
		
		for (int i = 0; i < nomes.length; i++) {
			lista.add(nomes[i]);
		}
		
		Collections.sort(lista);
		System.out.println(lista);

		sc.close();
	}

}

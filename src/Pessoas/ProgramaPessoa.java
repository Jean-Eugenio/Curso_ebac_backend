package Pessoas;

public class ProgramaPessoa {

	public static void main(String[] args) {
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		System.out.println("***** Pessoa Física *****");
		pessoaFisica.setNome("Gabriel Barbosa");
		pessoaFisica.setEndereco("Estrada dos bandeirantes, Vargem Grande - Rio de janeiro/RJ");
		pessoaFisica.setTelefone("(21) 91920-2122");
		pessoaFisica.setCpf("123.456.789-81");
		System.out.println(pessoaFisica.toString());
		System.out.print("CPF: ");
		imprimirDocumento(pessoaFisica);

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		System.out.println("\n***** Pessoa Jurídica *****");
		pessoaJuridica.setNome("CLUBE REGATAS FLAMENGO");
		pessoaJuridica.setEndereco("Av. Borges de Medeiros, 997 - Lagoa - Rio de janeiro/RJ");
		pessoaJuridica.setTelefone("(21) 2159-0100");
		pessoaJuridica.setCnpj("23.764.392/0001-60");
		System.out.println(pessoaJuridica.toString());
		System.out.print("CNPJ: ");
		imprimirDocumento(pessoaJuridica);
	}
	
	public static void imprimirDocumento(Pessoa pessoa) {
		if (pessoa instanceof PessoaFisica) {
			PessoaFisica pFisica = (PessoaFisica)pessoa;
			System.out.println(pFisica.getCpf());
		}else {
			PessoaJuridica pJus = (PessoaJuridica)pessoa;
			System.out.println(pJus.getCnpj());
		}
	}
	

}

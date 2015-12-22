package br.com.jason.cpf;

public class CPF {
	
	private String numeroCPF;
	
	
	public boolean validaCPF(String numeroCPF){
		char digVer1, digVer2;
		int soma, resto, numero, peso;
		soma = 0;
		peso = 10;
		
		if (numeroCPF.length() != 11){
			return false;
		}
		
		else{
				
			for(int i = 0; i < 9; i++){
				numero = (int) (numeroCPF.charAt(i)-48);
				soma += (numero * peso);
				peso--;
			}
			
			resto = 11 - (soma % 11);
			if((resto == 10) || (resto == 11))
				digVer1 = 0;
			else digVer1 = (char) (resto + 48);
			
			soma = 0;
			peso = 11;
			for(int i = 0; i < 10; i++){
				numero = (int) (numeroCPF.charAt(i)-48);
				soma += (numero * peso);
				peso--;
			}
			
			resto = 11 - (soma % 11);
			if((resto == 10) || (resto == 11))
				digVer2 = 0;
			else digVer2 = (char) (resto + 48);
			
			if((digVer1 == numeroCPF.charAt(9)) && (digVer2 == numeroCPF.charAt(10)))
				return true;
			else return false;	
			
		}
	}
	
	
	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	
	

}

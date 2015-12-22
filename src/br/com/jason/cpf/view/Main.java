package br.com.jason.cpf.view;

import javax.swing.JOptionPane;

import br.com.jason.cpf.CPF;

public class Main {

	public static void main(String[] args) {

		CPF cpf = new CPF();
		
		cpf.setNumeroCPF(JOptionPane.showInputDialog(null, "Digite o n�mero do CPF"));
		
		if(cpf.validaCPF(cpf.getNumeroCPF()))
			JOptionPane.showMessageDialog(null, "O CPF digitado foi "+ cpf.getNumeroCPF());
		else JOptionPane.showMessageDialog(null, "N�mero de CPF Inv�lido.");
		
	}
}

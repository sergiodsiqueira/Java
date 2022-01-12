package br.com.fiap.tds;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		String nome;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é seu nome? ");
		nome = input.nextLine();
		
		System.out.println("Informe o peso: ");
		peso = input.nextDouble();
		
		System.out.println("Informe a altura: ");
		altura = input.nextDouble();
		
		imc = peso / (altura * 2);
		
		System.out.println("");
		System.out.println(nome + " seu IMC é: " + imc);
		if (imc < 19) {
			System.out.println("Desnutrido");
		} else if (imc >= 19 && imc <= 24) {
			System.out.println("Ideal");	
		} else if (imc >= 25 && imc <= 29) {
			System.out.println("Sobrepeso");	
		} else if (imc >= 30 && imc <= 34) {
			System.out.println("Obesidade Grau I");	
		} else if (imc >= 35 && imc <= 39) {
			System.out.println("Obesidade Grau II");	
		} else if (imc >= 40) {
			System.out.println("Obesidade Grau III");	
		}
		
		

	}

}

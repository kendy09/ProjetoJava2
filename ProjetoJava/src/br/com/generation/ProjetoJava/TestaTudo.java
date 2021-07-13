package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudo{

	

	public static void main(String[] args) {
		//Objetos usados
		Scanner read = new Scanner (System.in);
		Logar log = new Logar ();
		Doador Doa1 = new Doador();
		Beneficiario Recebe1 = new Beneficiario();
		int ApoioOuBenef = 0;
		int Continuar = 0;
		
		//TeleInicial
		System.out.println("BEM VINDES!!!");
		System.out.println("NOME PROJETO");
		System.out.println("================");
		
		
		//Cadastro ou Login
		System.out.println("Você já tem cadastro?");
		System.out.println("1 - SIM | 2 - NÃO");
		int cadastroLogin = read.nextInt();
		read.nextLine();
		//Simulamos um login aqui
		//login : adm
		//senha: 123
		//será um doador
		
		if (cadastroLogin  ==1 ) {
			log.login(read);
			Doa1.setNome("Felipe");
			ApoioOuBenef =1;
		}
		else {
			//triagem
			System.out.println("Escolha seu perfil");
			System.out.println("1 - Apoiador | 2 - Amparado ou Beneficiário"); 
			ApoioOuBenef =read.nextInt();
			read.nextLine();
			if (ApoioOuBenef == 1 ) {
				Doa1.Cadastramento(read);
				Doa1.Doacao(read);
			}
			
			else {
				Recebe1.Cadastramento(read);
				
				Recebe1.Demanda(read);
			}
		}
		
		
		//laço de repetição caso o usario deseje fazer mais alguma doação ou pedido
		do {	
			
	

			//usando o res la de cima para diferencia um doador, de um beneficiario;
			if (ApoioOuBenef == 1) {
				System.out.println("Deseja Fazer mais uma doação?\n 1- SIM | 2- NAO");
				Continuar = read.nextInt();
				read.nextLine();
				if (Continuar == 2 ){
					break;
				}
				Doa1.Doacao(read);
			}
			else {
				System.out.println("Deseja Fazer mais um pedido?\n 1- SIM | 2- NAO");
				Continuar = read.nextInt();
				if (Continuar == 2 ){
					System.out.println("Quando quiser fazer uma doação estaremos aqui!");
					break;
				}
				Recebe1.Demanda(read);
			}
		}while(Continuar != 2);
		
		
		
			//Mensagem de agradecimento
			if (ApoioOuBenef ==1) {	
			Doa1.MessagemDoador(read);
		}
			else {
			Recebe1.MessagemReceptor(read);
		}
	}

}

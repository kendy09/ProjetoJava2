package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudo{

	private static final char Continuar = 0;

	public static void main(String[] args) {
		//Objetos usados
		Scanner read = new Scanner (System.in);
		Logar log = new Logar ();
		Doador Doa1 = new Doador();
		Beneficiario Recebe1 = new Beneficiario();
		int res = 0;
		//TeleInicial
		System.out.println("BEM VINDES!!!");
		System.out.println("NOME PROJETO");
		System.out.println("================");
		//Cadastro ou Login
		System.out.println("Você já tem cadastro?");
		System.out.println("1 - SIM | 2 - NÃO");
		int cadastroLogin = read.nextInt();
		//Simulamos um login aqui
		//login : adm
		//senha: 123
		//será um doador
		if (cadastroLogin  ==1 ) {
			log.login();
			Doa1.setNome("Felipe");
			res =1;
		}
		else {
			//triagem
			System.out.println("Escolha seu perfil");
			System.out.println("1 - Apoiador | 2 - Amparado ou Beneficiário"); 
			res =read.nextInt();
			if ( res == 1 ) {
				Doa1.Cadastramento();
				Doa1.Doacao();
			}
			else {
				Recebe1.Cadastramento();
				Recebe1.Demanda();
			}
		}
		//laço de repetição caso o usario deseje fazer mais alguma doação ou pedido
		do {	
			System.out.println("Deseja Fazer mais uma Doação/Receber?\n 1- SIM | 2- NAO");
			int Continuar = 0;
			Continuar = read.nextInt();
			if (Continuar == 2 ){
				break;
			}
			//usando o res la de cima para diferencia um doador, de um beneficiario;
			if (res == 1) {
				Doa1.Doacao();
			}
			else {
				Recebe1.Demanda();
			}
		}while(Continuar != 2);
			
			if (res ==1) {	
			Doa1.MessagemDoador();
		}
			else {
			Recebe1.MessagemReceptor();
		}
	}

}

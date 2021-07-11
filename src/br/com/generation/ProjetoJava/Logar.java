package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Logar {
	Doador Doa1 = new Doador();
	Scanner read = new Scanner(System.in);
	private String admin  = "adm";
	private String password = "123";
	String email;
	String senha;

	public String getAdmin() {
		return admin;
	}
	public void setAdmim(String adm) {
		this.admin = adm;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void login() {
		String email,senha;
		boolean cadastro = true;
		Scanner read = new Scanner (System.in);
		do {
			System.out.println("Insira seu email: ");
			email = read.nextLine();
			System.out.println("Insira sua senha: ");
			senha= read.nextLine();
			if(email.equals(getAdmin())  && senha.equals("123")) {
				System.out.println("Login efetuado");
				cadastro = true;
			}
			else{
				System.out.println("Login ou senha invalidos");
				cadastro =false;
			}
		}while(cadastro == false);
	}
}
	

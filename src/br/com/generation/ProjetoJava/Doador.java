package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Doador extends Usuario {
	
	Scanner read = new Scanner (System.in);
	private int DoaAlimentos;
	private int DoaRoupas;
	private int DoaBrinquedo;
	private int DoaFarmacia;
	private int DoaOutros;

	
	
	public int getDoaAlimentos() {
		return DoaAlimentos;
	}

	public void setDoaAlimentos(int doaAlimento) {
		DoaAlimentos = doaAlimento;
	}

	public int getDoaRoupas() {
		return DoaRoupas;
	}

	public void setDoaRoupas(int doaRoupas) {
		DoaRoupas = doaRoupas;
	}

	public int getDoaBrinquedo() {
		return DoaBrinquedo;
	}

	public void setDoaBrinquedo(int doaBrinquedo) {
		DoaBrinquedo = doaBrinquedo;
	}

	public int getDoaFarmacia() {
		return DoaFarmacia;
	}

	public void setDoaFarmacia(int doaFarmacia) {
		DoaFarmacia = doaFarmacia;
	}

	public int getDoaOutros() {
		return DoaOutros;
	}
	public void setDoaOutros(int doaOutros) {
		DoaOutros = doaOutros;
	}

	public void Doacao() {
		System.out.println("===========Doador===========\n");
		System.out.println("O que voce deseja doar\n1-Alimentos n�o perec�veis"
			+ "\n2-Roupas \n3-Brinquedos \n4-Farmacia \n5-Outros");
		int numero = 0 ;
		numero = read.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Alimentos n�o Perec�veis");
			System.out.println("\nQuantos Alimentos deseja doar?");
			setDoaAlimentos(read.nextInt());
			break;
		case 2:
			System.out.println("Roupas");
			System.out.println("Quantas Roupas deseja doar?");
			setDoaRoupas(read.nextInt());
			break;
		case 3:
			System.out.println("Brinquedos");
			System.out.println("Quantos Brinquedos deseja doar?");
			setDoaBrinquedo(read.nextInt());
			break;
		case 4:
			System.out.println("Farm�cia");
			System.out.println("Quantos produtos voc� deseja doar?");
			setDoaFarmacia(read.nextInt());
			break;
		case 5:
			System.out.println("Outros");
			System.out.println("Digite o que deseja doar: ");
			System.out.println("Quantos produtos deseja doar?");
			setDoaOutros(read.nextInt());
			break;
		default:
			System.out.println("Numero invalido");
		}
	}
		public void Cadastramento(){	
			
			System.out.println("Fa�a seu cadastro! ");
			System.out.println("Insira seu Nome: ");
			setNome(read.nextLine());
			System.out.println("Insira seu email: ");
			setEmail(read.nextLine());
			System.out.println("Insira seu senha: ");
			setSenha(read.nextLine());
		}
		public void MessagemDoador() {
			System.out.println();
			System.out.println(getNome()+" Voc� Doar�:\n");
			if (getDoaAlimentos()!=0) {
				System.out.println("*"+getDoaAlimentos()+" Alimentos n�o Perec�veis\n");
			}
			if (getDoaRoupas()!=0) {
				System.out.println("*"+getDoaRoupas()+" Roupas\n");
			}
			if(getDoaBrinquedo()!=0) {
				System.out.println("*"+getDoaBrinquedo()+" Brinquedos\n");
			}
			if(getDoaFarmacia()!=0) {
				System.out.println("*"+getDoaFarmacia()+" Farm�cia\n");
			}
			if(getDoaOutros()!=0) {
				System.out.println("*"+getDoaOutros()+" Outros\n");
			}
			System.out.println("Muito obrigade, "+getNome()+ " por sua doa��o.\nSua ajuda far� diferen�a em muitas vidas.");
		}
}

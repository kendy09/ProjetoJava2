package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Doador extends Usuario {
	

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
	


	public void Doacao(Scanner read) {
		System.out.println("===========Doador===========\n");
		System.out.println("O que voce deseja doar\n1-Alimentos não perecíveis"
			+ "\n2-Roupas \n3-Brinquedos \n4-Farmacia \n5-Outros");
		int numero = 0 ;
		numero = read.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Alimentos não Perecíveis");
			System.out.println("\nQuantos Alimentos deseja doar?");
			this.DoaAlimentos +=read.nextInt();
			break;
		case 2:
			System.out.println("Roupas");
			System.out.println("Quantas Roupas deseja doar?");
			this.DoaRoupas +=read.nextInt();
			break;
		case 3:
			System.out.println("Brinquedos");
			System.out.println("Quantos Brinquedos deseja doar?");
			this.DoaBrinquedo +=read.nextInt();
			break;
		case 4:
			System.out.println("Farmácia");
			System.out.println("Quantos produtos você deseja doar?");
			this.DoaFarmacia +=read.nextInt();
			break;
		case 5:
			System.out.println("Outros");
			System.out.println("Quantos produtos deseja doar?");
			this.DoaOutros +=read.nextInt();
			System.out.println("Liste os objetos que deseja doar: ");

			break;
		default:
			System.out.println("Numero invalido");
		}
	}
	
	
		public void Cadastramento(Scanner read){	
			
			System.out.println("Faça seu cadastro! ");
			System.out.println("Insira seu Nome: ");
			setNome(read.nextLine());
			System.out.println("Insira seu email: ");
			setEmail(read.nextLine());
			System.out.println("Insira seu senha: ");
			setSenha(read.nextLine());
		}
		public void MessagemDoador() {
			System.out.println();
			System.out.println(getNome()+" Você Doará:\n");
			if (getDoaAlimentos()!=0) {
				System.out.println("*"+getDoaAlimentos()+" Alimentos não Perecíveis\n");
			}
			if (getDoaRoupas()!=0) {
				System.out.println("*"+getDoaRoupas()+" Roupas\n");
			}
			if(getDoaBrinquedo()!=0) {
				System.out.println("*"+getDoaBrinquedo()+" Brinquedos\n");
			}
			if(getDoaFarmacia()!=0) {
				System.out.println("*"+getDoaFarmacia()+" Farmácia\n");
			}
			if(getDoaOutros()!=0) {
				System.out.println("*"+getDoaOutros()+" Outros\n");
			}
			System.out.println("Muito obrigade, "+getNome()+ " por sua doação.\nSua ajuda fará diferença em muitas vidas.");
		}

}

package br.com.generation.ProjetoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Doador extends Usuario {
	
	
	private int DoaAlimentos;
	private int DoaRoupas;
	private int DoaBrinquedo;
	private int DoaFarmacia;
	private int DoaOutros;
	ArrayList <Objetos> Doacoes = new ArrayList<>();

	
	
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
			System.out.println("Quais  produtos a mais voce deseja Receber?");
			String produto = read.nextLine();
			System.out.println("Quantos produtos a mais voce deseja Receber?");
			// Como fazer para ler int e char - Excluir Outros ???
			int quantidade = read.nextInt();
			

			Doacoes.add(new Objetos(produto, quantidade));
			
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
		public void MessagemDoador(Scanner read) {
			int RecebeConfirmacao = 0;
			while(RecebeConfirmacao != 1) {
				System.out.println();
				System.out.println(getNome()+" Você Doará:\n");
				if (getDoaAlimentos()>1) {
					System.out.println("*"+getDoaAlimentos()+" Alimentos não Perecíveis\n");
				}
				else if (getDoaAlimentos() == 1) {
					System.out.println("*"+getDoaAlimentos()+" Alimento não Perecível\n");
				}
				if (getDoaRoupas()>1) {
					System.out.println("*"+getDoaRoupas()+" Roupas\n");
				}
				else if (getDoaRoupas() == 1){
					System.out.println("*"+getDoaRoupas()+" Roupa\n");
				}
				if(getDoaBrinquedo() > 1) {
					System.out.println("*"+getDoaBrinquedo()+" Brinquedos\n");
				}
				else if (getDoaBrinquedo() == 1) {
					System.out.println("*"+getDoaBrinquedo()+" Brinquedo\n");
				}
				if(getDoaFarmacia()>1) {
					System.out.println("*"+getDoaFarmacia()+" Farmácia\n");
				}
				for(Objetos i: Doacoes ) {
					System.out.println(i);
				}
			
				System.out.println("Você confirma a solicitação? 1) Finalizar pedido - 2) Mais Doações -3)Corrigir - 4)Cancelar ");
			
				RecebeConfirmacao = read.nextInt();
				if(RecebeConfirmacao == 1) {
					System.out.println("Obrigade, "+getNome()+" por confiar no processo.\nEntraremos em contato em breve "+
						"para informar a disponibilidade de suas necessidades.");
				}
				else if(RecebeConfirmacao == 2) {
					Doacao(read);
				}
				else if (RecebeConfirmacao == 3) {
					setDoaAlimentos(0);
					setDoaBrinquedo(0);
					setDoaRoupas(0);
					setDoaFarmacia(0);
					Doacao(read);
			}
				else {
					setDoaAlimentos(0);
					setDoaBrinquedo(0);
					setDoaRoupas(0);
					setDoaFarmacia(0);
					System.out.println("Sua solicitação esteja cancelada, caso queira volte novamente ");
					break;
				}	
			}
		}
		
	}

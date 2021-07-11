package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Beneficiario extends Usuario{
	Scanner read = new Scanner (System.in);
	private int RecebeAlimentos;
	private int RecebeRoupas;
	private int RecebeBrinquedo;
	private int RecebeFarmacia;
	private int RecebeOutros;
	
	public int getRecebeAlimentos() {
		return RecebeAlimentos;
	}
	public void setRecebeAlimentos(int recebeAlimentos) {
		RecebeAlimentos = recebeAlimentos;
	}
	public int getRecebeRoupas() {
		return RecebeRoupas;
	}
	public void setRecebeRoupas(int recebeRoupas) {
		RecebeRoupas = recebeRoupas;
	}
	public int getRecebeBrinquedo() {
		return RecebeBrinquedo;
	}
	public void setRecebeBrinquedo(int recebeBrinquedo) {
		RecebeBrinquedo = recebeBrinquedo;
	}
	public int getRecebeFarmacia() {
		return RecebeFarmacia;
	}
	public void setRecebeFarmacia(int recebeFarmacia) {
		RecebeFarmacia = recebeFarmacia;
	}
	public int getRecebeOutros() {
		return RecebeOutros;
	}
	public void setRecebeOutros(int recebeOutros) {
		RecebeOutros = recebeOutros;
	}
	public void Demanda() {			
		System.out.println("==========Amparado ou Beneficiário==========");
		System.out.println("\nO que voce deseja Receber: \n1-Alimentos não Perecíveis"
				+ "\n2-Roupas \n3-Brinquedos \n4-Farmácia \n5-Outros");
		int numero = 0 ;
		numero = read.nextInt();
		switch (numero) {
			case 1:
				System.out.println("Alimentos");
				System.out.println("Quantos Alimentos deseja Receber?");
				setRecebeAlimentos(read.nextInt());
				break;
			case 2:
				System.out.println("Roupas");
				System.out.println("Quantas Roupas deseja Receber?");
				setRecebeRoupas(read.nextInt());
				break;
			case 3:
				System.out.println("Brinquedos");
				System.out.println("Quantos Brinquedos deseja Receber?");
				setRecebeBrinquedo(read.nextInt());
				break;
			case 4:
				System.out.println("Farmácia");
				System.out.println("Quantos produtos deseja Receber?");
				setRecebeFarmacia(read.nextInt());
				break;
			case 5:
				System.out.println("Outros");
				System.out.println("Quantos produtos deseja Receber?");
				// Como fazer para ler int e char - Excluir Outros ???
				setRecebeOutros(read.nextInt());
				break;
			}
		}
		public void Cadastramento(){	
			
			System.out.println("Faça seu cadastro! ");
			System.out.println("Insira seu Nome: ");
			setNome(read.nextLine());
			System.out.println("Insira seu email: ");
			setEmail(read.nextLine());
			System.out.println("Insira seu senha: ");
			setSenha(read.nextLine());
		}
	
	public void MessagemReceptor() {
		System.out.println();
		System.out.println(getNome()+"Você receberá:\n");
		if (getRecebeAlimentos()!=0) {
			System.out.println("*"+getRecebeAlimentos()+" Alimentos não Perecíveis\n");
		}
		if (getRecebeRoupas()!=0) {
			System.out.println("*"+getRecebeRoupas()+" Roupas\n");
		}
		if(getRecebeBrinquedo()!=0) {
			System.out.println("*"+getRecebeBrinquedo()+" Brinquedos\n");
		}
		if(getRecebeFarmacia()!=0) {
			System.out.println("*"+getRecebeFarmacia()+" Farmácia\n");
		}
		if(getRecebeOutros()!=0) {
			System.out.println("*"+getRecebeOutros()+" Outros\n");
		}
		System.out.println("Obrigade, "+getNome()+" por confiar no processo.\nEntraremos em contato em breve "+
				"para informar a disponibilidade de suas necessidades.");
		
	}
}

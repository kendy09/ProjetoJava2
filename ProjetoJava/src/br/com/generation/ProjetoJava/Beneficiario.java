package br.com.generation.ProjetoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Beneficiario extends Usuario {
	private int RecebeAlimentos;
	private int RecebeRoupas;
	private int RecebeBrinquedo;
	private int RecebeFarmacia;
	private Objetos outros;
	ArrayList <Objetos> Pedidos = new ArrayList<>();
	

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

	// Colocando o valor inicial da doacao ou ajustando o valor;



	public void Demanda(Scanner read) {
		
		System.out.println("==========Amparado ou Benefici�rio==========");
		System.out.println("\nO que voce deseja Receber: \n1-Alimentos n�o Perec�veis"
				+ "\n2-Roupas \n3-Brinquedos \n4-Farm�cia \n5-Outros");
		int numero = 0;
		numero = read.nextInt();
		read.nextLine();
		switch (numero) {
		case 1:
			System.out.println("Alimentos");
			System.out.println("Quantos Alimentos a mais voce deseja Receber?");
			this.RecebeAlimentos += read.nextInt();
			break;
		case 2:
			System.out.println("Roupas");
			System.out.println("Quantas Roupas a mais voce deseja Receber?");
			this.RecebeRoupas += read.nextInt();
			break;
		case 3:
			System.out.println("Brinquedos");
			System.out.println("Quantos Brinquedos a mais voce deseja Receber?");
			this.RecebeBrinquedo += read.nextInt();
			break;
		case 4:
			System.out.println("Farm�cia");
			System.out.println("Quantos produtos a mais voce deseja Receber?");
			this.RecebeFarmacia += read.nextInt();
			;
			break;
		case 5:
			System.out.println("Outros");
			System.out.println("Quais  produtos a mais voce deseja Receber?");
			String produto = read.nextLine();
			System.out.println("Quantos produtos a mais voce deseja Receber?");
			// Como fazer para ler int e char - Excluir Outros ???
			int quantidade = read.nextInt();
			

			Pedidos.add(new Objetos(produto, quantidade));
			
			break;
		}
	}

	public void Cadastramento(Scanner read) {

		System.out.println("Fa�a seu cadastro! ");
		System.out.println("Insira seu Nome: ");
		setNome(read.nextLine());
		System.out.println("Insira seu email: ");
		setEmail(read.nextLine());
		System.out.println("Insira seu senha: ");
		setSenha(read.nextLine());
	}

	public void MessagemReceptor(Scanner read) {
		int RecebeConfirmacao = 0;
		while (RecebeConfirmacao != 1) {
			System.out.println();
			System.out.println(getNome() + " Voc� receber�:\n");
			if (getRecebeAlimentos() > 1) {
				System.out.println("[" + getRecebeAlimentos() + " Alimentos n�o Perec�veis\n]");
			} else if (getRecebeAlimentos() == 1) {
				System.out.println("[" + getRecebeAlimentos() + " Alimento n�o Perec�vel\n]");
			}
			if (getRecebeRoupas() > 1) {
				System.out.println("[" + getRecebeRoupas() + " Roupas\n]");
			} else if (getRecebeRoupas() == 1) {
				System.out.println("[" + getRecebeRoupas() + " Roupa\n]");
			}
			if (getRecebeBrinquedo() > 1) {
				System.out.println("[" + getRecebeBrinquedo() + " Brinquedos\n]");
			} else if (getRecebeBrinquedo() == 1) {
				System.out.println("[" + getRecebeBrinquedo() + " Brinquedo\n]");
			}
			if (getRecebeFarmacia() > 0) {
				System.out.println("[" + getRecebeFarmacia() + " Farm�cia\n]");
			}
			for(Objetos i: Pedidos ) {
				System.out.println(i);
			}

			System.out.println(
					"Voc� confirma a solicita��o? 1) Finalizar pedido - 2) Mais Doa��es -3)Corrigir - 4)Cancelar ");

			RecebeConfirmacao = read.nextInt();
			// Confirma��o do pedido
			if (RecebeConfirmacao == 1) {
				System.out
						.println("Obrigade, " + getNome() + " por confiar no processo.\nEntraremos em contato em breve "
								+ "para informar a disponibilidade de suas necessidades.");
			}
			// Fazer mais pedidos ou doa��es
			else if (RecebeConfirmacao == 2) {
				Demanda(read);
			}
			// Zero os pedidos
			else if (RecebeConfirmacao == 3) {
				setRecebeAlimentos(0);
				setRecebeBrinquedo(0);
				setRecebeRoupas(0);
				setRecebeFarmacia(0);
				Demanda(read);
			}
			// Cancela os pedidos
			else {
				setRecebeAlimentos(0);
				setRecebeBrinquedo(0);
				setRecebeRoupas(0);
				setRecebeFarmacia(0);
				System.out.println("Sua solicita��o esteja cancelada, caso queira volte novamente ");
				break;
			}
		}
	}

}

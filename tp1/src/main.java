import java.util.Scanner;
import java.util.ArrayList;

public class main {

	static String[][] clientes = new String[10][10];
	static String[][] produtos = new String[10][10];
	static int totalEstoque = 0;
	static int totalClientes = 0;

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int opcaoMenu;

		do {
			System.out.println("----CONTROLE DE CLIENTES E PRODUTOS----");
			System.out.println("[1]Cadastrar Cliente");
			System.out.println("[2]Buscar cliente");
			System.out.println("[3]Cadastrar Produto");
			System.out.println("[4]Buscar Produto");
			System.out.println("[5]Cadastro de venda");
			System.out.println("[6]Estoque");
			System.out.println("[7]Sair");
			System.out.println("Digite o número da função que deseja realizar:");

			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {
			case 1:
				cadastroCliente();
				break;
			case 2:
				buscarCliente();
				break;
			case 3:
				cadastroProduto();
				break;
			case 4:
				buscarProduto();
				break;
			case 5:
				cadastroVenda();
				break;
			case 6:
				estoque();
				break;
			}

		} while (opcaoMenu != 7);

	}

	public static void cadastroCliente() {

		System.out.println("--------CADASTRO DE CLIENTE--------");
		System.out.println("Quantos clientes deseja cadastrar?");
		Scanner ler = new Scanner(System.in);
		int quantidadeClientes = ler.nextInt();

		for (int cont = 0; cont < quantidadeClientes; cont++) {
			System.out.println("Digite o nome do cliente:");
			ler.nextLine();
			String nomeCliente = ler.next();
			clientes[0][cont] = nomeCliente;
			System.out.println("Digite o endereço do cliente:");
			ler.nextLine();
			String enderecoCliente = ler.next();
			clientes[1][cont] = enderecoCliente;
			System.out.println("Digite o telefone do cliente:");
			ler.nextLine();
			String telefoneCliente = ler.next();
			clientes[2][cont] = telefoneCliente;
			totalClientes += 1;

			System.out.println("--------CLIENTE CADASTRADO COM SUCESSO--------");

		}
	}

	public static void buscarCliente() {
		System.out.println("--------BUSCAR CLIENTE--------");
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do cliente que deseja procurar:");
		String buscarCliente = ler.next();
		
		for(int i=0; i < totalClientes; i++) {
			if(clientes[0][i].equals(buscarCliente)) {
				System.out.println("Cliente encontrado");
				System.out.println("[1] Editar dados cadastrais");
				System.out.println("Ou digite qualquer tecla para voltar ao menu");
				int editarCliente = ler.nextInt();
				if (editarCliente == 1) {
						System.out.println("Digite o novo nome do cliente:");
						ler.nextLine();
						String nomeCliente = ler.next();
						clientes[0][i] = nomeCliente;
						System.out.println("Digite o novo endereço do cliente:");
						ler.nextLine();
						String enderecoCliente = ler.next();
						clientes[1][i] = enderecoCliente;
						System.out.println("Digite o novo telefone do cliente:");
						ler.nextLine();
						String telefoneCliente = ler.next();
						clientes[2][i] = telefoneCliente;
				}
			} else {
				System.out.println("Cliente não encontrado");
			}
		}
		
	}

	public static void cadastroProduto() {
		System.out.println("--------CADASTRAR PRODUTO--------");
		System.out.println("Quantos produtos deseja cadastrar?");
		Scanner ler = new Scanner(System.in);
		int quantidadeProdutos = ler.nextInt();

		for (int cont = 0; cont < quantidadeProdutos; cont++) {
			System.out.println("Digite o nome do produto");
			ler.nextLine();
			String nomeProduto = ler.next();
			produtos[0][cont] = nomeProduto;

			System.out.println("Digite uma descrição do produto:");
			ler.nextLine();
			String descricaoProduto = ler.next();
			produtos[1][cont] = descricaoProduto;

			System.out.println("Digite o valor de compra do produto:");
			ler.nextLine();
			String valorDeCompraProduto = ler.next();
			produtos[2][cont] = valorDeCompraProduto;

			System.out.println("Digite a porcentagem de lucro do produto:");
			ler.nextLine();
			String porcentagemProduto = ler.next();
			produtos[3][cont] = porcentagemProduto;

			System.out.println("Digite a quantidade do produto em estoque:");
			ler.nextLine();
			String quantidadeProduto = ler.next();
			produtos[4][cont] = quantidadeProduto;
			totalEstoque += 1;

			System.out.println("--------PRODUTO CADASTRADO--------");

		}
	}

	public static void buscarProduto() {
		System.out.println("--------BUSCAR PRODUTO--------");
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do produto que deseja procurar:");
		String buscaDeProduto = ler.next();
		
		for(int i=0; i < totalEstoque; i++) {
			if(produtos[0][i].equals(buscaDeProduto)) {
				System.out.println("Produto encontrado!");
				System.out.println("[1] Editar dados do produto");
				System.out.println("Ou digite qualquer tecla para voltar ao menu");
				int editarProduto = ler.nextInt();
				if (editarProduto == 1) {
					System.out.println("Digite o nome do produto");
					ler.nextLine();
					String nomeProduto = ler.next();
					produtos[0][i] = nomeProduto;

					System.out.println("Digite uma descrição do produto:");
					ler.nextLine();
					String descricaoProduto = ler.next();
					produtos[1][i] = descricaoProduto;

					System.out.println("Digite o valor de compra do produto:");
					ler.nextLine();
					String valorDeCompraProduto = ler.next();
					produtos[2][i] = valorDeCompraProduto;

					System.out.println("Digite a porcentagem de lucro do produto:");
					ler.nextLine();
					String porcentagemProduto = ler.next();
					produtos[3][i] = porcentagemProduto;

					System.out.println("Digite a quantidade do produto em estoque:");
					ler.nextLine();
					String quantidadeProduto = ler.next();
					produtos[4][i] = quantidadeProduto;
				}
			} else {
				System.out.println("Produto não encontrado");
			}
		}
		
	}

	public static void cadastroVenda() {
		System.out.println("--------CADASTRAR VENDA--------");
		for (int i = 0; totalClientes > i; i++) {
			System.out.println("- " + clientes[0][i]);
		}
		
		System.out.println("------------------------------------");
		System.out.println("Digite o nome do cliente comprador");
		Scanner ler = new Scanner(System.in);
		String clienteComprador = ler.next();
		
		System.out.println("------------------------------------");
		System.out.println("--------SEU ESTOQUE--------");
		String finalizarCompra = "n";
		for (int i = 0; totalEstoque > i; i++) {
			System.out.println(produtos[0][i]);
			}
		do {
			System.out.println("Digite o nome do produto comprado:");
			String compraProduto = ler.next();
			System.out.println("ITEM ADICIONADO NO CARRINHO!");
			System.out.println("Continuar comprando? (s/n)");
			finalizarCompra = ler.next();		
			
		} while ("s".equalsIgnoreCase(finalizarCompra));
		
		System.out.println("VENDA FEITA COM SUCESSO!!");
		
	
	}

	public static void estoque() {
		System.out.println("--------SEU ESTOQUE--------");

		for (int i = 0; i < totalEstoque; i++) {
			System.out.println("------------------------------------");
			System.out.println("Item:" + produtos[0][i]);
			System.out.println("Estoque:" + produtos[4][i]);
			System.out.println("Preço: R$ " + produtos[2][i]);
			System.out.println("------------------------------------");
		}
	}
	
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stoke myStoke = new Stoke();

        Scanner input = new Scanner(System.in);

        String name;
        String categoria;
        String validade;
        int quantidade;
        float preco;
        int option;
        Products produtoPesquisado;
        int optionUpdate;
        String update;

        while(true){
            System.out.println("--- Bem-vindo ao sitema do supermercado! ---");
            System.out.println("[1] - Inserir produto");
            System.out.println("[2] - Deletar produto");
            System.out.println("[3] - Atualizar produto");
            System.out.println("[4] - Pesquisar produto");
            System.out.println("[5] - Listar produtos");
            System.out.print("Selecione uma opção para continuar: ");
            option = input.nextInt();
            input.nextLine();
            switch(option){
                case 1:
                    System.out.print("Informe o nome do produto: ");
                    name = input.nextLine();
                    System.out.print("Informe a categoria do produto: ");
                    categoria = input.nextLine();
                    System.out.print("Informe a validade do produto: ");
                    validade = input.nextLine();
                    System.out.print("Informe a quantidade do produto: ");
                    quantidade = input.nextInt();
                    System.out.print("Informe o preço do produto: ");
                    preco = input.nextFloat();

                    Products produto = new Products(name, categoria, validade, quantidade, preco);
                    myStoke.inserirProduto(produto);
                    break;
                case 2:
                    System.out.print("Informe o nome do produto: ");
                    name = input.nextLine();
                    myStoke.deletarProduto(name);
                    break;
                case 3:
                    System.out.print("Informe o nome do produto: ");
                    name = input.nextLine();
                    System.out.println("O que deseja atualizar do produto: ");
                    System.out.println("[1] - Nome");
                    System.out.println("[2] - Categoria");
                    System.out.println("[3] - Validade");
                    System.out.println("[4] - Preço");
                    System.out.println("[5] - Quantidade");
                    optionUpdate = input.nextInt();
                    switch(optionUpdate){
                        case 1:
                            System.out.print("Informe o novo nome do produto: ");
                            update = input.nextLine();
                            produtoPesquisado = myStoke.pesquisarProduto(name);
                            produtoPesquisado.setName(update);
                            break;
                        case 2:
                            System.out.print("Informe a nova categoria do produto: ");
                            update = input.nextLine();
                            produtoPesquisado = myStoke.pesquisarProduto(name);
                            produtoPesquisado.setCategoria(update);
                            break;
                        case 3:
                            System.out.print("Informe a nova validade do produto: ");
                            update = input.nextLine();
                            produtoPesquisado = myStoke.pesquisarProduto(name);
                            produtoPesquisado.setValidade(update);
                            break;
                        case 4:
                            System.out.print("Informe o novo preço do produto: ");
                            preco = input.nextFloat();
                            produtoPesquisado = myStoke.pesquisarProduto(name);
                            produtoPesquisado.setPreco(preco);
                            break;
                        case 5:
                            System.out.print("Informe a nova quantidade do produto: ");
                            quantidade = input.nextInt();
                            produtoPesquisado = myStoke.pesquisarProduto(name);
                            produtoPesquisado.setQuantiadade(quantidade);
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Informe o nome do produto: ");
                    name = input.nextLine();
                    produtoPesquisado = myStoke.pesquisarProduto(name);
                    if(produtoPesquisado != null){
                        System.out.printf("%-14s | %-14s | %-11s | %-11s\n", "Nome", "Categoria", "Validade", "Preço");
                        System.out.printf("%-14s %-14s %-14s R$ %-14.2f\n", produtoPesquisado.getName(), produtoPesquisado.getCategoria(),
                                produtoPesquisado.getValidade(), produtoPesquisado.getPreco());
                    }
                    else{
                        System.out.println("Produto não encontrado no sistema");
                    }
                    break;
                case 5:
                    myStoke.listarProdutos();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("Selecione uma opção:");
            System.out.println("[1] - Voltar para o Menu");
            System.out.println("[2] - Sair do programa");
            option = input.nextInt();
            if(option == 2){
                break;
            }
        }
    }
}
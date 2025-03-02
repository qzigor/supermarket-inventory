import java.util.Scanner;

public class Main {
    public static void main(String[] args){

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

        System.out.println("Bem-vindo ao Supermarket inventory!!");
        while(true){
            System.out.println();
            System.out.println("--- Menu ---");
            System.out.println("[1] - Inserir produto");
            System.out.println("[2] - Deletar produto");
            System.out.println("[3] - Atualizar produto");
            System.out.println("[4] - Pesquisar produto");
            System.out.println("[5] - Listar produtos");
            System.out.print("Selecione uma opção para continuar: ");
            option = input.nextInt();
            input.nextLine();
            System.out.println();
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
                    if(myStoke.deletarProduto(name)){
                        System.out.println("Produto removido com sucesso.");
                    }
                    else{
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Informe o nome do produto: ");
                    name = input.nextLine();
                    System.out.println("[1] - Nome");
                    System.out.println("[2] - Categoria");
                    System.out.println("[3] - Validade");
                    System.out.println("[4] - Quantidade");
                    System.out.println("[5] - Preço");
                    System.out.print("O que deseja atualizar do produto: ");
                    optionUpdate = input.nextInt();
                    input.nextLine();
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
                        System.out.printf("%-14s | %-14s | %-11s | %-11s | %-11s\n", "Nome", "Categoria", "Validade", "Quantidade", "Preço");
                        System.out.printf("%-14s | %-14s | %-11s | %-11s | R$ %-11.2f\n", produtoPesquisado.getName(), produtoPesquisado.getCategoria(),
                                produtoPesquisado.getValidade(), produtoPesquisado.getQuantiadade(), produtoPesquisado.getPreco());
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
            System.out.println();
            System.out.println("[1] - Voltar para o Menu");
            System.out.println("[2] - Sair do programa");
            System.out.print("Selecione uma opção: ");
            option = input.nextInt();
            if(option == 2){
                break;
            }
        }
    }
}
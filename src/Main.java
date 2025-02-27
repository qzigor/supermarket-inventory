import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stoke myStoke = new Stoke();
        Scanner input = new Scanner(System.in);
        int option;
        String name;
        String categoria;
        String validade;
        float preco;

        while(true){
            System.out.println("--- Bem-vindo ao sitema do supermercado! ---");
            System.out.println("[1] - Inserir produto");
            System.out.println("[2] - Deletar produto");
            System.out.println("[3] - Listar produtos");
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
                    System.out.print("Informe o preço do produto: ");
                    preco = input.nextFloat();

                    Products produto = new Products(name, categoria, validade, preco);
                    myStoke.inserirProduto(produto);
                    break;
                case 2:
                    System.out.print("Informe o nome do produto: ");
                    name = input.nextLine();
                    myStoke.deletarProduto(name);
                    break;
                case 3:
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
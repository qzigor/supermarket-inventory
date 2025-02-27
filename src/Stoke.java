import java.util.ArrayList;

public class Stoke {

    ArrayList<Products> produtos = new ArrayList<>();

    public void inserirProduto(Products produto){
        produtos.add(produto);
    }

    public void deletarProduto(String name){
        produtos.removeIf(produto -> produto.getName().equalsIgnoreCase(name));
    }

    public void listarProdutos(){
        System.out.println("***** LISTA DE PRODUTOS *****");
        System.out.printf("%-14s | %-14s | %-11s | %-11s\n", "Nome", "Categoria", "Validade", "Preço");
        for(Products produto:produtos){
            System.out.printf("%-14s %-14s %-14s R$ %-14.2f\n", produto.getName(), produto.getCategoria(), produto.getValidade(), produto.getPreco());
        }
    }
}
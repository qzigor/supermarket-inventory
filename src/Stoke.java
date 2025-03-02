import java.util.ArrayList;

public class Stoke {

    private ArrayList<Products> produtos = new ArrayList<>();

    public void inserirProduto(Products produto){
        produtos.add(produto);
    }

    public boolean deletarProduto(String name){
        return produtos.removeIf(produto -> produto.getName().equalsIgnoreCase(name));
    }

    public Products pesquisarProduto(String name){
        for(Products produto:produtos){
            if(produto.getName().equalsIgnoreCase(name)){
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos(){
        System.out.println("***** LISTA DE PRODUTOS *****");
        System.out.printf("%-14s | %-14s | %-11s | %-11s | %-11s\n", "Nome", "Categoria", "Validade", "Quantidade", "Preço");
        for(Products produto:produtos){
            System.out.printf("%-14s | %-14s | %-11s | %-11s | R$ %-11.2f\n", produto.getName(),
                    produto.getCategoria(), produto.getValidade(), produto.getQuantiadade(), produto.getPreco());
        }
    }
}

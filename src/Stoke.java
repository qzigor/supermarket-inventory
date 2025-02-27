import java.util.ArrayList;

public class Stoke {

    ArrayList<Products> produtos = new ArrayList<>();

    public void inserirProduto(Products produto){
        produtos.add(produto);
    }

    public void listarProdutos(){
        for(Products produto:produtos){
            System.out.println(produto.getName());
        }
    }
}

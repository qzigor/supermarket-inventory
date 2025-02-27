public class Products {
    int ID;
    private String name;
    private String categoria;
    private String validade;
    private float preco;

    public Products(String name, String categoria, String validade, float preco){
        this.name = name;
        this.categoria = categoria;
        this.validade = validade;
        this.preco = preco;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setValidade(String validade){
        this.validade = validade;
    }

    public String getValidade(){
        return validade;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }

}


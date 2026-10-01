package one.digitalinnovation.gof.model;

public class Promocao {
    private String nomeProduto;
    private Double precoOriginal;
    private Double precoComDesconto;
    private String linkAfiliado;

    public Promocao(){

    }
    public Promocao(String nomeProduto, Double precoOriginal, Double precoComDesconto, String linkAfiliado) {
        this.nomeProduto = nomeProduto;
        this.precoOriginal = precoOriginal;
        this.precoComDesconto = precoComDesconto;
        this.linkAfiliado = linkAfiliado;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Double getPrecoOriginal() {
        return precoOriginal;
    }
    public void setPrecoOriginal(Double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }
    public Double getPrecoComDesconto() {
        return precoComDesconto;
    }
    public void setPrecoComDesconto(Double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }
    public String getLinkAfiliado() {
        return linkAfiliado;
    }
    public void setLinkAfiliado(String linkAfiliado) {
        this.linkAfiliado = linkAfiliado;
    }
    
    

}

package br.edu.uricer;

import java.math.BigDecimal;

public class Item {
    
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;

    public Item(){}
    
    public Item(String descricao, BigDecimal preco){
        produto = new Produto(descricao, preco);
    }

    public void setProduto(String descricao, BigDecimal preco) {
        produto.setDescricao(descricao);
        produto.setPreco(preco);
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    
    public void totalizar(){
        valorTotal = valorUnitario.multiply(quantidade);
    }
}

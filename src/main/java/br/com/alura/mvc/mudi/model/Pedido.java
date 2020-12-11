package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
  private String nomeProduto;
  private BigDecimal valorNegociavel;
  private LocalDate dataDaEntrega;
  private String urlProduto;
  private String urlImg;
  private String descricao;

  public String getNome() {
    return nomeProduto;
  }

  public void setNome(String nome) {
    this.nomeProduto = nome;
  }

  public BigDecimal getValorNegociavel() {
    return valorNegociavel;
  }

  public void setValorNegociavel(BigDecimal valorNegociavel) {
    this.valorNegociavel = valorNegociavel;
  }

  public LocalDate getDataDaEntrega() {
    return dataDaEntrega;
  }

  public void setDataDaEntrega(LocalDate dataDaEntegra) {
    this.dataDaEntrega = dataDaEntegra;
  }

  public String getUrlProduto() {
    return urlProduto;
  }

  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }

  public String getUrlImg() {
    return urlImg;
  }

  public void setUrlImg(String urlImg) {
    this.urlImg = urlImg;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}

package br.com.template.pedido;

import javafx.beans.property.SimpleStringProperty;

public class PedidoSP {
	
	private SimpleStringProperty id;
	private SimpleStringProperty pedido;
	private SimpleStringProperty qnt;
	private SimpleStringProperty valorUnit;
	private SimpleStringProperty valorParcial;
	
	public PedidoSP(String id, String pedido, String qnt, String valorUnit, String valorParcial) {

		this.id = new SimpleStringProperty(id);
		this.pedido = new SimpleStringProperty(pedido);
		this.qnt = new SimpleStringProperty(qnt);
		this.valorUnit = new SimpleStringProperty(valorUnit);
		this.valorParcial = new SimpleStringProperty(valorParcial);
	}
	
	public String getId() {
		return id.get();
	}
	public void setId(String id) {
		this.id.set(id);
	}
	public String getPedido() {
		return pedido.get();
	}
	public void setPedido(String pedido) {
		this.pedido.set(pedido);
	}
	public String getQnt() {
		return qnt.get();
	}
	public void setQnt(String qnt) {
		this.qnt.set(qnt);
	}
	public String getValorUnit() {
		return valorUnit.get();
	}
	public void setValorUnit(String valorUnit) {
		this.valorUnit.set(valorUnit);
	}
	public String getValorParcial() {
		return valorParcial.get();
	}
	public void setValorParcial(String valorParcial) {
		this.valorParcial.set(valorParcial);
	}
}
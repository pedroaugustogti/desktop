package br.com.template.mesa;

import javafx.beans.property.SimpleStringProperty;

public class MesaSP {
	
	private SimpleStringProperty numeroMesa;
	private SimpleStringProperty garcom;
	private SimpleStringProperty situacao;
	
	public MesaSP(){
		
	}
	
	public MesaSP(String numeroMesa, String garcom, String situacao) {
		super();
		this.numeroMesa = new SimpleStringProperty(numeroMesa);
		this.garcom = new SimpleStringProperty(garcom);
		this.situacao = new SimpleStringProperty(situacao);
	}
	
	public String getSituacao() {
		return situacao.get();
	}
	public void setSituacao(String situacao) {
		this.situacao.set(situacao);
	}
	
	public String getNumeroMesa() {
		return numeroMesa.get();
	}
	public void setNumeroMesa(String numeroMesa) {
		this.numeroMesa.set(numeroMesa);
	}
	public String getGarcom() {
		return garcom.get();
	}
	public void setGarcom(String garcom) {
		this.garcom.set(garcom);
	}
}

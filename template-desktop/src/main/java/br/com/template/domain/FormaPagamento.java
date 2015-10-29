package br.com.template.domain;



public enum FormaPagamento {

	DINHEIRO("Dinheiro"),
	DEBITO("Débito"),
	CREDITO("Crédito");
	
	private String label;
	
	private FormaPagamento(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
}
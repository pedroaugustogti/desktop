package br.com.template.domain;



public enum TipoProduto {

	C("Comida"),
	B("Bebida");
	
	private String label;
	
	private TipoProduto(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
}
package br.com.template.domain;

public enum SituacaoMesa {

	LIVRE("Livre"),
	OCUPADA("Ocupada");
	
	private String label;
	
	private SituacaoMesa(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
}
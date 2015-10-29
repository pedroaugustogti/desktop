package br.com.template.domain;



public enum Empresa {

	LOCAL_ONE("Local One", 
			Cargo.CAIXA, 
			Cargo.COZINHEIRO, 
			Cargo.GARCOM, 
			Cargo.GERENTE),
			
	BALADAPP("BaladApp"),
	FABRICA_SOFTWARE("Fábrica de Software");
	
	private String label;
	private Cargo[] cargos;
	
	private Empresa(String label, Cargo... cargos){
		this.label = label;
		this.cargos = cargos;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}

	public Cargo[] getCargos() {
		return cargos;
	}
}
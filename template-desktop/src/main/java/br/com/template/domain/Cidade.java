package br.com.template.domain;



public enum Cidade {

	BSB(Estado.DF,"Brasília"),
	TAGUA(Estado.DF,"Taguatinga"),
	AGUAS_C(Estado.DF,"Águas Claras"),
	CEI(Estado.DF,"Ceilândia"),
	SAMAMB(Estado.DF,"Samambaia"),
	RECANTO(Estado.DF,"Recanto das Emas"),
	RIACHO(Estado.DF,"Riacho Fundo"),
	
	LUZI(Estado.GO,"Luziânia"),
	AGUAS_L(Estado.GO,"Águas Lindas"),
	VAL_PARA(Estado.GO,"Val Paraíso");
	
	private String label;
	private Estado estado;
	
	private Cidade(Estado estado,String label){
		this.label = label;
		this.estado = estado;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
	
	public Estado getEstado() {
		return estado;
	}
}
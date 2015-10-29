package br.com.template.domain;



public enum SituacaoPedido {

	FILA("Na fila"),
	PREPARO("Em preparo"),
	CANCELADO("Cancelado"),
	CONCLUIDO("Concluído"),
	ENTREGUE("Entregue");
	
	private String label;
	
	private SituacaoPedido(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
}
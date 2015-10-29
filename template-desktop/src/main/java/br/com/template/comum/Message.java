package br.com.template.comum;

public enum Message {

	CAIXA("Caixa"), 
	
	MESA("Mesa"), 
	GARCOM("Garçom"), 
	DETALHAR("Detalhar"), 
	
	PEDIDO("Pedido"), 
	QUANTIDADE("Quantidade"), 
	VALOR_PARCIAL("Valor Parcial"),
	VALOR_UNITARIO("Valor Unitário"), 
	CANCELAR("Cancelar"), 
	PESQUISAR("Pesquisar"), 
	SITUACAO("Situação");
	
	private String label;
	
	Message(String label){
		
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
package br.com.template.domain;



public enum Medida {

	//subMedidas
	ML("ML"),
	G("Grama"),
	
	//Medidas
	KG("Kg", G),
	LT("Lt",ML),
	
	UNID("Unidade(s)");
	
	
	private String label;
	private Medida[] subMedida;
	
	private Medida(String label, Medida... subMedida){
		this.label = label;
		this.subMedida = subMedida;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}

	public static boolean isSubMedida(Medida medida, Medida subMed) {
		
		boolean retorno = Boolean.FALSE;
		
		if (medida != null){
			
			for (Medida subMedida : medida.subMedida){
				
				if (subMedida.equals(subMed)){
					retorno = Boolean.TRUE;
				}
			}
		}
		
		return retorno;
	}
}
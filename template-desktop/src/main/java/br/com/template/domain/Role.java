package br.com.template.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum Role {

	ADMIN("Admin", Empresa.BALADAPP, Empresa.LOCAL_ONE, Empresa.FABRICA_SOFTWARE),
	GARCOM("Garçom", Empresa.LOCAL_ONE),
	COZINHEIRO("Cozinheiro", Empresa.LOCAL_ONE),
	GERENTE("Gerente", Empresa.LOCAL_ONE);
	
	private String label;
	private Empresa[] empresas;
	
	private Role(String label, Empresa...empresas){
		this.label = label;
		this.empresas = empresas;
	}

	public String getLabel() {
		return label;
	}

	public static List<String> getLabelRoles(){
		
		List<String> listLabel = new ArrayList<String>();
		
		for (Role role : values()){
			
			listLabel.add(role.getLabel());
		}
		
		return listLabel;
	}
	
	public static Set<Role> getRolesPorLabel(String[] roles){
		
		Set<Role> listRoles = new HashSet<Role>();
		
		for (Role role : values()){
			
			for (String roleLabel : roles){
				
				if (role.getLabel().equals(roleLabel)){
					
					listRoles.add(role);
				}
			}
		}
		
		return listRoles;
	}

	public static Set<Role> getRolesPorCargo(Cargo cargo) {
		
		Set<Role> listRoles = new HashSet<Role>();
		
		for (Role role : values()){
			
			if (role.name().equals(cargo.name())){
				
				listRoles.add(role);
			}
		}
		
		return listRoles;
	}

	public Empresa[] getEmpresas() {
		return empresas;
	}
}
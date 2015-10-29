package br.com.template.pedido;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class TabelaDetalhePedidoAction {
	
	private final static ObservableList<PedidoSP> data =
            FXCollections.observableArrayList(new PedidoSP("1","Arroz","3","R$ 10,0", "R$ 30,0"));
	
	private static TableView<PedidoSP> tableView = TabelaDetalhePedidoLayout.getLayoutTabela();

	public static void detalhaMesa(String numeroMesa) {
		
		 tableView.setVisible(true);
		 tableView.setItems(data);
	}
}

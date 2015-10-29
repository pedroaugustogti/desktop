package br.com.template.pedido;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import br.com.template.comum.Message;

import com.sun.prism.impl.Disposer.Record;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class TabelaDetalhePedidoLayout {

	private static TableView<PedidoSP> tableView = new TableView<PedidoSP>();
	 
	static {
		
		 tableView.setVisible(false);
		 tableView.setEditable(Boolean.FALSE);
	     
	     addColunaPedido();
	     addColunaQuantidade();
	     addColunaValorUnitario();
	     addColunaValorParcial();
	     addColunaCancelarPedido();
	}

	private static void addColunaValorUnitario() {
		
		TableColumn<PedidoSP, String> valorUnitario = new TableColumn<PedidoSP, String>(Message.VALOR_UNITARIO.getLabel());
		valorUnitario.setCellValueFactory(new PropertyValueFactory<PedidoSP, String>("valorUnit"));
		tableView.getColumns().add(valorUnitario);
	}

	private static void addColunaCancelarPedido() {
		
		 TableColumn canvelarPedido = new TableColumn<>();
	     acaoBotaoCancelar(canvelarPedido);
	     tableView.getColumns().add(canvelarPedido);
		
	}

	private static void addColunaValorParcial() {
		
		TableColumn<PedidoSP, String> valorParcial = new TableColumn<PedidoSP, String>(Message.VALOR_PARCIAL.getLabel());
		valorParcial.setCellValueFactory(new PropertyValueFactory<PedidoSP, String>("valorParcial"));
		tableView.getColumns().add(valorParcial);
	}

	private static void addColunaQuantidade() {
		
		TableColumn<PedidoSP, String> qnt = new TableColumn<PedidoSP, String>(Message.QUANTIDADE.getLabel());
		qnt.setCellValueFactory(new PropertyValueFactory<PedidoSP, String>("qnt"));
		tableView.getColumns().add(qnt);
	}

	private static void addColunaPedido() {
		
		TableColumn<PedidoSP, String> pedido = new TableColumn<PedidoSP, String>(Message.PEDIDO.getLabel());
		pedido.setCellValueFactory(new PropertyValueFactory<PedidoSP, String>("pedido"));
		tableView.getColumns().add(pedido);
	}
	
	private static void acaoBotaoCancelar(TableColumn detalhar) {
		
		detalhar.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Record, Boolean>, 
                ObservableValue<Boolean>>() {

            @Override
            public ObservableValue<Boolean> call(TableColumn.CellDataFeatures<Record, Boolean> p) {
                return new SimpleBooleanProperty(p.getValue() != null);
            }
        });

		detalhar.setCellFactory(new Callback<TableColumn<Record, Boolean>, TableCell<Record, Boolean>>() {

            @Override
            public TableCell<Record, Boolean> call(TableColumn<Record, Boolean> p) {
                return new BotaoCancelar();
            }
        
        });
	}

	public static TableView<PedidoSP> getLayoutTabela() {
		return tableView;
	}
}
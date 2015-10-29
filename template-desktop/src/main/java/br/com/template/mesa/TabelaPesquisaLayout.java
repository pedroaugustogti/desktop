package br.com.template.mesa;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;
import br.com.template.comum.GridLayout;
import br.com.template.comum.Message;
import br.com.template.util.MascaraUtil;

import com.sun.prism.impl.Disposer.Record;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class TabelaPesquisaLayout {
	
	 private static TableView<MesaSP> tableView = null;
	 private static BotaoPesquisar btnPesquisar = null;
	 private static TextField tfMesa = null;
	 
	 //Dimensionamento TableView
	 private static final double WIDTH_TABELA_MESA = 360;
	 private static final double WIDTH_COLUNA_MESA = 50;
	 private static final double WIDTH_COLUNA_GARCOM = 150;
	 private static final double WIDTH_COLUNA_SITUACAO = 70;
	 
	static {
		
		tableView = new TableView<MesaSP>();
		tfMesa = new TextField();
		MascaraUtil.somenteNumeros(tfMesa);
		
		btnPesquisar = new BotaoPesquisar(tableView, tfMesa);
		
		tableView.setEditable(Boolean.FALSE);
		tableView.setMaxWidth(WIDTH_TABELA_MESA);
	     
	    addColunaNumeroMesa();
	    addColunaGarcom();
	    addColunaSituacao();
	    addColunaDetalhar();
	    
	    btnPesquisar.pesquisar();
	}
	
	public static Node getLayoutTabela() {
		
		GridPane grid = GridLayout.get();
		Label lbMesa = new Label(Message.MESA.getLabel());
		
		//Divisão GridPane
		final int PRIMEIRA_LINHA = 0;
		int COLUNA_PRIMEIRA_LINHA = 1;
		
		final int SEGUNDA_LINHA = 1;
		final int COLUNA_SEGUNDA_LINHA = 1;
		final int COLSPAN_SEGUNDA_LINHA = 3;
		final int ROWSPAN_SEGUNDA_LINHA = 1;
		
        grid.add(lbMesa, COLUNA_PRIMEIRA_LINHA, PRIMEIRA_LINHA);
        grid.add(tfMesa, ++COLUNA_PRIMEIRA_LINHA, PRIMEIRA_LINHA);
        grid.add(btnPesquisar, ++COLUNA_PRIMEIRA_LINHA, PRIMEIRA_LINHA);
        
        grid.add(tableView, COLUNA_SEGUNDA_LINHA, SEGUNDA_LINHA, COLSPAN_SEGUNDA_LINHA, ROWSPAN_SEGUNDA_LINHA);
        
		return grid;
	}

	private static void addColunaDetalhar() {

		TableColumn detalhar = new TableColumn<>();
	    acaoBotaoDetalhar(detalhar);
	    tableView.getColumns().add(detalhar);
	}
	
	private static void addColunaSituacao() {
		
		TableColumn<MesaSP, String> situacao = new TableColumn<MesaSP, String>(Message.SITUACAO.getLabel());
		situacao.setCellValueFactory(new PropertyValueFactory<MesaSP, String>("situacao"));
		situacao.setMinWidth(WIDTH_COLUNA_SITUACAO);
		tableView.getColumns().add(situacao);
	}

	private static void addColunaGarcom() {
		
		TableColumn<MesaSP, String> garcom = new TableColumn<MesaSP, String>(Message.GARCOM.getLabel());
		garcom.setCellValueFactory(new PropertyValueFactory<MesaSP, String>("garcom"));
		garcom.setMinWidth(WIDTH_COLUNA_GARCOM);
		tableView.getColumns().add(garcom);
	}

	private static void addColunaNumeroMesa() {
		
		TableColumn<MesaSP, String> numeroMesa = new TableColumn<MesaSP, String>(Message.MESA.getLabel());
		numeroMesa.setCellValueFactory(new PropertyValueFactory<MesaSP, String>("numeroMesa"));
		numeroMesa.setMinWidth(WIDTH_COLUNA_MESA);
		tableView.getColumns().add(numeroMesa);
	}
	
	private static void acaoBotaoDetalhar(TableColumn detalhar) {
		
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
                return new BotaoDetalhar();
            }
        
        });
	}
}
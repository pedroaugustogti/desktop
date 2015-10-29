package br.com.template.mesa;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import br.com.template.comum.Message;
import br.com.template.dao.MesaDao;
import br.com.template.dto.FiltroMesaDTO;
import br.com.template.entidade.Mesa;
import br.com.template.persistencia.Persistence;

public class BotaoPesquisar extends Button {
	
	private TableView<MesaSP> tableView;
	private TextField tfNumMesa;
	
	private MesaDao mesaDAO = Persistence.getInstance(MesaDao.class);
	
	public BotaoPesquisar(TableView<MesaSP> tableView, TextField tfNumMesa){
		
		configBotao(tableView, tfNumMesa);
		
		acaoBotaoPesquisar(tableView);
	}

	private void configBotao(TableView<MesaSP> tableView, TextField tfNumMesa) {
		
		this.tableView = tableView;
		this.tfNumMesa = tfNumMesa;
		this.setText(Message.PESQUISAR.getLabel());
	}
	
	public void pesquisar() {
		
		ObservableList<MesaSP> listMesas = null;
		List<Mesa> listEntidadeMesa = null;
		
		if (StringUtils.isBlank(tfNumMesa.getText())){
			
			listEntidadeMesa = mesaDAO.findAll();
		}else{
			
			FiltroMesaDTO filtroMesaDTO = new FiltroMesaDTO();
			
			filtroMesaDTO.setNumMesa(Integer.valueOf(tfNumMesa.getText()));
			
			listEntidadeMesa = mesaDAO.pesquisaPorNumeroMesa(filtroMesaDTO);
		}
    	
    	listMesas = converteParaMesaSP(listEntidadeMesa);
    	tableView.setItems(listMesas);
	}
	
	private void acaoBotaoPesquisar(final TableView<MesaSP> tableView) {
		
		this.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
            	
            	pesquisar();
            }
        });
	}

	private ObservableList<MesaSP> converteParaMesaSP(List<Mesa> listMesa) {
		
		List<MesaSP> listMesaSP = new ArrayList<MesaSP>();
		
		for (Mesa mesa : listMesa){
			
			MesaSP mesaSP = null;
			
			String numeroMesa = mesa.getNumMesa().toString();
			String garcom = mesa.getFuncionario().getPessoa().getNome();
			String situacao = mesa.getSituacaoMesa().getLabel();
			
			mesaSP = new MesaSP(numeroMesa, garcom, situacao);
			
			listMesaSP.add(mesaSP);
		}
		
		return FXCollections.observableArrayList(listMesaSP);
	}
	
}
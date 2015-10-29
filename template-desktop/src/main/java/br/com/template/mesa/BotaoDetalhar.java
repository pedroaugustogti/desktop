package br.com.template.mesa;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import br.com.template.comum.Message;
import br.com.template.pedido.TabelaDetalhePedidoAction;

import com.sun.prism.impl.Disposer.Record;

public class BotaoDetalhar extends TableCell<Record, Boolean> {
	
    final Button botaoDetalhar = new Button(Message.DETALHAR.getLabel());
        
    public BotaoDetalhar() {
        
        botaoDetalhar.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
            	MesaSP currentMesaSP = (MesaSP) BotaoDetalhar.this.getTableView().getItems().get(BotaoDetalhar.this.getIndex());
            	
            	TabelaDetalhePedidoAction.detalhaMesa(currentMesaSP.getNumeroMesa());
            }
        });
    }

    @Override
    protected void updateItem(Boolean t, boolean empty) {
    	
        super.updateItem(t, empty);
        
        if(!empty){
            setGraphic(botaoDetalhar);
        }
    }
}
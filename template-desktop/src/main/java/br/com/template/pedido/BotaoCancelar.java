package br.com.template.pedido;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import br.com.template.comum.Message;

import com.sun.prism.impl.Disposer.Record;
 //Define the button cell
public class BotaoCancelar extends TableCell<Record, Boolean> {
	
    final Button cellButton = new Button(Message.CANCELAR.getLabel());
        
    public BotaoCancelar() {
        
    	//Action when the button is pressed
        cellButton.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
            	PedidoSP currentPedidoSP = (PedidoSP) BotaoCancelar.this.getTableView().getItems().get(BotaoCancelar.this.getIndex());
            	System.out.println(currentPedidoSP.getPedido());
            }
        });
    }

    @Override
    protected void updateItem(Boolean t, boolean empty) {
    	
        super.updateItem(t, empty);
        
        if(!empty){
            setGraphic(cellButton);
        }
    }
}
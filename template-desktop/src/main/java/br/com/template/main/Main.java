package br.com.template.main;

import br.com.template.comum.Message;
import br.com.template.mesa.TabelaPesquisaLayout;
import br.com.template.pedido.TabelaDetalhePedidoLayout;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
	
	private BorderPane border = new BorderPane();
	
	@Override
	public void start(Stage stage) throws Exception {
		
		border.setLeft(TabelaPesquisaLayout.getLayoutTabela());
		border.setCenter(TabelaDetalhePedidoLayout.getLayoutTabela());
		
		Scene scene = new Scene(border);
		stage.setTitle(Message.CAIXA.getLabel());
		stage.setScene(scene);
		
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();

		stage.setX(bounds.getMinX());
		stage.setY(bounds.getMinY());
		stage.setWidth(bounds.getWidth());
		stage.setHeight(bounds.getHeight());
		
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
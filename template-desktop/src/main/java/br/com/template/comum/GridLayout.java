package br.com.template.comum;

import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class GridLayout {

	public static GridPane get(){
		
		GridPane root = new GridPane();
		root.setHgap(8);
		root.setVgap(8);
		root.setPadding(new Insets(5));
		
		ColumnConstraints cons1 = new ColumnConstraints();
		cons1.setHgrow(Priority.NEVER);
		root.getColumnConstraints().add(cons1);
		
		ColumnConstraints cons2 = new ColumnConstraints();
		cons2.setHgrow(Priority.ALWAYS);
		
		root.getColumnConstraints().addAll(cons1, cons2);
		
		RowConstraints rcons1 = new RowConstraints();
		rcons1.setVgrow(Priority.NEVER);
		
		RowConstraints rcons2 = new RowConstraints();
		rcons2.setVgrow(Priority.ALWAYS);  
		
		root.getRowConstraints().addAll(rcons1, rcons2);
		
		return root;
	}
}

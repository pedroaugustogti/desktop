package br.com.template.util;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public final class MascaraUtil {
	
	private MascaraUtil(){
		//nada a fazer
	}

	public static void somenteNumeros(final TextField textField) {
		textField.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(
					ObservableValue<? extends String> observableValue,
					String antigo, String novo) {
				if (!novo.isEmpty()) {
					try {
						Double.parseDouble(novo);
					} catch (NumberFormatException e) {
						desfazAlteracao(antigo, textField);
					}
				}
			}
		});
	}

	private static void desfazAlteracao(String antigo, TextField textField) {
		if (antigo != null && !antigo.isEmpty()) {
			textField.setText(antigo);
		} else {
			textField.clear();
		}
	}
}
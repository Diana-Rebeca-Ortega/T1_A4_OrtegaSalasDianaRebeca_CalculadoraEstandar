import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

public class LogicaCalculadora {
	//****************************************************************************************************************************************
	public JTextField  BorrarCero (  JTextField cajaResultado) {
		String cadena =String.valueOf(cajaResultado.getText());
		if(cadena.length()==2  ) {
			if(cadena.charAt(0)=='0') {
				cadena= String.valueOf(cadena.charAt(1));
				cajaResultado.setText(cadena);	}	}
		return cajaResultado ;
	}
	//****************************************************************************************************************************************
	public JTextField  BorrarUltimoNumero (  JTextField cajaResultado, ActionEvent e, JButton btnBorrar) {
		String cadena = cajaResultado.getText();
		if(e.getSource()==btnBorrar) {
			if(cadena.length()==1 || cadena.charAt(0)=='0' ) {
				cajaResultado.setText("0");
			}else{
				if(e.getSource()==btnBorrar) {
					cajaResultado.setText(cadena.substring(0,cadena.length()-1));}}}
		return cajaResultado;
	}
	//****************************************************************************************************************************************
	
	
	
}//logic

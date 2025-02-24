import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class VentanaInicio extends JFrame implements ActionListener{

	JButton btn0,btn1, btn2, btn3 ,btn4 , btn5 , btn6, btn7 , btn8, btn9, btnPunto;
	JButton btnBorrar;
	JTextField cajaResultado;
	JButton btnDividir, btnIgual ;
	LogicaCalculadora c1 = new LogicaCalculadora();
	public VentanaInicio() {
		getContentPane().setBackground(new Color (210,247,247));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//para que no queden registros en la ram
		setTitle("Calculadora");
		setSize(300, 310);
		setLocationRelativeTo(null);//locacion en la ventana
		setVisible(true);

		Icon icon = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\ICONOS\\ajustes.png");
		Icon iconReiniciar = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\ICONOS\\reiniciar.png");
		Icon iconBorrar = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\ICONOS\\borrar.png");

		JButton btnAjustes = new JButton (icon);
		btnAjustes.setBounds(0, 0, 19, 19);
		add(btnAjustes);

		JLabel txtEstandar = new JLabel ("Estandar");
		txtEstandar.setHorizontalAlignment(JTextField.CENTER);//centrar texto
		txtEstandar.setFont(new Font("Arial", Font.BOLD, 20));
		txtEstandar.setBounds(21, 0, 270, 27);
		add(txtEstandar);

		JButton btnReiniciar = new JButton (iconReiniciar);
		btnReiniciar.setBounds(260, 0, 24, 20);
		add(btnReiniciar);

		cajaResultado =  new JTextField("0");
		cajaResultado.setBackground(new Color (230,247,247));
		cajaResultado.setHorizontalAlignment(JTextField.RIGHT);//Alinear texto a la derecha 
		cajaResultado.setFont(new Font("Arial", Font.BOLD, 30));
		cajaResultado.setBounds(0, 30, 285, 40);
		add(cajaResultado );

		//Primera fila 
		JButton btnPorcentaje = new JButton ("%");
		btnPorcentaje.setBounds(0,90, 70, 30);
		btnPorcentaje.setBackground(new Color (210,247,247));
		add(btnPorcentaje);

		JButton btnRaiz = new JButton ("√");
		btnRaiz.setBounds(70,90, 70, 30);
		btnRaiz.setBackground(new Color (210,247,247));
		add(btnRaiz);

		JButton btnCuadrado = new JButton (" x² ");
		btnCuadrado.setBounds(140,90, 75, 30);
		btnCuadrado.setBackground(new Color (210,247,247));
		add(btnCuadrado);

		JButton btnUnoEntreX = new JButton (" 1/x ");
		btnUnoEntreX.setBounds(215,90, 75, 30);
		btnUnoEntreX.setBackground(new Color (210,247,247));
		add(btnUnoEntreX);

		//Segunda fila 
		JButton btnCE = new JButton ("CE");
		btnCE.setBounds(0,120, 70, 30);
		btnCE.setBackground(new Color (226,247,255));
		add(btnCE);

		JButton btnC = new JButton ("C");
		btnC.setBounds(70,120, 70, 30);
		btnC.setBackground(new Color (226,247,255));
		add(btnC);

		btnBorrar = new JButton (iconBorrar);
		btnBorrar.setBounds(140,120, 75, 30);
		btnBorrar.setBackground(new Color (226,247,255));
		add(btnBorrar);
		btnBorrar.addActionListener(this);

		btnDividir = new JButton (" / ");
		btnDividir.setBounds(215,120, 75, 30);
		btnDividir.setBackground(new Color (226,247,255));
		add(btnDividir);
		btnDividir.addActionListener(this);

		//Tercera fila 
		btn7 = new JButton ("7");
		btn7.setBounds(0,150, 70, 30);
		btn7.setBackground(new Color (226,247,255));
		add(btn7);
		btn7.addActionListener(this);

		btn8 = new JButton ("8");
		btn8.setBounds(70,150, 70, 30);
		btn8.setBackground(new Color (226,247,255));
		add(btn8);
		btn8.addActionListener(this);

		btn9 = new JButton ("9");
		btn9.setBounds(140,150, 75, 30);
		btn9.setBackground(new Color (226,247,255));
		add(btn9);
		btn9.addActionListener(this);

		JButton btnmultiplicar = new JButton (" X ");
		btnmultiplicar.setBounds(215,150, 75, 30);
		btnmultiplicar.setBackground(new Color (226,247,255));
		add(btnmultiplicar);

		//Cuarta fila 
		btn4 = new JButton ("4");
		btn4.setBounds(0,180, 70, 30);
		btn4.setBackground(new Color (226,247,255));
		add(btn4);
		btn4.addActionListener(this);

		btn5 = new JButton ("5");
		btn5.setBounds(70,180, 70, 30);
		btn5.setBackground(new Color (226,247,255));
		add(btn5);
		btn5.addActionListener(this);

		btn6 = new JButton ("6");
		btn6.setBounds(140,180, 75, 30);
		btn6.setBackground(new Color (226,247,255));
		add(btn6);
		btn6.addActionListener(this);

		JButton btnRestar = new JButton (" - ");
		btnRestar.setBounds(215,180, 75, 30);
		btnRestar.setBackground(new Color (226,247,255));
		add(btnRestar);

		//quinta fila 
		btn1 = new JButton ("1");
		btn1.setBounds(0,210, 70, 30);
		btn1.setBackground(new Color (226,247,255));
		add(btn1);
		btn1.addActionListener(this);

		btn2= new JButton ("2");
		btn2.setBounds(70,210, 70, 30);
		btn2.setBackground(new Color (226,247,255));
		add(btn2);
		btn2.addActionListener(this);

		btn3 = new JButton ("3");
		btn3.setBounds(140,210, 75, 30);
		btn3.setBackground(new Color (226,247,255));
		add(btn3);
		btn3.addActionListener(this);

		JButton btnMas = new JButton (" + ");
		btnMas.setBounds(215,210, 75, 30);
		btnMas.setBackground(new Color (226,247,255));
		add(btnMas);

		//sexta fila 
		JButton btnMasMenos = new JButton ("+-");
		btnMasMenos.setBounds(0,240, 70, 30);
		btnMasMenos.setBackground(new Color (226,247,255));
		add(btnMasMenos);

		btn0= new JButton ("0");
		btn0.setBounds(70,240, 70, 30);
		btn0.setBackground(new Color (226,247,255));
		add(btn0);
		btn0.addActionListener(this);

		btnPunto = new JButton (".");
		btnPunto.setBounds(140,240, 75, 30);
		btnPunto.setBackground(new Color (226,247,255));
		add(btnPunto);
		btnPunto.addActionListener(this);

		btnIgual = new JButton (" = ");
		btnIgual.setBounds(215,240, 75, 30);
		btnIgual.setBackground(new Color (226,247,255));
		add(btnIgual);
		btnIgual.addActionListener(this);



	}
	Double primero, segundo;
	String operador;
	int conteo=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		c1.BorrarUltimoNumero(cajaResultado, e, btnBorrar);
		if(e.getSource()==btnDividir) {
			conteo++;
			if(operador==null) {
				primero= Double.parseDouble(  String.valueOf(cajaResultado.getText())) ;
				cajaResultado.setText("0");
				operador="/";
			}else {
				segundo= Double.parseDouble(  String.valueOf(cajaResultado.getText())) ;
			}

			if(conteo>1) {
				switch (operador){
				case "/":System.out.println("dividir");
				cajaResultado.setText(String.valueOf(	primero/segundo));
				break;
				}
			}
		}
		if(e.getSource()==btnIgual) {
			segundo= Double.parseDouble(  String.valueOf(cajaResultado.getText())) ;
			switch (operador){
			case "/":
				cajaResultado.setText(String.valueOf(	primero/segundo));
				break;
			}

		}

		if(e.getSource()==btn0) {
			cajaResultado.setText(cajaResultado.getText()+"0");
			c1.BorrarCero(cajaResultado);

		}else if(e.getSource()==btn1) {
			cajaResultado.setText(cajaResultado.getText()+"1");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn2) {
			cajaResultado.setText(cajaResultado.getText()+"2");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn3) {
			cajaResultado.setText(cajaResultado.getText()+"3");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn4) {
			cajaResultado.setText(cajaResultado.getText()+"4");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn5) {
			cajaResultado.setText(cajaResultado.getText()+"5");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn6) {
			cajaResultado.setText(cajaResultado.getText()+"6");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn7) {
			cajaResultado.setText(cajaResultado.getText()+"7");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn8) {
			cajaResultado.setText(cajaResultado.getText()+"8");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btn9) {
			cajaResultado.setText(cajaResultado.getText()+"9");
			c1.BorrarCero(cajaResultado);
		}else if(e.getSource()==btnPunto) {
			cajaResultado.setText(cajaResultado.getText()+".");

		}



	}

}
public class CalculadoraEstandar {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run(){
				new VentanaInicio();
			}
		});
		new VentanaInicio();}

}

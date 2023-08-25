package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 328);
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 249, 328);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			
			//painel "0": textfield
			JPanel panel = new JPanel();
			contentPane.add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			
			textField = new JTextField();
			textField.setBackground(new Color(255, 255, 255));
			panel.add(textField);
			textField.setColumns(20);
			
			//painel 1: botão calcular
			JPanel panel_1 = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			contentPane.add(panel_1, BorderLayout.SOUTH);
			
			JButton buttonCalcular = new JButton("Calcular");
			panel_1.add(buttonCalcular);
			
			//painel 2: botões 
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(null);
			contentPane.add(panel_2, BorderLayout.CENTER);
			panel_2.setLayout(new GridLayout(4, 4, 0, 0));
			
			JButton[] vetBotoes = {new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+"),
					new JButton("4"), new JButton("5"), new JButton("6"), new JButton("-"),
					new JButton("7"), new JButton("8"), new JButton("9"), new JButton("/"),
					new JButton("0"), new JButton("^"), new JButton("C"), new JButton("CE")};
			
			for (int i = 0; i < vetBotoes.length; i++) {

			panel_2.add(vetBotoes[i]);
				
			}
	}

}

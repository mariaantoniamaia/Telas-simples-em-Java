package cadastro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JButton;

public class CadastroDeCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField_CPF;
	private JTextField textField_nome;
	private JTextField textField_endereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeCliente frame = new CadastroDeCliente();
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
	public CadastroDeCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel JLabelCPF = new JLabel("CPF:");
		JLabelCPF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel1.add(JLabelCPF);
		
		textField_CPF = new JTextField();
		panel1.add(textField_CPF);
		textField_CPF.setColumns(10);
		
		JLabel JLabelNome = new JLabel("Nome:");
		JLabelNome.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel1.add(JLabelNome);
		
		textField_nome = new JTextField();
		panel1.add(textField_nome);
		textField_nome.setColumns(32);
		
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel2);
		
		JLabel JLabelEndereco = new JLabel("Endereço:");
		JLabelEndereco.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel2.add(JLabelEndereco);
		
		textField_endereco = new JTextField();
		panel2.add(textField_endereco);
		textField_endereco.setColumns(22);
		
		JLabel JLabelProfissao = new JLabel("Profissão:");
		JLabelProfissao.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel2.add(JLabelProfissao);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(122, 24));
		panel2.add(comboBox);
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel3);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel3.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel3.add(btnLimpar);
	}

}

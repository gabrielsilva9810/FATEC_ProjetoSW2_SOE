package view2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class TelaCoordenador extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBase frame = new TelaBase();// CHAMADA PARA TELA
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//====================================================================================================================================
//============================================================ TELA BASE =============================================================
//====================================================================================================================================
	public TelaCoordenador() {
		setBackground(new Color(214, 220, 228));
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\\\Gabriel Silva\\\\Area de Trabalho\\\\FATEC\\\\OneDrive - Fatec Centro Paula Souza\\\\PROJETOS_GITHUB\\\\ENGENHARIA_SW2\\\\IMG"));
		setTitle("SOE - Sistema de Orientação Estudantil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1024, 680);// TAMANHO DA TELA
		contentPane = new JPanel();
		contentPane.setBackground(new Color(214, 220, 228));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//----------------------------------------------------------------------------------------------------------------------------
		JLabel LOGO = new JLabel("");
		LOGO.setHorizontalAlignment(SwingConstants.CENTER);
		LOGO.setVerticalAlignment(SwingConstants.TOP);
		LOGO.setBackground(new Color(132, 151, 176));
		LOGO.setIcon(new ImageIcon("E:\\Gabriel Silva\\Area de Trabalho\\FATEC\\OneDrive - Fatec Centro Paula Souza\\PROJETOS_GITHUB\\ENGENHARIA_SW2\\IMG\\logoSOE.png"));
		LOGO.setBounds(0, 0, 207, 93);
		contentPane.add(LOGO);
		
		//----------------------------------------------------------------------------------------------------------------------------
		txtSistemaDeOrientacao = new JTextField();
		txtSistemaDeOrientacao.setEditable(false);
		txtSistemaDeOrientacao.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSistemaDeOrientacao.setForeground(new Color(255, 255, 255));
		txtSistemaDeOrientacao.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtSistemaDeOrientacao.setText("SISTEMA DE ORIENTAÇÃO ESTUDANTIL      ");
		txtSistemaDeOrientacao.setBackground(new Color(132, 151, 176));
		txtSistemaDeOrientacao.setBounds(0, 0, 1008, 93);
		contentPane.add(txtSistemaDeOrientacao);
		txtSistemaDeOrientacao.setColumns(10);
		
		txtPropriedadeDaFatec_1 = new JTextField();
		txtPropriedadeDaFatec_1.setText("Propriedade da FATEC Zona Leste. Todos os direitos reservados ®");
		txtPropriedadeDaFatec_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPropriedadeDaFatec_1.setForeground(Color.WHITE);
		txtPropriedadeDaFatec_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPropriedadeDaFatec_1.setEditable(false);
		txtPropriedadeDaFatec_1.setColumns(10);
		txtPropriedadeDaFatec_1.setBackground(new Color(132, 151, 176));
		txtPropriedadeDaFatec_1.setBounds(0, 616, 1008, 25);
		contentPane.add(txtPropriedadeDaFatec_1);
		
		labelAmarelaBottomPropriedadeDaFatec = new JTextField();
		labelAmarelaBottomPropriedadeDaFatec.setHorizontalAlignment(SwingConstants.CENTER);
		labelAmarelaBottomPropriedadeDaFatec.setForeground(Color.WHITE);
		labelAmarelaBottomPropriedadeDaFatec.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelAmarelaBottomPropriedadeDaFatec.setEditable(false);
		labelAmarelaBottomPropriedadeDaFatec.setColumns(10);
		labelAmarelaBottomPropriedadeDaFatec.setBackground(new Color(191, 143, 0));
		labelAmarelaBottomPropriedadeDaFatec.setBounds(0, 612, 1008, 5);
		contentPane.add(labelAmarelaBottomPropriedadeDaFatec);
		
		labelAmarelaTOP = new JTextField();
		labelAmarelaTOP.setHorizontalAlignment(SwingConstants.CENTER);
		labelAmarelaTOP.setForeground(Color.WHITE);
		labelAmarelaTOP.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelAmarelaTOP.setEditable(false);
		labelAmarelaTOP.setColumns(10);
		labelAmarelaTOP.setBackground(new Color(191, 143, 0));
		labelAmarelaTOP.setBounds(0, 92, 1008, 5);
		contentPane.add(labelAmarelaTOP);
		
		JButton btnLimparDados = new JButton("Voltar");
		btnLimparDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimparDados.setBounds(518, 511, 125, 32);
		contentPane.add(btnLimparDados);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(177, 179, 57, 25);
		contentPane.add(passwordField);
		
		JLabel lblRegrasTcc = new JLabel("Regras TCC");
		lblRegrasTcc.setBounds(666, 159, 119, 25);
		contentPane.add(lblRegrasTcc);
		
		JPanel panel = new JPanel();
		panel.setBounds(493, 184, 452, 316);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(127, 34, 274, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTipoDeProjeto = new JLabel("Tipo de Projeto");
		lblTipoDeProjeto.setBounds(40, 38, 119, 25);
		panel.add(lblTipoDeProjeto);
		
		JLabel lblQuantidadeDeAlunos = new JLabel("Quantidade de Alunos");
		lblQuantidadeDeAlunos.setBounds(10, 96, 119, 25);
		panel.add(lblQuantidadeDeAlunos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 92, 274, 33);
		panel.add(textField_1);
		
		JLabel lblTemplatesDeExemplo = new JLabel("Templates de Exemplo");
		lblTemplatesDeExemplo.setBounds(10, 150, 119, 25);
		panel.add(lblTemplatesDeExemplo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 152, 274, 33);
		panel.add(textField_2);
		
		JLabel lblTempoDeEntrega = new JLabel("Tempo de Entrega Final");
		lblTempoDeEntrega.setBounds(10, 199, 119, 25);
		panel.add(lblTempoDeEntrega);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(127, 196, 274, 33);
		panel.add(textField_3);
		
		JLabel lblBanca = new JLabel("Banca");
		lblBanca.setBounds(93, 256, 119, 25);
		panel.add(lblBanca);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(127, 252, 274, 33);
		panel.add(textField_4);
		
		JButton btnRegras_1_1 = new JButton("Gravar");
		btnRegras_1_1.setBounds(811, 511, 119, 32);
		contentPane.add(btnRegras_1_1);
		
		JButton btnCriarNovo = new JButton("Criar Novo");
		btnCriarNovo.setBounds(54, 397, 153, 32);
		contentPane.add(btnCriarNovo);
		
		JLabel lblTipoDeProjeto_1 = new JLabel("Tipo de Projeto");
		lblTipoDeProjeto_1.setBounds(87, 143, 119, 25);
		contentPane.add(lblTipoDeProjeto_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setBounds(177, 218, 57, 25);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setToolTipText("");
		passwordField_2.setBounds(177, 264, 57, 25);
		contentPane.add(passwordField_2);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setToolTipText("");
		passwordField_3.setBounds(177, 311, 57, 25);
		contentPane.add(passwordField_3);
		
		JButton btnRegras_1_1_1 = new JButton("Upload Template");
		btnRegras_1_1_1.setBounds(662, 511, 139, 32);
		contentPane.add(btnRegras_1_1_1);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

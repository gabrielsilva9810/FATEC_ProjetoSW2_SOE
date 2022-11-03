package view;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.List;
import javax.swing.JTabbedPane;
import javax.swing.JProgressBar;
import java.awt.SystemColor;

public class Tela_Pag45 extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JPanel BancasNotas;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNotas;
	private JTextField textField_1;
	private JPanel Dashboard;
	private JTextField textField_2;
	private JLabel lblTurma;
	private JTextField textField_3;
	private JLabel lblNotas_2;
	private JLabel lblNotas_3;
	private JTextField textField_4;
	private JPanel DASHBOARD_apresentado;
	private JButton btnGerarDashboard;
	private JButton btnLimpar;
	private JPanel Vínculos;
	private JTextField textField_5;
	private JLabel lblGrupo;
	private JTextField textField_6;
	private JLabel lblNotas_1;
	private JLabel lblNotas_4;
	private JTextField textField_7;
	private JPanel DASHBOARD_apresentado_1;
	private JButton btnGerarDashboard_1;
	private JButton btnLimpar_1;
	private JLabel lblAndamento;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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
	public Tela_Pag45() {
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
		LOGO.setBounds(0, 0, 207, 93);
		LOGO.setHorizontalAlignment(SwingConstants.CENTER);
		LOGO.setVerticalAlignment(SwingConstants.TOP);
		LOGO.setBackground(new Color(132, 151, 176));
		LOGO.setIcon(new ImageIcon("E:\\Gabriel Silva\\Area de Trabalho\\FATEC\\OneDrive - Fatec Centro Paula Souza\\PROJETOS_GITHUB\\ENGENHARIA_SW2\\IMG\\logoSOE.png"));
		contentPane.add(LOGO);
		
		//----------------------------------------------------------------------------------------------------------------------------
		txtSistemaDeOrientacao = new JTextField();
		txtSistemaDeOrientacao.setBounds(0, 0, 1008, 93);
		txtSistemaDeOrientacao.setEditable(false);
		txtSistemaDeOrientacao.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSistemaDeOrientacao.setForeground(new Color(255, 255, 255));
		txtSistemaDeOrientacao.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtSistemaDeOrientacao.setText("SISTEMA DE ORIENTAÇÃO ESTUDANTIL      ");
		txtSistemaDeOrientacao.setBackground(new Color(132, 151, 176));
		contentPane.add(txtSistemaDeOrientacao);
		txtSistemaDeOrientacao.setColumns(10);
		
		txtPropriedadeDaFatec_1 = new JTextField();
		txtPropriedadeDaFatec_1.setBounds(0, 616, 1008, 25);
		txtPropriedadeDaFatec_1.setText("Propriedade da FATEC Zona Leste. Todos os direitos reservados ®");
		txtPropriedadeDaFatec_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPropriedadeDaFatec_1.setForeground(Color.WHITE);
		txtPropriedadeDaFatec_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPropriedadeDaFatec_1.setEditable(false);
		txtPropriedadeDaFatec_1.setColumns(10);
		txtPropriedadeDaFatec_1.setBackground(new Color(132, 151, 176));
		contentPane.add(txtPropriedadeDaFatec_1);
		
		labelAmarelaBottomPropriedadeDaFatec = new JTextField();
		labelAmarelaBottomPropriedadeDaFatec.setBounds(0, 612, 1008, 5);
		labelAmarelaBottomPropriedadeDaFatec.setHorizontalAlignment(SwingConstants.CENTER);
		labelAmarelaBottomPropriedadeDaFatec.setForeground(Color.WHITE);
		labelAmarelaBottomPropriedadeDaFatec.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelAmarelaBottomPropriedadeDaFatec.setEditable(false);
		labelAmarelaBottomPropriedadeDaFatec.setColumns(10);
		labelAmarelaBottomPropriedadeDaFatec.setBackground(new Color(191, 143, 0));
		contentPane.add(labelAmarelaBottomPropriedadeDaFatec);
		
		labelAmarelaTOP = new JTextField();
		labelAmarelaTOP.setBounds(0, 92, 1008, 5);
		labelAmarelaTOP.setHorizontalAlignment(SwingConstants.CENTER);
		labelAmarelaTOP.setForeground(Color.WHITE);
		labelAmarelaTOP.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelAmarelaTOP.setEditable(false);
		labelAmarelaTOP.setColumns(10);
		labelAmarelaTOP.setBackground(new Color(191, 143, 0));
		contentPane.add(labelAmarelaTOP);
		
		JTabbedPane tabbedAbas = new JTabbedPane(JTabbedPane.TOP);
		tabbedAbas.setBounds(53, 119, 921, 486);
		contentPane.add(tabbedAbas);
		
		BancasNotas = new JPanel();
		tabbedAbas.addTab("Bancas e Notas", null, BancasNotas, null);
		BancasNotas.setLayout(null);
		
		lblNewLabel = new JLabel("Banca");
		lblNewLabel.setBounds(63, 67, 46, 14);
		BancasNotas.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(124, 64, 158, 20);
		BancasNotas.add(textField);
		textField.setColumns(10);
		
		lblNotas = new JLabel("Notas");
		lblNotas.setBounds(63, 111, 46, 14);
		BancasNotas.add(lblNotas);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 108, 158, 20);
		BancasNotas.add(textField_1);
		
		Dashboard = new JPanel();
		Dashboard.setLayout(null);
		tabbedAbas.addTab("Dashboard", null, Dashboard, null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 64, 158, 20);
		Dashboard.add(textField_2);
		
		lblTurma = new JLabel("Turma");
		lblTurma.setBounds(63, 111, 46, 14);
		Dashboard.add(lblTurma);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 108, 158, 20);
		Dashboard.add(textField_3);
		
		lblNotas_2 = new JLabel("Nome");
		lblNotas_2.setBounds(63, 67, 46, 14);
		Dashboard.add(lblNotas_2);
		
		lblNotas_3 = new JLabel("Notas");
		lblNotas_3.setBounds(63, 160, 46, 14);
		Dashboard.add(lblNotas_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 157, 158, 20);
		Dashboard.add(textField_4);
		
		DASHBOARD_apresentado = new JPanel();
		DASHBOARD_apresentado.setBounds(541, 64, 312, 293);
		Dashboard.add(DASHBOARD_apresentado);
		
		btnGerarDashboard = new JButton("Gerar");
		btnGerarDashboard.setBounds(193, 200, 89, 23);
		Dashboard.add(btnGerarDashboard);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(63, 200, 89, 23);
		Dashboard.add(btnLimpar);
		
		Vínculos = new JPanel();
		Vínculos.setLayout(null);
		tabbedAbas.addTab("Vinculos", null, Vínculos, null);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(124, 143, 158, 20);
		Vínculos.add(textField_5);
		
		lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(68, 171, 46, 14);
		Vínculos.add(lblGrupo);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(124, 174, 158, 20);
		Vínculos.add(textField_6);
		
		lblNotas_1 = new JLabel("Orientador");
		lblNotas_1.setBounds(68, 146, 76, 14);
		Vínculos.add(lblNotas_1);
		
		lblNotas_4 = new JLabel("Tema");
		lblNotas_4.setBounds(68, 202, 46, 14);
		Vínculos.add(lblNotas_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(124, 199, 158, 20);
		Vínculos.add(textField_7);
		
		DASHBOARD_apresentado_1 = new JPanel();
		DASHBOARD_apresentado_1.setBounds(541, 64, 312, 293);
		Vínculos.add(DASHBOARD_apresentado_1);
		
		btnGerarDashboard_1 = new JButton("Gerar");
		btnGerarDashboard_1.setBounds(200, 282, 89, 23);
		Vínculos.add(btnGerarDashboard_1);
		
		btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.setBounds(68, 282, 89, 23);
		Vínculos.add(btnLimpar_1);
		
		lblAndamento = new JLabel("Andamento");
		lblAndamento.setBounds(64, 241, 66, 14);
		Vínculos.add(lblAndamento);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 120, 215));
		progressBar.setStringPainted(true);
		progressBar.setBounds(124, 243, 158, 14);
		Vínculos.add(progressBar);
		
		JLabel lblNotas_1_1 = new JLabel("Curso");
		lblNotas_1_1.setBounds(68, 117, 76, 14);
		Vínculos.add(lblNotas_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(124, 114, 158, 20);
		Vínculos.add(textField_8);
		
		JLabel lblNotas_1_1_1 = new JLabel("Nome");
		lblNotas_1_1_1.setBounds(69, 91, 76, 14);
		Vínculos.add(lblNotas_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(124, 86, 158, 20);
		Vínculos.add(textField_9);
		
		JPanel Termo = new JPanel();
		Termo.setLayout(null);
		tabbedAbas.addTab("Termo", null, Termo, null);
		
		JPanel DASHBOARD_apresentado_1_1 = new JPanel();
		DASHBOARD_apresentado_1_1.setBounds(541, 64, 312, 293);
		Termo.add(DASHBOARD_apresentado_1_1);
		
		JButton btnGerarDashboard_1_1 = new JButton("Gerar Termo");
		btnGerarDashboard_1_1.setBounds(181, 194, 110, 23);
		Termo.add(btnGerarDashboard_1_1);
		
		JButton btnLimpar_1_1 = new JButton("Imprimir");
		btnLimpar_1_1.setBounds(663, 368, 89, 23);
		Termo.add(btnLimpar_1_1);
		
		JLabel lblNotas_1_1_1_1 = new JLabel("Termo");
		lblNotas_1_1_1_1.setBounds(676, 39, 76, 14);
		Termo.add(lblNotas_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(89, 97, 46, 14);
		Termo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("RA");
		lblNewLabel_1_1.setBounds(89, 147, 46, 14);
		Termo.add(lblNewLabel_1_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(119, 94, 172, 20);
		Termo.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(119, 144, 172, 20);
		Termo.add(textField_11);
		
		JButton btnGerarDashboard_1_1_1 = new JButton("Limpar Dados");
		btnGerarDashboard_1_1_1.setBounds(61, 194, 110, 23);
		Termo.add(btnGerarDashboard_1_1_1);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

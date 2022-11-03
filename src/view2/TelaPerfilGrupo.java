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

public class TelaPerfilGrupo extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblTrilha;
	private JLabel lblMembros;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnLimpar;
	private JButton btnRegras_1;
	private JLabel lblNomeDoGrupo;
	private JLabel lblreaDeEstudo;
	private JButton btnLimpar_1;
	private JButton btnLimpar_2;
	private JButton btnLimpar_3;
	private JLabel lblStatus;
	private JButton btnLimpar_4;

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
	public TelaPerfilGrupo() {
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
		
		JLabel lblRegrasTcc = new JLabel("Tela - Perfil Grupo");
		lblRegrasTcc.setBounds(54, 135, 119, 25);
		contentPane.add(lblRegrasTcc);
		
		JPanel panel = new JPanel();
		panel.setBounds(389, 141, 569, 384);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(103, 34, 274, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblQuantidadeDeAlunos = new JLabel("Nome do Grupo");
		lblQuantidadeDeAlunos.setBounds(24, 78, 119, 25);
		panel.add(lblQuantidadeDeAlunos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 78, 274, 33);
		panel.add(textField_1);
		
		JLabel lblTemplatesDeExemplo = new JLabel("Tema do TCC");
		lblTemplatesDeExemplo.setBounds(34, 124, 119, 25);
		panel.add(lblTemplatesDeExemplo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 120, 274, 33);
		panel.add(textField_2);
		
		JLabel lblTempoDeEntrega = new JLabel("Descrição do Projeto");
		lblTempoDeEntrega.setBounds(24, 200, 119, 25);
		panel.add(lblTempoDeEntrega);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(24, 221, 353, 111);
		panel.add(textField_3);
		
		lblreaDeEstudo = new JLabel("Área de Estudo");
		lblreaDeEstudo.setBounds(24, 38, 119, 25);
		panel.add(lblreaDeEstudo);
		
		btnLimpar_2 = new JButton("Convidar Banca");
		btnLimpar_2.setBounds(418, 34, 125, 32);
		panel.add(btnLimpar_2);
		
		btnLimpar_3 = new JButton("Aprovado");
		btnLimpar_3.setBounds(418, 167, 125, 32);
		panel.add(btnLimpar_3);
		
		lblStatus = new JLabel("Status");
		lblStatus.setBounds(418, 146, 119, 25);
		panel.add(lblStatus);
		
		btnLimpar_4 = new JButton("Termo");
		btnLimpar_4.setBounds(418, 83, 125, 32);
		panel.add(btnLimpar_4);
		
		JButton btnRegras_1_1 = new JButton("Gravar");
		btnRegras_1_1.setBounds(779, 536, 119, 32);
		contentPane.add(btnRegras_1_1);
		
		JLabel lblTipoDeProjeto = new JLabel("Tipo");
		lblTipoDeProjeto.setBounds(20, 196, 119, 25);
		contentPane.add(lblTipoDeProjeto);
		
		lblTrilha = new JLabel("Trilha de Desenvolvimento");
		lblTrilha.setBounds(20, 232, 140, 25);
		contentPane.add(lblTrilha);
		
		lblMembros = new JLabel("Membros");
		lblMembros.setBounds(20, 268, 119, 25);
		contentPane.add(lblMembros);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(74, 268, 274, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(151, 228, 197, 33);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(48, 188, 300, 33);
		contentPane.add(textField_6);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(84, 312, 125, 32);
		contentPane.add(btnLimpar);
		
		btnRegras_1 = new JButton("Acessar");
		btnRegras_1.setBounds(229, 312, 119, 32);
		contentPane.add(btnRegras_1);
		
		lblNomeDoGrupo = new JLabel("Nome do Grupo");
		lblNomeDoGrupo.setBounds(644, 117, 119, 25);
		contentPane.add(lblNomeDoGrupo);
		
		btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.setBounds(644, 536, 125, 32);
		contentPane.add(btnLimpar_1);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

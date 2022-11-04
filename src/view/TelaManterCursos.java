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
import javax.swing.JSeparator;

public class TelaManterCursos extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JTextField Nome;	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

//====================================================================================================================================
//============================================================ TELA BASE =============================================================
//====================================================================================================================================
	public TelaManterCursos() {
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
		LOGO.setBackground(new Color(132, 151, 176));
		LOGO.setIcon(new ImageIcon("C:\\TEMP\\logoSOE.png"));
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
		
		Nome = new JTextField();
		Nome.setBounds(68, 160, 437, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNome = new JLabel("Curso");
		lblNome.setBounds(68, 144, 40, 17);
		contentPane.add(lblNome);
		
		JLabel lbTelefone = new JLabel("Limite de Ciclos");
		lbTelefone.setBounds(855, 144, 110, 17);
		contentPane.add(lbTelefone);
		
		List list_1 = new List();
		list_1.setBounds(68, 209, 897, 98);
		contentPane.add(list_1);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(68, 186, 110, 17);
		contentPane.add(lblDescrio);
		
		JLabel lblPerodo = new JLabel("Período");
		lblPerodo.setBounds(526, 144, 110, 17);
		contentPane.add(lblPerodo);
		
		JButton btnGravar_1 = new JButton("Alterar");
		btnGravar_1.setBounds(495, 569, 110, 32);
		contentPane.add(btnGravar_1);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(615, 569, 110, 32);
		contentPane.add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(735, 569, 110, 32);
		contentPane.add(btnBuscar);
		
		JButton btnGravar_1_1 = new JButton("Gravar");
		btnGravar_1_1.setBounds(855, 569, 110, 32);
		contentPane.add(btnGravar_1_1);
		
		JLabel lblDescrioDasDisciplinas = new JLabel("Descrição das Disciplinas");
		lblDescrioDasDisciplinas.setBounds(69, 435, 188, 17);
		contentPane.add(lblDescrioDasDisciplinas);
		
		List list_1_1 = new List();
		list_1_1.setBounds(68, 452, 897, 93);
		contentPane.add(list_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(526, 160, 308, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(855, 161, 110, 20);
		contentPane.add(textField);
		
		JLabel lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setBounds(68, 410, 81, 17);
		contentPane.add(lblDisciplinas);
		
		JLabel lblSigla = new JLabel("Sigla");
		lblSigla.setBounds(810, 407, 81, 17);
		contentPane.add(lblSigla);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(836, 407, 129, 20);
		contentPane.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(68, 378, 897, 5);
		contentPane.add(separator);
		
		JLabel lblInserindoCursos = new JLabel("Inserindo Cursos");
		lblInserindoCursos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserindoCursos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInserindoCursos.setBounds(58, 108, 907, 17);
		contentPane.add(lblInserindoCursos);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 408, 674, 20);
		contentPane.add(textField_2);
		
		JButton btnGravar_1_2 = new JButton("Alterar");
		btnGravar_1_2.setBounds(495, 323, 110, 32);
		contentPane.add(btnGravar_1_2);
		
		JButton btnExcluir_1 = new JButton("Excluir");
		btnExcluir_1.setBounds(615, 323, 110, 32);
		contentPane.add(btnExcluir_1);
		
		JButton btnBuscar_1 = new JButton("Buscar");
		btnBuscar_1.setBounds(735, 323, 110, 32);
		contentPane.add(btnBuscar_1);
		
		JButton btnGravar_1_1_1 = new JButton("Gravar");
		btnGravar_1_1_1.setBounds(855, 323, 110, 32);
		contentPane.add(btnGravar_1_1_1);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

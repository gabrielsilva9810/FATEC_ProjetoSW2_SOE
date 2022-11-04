package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;

public class TelaManterOrientadores extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_5;



//====================================================================================================================================
//============================================================ TELA BASE =============================================================
//====================================================================================================================================
	public TelaManterOrientadores() {
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
		
		JLabel lbEmail = new JLabel("Nome");
		lbEmail.setBounds(51, 135, 40, 17);
		contentPane.add(lbEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(51, 156, 457, 20);
		contentPane.add(textField);
		
		JLabel lblCursosQueMinistra = new JLabel("Cursos que ministra aula");
		lblCursosQueMinistra.setBounds(51, 187, 319, 17);
		contentPane.add(lblCursosQueMinistra);
		
		JLabel lblPerodos = new JLabel("Períodos");
		lblPerodos.setBounds(51, 236, 104, 17);
		contentPane.add(lblPerodos);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(226, 236, 515, 17);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(226, 254, 423, 20);
		contentPane.add(textField_3);
		
		JLabel lblMatrias = new JLabel("Disciplinas");
		lblMatrias.setBounds(398, 189, 362, 17);
		contentPane.add(lblMatrias);
		
		JLabel lblNome_1 = new JLabel("RP");
		lblNome_1.setBounds(562, 135, 40, 17);
		contentPane.add(lblNome_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(562, 156, 156, 20);
		contentPane.add(textField_5);
		
		JButton btnGravar = new JButton("Alterar");
		btnGravar.setBounds(410, 295, 110, 32);
		contentPane.add(btnGravar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(530, 295, 110, 32);
		contentPane.add(btnExcluir);
		
		JButton btnGravar_1 = new JButton("Inserir");
		btnGravar_1.setBounds(650, 295, 110, 32);
		contentPane.add(btnGravar_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(51, 203, 331, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(398, 203, 362, 22);
		contentPane.add(comboBox_1);
		
		JButton btnRegras_1_2 = new JButton("");
		btnRegras_1_2.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
		btnRegras_1_2.setBounds(518, 144, 32, 32);
		contentPane.add(btnRegras_1_2);
		
		JButton btnRegras_1_2_1 = new JButton("");
		btnRegras_1_2_1.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
		btnRegras_1_2_1.setBounds(728, 144, 32, 32);
		contentPane.add(btnRegras_1_2_1);
		
		JLabel lblTrilha = new JLabel("Nome");
		lblTrilha.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrilha.setBounds(156, 387, 82, 25);
		contentPane.add(lblTrilha);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(78, 438, 859, 11);
		contentPane.add(separator);
		
		JLabel lblTrilha_1 = new JLabel("Curso");
		lblTrilha_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrilha_1.setBounds(275, 387, 82, 25);
		contentPane.add(lblTrilha_1);
		
		JLabel lblTrilha_2 = new JLabel("Email");
		lblTrilha_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrilha_2.setBounds(508, 387, 82, 25);
		contentPane.add(lblTrilha_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(78, 489, 859, 11);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(78, 541, 859, 11);
		contentPane.add(separator_1_1);
		
		JButton btnLimpar_2 = new JButton("Importar Lista");
		btnLimpar_2.setBounds(812, 563, 125, 32);
		contentPane.add(btnLimpar_2);
		
		JLabel lblRp = new JLabel("RP");
		lblRp.setHorizontalAlignment(SwingConstants.CENTER);
		lblRp.setBounds(78, 387, 48, 25);
		contentPane.add(lblRp);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 375, 912, 227);
		contentPane.add(textArea);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Coordenador");
		chckbxNewCheckBox.setBounds(656, 253, 104, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblHorriosParaEncontrar = new JLabel("Horário do semestre");
		lblHorriosParaEncontrar.setBounds(778, 135, 180, 17);
		contentPane.add(lblHorriosParaEncontrar);
		
		List list_1_1 = new List();
		list_1_1.setBounds(778, 158, 180, 182);
		contentPane.add(list_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(51, 353, 907, 11);
		contentPane.add(separator_2);
		
		JLabel lblInserindoOrientadores = new JLabel("Inserindo Orientadores");
		lblInserindoOrientadores.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInserindoOrientadores.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserindoOrientadores.setBounds(51, 104, 907, 17);
		contentPane.add(lblInserindoOrientadores);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(51, 253, 165, 22);
		contentPane.add(comboBox_2);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

package view;



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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;

public class TelaManterAlunos extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;



//====================================================================================================================================
//============================================================ TELA BASE =============================================================
//====================================================================================================================================
	public TelaManterAlunos() {
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
		lbEmail.setBounds(46, 125, 40, 17);
		contentPane.add(lbEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(46, 146, 457, 20);
		contentPane.add(textField);
		
		JButton btnRegras_1_2 = new JButton("");
		btnRegras_1_2.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
		btnRegras_1_2.setBounds(513, 134, 32, 32);
		contentPane.add(btnRegras_1_2);
		
		JLabel lblNome_1 = new JLabel("RA");
		lblNome_1.setBounds(557, 125, 40, 17);
		contentPane.add(lblNome_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(557, 146, 156, 20);
		contentPane.add(textField_1);
		
		JButton btnRegras_1_2_1 = new JButton("");
		btnRegras_1_2_1.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
		btnRegras_1_2_1.setBounds(723, 134, 32, 32);
		contentPane.add(btnRegras_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(46, 193, 331, 22);
		contentPane.add(comboBox);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(46, 177, 319, 17);
		contentPane.add(lblCurso);
		
		JLabel lblPerodos = new JLabel("Períodos");
		lblPerodos.setBounds(772, 125, 104, 17);
		contentPane.add(lblPerodos);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(772, 142, 186, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(46, 226, 423, 17);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(46, 244, 533, 20);
		contentPane.add(textField_2);
		
		JButton btnGravar = new JButton("Alterar");
		btnGravar.setBounds(608, 243, 110, 32);
		contentPane.add(btnGravar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(728, 243, 110, 32);
		contentPane.add(btnExcluir);
		
		JButton btnGravar_1 = new JButton("Inserir");
		btnGravar_1.setBounds(848, 243, 110, 32);
		contentPane.add(btnGravar_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(46, 341, 912, 11);
		contentPane.add(separator_2);
		
		JLabel lblRp = new JLabel("RA");
		lblRp.setHorizontalAlignment(SwingConstants.CENTER);
		lblRp.setBounds(78, 375, 48, 25);
		contentPane.add(lblRp);
		
		JLabel lblTrilha = new JLabel("Nome");
		lblTrilha.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrilha.setBounds(156, 375, 82, 25);
		contentPane.add(lblTrilha);
		
		JLabel lblTrilha_1 = new JLabel("Curso");
		lblTrilha_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrilha_1.setBounds(275, 375, 82, 25);
		contentPane.add(lblTrilha_1);
		
		JLabel lblTrilha_2 = new JLabel("Email");
		lblTrilha_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrilha_2.setBounds(508, 375, 82, 25);
		contentPane.add(lblTrilha_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(78, 426, 859, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(78, 477, 859, 11);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(78, 529, 859, 11);
		contentPane.add(separator_1_1);
		
		JButton btnLimpar_2 = new JButton("Importar Lista");
		btnLimpar_2.setBounds(812, 551, 125, 32);
		contentPane.add(btnLimpar_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 363, 912, 227);
		contentPane.add(textArea);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setBounds(645, 179, 110, 17);
		contentPane.add(lblSemestre);
		
		JLabel lblPerodo = new JLabel("Período");
		lblPerodo.setBounds(772, 175, 165, 17);
		contentPane.add(lblPerodo);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(47, 271, 95, 17);
		contentPane.add(lblStatus);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(393, 177, 137, 17);
		contentPane.add(lblTelefone);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(393, 195, 137, 20);
		contentPane.add(textField_6);
		
		JLabel lblTurma = new JLabel("Turma");
		lblTurma.setBounds(549, 177, 86, 17);
		contentPane.add(lblTurma);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Trancado");
		chckbxNewCheckBox.setBounds(46, 286, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDesistente = new JCheckBox("Desistente");
		chckbxDesistente.setBounds(156, 286, 97, 23);
		contentPane.add(chckbxDesistente);
		
		JLabel lblInserindoAlunos = new JLabel("Inserindo Alunos");
		lblInserindoAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserindoAlunos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInserindoAlunos.setBounds(46, 104, 907, 17);
		contentPane.add(lblInserindoAlunos);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(549, 193, 86, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(645, 193, 110, 22);
		contentPane.add(comboBox_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(772, 193, 186, 22);
		contentPane.add(comboBox_1_1_1);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

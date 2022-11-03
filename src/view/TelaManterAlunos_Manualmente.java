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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TelaManterAlunos_Manualmente extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JTextField Nome;
	private JTextField Email;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
	public TelaManterAlunos_Manualmente() {
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
		
		Nome = new JTextField();
		Nome.setBounds(150, 174, 269, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(487, 174, 239, 20);
		contentPane.add(Email);
		
		JLabel lblNome = new JLabel("RA");
		lblNome.setBounds(153, 153, 40, 17);
		contentPane.add(lblNome);
		
		JLabel lbTelefone = new JLabel("Curso");
		lbTelefone.setBounds(150, 215, 64, 17);
		contentPane.add(lbTelefone);
		
		JLabel lbEmail = new JLabel("Nome");
		lbEmail.setBounds(490, 153, 40, 17);
		contentPane.add(lbEmail);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGravar.setBounds(543, 433, 110, 32);
		contentPane.add(btnGravar);
		
		JLabel lblPerodo = new JLabel("Período");
		lblPerodo.setBounds(150, 300, 64, 17);
		contentPane.add(lblPerodo);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(150, 359, 64, 17);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(150, 377, 239, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(345, 320, 74, 20);
		contentPane.add(textField_1);
		
		JLabel lblCiclo = new JLabel("Ciclo");
		lblCiclo.setBounds(345, 300, 64, 17);
		contentPane.add(lblCiclo);
		
		List list_1 = new List();
		list_1.setBounds(150, 322, 155, 18);
		contentPane.add(list_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(487, 238, 239, 20);
		contentPane.add(textField_2);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setBounds(487, 222, 64, 17);
		contentPane.add(lblSemestre);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(487, 300, 64, 17);
		contentPane.add(lblTelefone);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(487, 320, 239, 20);
		contentPane.add(textField_3);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(487, 359, 64, 17);
		contentPane.add(lblStatus);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(487, 377, 239, 20);
		contentPane.add(textField_4);
		
		JLabel lblVinculo = new JLabel("Vinculo");
		lblVinculo.setBounds(150, 421, 64, 17);
		contentPane.add(lblVinculo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(150, 439, 239, 20);
		contentPane.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 238, 269, 20);
		contentPane.add(comboBox);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

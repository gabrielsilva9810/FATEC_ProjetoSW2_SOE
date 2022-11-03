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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JList;

public class TelaManterUsuario_Cadastro extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JTextField Nome;
	private JTextField Email;
	private JTextField textTelefone;

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
	public TelaManterUsuario_Cadastro() {
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
		Nome.setBounds(216, 180, 239, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(216, 211, 239, 20);
		contentPane.add(Email);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(177, 182, 40, 17);
		contentPane.add(lblNome);
		
		JLabel lbTelefone = new JLabel("Telefone");
		lbTelefone.setBounds(167, 242, 64, 17);
		contentPane.add(lbTelefone);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterar.setBounds(646, 174, 110, 32);
		contentPane.add(btnAlterar);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setBounds(177, 211, 40, 17);
		contentPane.add(lbEmail);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(216, 242, 239, 20);
		contentPane.add(textTelefone);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(646, 239, 110, 32);
		contentPane.add(btnMostrar);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGravar.setBounds(646, 351, 110, 32);
		contentPane.add(btnGravar);
		
		JPanel panel = new JPanel();
		panel.setBounds(153, 326, 302, 118);
		contentPane.add(panel);
		
		JRadioButton Aluno = new JRadioButton("Aluno");
		Aluno.setVerticalAlignment(SwingConstants.TOP);
		Aluno.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(Aluno);
		
		JRadioButton Orientador = new JRadioButton("Orientador");
		Orientador.setHorizontalAlignment(SwingConstants.LEFT);
		Orientador.setVerticalAlignment(SwingConstants.TOP);
		panel.add(Orientador);
		
		JRadioButton Coordenador = new JRadioButton("Coordenador");
		Coordenador.setVerticalAlignment(SwingConstants.TOP);
		Coordenador.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(Coordenador);
		
		JRadioButton Administrativo = new JRadioButton("Administrativo");
		Administrativo.setVerticalAlignment(SwingConstants.BOTTOM);
		Administrativo.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(Administrativo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tipo"}));
		comboBox_1.setBounds(153, 301, 46, 20);
		contentPane.add(comboBox_1);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

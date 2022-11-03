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

public class TelaProfessor extends JFrame {
	
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
	private JButton btnAgendarEntrega;
	private JButton btnHorrio;
	private JButton btnRegras;
	private JButton btnTrilhas;
	private JButton btnTemplates;

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
	public TelaProfessor() {
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
		btnLimparDados.setBounds(666, 466, 125, 32);
		contentPane.add(btnLimparDados);
		
		JLabel lblRegrasTcc = new JLabel("Trilha TCC");
		lblRegrasTcc.setBounds(666, 159, 119, 25);
		contentPane.add(lblRegrasTcc);
		
		JPanel panel = new JPanel();
		panel.setBounds(493, 184, 451, 264);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(127, 34, 274, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTipoDeProjeto = new JLabel("Escolher Tema");
		lblTipoDeProjeto.setBounds(52, 38, 119, 25);
		panel.add(lblTipoDeProjeto);
		
		JLabel lblQuantidadeDeAlunos = new JLabel("Nome do Projeto");
		lblQuantidadeDeAlunos.setBounds(40, 96, 119, 25);
		panel.add(lblQuantidadeDeAlunos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 92, 274, 33);
		panel.add(textField_1);
		
		JLabel lblTemplatesDeExemplo = new JLabel("Esboço do Projeto");
		lblTemplatesDeExemplo.setBounds(40, 156, 119, 25);
		panel.add(lblTemplatesDeExemplo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 152, 274, 33);
		panel.add(textField_2);
		
		JLabel lblTempoDeEntrega = new JLabel("Orientador");
		lblTempoDeEntrega.setBounds(64, 200, 119, 25);
		panel.add(lblTempoDeEntrega);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(127, 196, 274, 33);
		panel.add(textField_3);
		
		JButton btnRegras_1_1 = new JButton("Gravar");
		btnRegras_1_1.setBounds(801, 466, 119, 32);
		contentPane.add(btnRegras_1_1);
		
		JButton btnCriarNovo = new JButton("Descrição");
		btnCriarNovo.setBounds(54, 242, 153, 32);
		contentPane.add(btnCriarNovo);
		
		btnAgendarEntrega = new JButton("Agendar Entrega");
		btnAgendarEntrega.setBounds(54, 199, 153, 32);
		contentPane.add(btnAgendarEntrega);
		
		btnHorrio = new JButton("Horário");
		btnHorrio.setBounds(54, 294, 153, 32);
		contentPane.add(btnHorrio);
		
		btnRegras = new JButton("Regras");
		btnRegras.setBounds(54, 344, 153, 32);
		contentPane.add(btnRegras);
		
		btnTrilhas = new JButton("Trilhas");
		btnTrilhas.setBounds(54, 387, 153, 32);
		contentPane.add(btnTrilhas);
		
		btnTemplates = new JButton("Templates");
		btnTemplates.setBounds(54, 430, 153, 32);
		contentPane.add(btnTemplates);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

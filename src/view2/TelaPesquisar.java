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
import javax.swing.DropMode;

public class TelaPesquisar extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientacao;
	private JTextField labelAmarelaBottomPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField labelAmarelaTOP;
	private JLabel lblTrilha;
	private JTextField textField_4;
	private JButton btnLimpar;
	private JButton btnRegras_1;
	private JLabel lblNomeDoGrupo;
	private JButton btnLimpar_1;
	private JButton btnRegras;
	private JTextField textField_5;
	private JLabel lblPainel;
	private JPanel panel;
	private JLabel lblNewLabel;

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
	public TelaPesquisar() {
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
		
		JButton btnRegras_1_1 = new JButton("Gravar");
		btnRegras_1_1.setBounds(155, 565, 119, 32);
		contentPane.add(btnRegras_1_1);
		
		lblTrilha = new JLabel("Perfil do Professor");
		lblTrilha.setBounds(155, 192, 140, 25);
		contentPane.add(lblTrilha);
		
		textField_4 = new JTextField();
		textField_4.setBounds(68, 216, 274, 241);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		btnLimpar = new JButton("Termo");
		btnLimpar.setBounds(20, 127, 125, 32);
		contentPane.add(btnLimpar);
		
		btnRegras_1 = new JButton("Grupo");
		btnRegras_1.setBounds(155, 127, 119, 32);
		contentPane.add(btnRegras_1);
		
		lblNomeDoGrupo = new JLabel("Pesquisar");
		lblNomeDoGrupo.setBounds(644, 117, 119, 25);
		contentPane.add(lblNomeDoGrupo);
		
		btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.setBounds(20, 565, 125, 32);
		contentPane.add(btnLimpar_1);
		
		btnRegras = new JButton("Agenda");
		btnRegras.setBounds(284, 127, 119, 32);
		btnRegras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnRegras);
		
		textField_5 = new JTextField();
		textField_5.setBounds(700, 119, 274, 23);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		lblPainel = new JLabel("Painel");
		lblPainel.setBounds(657, 192, 140, 25);
		contentPane.add(lblPainel);
		
		panel = new JPanel();
		panel.setBounds(619, 216, 280, 241);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("Solicitação de Vinculo");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		//----------------------------------------------------------------------------------------------------------------------------
		
		
		
	}
}

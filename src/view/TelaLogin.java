package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblLogin;
	private JTextField textField;
	private JLabel lbSenha;
	private JTextField textField_4;
	private JCheckBox chckbxLembrar;
	private JButton btnEntrar;
	private JButton btnEsqueciSenha;
	private JButton btnCadastrar;
	private JLabel LOGO_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaLogin() {	
				setBackground(new Color(214, 220, 228));
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\TEMP\\IMG"));
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
				txtSistemaDeOrientao = new JTextField();
				txtSistemaDeOrientao.setText("SISTEMA DE ORIENTAÇÃO ESTUDANTIL     ");
				txtSistemaDeOrientao.setHorizontalAlignment(SwingConstants.RIGHT);
				txtSistemaDeOrientao.setForeground(Color.WHITE);
				txtSistemaDeOrientao.setFont(new Font("Tahoma", Font.PLAIN, 41));
				txtSistemaDeOrientao.setEditable(false);
				txtSistemaDeOrientao.setColumns(10);
				txtSistemaDeOrientao.setBackground(new Color(132, 151, 176));
				txtSistemaDeOrientao.setBounds(0, 0, 1008, 93);
				contentPane.add(txtSistemaDeOrientao);
				
				textField_1 = new JTextField();
				textField_1.setHorizontalAlignment(SwingConstants.CENTER);
				textField_1.setForeground(Color.WHITE);
				textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				textField_1.setBackground(new Color(191, 143, 0));
				textField_1.setBounds(0, 92, 1008, 5);
				contentPane.add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setText("Propriedade da FATEC Zona Leste. Todos os direitos reservados ®");
				textField_2.setHorizontalAlignment(SwingConstants.CENTER);
				textField_2.setForeground(Color.WHITE);
				textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				textField_2.setEditable(false);
				textField_2.setColumns(10);
				textField_2.setBackground(new Color(132, 151, 176));
				textField_2.setBounds(0, 616, 1008, 25);
				contentPane.add(textField_2);
				
				textField_3 = new JTextField();
				textField_3.setHorizontalAlignment(SwingConstants.CENTER);
				textField_3.setForeground(Color.WHITE);
				textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
				textField_3.setEditable(false);
				textField_3.setColumns(10);
				textField_3.setBackground(new Color(191, 143, 0));
				textField_3.setBounds(0, 612, 1008, 5);
				contentPane.add(textField_3);
// ====================================================================================================================================
// ========================================================== FIM TELA BASE ===========================================================
// ====================================================================================================================================
				
				//----------------------------------------------------------------------------------------------------------------------------
				lblLogin = new JLabel("Usuário");
				lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblLogin.setBounds(113, 282, 82, 20);
				contentPane.add(lblLogin);				
				
				lbSenha = new JLabel("Senha");
				lbSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lbSenha.setBounds(113, 314, 82, 20);
				contentPane.add(lbSenha);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(205, 282, 239, 26);
				contentPane.add(textField);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(205, 314, 239, 26);
				contentPane.add(textField_4);
				
				//----------------------------------------------------------------------------------------------------------------------------
				chckbxLembrar = new JCheckBox("Lembrar-me");
				chckbxLembrar.setBounds(207, 363, 97, 23);
				contentPane.add(chckbxLembrar);
				
				btnEntrar = new JButton("Acessar");
				btnEntrar.setBounds(316, 358, 127, 32);
				contentPane.add(btnEntrar);
				
				btnEsqueciSenha = new JButton("Esqueci a Senha");
				btnEsqueciSenha.setBounds(177, 401, 127, 32);
				contentPane.add(btnEsqueciSenha);
				
				btnCadastrar = new JButton("Cadastrar");
				btnCadastrar.setBounds(316, 401, 127, 32);
				contentPane.add(btnCadastrar);
				
// ====================================================================================================================================				
				JLabel LOGO_1_1 = new JLabel("");
				LOGO_1_1.setIcon(new ImageIcon("C:\\TEMP\\img (3).png"));
				LOGO_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_1_1.setBackground(Color.WHITE);
				LOGO_1_1.setBounds(484, 72, 605, 569);
				contentPane.add(LOGO_1_1);
				
				LOGO_1 = new JLabel("");
				LOGO_1.setIcon(new ImageIcon("C:\\TEMP\\fundo.png"));
				LOGO_1.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_1.setBackground(new Color(255, 255, 255));
				LOGO_1.setBounds(566, 61, 442, 569);
				contentPane.add(LOGO_1);				
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class TelaOrientadorVeOrientador extends JFrame {	
	
	private static final long serialVersionUID = 4796562433790656257L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;	
	private JPanel tabPerfil;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_12;
	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaOrientadorVeOrientador() {	
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
				LOGO.setBounds(0, 0, 207, 93);
				LOGO.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO.setBackground(new Color(132, 151, 176));
				LOGO.setIcon(new ImageIcon("C:\\TEMP\\logoSOE.png"));
				contentPane.add(LOGO);
				
				//----------------------------------------------------------------------------------------------------------------------------				
				txtSistemaDeOrientao = new JTextField();
				txtSistemaDeOrientao.setBounds(0, 0, 1008, 93);
				txtSistemaDeOrientao.setText("SISTEMA DE ORIENTAÇÃO ESTUDANTIL     ");
				txtSistemaDeOrientao.setHorizontalAlignment(SwingConstants.RIGHT);
				txtSistemaDeOrientao.setForeground(Color.WHITE);
				txtSistemaDeOrientao.setFont(new Font("Tahoma", Font.PLAIN, 41));
				txtSistemaDeOrientao.setEditable(false);
				txtSistemaDeOrientao.setColumns(10);
				txtSistemaDeOrientao.setBackground(new Color(132, 151, 176));
				contentPane.add(txtSistemaDeOrientao);
				
				textField_1 = new JTextField();
				textField_1.setBounds(0, 92, 1008, 5);
				textField_1.setHorizontalAlignment(SwingConstants.CENTER);
				textField_1.setForeground(Color.WHITE);
				textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				textField_1.setBackground(new Color(191, 143, 0));
				contentPane.add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setBounds(0, 616, 1008, 25);
				textField_2.setText("Propriedade da FATEC Zona Leste. Todos os direitos reservados ®");
				textField_2.setHorizontalAlignment(SwingConstants.CENTER);
				textField_2.setForeground(Color.WHITE);
				textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				textField_2.setEditable(false);
				textField_2.setColumns(10);
				textField_2.setBackground(new Color(132, 151, 176));
				contentPane.add(textField_2);
				
				textField_3 = new JTextField();
				textField_3.setBounds(0, 612, 1008, 5);
				textField_3.setHorizontalAlignment(SwingConstants.CENTER);
				textField_3.setForeground(Color.WHITE);
				textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
				textField_3.setEditable(false);
				textField_3.setColumns(10);
				textField_3.setBackground(new Color(191, 143, 0));
				contentPane.add(textField_3);
// ====================================================================================================================================
// ========================================================== FIM TELA BASE ===========================================================
// ====================================================================================================================================
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBorder(null);
				tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
				tabbedPane.setBackground(new Color(214, 220, 228));
				tabbedPane.setBounds(10, 100, 988, 503);
				contentPane.add(tabbedPane);
				
				tabPerfil = new JPanel();
				tabPerfil.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Perfil     ", null, tabPerfil, null);
				tabPerfil.setLayout(null);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(220, 44, 543, 20);
				tabPerfil.add(textField);
				
				JLabel lbEmail = new JLabel("Nome");
				lbEmail.setBounds(220, 23, 40, 17);
				tabPerfil.add(lbEmail);
				
				JLabel lblCursoQueMinistra = new JLabel("Cursos que ministra aula");
				lblCursoQueMinistra.setBounds(220, 75, 319, 17);
				tabPerfil.add(lblCursoQueMinistra);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(220, 92, 319, 57);
				tabPerfil.add(textField_4);
				
				JLabel lblMatrias = new JLabel("Disciplinas");
				lblMatrias.setBounds(567, 77, 362, 17);
				tabPerfil.add(lblMatrias);
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(567, 92, 362, 57);
				tabPerfil.add(textField_6);
				
				JLabel lblNome_1 = new JLabel("RP");
				lblNome_1.setBounds(773, 23, 40, 17);
				tabPerfil.add(lblNome_1);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(773, 44, 156, 20);
				tabPerfil.add(textField_7);
				
				JLabel lblPerodos = new JLabel("Períodos");
				lblPerodos.setBounds(220, 150, 104, 17);
				tabPerfil.add(lblPerodos);
				
				List list_1 = new List();
				list_1.setBounds(220, 170, 176, 18);
				tabPerfil.add(list_1);
				
				JLabel lblEmail = new JLabel("E-mail");
				lblEmail.setBounds(414, 150, 515, 17);
				tabPerfil.add(lblEmail);
				
				textField_11 = new JTextField();
				textField_11.setColumns(10);
				textField_11.setBounds(414, 168, 515, 20);
				tabPerfil.add(textField_11);
				
				JLabel lblTemaDoTrabalho = new JLabel("Formação");
				lblTemaDoTrabalho.setBounds(221, 199, 88, 30);
				tabPerfil.add(lblTemaDoTrabalho);
				
				textField_12 = new JTextField();
				textField_12.setColumns(10);
				textField_12.setBounds(220, 231, 714, 64);
				tabPerfil.add(textField_12);
				
				JLabel lblDescrioDoProjeto = new JLabel("Áreas para orientar");
				lblDescrioDoProjeto.setBounds(220, 298, 714, 32);
				tabPerfil.add(lblDescrioDoProjeto);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(220, 323, 714, 126);
				tabPerfil.add(textArea_1);
				
				JLabel lblHorriosParaEncontrar = new JLabel("Horário do semestre");
				lblHorriosParaEncontrar.setBounds(10, 225, 180, 17);
				tabPerfil.add(lblHorriosParaEncontrar);
				
				JLabel LOGO_1 = new JLabel("");
				LOGO_1.setIcon(new ImageIcon("C:\\TEMP\\perfil.png"));
				LOGO_1.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_1.setBackground(new Color(132, 151, 176));
				LOGO_1.setBounds(10, 11, 200, 201);
				tabPerfil.add(LOGO_1);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setBounds(21, 284, 156, 2);
				tabPerfil.add(separator_2);
				
				JSeparator separator_2_1 = new JSeparator();
				separator_2_1.setBounds(21, 312, 156, 2);
				tabPerfil.add(separator_2_1);
				
				JSeparator separator_2_2 = new JSeparator();
				separator_2_2.setBounds(21, 342, 156, 2);
				tabPerfil.add(separator_2_2);
				
				JSeparator separator_2_3 = new JSeparator();
				separator_2_3.setBounds(21, 372, 156, 2);
				tabPerfil.add(separator_2_3);
				
				JSeparator separator_2_4 = new JSeparator();
				separator_2_4.setBounds(21, 403, 156, 2);
				tabPerfil.add(separator_2_4);
				
				List list_1_1 = new List();
				list_1_1.setBounds(10, 248, 180, 201);
				tabPerfil.add(list_1_1);
				
				JSeparator separator_3 = new JSeparator();
				separator_3.setBounds(221, 198, 708, 5);
				tabPerfil.add(separator_3);
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
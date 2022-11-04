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
import javax.swing.JComboBox;

public class TelaAdministrativoCoordVeOrientador extends JFrame {	
	
	private static final long serialVersionUID = 4796562433790656257L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;	
	private JPanel tabPerfil;
	private JPanel tabGrupos;
	private JTextField textField;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaAdministrativoCoordVeOrientador() {	
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
				
				JLabel lblMatrias = new JLabel("Disciplinas");
				lblMatrias.setBounds(567, 77, 362, 17);
				tabPerfil.add(lblMatrias);
				
				JLabel lblNome_1 = new JLabel("RP");
				lblNome_1.setBounds(773, 23, 40, 17);
				tabPerfil.add(lblNome_1);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(773, 44, 156, 20);
				tabPerfil.add(textField_7);
				
				JLabel lblPerodos = new JLabel("Períodos");
				lblPerodos.setBounds(220, 124, 104, 17);
				tabPerfil.add(lblPerodos);
				
				List list_1 = new List();
				list_1.setBounds(220, 144, 176, 18);
				tabPerfil.add(list_1);
				
				JLabel lblEmail = new JLabel("E-mail");
				lblEmail.setBounds(414, 124, 515, 17);
				tabPerfil.add(lblEmail);
				
				textField_11 = new JTextField();
				textField_11.setColumns(10);
				textField_11.setBounds(414, 142, 515, 20);
				tabPerfil.add(textField_11);
				
				JLabel lblTemaDoTrabalho = new JLabel("Formação");
				lblTemaDoTrabalho.setBounds(219, 219, 88, 30);
				tabPerfil.add(lblTemaDoTrabalho);
				
				textField_12 = new JTextField();
				textField_12.setColumns(10);
				textField_12.setBounds(218, 251, 714, 64);
				tabPerfil.add(textField_12);
				
				JLabel lblDescrioDoProjeto = new JLabel("Áreas para orientar");
				lblDescrioDoProjeto.setBounds(220, 310, 714, 32);
				tabPerfil.add(lblDescrioDoProjeto);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(220, 340, 714, 103);
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
				list_1_1.setBounds(10, 248, 180, 195);
				tabPerfil.add(list_1_1);
				
				JSeparator separator_3 = new JSeparator();
				separator_3.setBounds(220, 219, 704, 2);
				tabPerfil.add(separator_3);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(222, 91, 322, 22);
				tabPerfil.add(comboBox);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setBounds(564, 93, 364, 22);
				tabPerfil.add(comboBox_1);
				
				JButton btnGravar_1 = new JButton("Gravar");
				btnGravar_1.setBounds(819, 171, 110, 32);
				tabPerfil.add(btnGravar_1);
				
				tabGrupos = new JPanel();
				tabGrupos.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Grupos     ", null, tabGrupos, null);
				tabGrupos.setLayout(null);
				
				JLabel lblTemaDoTrabalho_2 = new JLabel("Tema do Trabalho: ");
				lblTemaDoTrabalho_2.setBounds(10, 90, 151, 30);
				tabGrupos.add(lblTemaDoTrabalho_2);
				
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				textField_8.setBounds(113, 95, 589, 20);
				tabGrupos.add(textField_8);
				
				JLabel lblMembros = new JLabel("Membros");
				lblMembros.setBounds(10, 114, 119, 25);
				tabGrupos.add(lblMembros);
				
				textField_9 = new JTextField();
				textField_9.setColumns(10);
				textField_9.setBounds(10, 134, 692, 109);
				tabGrupos.add(textField_9);
				
				JLabel lblStatus_1 = new JLabel("Data de entrega da próxima atividade");
				lblStatus_1.setBounds(311, 59, 198, 25);
				tabGrupos.add(lblStatus_1);
				
				textField_10 = new JTextField();
				textField_10.setColumns(10);
				textField_10.setBounds(500, 59, 202, 20);
				tabGrupos.add(textField_10);
				
				JLabel lblStatus_4 = new JLabel("Data da última atualização");
				lblStatus_4.setBounds(10, 60, 143, 25);
				tabGrupos.add(lblStatus_4);
				
				textField_13 = new JTextField();
				textField_13.setColumns(10);
				textField_13.setBounds(144, 57, 151, 20);
				tabGrupos.add(textField_13);
				
				JLabel lblTrilha_2_1 = new JLabel("Tema");
				lblTrilha_2_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_2_1.setBounds(35, 292, 82, 25);
				tabGrupos.add(lblTrilha_2_1);
				
				JLabel lblNome_2 = new JLabel("Autores");
				lblNome_2.setHorizontalAlignment(SwingConstants.LEFT);
				lblNome_2.setBounds(35, 316, 82, 25);
				tabGrupos.add(lblNome_2);
				
				JButton btnLimpar_2_1 = new JButton("Ver detalhes");
				btnLimpar_2_1.setBounds(803, 312, 125, 32);
				tabGrupos.add(btnLimpar_2_1);
				
				JLabel lblTrilha_4_1 = new JLabel("Lista de grupos orientados");
				lblTrilha_4_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_4_1.setBounds(10, 254, 945, 25);
				tabGrupos.add(lblTrilha_4_1);
				
				JButton btnLimpar_2_1_1 = new JButton("Ver detalhes");
				btnLimpar_2_1_1.setBounds(803, 399, 125, 32);
				tabGrupos.add(btnLimpar_2_1_1);
				
				JLabel lblNome_2_1 = new JLabel("Autores");
				lblNome_2_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNome_2_1.setBounds(35, 403, 82, 25);
				tabGrupos.add(lblNome_2_1);
				
				JLabel lblTrilha_2_1_1 = new JLabel("Tema");
				lblTrilha_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_2_1_1.setBounds(35, 379, 82, 25);
				tabGrupos.add(lblTrilha_2_1_1);
				
				textField_14 = new JTextField();
				textField_14.setHorizontalAlignment(SwingConstants.CENTER);
				textField_14.setForeground(Color.WHITE);
				textField_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
				textField_14.setEditable(false);
				textField_14.setColumns(10);
				textField_14.setBackground(new Color(214, 220, 248));
				textField_14.setBounds(35, 367, 893, 1);
				tabGrupos.add(textField_14);
				
				JTextArea textArea_3 = new JTextArea();
				textArea_3.setBounds(10, 278, 945, 183);
				tabGrupos.add(textArea_3);
				
				JLabel lblStatus_1_1 = new JLabel("85%");
				lblStatus_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblStatus_1_1.setBounds(811, 189, 45, 25);
				tabGrupos.add(lblStatus_1_1);
				
				JLabel lblStatus_1_1_1 = new JLabel("15%");
				lblStatus_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblStatus_1_1_1.setBounds(853, 89, 37, 25);
				tabGrupos.add(lblStatus_1_1_1);
				
				JLabel lblStatus_4_1 = new JLabel("Nome");
				lblStatus_4_1.setBounds(10, 26, 54, 25);
				tabGrupos.add(lblStatus_4_1);
				
				textField_15 = new JTextField();
				textField_15.setColumns(10);
				textField_15.setBounds(46, 28, 617, 20);
				tabGrupos.add(textField_15);
				
				JLabel lblStatus_4_1_1 = new JLabel("RA");
				lblStatus_4_1_1.setBounds(734, 26, 54, 25);
				tabGrupos.add(lblStatus_4_1_1);
				
				textField_16 = new JTextField();
				textField_16.setColumns(10);
				textField_16.setBounds(760, 28, 157, 20);
				tabGrupos.add(textField_16);
				
				JButton btnRegras_1_2_2 = new JButton("");
				btnRegras_1_2_2.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
				btnRegras_1_2_2.setBounds(673, 16, 32, 32);
				tabGrupos.add(btnRegras_1_2_2);
				
				JButton btnRegras_1_2_2_1 = new JButton("");
				btnRegras_1_2_2_1.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
				btnRegras_1_2_2_1.setBounds(923, 16, 32, 32);
				tabGrupos.add(btnRegras_1_2_2_1);
				
				JLabel lblTrilha_3 = new JLabel("Progresso");
				lblTrilha_3.setBounds(734, 47, 239, 51);
				tabGrupos.add(lblTrilha_3);
				
				JLabel LOGO_3 = new JLabel("");
				LOGO_3.setIcon(new ImageIcon("C:\\TEMP\\GraficoPizza.png"));
				LOGO_3.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_3.setBackground(new Color(132, 151, 176));
				LOGO_3.setBounds(734, 57, 239, 208);
				tabGrupos.add(LOGO_3);
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class TelaCoordenador extends JFrame {	
	
	private static final long serialVersionUID = 4796562433790656257L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;	
	private JPanel tabPerfil;
	private JPanel tabGrupos;
	private JPanel tabAgenda;
	private JPanel tabPesquisa;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaCoordenador() {	
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
				
				JButton btnBuscar = new JButton("Limpar");
				btnBuscar.setBounds(493, 429, 110, 32);
				tabPerfil.add(btnBuscar);
				
				JButton btnGravar_1 = new JButton("Gravar");
				btnGravar_1.setBounds(613, 429, 110, 32);
				tabPerfil.add(btnGravar_1);
				
				JLabel lblTemaDoTrabalho = new JLabel("Formação");
				lblTemaDoTrabalho.setBounds(220, 194, 88, 30);
				tabPerfil.add(lblTemaDoTrabalho);
				
				textField_12 = new JTextField();
				textField_12.setColumns(10);
				textField_12.setBounds(220, 223, 503, 72);
				tabPerfil.add(textField_12);
				
				JLabel lblDescrioDoProjeto = new JLabel("Áreas para orientar");
				lblDescrioDoProjeto.setBounds(220, 298, 503, 32);
				tabPerfil.add(lblDescrioDoProjeto);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(220, 323, 503, 95);
				tabPerfil.add(textArea_1);
				
				JLabel lblHorriosParaEncontrar = new JLabel("Horário do semestre");
				lblHorriosParaEncontrar.setBounds(10, 225, 180, 17);
				tabPerfil.add(lblHorriosParaEncontrar);
				
				JButton btnRegras_1_2_1 = new JButton("");
				btnRegras_1_2_1.setIcon(new ImageIcon("C:\\TEMP\\atualizar.png"));
				btnRegras_1_2_1.setBounds(158, 180, 32, 32);
				tabPerfil.add(btnRegras_1_2_1);
				
				JLabel LOGO_1 = new JLabel("");
				LOGO_1.setIcon(new ImageIcon("C:\\TEMP\\perfil.png"));
				LOGO_1.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_1.setBackground(new Color(132, 151, 176));
				LOGO_1.setBounds(10, 11, 200, 201);
				tabPerfil.add(LOGO_1);
				
				JSeparator separator_2_1 = new JSeparator();
				separator_2_1.setBounds(20, 302, 156, 2);
				tabPerfil.add(separator_2_1);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setBounds(20, 274, 156, 2);
				tabPerfil.add(separator_2);
				
				JSeparator separator_2_2 = new JSeparator();
				separator_2_2.setBounds(20, 332, 156, 2);
				tabPerfil.add(separator_2_2);
				
				JSeparator separator_2_3 = new JSeparator();
				separator_2_3.setBounds(20, 362, 156, 2);
				tabPerfil.add(separator_2_3);
				
				JSeparator separator_2_4 = new JSeparator();
				separator_2_4.setBounds(20, 393, 156, 2);
				tabPerfil.add(separator_2_4);
				
				List list_1_1 = new List();
				list_1_1.setBounds(10, 239, 180, 182);
				tabPerfil.add(list_1_1);
				
				JLabel lblTemaDoTrabalho_1 = new JLabel("Mensagens e Solicitações");
				lblTemaDoTrabalho_1.setBounds(746, 199, 193, 17);
				tabPerfil.add(lblTemaDoTrabalho_1);
				
				JButton btnRegras_1_2_2_2 = new JButton("");
				btnRegras_1_2_2_2.setIcon(new ImageIcon("C:\\TEMP\\ConfirmV.png"));
				btnRegras_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 5));
				btnRegras_1_2_2_2.setBounds(865, 286, 26, 20);
				tabPerfil.add(btnRegras_1_2_2_2);
				
				JButton btnRegras_1_2_3 = new JButton("");
				btnRegras_1_2_3.setIcon(new ImageIcon("C:\\TEMP\\ConfirmX.png"));
				btnRegras_1_2_3.setBounds(893, 286, 26, 20);
				tabPerfil.add(btnRegras_1_2_3);
				
				JButton btnRegras_1_2_4 = new JButton("");
				btnRegras_1_2_4.setIcon(new ImageIcon("C:\\TEMP\\ConfirmV.png"));
				btnRegras_1_2_4.setBounds(865, 396, 26, 20);
				tabPerfil.add(btnRegras_1_2_4);
				
				JButton btnRegras_1_2_5 = new JButton("");
				btnRegras_1_2_5.setIcon(new ImageIcon("C:\\TEMP\\ConfirmX.png"));
				btnRegras_1_2_5.setBounds(893, 396, 26, 20);
				tabPerfil.add(btnRegras_1_2_5);
				
				JSeparator separator_3 = new JSeparator();
				separator_3.setBounds(762, 328, 157, 2);
				tabPerfil.add(separator_3);
				
				JTextArea textArea_3_1 = new JTextArea();
				textArea_3_1.setBounds(746, 217, 186, 231);
				tabPerfil.add(textArea_3_1);
				
				JSeparator separator_3_1 = new JSeparator();
				separator_3_1.setBounds(220, 194, 708, 5);
				tabPerfil.add(separator_3_1);
				
				tabGrupos = new JPanel();
				tabGrupos.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Grupos     ", null, tabGrupos, null);
				tabGrupos.setLayout(null);
				
				JLabel lblTemaDoTrabalho_2 = new JLabel("Tema do Trabalho: ");
				lblTemaDoTrabalho_2.setBounds(10, 11, 119, 30);
				tabGrupos.add(lblTemaDoTrabalho_2);
				
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				textField_8.setBounds(113, 16, 860, 20);
				tabGrupos.add(textField_8);
				
				JLabel lblMembros = new JLabel("Membros");
				lblMembros.setBounds(10, 68, 119, 25);
				tabGrupos.add(lblMembros);
				
				textField_9 = new JTextField();
				textField_9.setColumns(10);
				textField_9.setBounds(10, 91, 692, 152);
				tabGrupos.add(textField_9);
				
				JLabel lblStatus_1 = new JLabel("Data de entrega da próxima atividade");
				lblStatus_1.setBounds(311, 47, 198, 25);
				tabGrupos.add(lblStatus_1);
				
				textField_10 = new JTextField();
				textField_10.setColumns(10);
				textField_10.setBounds(500, 47, 202, 20);
				tabGrupos.add(textField_10);
				
				JLabel lblTrilha_3 = new JLabel("Progresso");
				lblTrilha_3.setBounds(734, 35, 239, 51);
				tabGrupos.add(lblTrilha_3);
				
				JLabel lblStatus_4 = new JLabel("Data da última atualização");
				lblStatus_4.setBounds(10, 48, 143, 25);
				tabGrupos.add(lblStatus_4);
				
				textField_13 = new JTextField();
				textField_13.setColumns(10);
				textField_13.setBounds(144, 45, 151, 20);
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
				
				JLabel lblStatus_1_1_1 = new JLabel("15%");
				lblStatus_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblStatus_1_1_1.setBounds(855, 85, 37, 25);
				tabGrupos.add(lblStatus_1_1_1);
				
				JLabel lblStatus_1_1 = new JLabel("85%");
				lblStatus_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblStatus_1_1.setBounds(813, 185, 45, 25);
				tabGrupos.add(lblStatus_1_1);
				
				JLabel LOGO_3 = new JLabel("");
				LOGO_3.setIcon(new ImageIcon("C:\\TEMP\\GraficoPizza.png"));
				LOGO_3.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_3.setBackground(new Color(132, 151, 176));
				LOGO_3.setBounds(734, 47, 239, 208);
				tabGrupos.add(LOGO_3);
				
				tabAgenda = new JPanel();
				tabAgenda.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Agenda     ", null, tabAgenda, null);
				tabAgenda.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Calendário");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel.setBounds(50, 11, 609, 20);
				tabAgenda.add(lblNewLabel);
				
				JLabel LOGO_2 = new JLabel("");
				LOGO_2.setIcon(new ImageIcon("C:\\TEMP\\Calendario.png"));
				LOGO_2.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_2.setBackground(new Color(132, 151, 176));
				LOGO_2.setBounds(10, 42, 687, 368);
				tabAgenda.add(LOGO_2);
				
				JLabel lblNewLabel_1 = new JLabel("Histórico de agendamento");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel_1.setBounds(707, 11, 241, 20);
				tabAgenda.add(lblNewLabel_1);
				
				JTextArea textArea_2 = new JTextArea();
				textArea_2.setBounds(707, 42, 241, 368);
				tabAgenda.add(textArea_2);
				
				JButton btnGravar_3 = new JButton("Agendar");
				btnGravar_3.setBounds(549, 429, 110, 32);
				tabAgenda.add(btnGravar_3);
				
				JButton btnBuscar_1 = new JButton("Buscar");
				btnBuscar_1.setBounds(838, 421, 110, 32);
				tabAgenda.add(btnBuscar_1);
				
				JButton btnExcluir_1 = new JButton("Excluir");
				btnExcluir_1.setBounds(429, 429, 110, 32);
				tabAgenda.add(btnExcluir_1);
				
				JButton btnGravar_2 = new JButton("Alterar");
				btnGravar_2.setBounds(309, 429, 110, 32);
				tabAgenda.add(btnGravar_2);
				
				tabPesquisa = new JPanel();
				tabPesquisa.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Pesquisa     ", null, tabPesquisa, null);
				tabPesquisa.setLayout(null);							
				
				JLabel lblNomeDoGrupo = new JLabel("Pesquisar");
				lblNomeDoGrupo.setHorizontalAlignment(SwingConstants.CENTER);
				lblNomeDoGrupo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNomeDoGrupo.setBounds(220, 11, 491, 25);
				tabPesquisa.add(lblNomeDoGrupo);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(220, 34, 491, 30);
				tabPesquisa.add(textField_5);
				
				JButton btnRegras_1_2 = new JButton("");
				btnRegras_1_2.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
				btnRegras_1_2.setBounds(720, 34, 32, 32);
				tabPesquisa.add(btnRegras_1_2);
				
				JLabel lblTrilha = new JLabel("Nome");
				lblTrilha.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha.setBounds(95, 114, 82, 25);
				tabPesquisa.add(lblTrilha);
				
				JLabel lblTrilha_1 = new JLabel("Tipo de Usuário");
				lblTrilha_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha_1.setBounds(199, 114, 82, 25);
				tabPesquisa.add(lblTrilha_1);
				
				JLabel lblTrilha_2 = new JLabel("Orientador");
				lblTrilha_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha_2.setBounds(316, 114, 82, 25);
				tabPesquisa.add(lblTrilha_2);
				
				JLabel lblAndamento = new JLabel("Tema");
				lblAndamento.setHorizontalAlignment(SwingConstants.CENTER);
				lblAndamento.setBounds(473, 114, 82, 25);
				tabPesquisa.add(lblAndamento);
				
				JButton btnLimpar_2 = new JButton("Ver Andamento");
				btnLimpar_2.setBounds(787, 150, 125, 32);
				tabPesquisa.add(btnLimpar_2);
				
				JButton btnLimpar_3 = new JButton("Ver Andamento");
				btnLimpar_3.setBounds(787, 206, 125, 32);
				tabPesquisa.add(btnLimpar_3);
				
				JButton btnLimpar_4 = new JButton("Ver Andamento");
				btnLimpar_4.setBounds(787, 262, 125, 32);
				tabPesquisa.add(btnLimpar_4);
				
				JButton btnLimpar_5 = new JButton("Ver Andamento");
				btnLimpar_5.setBounds(787, 316, 125, 32);
				tabPesquisa.add(btnLimpar_5);
				
				JButton btnLimpar_5_1 = new JButton("Ver Andamento");
				btnLimpar_5_1.setBounds(787, 369, 125, 32);
				tabPesquisa.add(btnLimpar_5_1);
				
				JButton btnLimpar = new JButton("Imprimir");
				btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnLimpar.setBounds(787, 422, 125, 32);
				tabPesquisa.add(btnLimpar);
				
				JLabel lblPainel = new JLabel(" ◄ 1 2 3 4 5 6 7 ... última ► ");
				lblPainel.setHorizontalAlignment(SwingConstants.CENTER);
				lblPainel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPainel.setBounds(381, 426, 227, 25);
				tabPesquisa.add(lblPainel);
				
				JCheckBox chckbxAlunos_1 = new JCheckBox("Alunos");
				chckbxAlunos_1.setBounds(380, 67, 97, 23);
				tabPesquisa.add(chckbxAlunos_1);
				
				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Professor");
				chckbxNewCheckBox_1.setBounds(263, 67, 97, 23);
				tabPesquisa.add(chckbxNewCheckBox_1);
				
				JLabel lblFiltro = new JLabel("Filtro:");
				lblFiltro.setHorizontalAlignment(SwingConstants.LEFT);
				lblFiltro.setBounds(223, 69, 82, 19);
				tabPesquisa.add(lblFiltro);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(95, 198, 654, 11);
				tabPesquisa.add(separator);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setBounds(95, 249, 654, 11);
				tabPesquisa.add(separator_1);
				
				JSeparator separator_1_1 = new JSeparator();
				separator_1_1.setBounds(95, 301, 654, 11);
				tabPesquisa.add(separator_1_1);
				
				JSeparator separator_1_1_1 = new JSeparator();
				separator_1_1_1.setBounds(95, 353, 654, 11);
				tabPesquisa.add(separator_1_1_1);
				
				JTextArea textArea = new JTextArea();
				textArea.setBounds(63, 101, 863, 310);
				tabPesquisa.add(textArea);
				
				JPanel tabRegras = new JPanel();
				tabRegras.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Regras     ", null, tabRegras, null);
				tabRegras.setLayout(null);
				
				JButton btnGravar_2_1 = new JButton("Alterar");
				btnGravar_2_1.setBounds(874, 417, 88, 32);
				tabRegras.add(btnGravar_2_1);
				
				JButton btnExcluir_1_1 = new JButton("Excluir");
				btnExcluir_1_1.setBounds(778, 418, 88, 32);
				tabRegras.add(btnExcluir_1_1);
				
				JButton btnGravar_3_1 = new JButton("Gravar");
				btnGravar_3_1.setBounds(682, 417, 88, 32);
				tabRegras.add(btnGravar_3_1);
				
				textField_15 = new JTextField();
				textField_15.setColumns(10);
				textField_15.setBounds(50, 32, 398, 20);
				tabRegras.add(textField_15);
				
				JLabel lblNomeDoTipo = new JLabel("Nome do tipo do Projeto para TCC");
				lblNomeDoTipo.setBounds(50, 11, 198, 17);
				tabRegras.add(lblNomeDoTipo);
				
				JLabel lblQuantidadeDeAlunos = new JLabel("Quantidade de Alunos por grupo");
				lblQuantidadeDeAlunos.setBounds(682, 95, 160, 17);
				tabRegras.add(lblQuantidadeDeAlunos);
				
				JLabel lblDefinirDatasDe = new JLabel("Definir data de entrega");
				lblDefinirDatasDe.setBounds(682, 129, 125, 17);
				tabRegras.add(lblDefinirDatasDe);
				
				textField_16 = new JTextField();
				textField_16.setColumns(10);
				textField_16.setBounds(802, 127, 160, 20);
				tabRegras.add(textField_16);
				
				textField_17 = new JTextField();
				textField_17.setColumns(10);
				textField_17.setBounds(852, 93, 110, 20);
				tabRegras.add(textField_17);
				
				JButton btnGravar_2_1_1 = new JButton("Inserir Template");
				btnGravar_2_1_1.setBounds(682, 167, 133, 32);
				tabRegras.add(btnGravar_2_1_1);
				
				JButton btnGravar_2_1_1_1 = new JButton("Regras da ABNT");
				btnGravar_2_1_1_1.setBounds(829, 167, 133, 32);
				tabRegras.add(btnGravar_2_1_1_1);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Curso 1", "Curso 2", "Curso 3", "Curso 4", "Curso 5", "Curso 6"}));
				comboBox.setBounds(480, 31, 482, 22);
				tabRegras.add(comboBox);
				
				JLabel lblCurso = new JLabel("Curso");
				lblCurso.setBounds(480, 11, 409, 17);
				tabRegras.add(lblCurso);
				
				JLabel lblNewLabel_2 = new JLabel("Calendário de Atividades");
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel_2.setBounds(50, 63, 609, 20);
				tabRegras.add(lblNewLabel_2);
				
				JLabel LOGO_2_2 = new JLabel("");
				LOGO_2_2.setIcon(new ImageIcon("C:\\TEMP\\Calendario.png"));
				LOGO_2_2.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_2_2.setBackground(new Color(132, 151, 176));
				LOGO_2_2.setBounds(10, 93, 687, 368);
				tabRegras.add(LOGO_2_2);
				
				JLabel lblListaDeDatas = new JLabel("Lista de Datas Importantes");
				lblListaDeDatas.setBounds(682, 220, 280, 17);
				tabRegras.add(lblListaDeDatas);
				
				textField_18 = new JTextField();
				textField_18.setColumns(10);
				textField_18.setBounds(682, 236, 280, 168);
				tabRegras.add(textField_18);
				
				JPanel tabDash = new JPanel();
				tabDash.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Dashboard     ", null, tabDash, null);
				tabDash.setLayout(null);
				
				JLabel LOGO_2_1 = new JLabel("");
				LOGO_2_1.setIcon(new ImageIcon("C:\\TEMP\\Dash.png"));
				LOGO_2_1.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_2_1.setBackground(new Color(132, 151, 176));
				LOGO_2_1.setBounds(0, 0, 701, 472);
				tabDash.add(LOGO_2_1);
				
				JLabel lblNewLabel_3 = new JLabel("Filtro para Dash");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel_3.setBounds(725, 26, 234, 14);
				tabDash.add(lblNewLabel_3);
				
				JCheckBox chckbxNewCheckBox = new JCheckBox("Professor");
				chckbxNewCheckBox.setBounds(725, 47, 234, 23);
				tabDash.add(chckbxNewCheckBox);
				
				JCheckBox chckbxAlunos = new JCheckBox("Alunos");
				chckbxAlunos.setBounds(725, 73, 234, 23);
				tabDash.add(chckbxAlunos);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Curso 01", "Curso 02", "Curso 03", "Curso 04", "Curso 05"}));
				comboBox_1.setBounds(725, 103, 234, 22);
				tabDash.add(comboBox_1);
				
				JLabel lblListaDeDatas_1 = new JLabel("Datas das apresentações");
				lblListaDeDatas_1.setBounds(725, 152, 234, 17);
				tabDash.add(lblListaDeDatas_1);
				
				textField_19 = new JTextField();
				textField_19.setColumns(10);
				textField_19.setBounds(725, 168, 234, 268);
				tabDash.add(textField_19);
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
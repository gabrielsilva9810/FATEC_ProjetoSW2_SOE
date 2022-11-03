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
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class TelaOrientador extends JFrame {	
	
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
	private JPanel panel;
	private JPanel panel_1;
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
	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaOrientador() {	
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
				LOGO.setBackground(new Color(132, 151, 176));
				LOGO.setIcon(new ImageIcon("D:\\A FATEC\\GitHub\\TrabalhoED\\FATEC_ProjetoSW2_SOE\\img\\logoSOE.png"));
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
				
				JLabel LOGO_1 = new JLabel("");
				LOGO_1.setIcon(new ImageIcon("D:\\A FATEC\\GitHub\\TrabalhoED\\FATEC_ProjetoSW2_SOE\\img\\perfil.png"));
				LOGO_1.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_1.setBackground(new Color(132, 151, 176));
				LOGO_1.setBounds(10, 11, 200, 201);
				tabPerfil.add(LOGO_1);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(220, 44, 543, 20);
				tabPerfil.add(textField);
				
				JLabel lbEmail = new JLabel("Nome");
				lbEmail.setBounds(220, 23, 40, 17);
				tabPerfil.add(lbEmail);
				
				JLabel lblCursoQueMinistra = new JLabel("Curso que ministra aula");
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
				
				JButton btnGravar = new JButton("Alterar");
				btnGravar.setBounds(465, 429, 110, 32);
				tabPerfil.add(btnGravar);
				
				JButton btnExcluir = new JButton("Excluir");
				btnExcluir.setBounds(585, 429, 110, 32);
				tabPerfil.add(btnExcluir);
				
				JButton btnBuscar = new JButton("Buscar");
				btnBuscar.setBounds(705, 429, 110, 32);
				tabPerfil.add(btnBuscar);
				
				JButton btnGravar_1 = new JButton("Gravar");
				btnGravar_1.setBounds(825, 429, 110, 32);
				tabPerfil.add(btnGravar_1);
				
				JLabel lblTemaDoTrabalho = new JLabel("Formação");
				lblTemaDoTrabalho.setBounds(220, 194, 88, 30);
				tabPerfil.add(lblTemaDoTrabalho);
				
				textField_12 = new JTextField();
				textField_12.setColumns(10);
				textField_12.setBounds(220, 223, 714, 72);
				tabPerfil.add(textField_12);
				
				JLabel lblDescrioDoProjeto = new JLabel("Áreas para orientar");
				lblDescrioDoProjeto.setBounds(220, 298, 714, 32);
				tabPerfil.add(lblDescrioDoProjeto);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(220, 323, 714, 95);
				tabPerfil.add(textArea_1);
				
				List list_1_1 = new List();
				list_1_1.setBounds(10, 239, 180, 182);
				tabPerfil.add(list_1_1);
				
				JLabel lblHorriosParaEncontrar = new JLabel("Horário do semestre");
				lblHorriosParaEncontrar.setBounds(10, 225, 180, 17);
				tabPerfil.add(lblHorriosParaEncontrar);
				
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
				
				JLabel LOGO_3 = new JLabel("");
				LOGO_3.setIcon(new ImageIcon("D:\\A FATEC\\GitHub\\TrabalhoED\\FATEC_ProjetoSW2_SOE\\img\\GraficoPizza.png"));
				LOGO_3.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_3.setBackground(new Color(132, 151, 176));
				LOGO_3.setBounds(734, 47, 239, 208);
				tabGrupos.add(LOGO_3);
				
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
				LOGO_2.setIcon(new ImageIcon("D:\\A FATEC\\GitHub\\TrabalhoED\\FATEC_ProjetoSW2_SOE\\img\\Calendario.png"));
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
				
				JButton btnGravar_3 = new JButton("Gravar");
				btnGravar_3.setBounds(549, 429, 110, 32);
				tabAgenda.add(btnGravar_3);
				
				JButton btnBuscar_1 = new JButton("Buscar");
				btnBuscar_1.setBounds(429, 429, 110, 32);
				tabAgenda.add(btnBuscar_1);
				
				JButton btnExcluir_1 = new JButton("Excluir");
				btnExcluir_1.setBounds(309, 429, 110, 32);
				tabAgenda.add(btnExcluir_1);
				
				JButton btnGravar_2 = new JButton("Alterar");
				btnGravar_2.setBounds(189, 429, 110, 32);
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
				btnRegras_1_2.setIcon(new ImageIcon("D:\\A FATEC\\GitHub\\TrabalhoED\\FATEC_ProjetoSW2_SOE\\img\\lupa.png"));
				btnRegras_1_2.setBounds(720, 34, 32, 32);
				tabPesquisa.add(btnRegras_1_2);
				
				JLabel lblTrilha = new JLabel("Orientador");
				lblTrilha.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha.setBounds(120, 114, 82, 25);
				tabPesquisa.add(lblTrilha);
				
				JLabel lblTrilha_1 = new JLabel("Grupo");
				lblTrilha_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha_1.setBounds(256, 114, 82, 25);
				tabPesquisa.add(lblTrilha_1);
				
				JLabel lblTrilha_2 = new JLabel("Tema");
				lblTrilha_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha_2.setBounds(392, 114, 82, 25);
				tabPesquisa.add(lblTrilha_2);
				
				JLabel lblAndamento = new JLabel("Andamento");
				lblAndamento.setHorizontalAlignment(SwingConstants.CENTER);
				lblAndamento.setBounds(528, 114, 82, 25);
				tabPesquisa.add(lblAndamento);
				
				JLabel lblNome = new JLabel("Nome");
				lblNome.setHorizontalAlignment(SwingConstants.CENTER);
				lblNome.setBounds(664, 114, 82, 25);
				tabPesquisa.add(lblNome);
				
				JLabel lblTermo = new JLabel("Termo");
				lblTermo.setHorizontalAlignment(SwingConstants.CENTER);
				lblTermo.setBounds(800, 114, 82, 25);
				tabPesquisa.add(lblTermo);
				
				JButton btnLimpar_2 = new JButton("Termo");
				btnLimpar_2.setBounds(787, 150, 125, 32);
				tabPesquisa.add(btnLimpar_2);
				
				JButton btnLimpar_3 = new JButton("Termo");
				btnLimpar_3.setBounds(787, 206, 125, 32);
				tabPesquisa.add(btnLimpar_3);
				
				JButton btnLimpar_4 = new JButton("Termo");
				btnLimpar_4.setBounds(787, 262, 125, 32);
				tabPesquisa.add(btnLimpar_4);
				
				JButton btnLimpar_5 = new JButton("Termo");
				btnLimpar_5.setBounds(787, 316, 125, 32);
				tabPesquisa.add(btnLimpar_5);
				
				JButton btnLimpar_5_1 = new JButton("Termo");
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
				
				JTextArea textArea = new JTextArea();
				textArea.setBounds(63, 101, 863, 310);
				tabPesquisa.add(textArea);
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
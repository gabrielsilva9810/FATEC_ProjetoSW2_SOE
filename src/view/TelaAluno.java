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
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAluno extends JFrame {	
	
	private static final long serialVersionUID = 4796562433790656257L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;	
	private JPanel tabPerfil;
	private JPanel tabAgenda;
	private JPanel tabGrupo;
	private JPanel tabPesquisa;
	private JButton btnLimpar;
	private JLabel lblTrilha;
	private JLabel lblPainel;
	private JLabel lblNomeDoGrupo;
	private JTextField textField_4;
	private JButton btnRegras_1_2;
	private JLabel lblTrilha_1;
	private JLabel lblTrilha_2;
	private JButton btnLimpar_2;
	private JLabel LOGO_1;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JLabel lblTemaDoTrabalho;
	private JButton btnBuscar;
	private JButton btnGravar_1;
	private JLabel LOGO_2;
	private JTextArea textArea_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextArea textArea_3;
	private JLabel lblTemaDoTrabalho_1;
	private JLabel lblTemaDoTrabalho_2;
	private JTextField textField_21;
	private JLabel lblDescrioDoProjeto_1;
	private JLabel lblStatus_1;
	private JTextField textField_18;
	private JLabel lblreaDeEstudo;
	private JTextField textField_19;
	private JButton btnLimpar_2_2;
	private JTextField textField_20;
	private JLabel lblStatus_4;
	private JLabel lblTemaDoTrabalho_4;
	private JButton btnRegras;
	private JButton btnGravar_4;
	private JButton btnExcluir_2;
	private JButton btnGravar_5;
	private JTextField textField_16;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblTemaDoTrabalho_3;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_17;
	private JLabel lblStatus_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JButton btnGravar_2;
	private JButton btnExcluir_1;
	private JButton btnGravar_3;
	private JButton btnBuscar_1;
	private JButton btnRegras_1_2_2;
	private JButton btnRegras_1_2_3;
	private JButton btnRegras_1_2_4;
	private JButton btnRegras_1_2_5;
	private JSeparator separator_5;
	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaAluno() {	
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
				textField.setBounds(794, 54, 156, 20);
				tabPerfil.add(textField);
				
				JLabel lblNome_1 = new JLabel("RA");
				lblNome_1.setBounds(794, 33, 40, 17);
				tabPerfil.add(lblNome_1);
				
				JLabel lbTelefone = new JLabel("Curso");
				lbTelefone.setBounds(241, 83, 64, 17);
				tabPerfil.add(lbTelefone);
				
				JLabel lblCiclo = new JLabel("Ciclo");
				lblCiclo.setBounds(360, 134, 65, 17);
				tabPerfil.add(lblCiclo);
				
				JLabel lblPerodo = new JLabel("Período");
				lblPerodo.setBounds(241, 134, 104, 17);
				tabPerfil.add(lblPerodo);
				
				List list_1 = new List();
				list_1.setBounds(241, 156, 104, 18);
				tabPerfil.add(list_1);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(360, 154, 65, 20);
				tabPerfil.add(textField_5);
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(687, 154, 263, 20);
				tabPerfil.add(textField_6);
				
				JLabel lblEmail = new JLabel("E-mail");
				lblEmail.setBounds(687, 136, 263, 17);
				tabPerfil.add(lblEmail);
				
				JLabel lblOrientador = new JLabel("Orientador");
				lblOrientador.setBounds(666, 83, 284, 17);
				tabPerfil.add(lblOrientador);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(666, 101, 284, 20);
				tabPerfil.add(textField_7);
				
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				textField_8.setBounds(435, 154, 95, 20);
				tabPerfil.add(textField_8);
				
				JLabel lblStatus = new JLabel("Status");
				lblStatus.setBounds(435, 136, 95, 17);
				tabPerfil.add(lblStatus);
				
				textField_9 = new JTextField();
				textField_9.setColumns(10);
				textField_9.setBounds(540, 154, 137, 20);
				tabPerfil.add(textField_9);
				
				JLabel lblTelefone = new JLabel("Telefone");
				lblTelefone.setBounds(540, 136, 137, 17);
				tabPerfil.add(lblTelefone);
				
				textField_10 = new JTextField();
				textField_10.setColumns(10);
				textField_10.setBounds(570, 101, 86, 20);
				tabPerfil.add(textField_10);
				
				JLabel lblSemestre = new JLabel("Semestre");
				lblSemestre.setBounds(570, 85, 86, 17);
				tabPerfil.add(lblSemestre);
				
				textField_11 = new JTextField();
				textField_11.setColumns(10);
				textField_11.setBounds(241, 54, 543, 20);
				tabPerfil.add(textField_11);
				
				JLabel lbEmail = new JLabel("Nome");
				lbEmail.setBounds(241, 33, 40, 17);
				tabPerfil.add(lbEmail);
				
				textField_12 = new JTextField();
				textField_12.setColumns(10);
				textField_12.setBounds(241, 101, 319, 20);
				tabPerfil.add(textField_12);
				
				textField_13 = new JTextField();
				textField_13.setColumns(10);
				textField_13.setBounds(41, 233, 703, 20);
				tabPerfil.add(textField_13);
				
				lblTemaDoTrabalho = new JLabel("Tema do Trabalho");
				lblTemaDoTrabalho.setBounds(41, 210, 703, 30);
				tabPerfil.add(lblTemaDoTrabalho);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(41, 274, 703, 137);
				tabPerfil.add(textArea_1);
				
				btnBuscar = new JButton("Limpar");
				btnBuscar.setBounds(514, 422, 110, 32);
				tabPerfil.add(btnBuscar);
				
				btnGravar_1 = new JButton("Gravar");
				btnGravar_1.setBounds(634, 422, 110, 32);
				tabPerfil.add(btnGravar_1);
				
				lblTemaDoTrabalho_1 = new JLabel("Mensagens e Solicitações");
				lblTemaDoTrabalho_1.setBounds(765, 210, 193, 17);
				tabPerfil.add(lblTemaDoTrabalho_1);
				
				JLabel lblDescrioDoProjeto = new JLabel("Descrição do projeto");
				lblDescrioDoProjeto.setBounds(41, 250, 714, 32);
				tabPerfil.add(lblDescrioDoProjeto);
				
				JButton btnRegras_1_2_1 = new JButton("");
				btnRegras_1_2_1.setIcon(new ImageIcon("C:\\TEMP\\atualizar.png"));
				btnRegras_1_2_1.setBounds(185, 180, 32, 32);
				tabPerfil.add(btnRegras_1_2_1);
				
				LOGO_1 = new JLabel("");
				LOGO_1.setIcon(new ImageIcon("C:\\TEMP\\perfil.png"));
				LOGO_1.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_1.setBackground(new Color(132, 151, 176));
				LOGO_1.setBounds(31, 11, 200, 201);
				tabPerfil.add(LOGO_1);
				
				separator_3 = new JSeparator();
				separator_3.setBounds(242, 209, 1, 2);
				tabPerfil.add(separator_3);
				
				separator_4 = new JSeparator();
				separator_4.setBounds(241, 197, 709, 2);
				tabPerfil.add(separator_4);
				
				btnRegras_1_2_2 = new JButton("");
				btnRegras_1_2_2.setIcon(new ImageIcon("C:\\TEMP\\ConfirmV.png"));
				btnRegras_1_2_2.setBounds(884, 307, 26, 20);
				tabPerfil.add(btnRegras_1_2_2);
				
				btnRegras_1_2_3 = new JButton("");
				btnRegras_1_2_3.setIcon(new ImageIcon("C:\\TEMP\\ConfirmX.png"));
				btnRegras_1_2_3.setBounds(912, 307, 26, 20);
				tabPerfil.add(btnRegras_1_2_3);
				
				btnRegras_1_2_4 = new JButton("");
				btnRegras_1_2_4.setIcon(new ImageIcon("C:\\TEMP\\ConfirmV.png"));
				btnRegras_1_2_4.setBounds(884, 417, 26, 20);
				tabPerfil.add(btnRegras_1_2_4);
				
				btnRegras_1_2_5 = new JButton("");
				btnRegras_1_2_5.setIcon(new ImageIcon("C:\\TEMP\\ConfirmX.png"));
				btnRegras_1_2_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnRegras_1_2_5.setBounds(912, 417, 26, 20);
				tabPerfil.add(btnRegras_1_2_5);
				
				separator_5 = new JSeparator();
				separator_5.setBounds(775, 338, 164, 12);
				tabPerfil.add(separator_5);
				
				textArea_3 = new JTextArea();
				textArea_3.setBounds(765, 231, 186, 218);
				tabPerfil.add(textArea_3);
				
				tabGrupo = new JPanel();
				tabGrupo.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Grupo     ", null, tabGrupo, null);
				tabGrupo.setLayout(null);
				
				lblTemaDoTrabalho_2 = new JLabel("Tema do Trabalho");
				lblTemaDoTrabalho_2.setBounds(10, 11, 119, 30);
				tabGrupo.add(lblTemaDoTrabalho_2);
				
				textField_21 = new JTextField();
				textField_21.setColumns(10);
				textField_21.setBounds(10, 34, 654, 20);
				tabGrupo.add(textField_21);
				
				lblDescrioDoProjeto_1 = new JLabel("Descrição do projeto");
				lblDescrioDoProjeto_1.setBounds(10, 205, 714, 32);
				tabGrupo.add(lblDescrioDoProjeto_1);
				
				JLabel lblTipoDeProjeto = new JLabel("Tipo");
				lblTipoDeProjeto.setBounds(683, 14, 41, 25);
				tabGrupo.add(lblTipoDeProjeto);
				
				JLabel lblTrilha_3 = new JLabel("Progresso");
				lblTrilha_3.setBounds(10, 390, 62, 51);
				tabGrupo.add(lblTrilha_3);
				
				JLabel lblMembros = new JLabel("Membros");
				lblMembros.setBounds(10, 102, 119, 25);
				tabGrupo.add(lblMembros);
				
				lblStatus_1 = new JLabel("Data de Apresentação");
				lblStatus_1.setBounds(775, 60, 119, 25);
				tabGrupo.add(lblStatus_1);
				
				textField_18 = new JTextField();
				textField_18.setColumns(10);
				textField_18.setBounds(775, 78, 184, 20);
				tabGrupo.add(textField_18);
				
				lblreaDeEstudo = new JLabel("Área de Estudo");
				lblreaDeEstudo.setBounds(420, 55, 119, 25);
				tabGrupo.add(lblreaDeEstudo);
				
				textField_19 = new JTextField();
				textField_19.setColumns(10);
				textField_19.setBounds(420, 78, 345, 20);
				tabGrupo.add(textField_19);
				
				btnLimpar_2_2 = new JButton("Download de uma Cópia");
				btnLimpar_2_2.setBounds(1080, 695, 125, 32);
				tabGrupo.add(btnLimpar_2_2);
				
				textField_20 = new JTextField();
				textField_20.setColumns(10);
				textField_20.setBounds(840, 403, 119, 20);
				tabGrupo.add(textField_20);
				
				lblStatus_4 = new JLabel("Data da última atualização");
				lblStatus_4.setBounds(706, 403, 143, 25);
				tabGrupo.add(lblStatus_4);
				
				lblTemaDoTrabalho_4 = new JLabel("Membros da Banca");
				lblTemaDoTrabalho_4.setBounds(512, 106, 250, 17);
				tabGrupo.add(lblTemaDoTrabalho_4);
				
				btnRegras = new JButton("Autorizar divulgar");
				btnRegras.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnRegras.setBounds(815, 430, 144, 32);
				tabGrupo.add(btnRegras);
				
				btnGravar_4 = new JButton("Alterar");
				btnGravar_4.setBounds(20, 430, 144, 32);
				tabGrupo.add(btnGravar_4);
				
				btnExcluir_2 = new JButton("Excluir");
				btnExcluir_2.setBounds(184, 430, 144, 32);
				tabGrupo.add(btnExcluir_2);
				
				btnGravar_5 = new JButton("Gravar");
				btnGravar_5.setBounds(345, 430, 144, 32);
				tabGrupo.add(btnGravar_5);
				
				textField_16 = new JTextField();
				textField_16.setColumns(10);
				textField_16.setBounds(10, 122, 479, 84);
				tabGrupo.add(textField_16);
				
				textField_14 = new JTextField();
				textField_14.setColumns(10);
				textField_14.setBounds(685, 34, 274, 20);
				tabGrupo.add(textField_14);
				
				textField_15 = new JTextField();
				textField_15.setColumns(10);
				textField_15.setBounds(512, 122, 447, 84);
				tabGrupo.add(textField_15);
				
				lblTemaDoTrabalho_3 = new JLabel("Orientador");
				lblTemaDoTrabalho_3.setBounds(10, 52, 119, 30);
				tabGrupo.add(lblTemaDoTrabalho_3);
				
				textField_22 = new JTextField();
				textField_22.setColumns(10);
				textField_22.setBounds(10, 78, 400, 20);
				tabGrupo.add(textField_22);
				
				textField_23 = new JTextField();
				textField_23.setColumns(10);
				textField_23.setBounds(10, 231, 949, 161);
				tabGrupo.add(textField_23);
				
				textField_17 = new JTextField();
				textField_17.setColumns(10);
				textField_17.setBounds(577, 405, 119, 20);
				tabGrupo.add(textField_17);
				
				lblStatus_2 = new JLabel("Status");
				lblStatus_2.setBounds(534, 403, 143, 25);
				tabGrupo.add(lblStatus_2);
				
				JProgressBar progressBar = new JProgressBar();
				progressBar.setStringPainted(true);
				progressBar.setForeground(SystemColor.textHighlight);
				progressBar.setBounds(66, 403, 457, 17);
				tabGrupo.add(progressBar);
				
				tabAgenda = new JPanel();
				tabAgenda.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Agenda     ", null, tabAgenda, null);
				tabAgenda.setLayout(null);
				
				LOGO_2 = new JLabel("");
				LOGO_2.setIcon(new ImageIcon("C:\\TEMP\\Calendario.png"));
				LOGO_2.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_2.setBackground(new Color(132, 151, 176));
				LOGO_2.setBounds(0, 42, 687, 368);
				tabAgenda.add(LOGO_2);
				
				lblNewLabel = new JLabel("Calendário");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(40, 11, 609, 20);
				tabAgenda.add(lblNewLabel);
				
				lblNewLabel_1 = new JLabel("Histórico de agendamento");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel_1.setBounds(697, 11, 241, 20);
				tabAgenda.add(lblNewLabel_1);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setBounds(710, 131, 218, 2);
				tabAgenda.add(separator_2);
				
				JSeparator separator_2_1 = new JSeparator();
				separator_2_1.setBounds(710, 228, 218, 2);
				tabAgenda.add(separator_2_1);
				
				JSeparator separator_2_1_1 = new JSeparator();
				separator_2_1_1.setBounds(710, 329, 218, 2);
				tabAgenda.add(separator_2_1_1);
				
				textArea_2 = new JTextArea();
				textArea_2.setBounds(697, 42, 241, 368);
				tabAgenda.add(textArea_2);
				
				btnGravar_2 = new JButton("Alterar");
				btnGravar_2.setBounds(299, 429, 110, 32);
				tabAgenda.add(btnGravar_2);
				
				btnExcluir_1 = new JButton("Excluir");
				btnExcluir_1.setBounds(419, 429, 110, 32);
				tabAgenda.add(btnExcluir_1);
				
				btnGravar_3 = new JButton("Agendar");
				btnGravar_3.setBounds(539, 429, 110, 32);
				tabAgenda.add(btnGravar_3);
				
				btnBuscar_1 = new JButton("Buscar");
				btnBuscar_1.setBounds(828, 421, 110, 32);
				tabAgenda.add(btnBuscar_1);
				
				tabPesquisa = new JPanel();
				tabPesquisa.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Pesquisa     ", null, tabPesquisa, null);
				tabPesquisa.setLayout(null);			
				
				btnLimpar = new JButton("Imprimir");
				btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnLimpar.setBounds(784, 432, 125, 32);
				tabPesquisa.add(btnLimpar);			
				
				lblPainel = new JLabel(" ◄ 1 2 3 4 5 6 7 ... última ► ");
				lblPainel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPainel.setHorizontalAlignment(SwingConstants.CENTER);
				lblPainel.setBounds(378, 436, 227, 25);
				tabPesquisa.add(lblPainel);
				
				lblNomeDoGrupo = new JLabel("Pesquisar");
				lblNomeDoGrupo.setHorizontalAlignment(SwingConstants.CENTER);
				lblNomeDoGrupo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNomeDoGrupo.setBounds(217, 11, 491, 25);
				tabPesquisa.add(lblNomeDoGrupo);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(217, 34, 491, 30);
				tabPesquisa.add(textField_4);
				
				btnRegras_1_2 = new JButton("");
				btnRegras_1_2.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
				btnRegras_1_2.setBounds(717, 34, 32, 32);
				tabPesquisa.add(btnRegras_1_2);							
				//----------------------------------------------------------------------------------------------------------------------------
				
				lblTrilha = new JLabel("Nome");
				lblTrilha.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha.setBounds(89, 124, 82, 25);
				tabPesquisa.add(lblTrilha);
				
				lblTrilha_1 = new JLabel("Tipo de usuário");
				lblTrilha_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha_1.setBounds(202, 124, 82, 25);
				tabPesquisa.add(lblTrilha_1);
				
				lblTrilha_2 = new JLabel("Tema/ Área de atuação");
				lblTrilha_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblTrilha_2.setBounds(346, 124, 125, 25);
				tabPesquisa.add(lblTrilha_2);
				
				btnLimpar_2 = new JButton("Formar Grupo / Orientador");
				btnLimpar_2.setBounds(731, 167, 178, 32);
				tabPesquisa.add(btnLimpar_2);
				
				JButton btnLimpar_2_1 = new JButton("Formar Grupo / Orientador");
				btnLimpar_2_1.setBounds(731, 217, 178, 32);
				tabPesquisa.add(btnLimpar_2_1);
				
				JButton btnLimpar_2_3 = new JButton("Formar Grupo / Orientador");
				btnLimpar_2_3.setBounds(731, 266, 178, 32);
				tabPesquisa.add(btnLimpar_2_3);
				
				JButton btnLimpar_2_4 = new JButton("Formar Grupo / Orientador");
				btnLimpar_2_4.setBounds(731, 316, 178, 32);
				tabPesquisa.add(btnLimpar_2_4);
				
				JButton btnLimpar_2_5 = new JButton("Formar Grupo / Orientador");
				btnLimpar_2_5.setBounds(731, 364, 178, 32);
				tabPesquisa.add(btnLimpar_2_5);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(89, 204, 619, 11);
				tabPesquisa.add(separator);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setBounds(89, 255, 619, 11);
				tabPesquisa.add(separator_1);
				
				JSeparator separator_1_1 = new JSeparator();
				separator_1_1.setBounds(89, 307, 619, 11);
				tabPesquisa.add(separator_1_1);
				
				JSeparator separator_1_1_1 = new JSeparator();
				separator_1_1_1.setBounds(89, 359, 619, 11);
				tabPesquisa.add(separator_1_1_1);
				
				JTextArea textArea = new JTextArea();
				textArea.setBounds(60, 111, 863, 310);
				tabPesquisa.add(textArea);
				
				JLabel lblFiltro = new JLabel("Filtro:");
				lblFiltro.setHorizontalAlignment(SwingConstants.LEFT);
				lblFiltro.setBounds(217, 75, 82, 19);
				tabPesquisa.add(lblFiltro);
				
				JCheckBox chckbxNewCheckBox = new JCheckBox("Professor");
				chckbxNewCheckBox.setBounds(257, 73, 97, 23);
				tabPesquisa.add(chckbxNewCheckBox);
				
				JCheckBox chckbxAlunos = new JCheckBox("Alunos");
				chckbxAlunos.setBounds(374, 73, 97, 23);
				tabPesquisa.add(chckbxAlunos);
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class TelaAdministrativo extends JFrame {	
	
	private static final long serialVersionUID = 4796562433790656257L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;	
	private JPanel tabDash;
	private JPanel tabPesquisa;
	private JTextField textField;
	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaAdministrativo() {	
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
				
				tabDash = new JPanel();
				tabDash.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     DashBoard     ", null, tabDash, null);
				tabDash.setLayout(null);
				
				JLabel LOGO_2 = new JLabel("");
				LOGO_2.setIcon(new ImageIcon("C:\\TEMP\\Dash.png"));
				LOGO_2.setHorizontalAlignment(SwingConstants.CENTER);
				LOGO_2.setBackground(new Color(132, 151, 176));
				LOGO_2.setBounds(0, 0, 701, 472);
				tabDash.add(LOGO_2);
				
				JButton btnVnculos = new JButton("Inserir Cursos");
				btnVnculos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnVnculos.setBounds(729, 287, 223, 32);
				tabDash.add(btnVnculos);
				
				JButton btnInserirAlunos = new JButton("Inserir Alunos");
				btnInserirAlunos.setBounds(729, 330, 223, 32);
				tabDash.add(btnInserirAlunos);
				
				JButton btnInserirProfessores = new JButton("Inserir Professores");
				btnInserirProfessores.setBounds(729, 373, 223, 32);
				tabDash.add(btnInserirProfessores);
				
				JButton btnInserirFuncionrios = new JButton("Inserir Funcionários \\ Hist de Atividades");
				btnInserirFuncionrios.setBounds(729, 416, 223, 32);
				tabDash.add(btnInserirFuncionrios);
				
				JCheckBox chckbxNewCheckBox = new JCheckBox("Professor");
				chckbxNewCheckBox.setBounds(743, 50, 209, 23);
				tabDash.add(chckbxNewCheckBox);
				
				JCheckBox chckbxAlunos = new JCheckBox("Alunos");
				chckbxAlunos.setBounds(743, 81, 209, 23);
				tabDash.add(chckbxAlunos);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"ADS 1", "ADS 2", "ADS 3", "ADS 4", "ADS 5"}));
				comboBox.setBounds(741, 115, 209, 22);
				tabDash.add(comboBox);
				
				JLabel lblNewLabel = new JLabel("Filtro para Dashboard");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel.setBounds(743, 29, 209, 14);
				tabDash.add(lblNewLabel);
				
				JLabel lblOutrasFunes = new JLabel("Funções Básicas");
				lblOutrasFunes.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblOutrasFunes.setBounds(743, 262, 209, 14);
				tabDash.add(lblOutrasFunes);
				
				tabPesquisa = new JPanel();
				tabPesquisa.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Pesquisar     ", null, tabPesquisa, null);
				tabPesquisa.setLayout(null);
				
				JLabel lblTrilha = new JLabel("Orientador");
				lblTrilha.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha.setBounds(88, 138, 82, 25);
				tabPesquisa.add(lblTrilha);
				
				JLabel lblTrilha_1 = new JLabel("Grupo");
				lblTrilha_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_1.setBounds(467, 138, 82, 25);
				tabPesquisa.add(lblTrilha_1);
				
				JLabel lblTrilha_2 = new JLabel("Tema");
				lblTrilha_2.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_2.setBounds(467, 114, 82, 25);
				tabPesquisa.add(lblTrilha_2);
				
				JLabel lblNome = new JLabel("Nome");
				lblNome.setHorizontalAlignment(SwingConstants.LEFT);
				lblNome.setBounds(88, 114, 82, 25);
				tabPesquisa.add(lblNome);
				
				JLabel lblTermo = new JLabel("Termos de vículos");
				lblTermo.setHorizontalAlignment(SwingConstants.CENTER);
				lblTermo.setBounds(783, 114, 125, 25);
				tabPesquisa.add(lblTermo);
				
				JButton btnLimpar_2 = new JButton("Visualizar");
				btnLimpar_2.setBounds(783, 150, 125, 32);
				tabPesquisa.add(btnLimpar_2);
				
				JButton btnLimpar_4 = new JButton("Visualizar");
				btnLimpar_4.setBounds(783, 232, 125, 32);
				tabPesquisa.add(btnLimpar_4);
				
				JButton btnLimpar_5_1 = new JButton("Visualizar");
				btnLimpar_5_1.setBounds(783, 313, 125, 32);
				tabPesquisa.add(btnLimpar_5_1);
				
				JButton btnLimpar = new JButton("Imprimir Vínculos");
				btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnLimpar.setBounds(783, 422, 125, 32);
				tabPesquisa.add(btnLimpar);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(216, 34, 491, 30);
				tabPesquisa.add(textField);
				
				JLabel lblNomeDoGrupo = new JLabel("Pesquisar");
				lblNomeDoGrupo.setHorizontalAlignment(SwingConstants.CENTER);
				lblNomeDoGrupo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNomeDoGrupo.setBounds(216, 11, 491, 25);
				tabPesquisa.add(lblNomeDoGrupo);
				
				JButton btnRegras_1_2 = new JButton("");
				btnRegras_1_2.setIcon(new ImageIcon("C:\\TEMP\\lupa.png"));
				btnRegras_1_2.setBounds(716, 34, 32, 32);
				tabPesquisa.add(btnRegras_1_2);
				
				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Professor");
				chckbxNewCheckBox_1.setBounds(256, 68, 97, 23);
				tabPesquisa.add(chckbxNewCheckBox_1);
				
				JCheckBox chckbxAlunos_1 = new JCheckBox("Alunos");
				chckbxAlunos_1.setBounds(373, 68, 97, 23);
				tabPesquisa.add(chckbxAlunos_1);
				
				JLabel lblFiltro = new JLabel("Filtro:");
				lblFiltro.setHorizontalAlignment(SwingConstants.LEFT);
				lblFiltro.setBounds(216, 70, 82, 19);
				tabPesquisa.add(lblFiltro);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(88, 199, 654, 11);
				tabPesquisa.add(separator);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setBounds(88, 283, 654, 11);
				tabPesquisa.add(separator_1);
				
				JSeparator separator_1_1_1 = new JSeparator();
				separator_1_1_1.setBounds(88, 363, 654, 11);
				tabPesquisa.add(separator_1_1_1);
				
				JLabel lblTrilha_2_1 = new JLabel("Tema");
				lblTrilha_2_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_2_1.setBounds(467, 212, 82, 25);
				tabPesquisa.add(lblTrilha_2_1);
				
				JLabel lblTrilha_1_1 = new JLabel("Grupo");
				lblTrilha_1_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_1_1.setBounds(467, 236, 82, 25);
				tabPesquisa.add(lblTrilha_1_1);
				
				JLabel lblNome_1 = new JLabel("Nome");
				lblNome_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNome_1.setBounds(88, 212, 82, 25);
				tabPesquisa.add(lblNome_1);
				
				JLabel lblTrilha_3 = new JLabel("Orientador");
				lblTrilha_3.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_3.setBounds(88, 236, 82, 25);
				tabPesquisa.add(lblTrilha_3);
				
				JLabel lblTrilha_2_2 = new JLabel("Tema");
				lblTrilha_2_2.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_2_2.setBounds(467, 293, 82, 25);
				tabPesquisa.add(lblTrilha_2_2);
				
				JLabel lblTrilha_1_2 = new JLabel("Grupo");
				lblTrilha_1_2.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_1_2.setBounds(467, 317, 82, 25);
				tabPesquisa.add(lblTrilha_1_2);
				
				JLabel lblNome_2 = new JLabel("Nome");
				lblNome_2.setHorizontalAlignment(SwingConstants.LEFT);
				lblNome_2.setBounds(88, 293, 82, 25);
				tabPesquisa.add(lblNome_2);
				
				JLabel lblTrilha_4 = new JLabel("Orientador");
				lblTrilha_4.setHorizontalAlignment(SwingConstants.LEFT);
				lblTrilha_4.setBounds(88, 317, 82, 25);
				tabPesquisa.add(lblTrilha_4);
				
				JTextArea textArea = new JTextArea();
				textArea.setBounds(59, 101, 863, 310);
				tabPesquisa.add(textArea);
							
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
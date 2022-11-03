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

public class TelaAdministrativo extends JFrame {	
	
	private static final long serialVersionUID = 4796562433790656257L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;	
	private JPanel tabPerfil;
	private JPanel tabTCC;
	private JPanel tabAgenda;
	private JPanel tabPesquisa;
	private JPanel panel;
	
// ====================================================================================================================================
// ============================================================ TELA BASE =============================================================
// ====================================================================================================================================
	public TelaAdministrativo() {	
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
				tabbedPane.addTab("     DashBoard     ", null, tabPerfil, null);
				tabPerfil.setLayout(null);
				
				tabTCC = new JPanel();
				tabTCC.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Vínculos     ", null, tabTCC, null);
				tabTCC.setLayout(null);
				
				tabAgenda = new JPanel();
				tabAgenda.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Bancas     ", null, tabAgenda, null);
				tabAgenda.setLayout(null);
				
				tabPesquisa = new JPanel();
				tabPesquisa.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Inserir     ", null, tabPesquisa, null);
				tabPesquisa.setLayout(null);			
				
				panel = new JPanel();
				panel.setBackground(new Color(214, 220, 228));
				tabbedPane.addTab("     Pesquisar     ", null, panel, null);
				panel.setLayout(null);
							
				//----------------------------------------------------------------------------------------------------------------------------				
			}
}
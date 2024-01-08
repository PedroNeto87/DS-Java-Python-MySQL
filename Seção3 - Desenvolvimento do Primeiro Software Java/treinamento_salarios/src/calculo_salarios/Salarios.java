package calculo_salarios;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Salarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSalario;
	private JTextField txtPercentual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salarios frame = new Salarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Salarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cálculo Liquído da Folha");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 21, 343, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Salário bruto");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 54, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("% de descontos");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 105, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultados");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 177, 343, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblLiquido = new JLabel("");
		lblLiquido.setForeground(new Color(0, 0, 255));
		lblLiquido.setFont(new Font("Arial", Font.BOLD, 12));
		lblLiquido.setBounds(10, 202, 343, 14);
		contentPane.add(lblLiquido);
		
		JLabel lblAnual = new JLabel("");
		lblAnual.setForeground(new Color(0, 0, 255));
		lblAnual.setFont(new Font("Arial", Font.BOLD, 12));
		lblAnual.setBounds(10, 227, 343, 14);
		contentPane.add(lblAnual);
		
		JLabel lbl13 = new JLabel("");
		lbl13.setForeground(new Color(0, 0, 255));
		lbl13.setFont(new Font("Arial", Font.BOLD, 12));
		lbl13.setBounds(10, 252, 343, 14);
		contentPane.add(lbl13);
		
		JLabel lblFerias = new JLabel("");
		lblFerias.setForeground(new Color(0, 0, 255));
		lblFerias.setFont(new Font("Arial", Font.BOLD, 12));
		lblFerias.setBounds(10, 277, 343, 14);
		contentPane.add(lblFerias);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Desenvolvido by PedroNeto");
		lblNewLabel_4_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_3_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_4_3_1.setBounds(10, 302, 343, 14);
		contentPane.add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_5 = new JLabel("Departamento Pessoal");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setBounds(147, 42, 140, 14);
		contentPane.add(lblNewLabel_5);
		
		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSalario.setBounds(10, 72, 120, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtPercentual = new JTextField();
		txtPercentual.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPercentual.setColumns(10);
		txtPercentual.setBounds(10, 120, 60, 20);
		contentPane.add(txtPercentual);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double salario = Double.parseDouble(txtSalario.getText());
				double percentual = Double.parseDouble(txtPercentual.getText());
				
				double liquido = salario - (salario/100) * percentual;
				double anual = liquido * 12;
				double decimo = liquido;
				double ferias = liquido/3+liquido;
				
				DecimalFormat f = new DecimalFormat("#0.00");
				String liquidof = f.format(liquido);
				String anualf = f.format(anual);
				String decimof = f.format(decimo);
				String feriasf = f.format(ferias);
				
				lblLiquido.setText("Valor Líquido R$" + liquidof);
				lblAnual.setText("Valor Líquido Anual R$" + anualf);
				lbl13.setText("13º Salário Líquido R$" + decimof);
				lblFerias.setText("Férias Líquida R$" + feriasf);
				
			}
		});
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.setBounds(111, 143, 140, 23);
		contentPane.add(btnCalcular);
	}
}

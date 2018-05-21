package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FormularioAlteracao {

	public static void main(String[] args) {

		//JFrame
		JFrame alterarExcluit = new JFrame();
		alterarExcluit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		alterarExcluit.setSize(350, 300);
		alterarExcluit.setLocationRelativeTo(null);
		alterarExcluit.setLayout(null);
		
		//JLabel
		JLabel campo = new JLabel();
		campo.setText("Nome do produto.");
		campo.setBounds(10, 10, 200, 20);
		
		//JTextField
		JTextField resposta = new JTextField();
		resposta.setBounds(150, 10, 150, 20);
		
		//JRadioButton
		JRadioButton alterar = new JRadioButton("Alterar");
		alterar.setBounds(10, 40, 100, 20);
						
		JRadioButton excluir = new JRadioButton("Excluir");
		excluir.setBounds(110, 40, 100, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Escolher");
		botao.setBounds(70, 70, 100, 30);
		
		//Ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(alterar.isSelected()){
					
				}else if(excluir.isSelected()){
					
				}
				
			}
		});
		
		//Add ao JFrame
		alterarExcluit.add(resposta);
		alterarExcluit.add(campo);
		alterarExcluit.add(excluir);
		alterarExcluit.add(alterar);
		alterarExcluit.add(botao);
		
		//Tornar visivel
		alterarExcluit.setVisible(true);
		alterarExcluit.repaint();
		
	}

}

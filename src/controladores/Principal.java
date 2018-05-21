package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//JFrame
				JFrame acao = new JFrame();
				acao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				acao.setSize(300, 200);
				acao.setLocationRelativeTo(null);
				acao.setTitle("Ação");
				acao.setLayout(null);
				
				//JComboBoz
						JComboBox<String> combo = new JComboBox();
						combo.setBounds(10, 10, 270, 30);
						combo.addItem("Cadastrar dados");
						combo.addItem("Alterar dados");
						combo.addItem("Excluir dados");
						combo.addItem("Selecionar dados");
						
						
						//Ação no combo
						combo.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {

								if(combo.getSelectedItem().equals("Cadastrar dados")){
								
								}else if(combo.getSelectedItem().equals("Alterar dados")){
									
								}else if(combo.getSelectedItem().equals("Excluir dados")){
									
								}else if(combo.getSelectedItem().equals("Selecionar dados")){
									
								}
								
							}

						});
						
						//Adicionar ao JFrame
						acao.add(combo);
						
						//Exibir os componentes
						acao.setVisible(true);
				
	}

}

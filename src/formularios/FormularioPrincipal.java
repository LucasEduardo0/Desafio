package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FormularioPrincipal {

	public static void main(String[] args) {

		//JFrame
		JFrame formularioPrincipal = new JFrame();
		formularioPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioPrincipal.setSize(300, 500);
		formularioPrincipal.setLocationRelativeTo(null);
		formularioPrincipal.setTitle("Formulario Principal");
		formularioPrincipal.setLayout(null);
		
		//JLabel
		JLabel produto = new JLabel();
		produto.setText("Produto");
		produto.setBounds(10, 10, 100, 20);
		
		JLabel valor = new JLabel();
		valor.setText("Valor");
		valor.setBounds(10, 30, 100, 20);
		
		JLabel quantidade = new JLabel();
		quantidade.setText("Quantidade");
		quantidade.setBounds(10, 50, 100, 20);
		
		//JTextFiald
		JTextField obterProduto = new JTextField();
		obterProduto.setBounds(110, 10, 150, 20);
		
		JTextField obterValor = new JTextField();
		obterValor.setBounds(110, 30, 150, 20);
		
		JTextField obterQuantidade = new JTextField();
		obterQuantidade.setBounds(110, 50, 150, 20);
		
		// DefaultTableModel - Serve para agrupar os dados
		DefaultTableModel exibirDados = new DefaultTableModel();
		
		// JTable - Serve para exibir o DefaultTableModel
		JTable tabela = new JTable(exibirDados);
						
		// JScrollPane - Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 200, 260, 100);
		
		//Criar colunas
		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Valor");
		exibirDados.addColumn("Quantidade");
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Cadastrar");
		botao.setBounds(50, 85, 150, 40);
		
		// Adicionar ação ao botão
				botao.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						String produto;
						double val;
						int qtd;
						
						produto = obterProduto.getText();
						val = Double.parseDouble(obterValor.getText());
						qtd = Integer.parseInt(obterQuantidade.getText());
						
						exibirDados.addRow(new Object[]{produto, val, qtd});
						
						// Limpar
						obterProduto.setText("");
						obterValor.setText("");
						obterQuantidade.setText("");

						// Selecionar 
						obterProduto.requestFocus();

					}
				});
		
		
		//Adicionar ao JFrame
		formularioPrincipal.add(quantidade);
		formularioPrincipal.add(valor);
		formularioPrincipal.add(produto);
		formularioPrincipal.add(obterQuantidade);
		formularioPrincipal.add(obterValor);
		formularioPrincipal.add(obterProduto);
		formularioPrincipal.add(botao);
		formularioPrincipal.add(barraRolagem);
		
		//Tornar visivel
		formularioPrincipal.setVisible(true);
		formularioPrincipal.repaint();
		
		
	}

}

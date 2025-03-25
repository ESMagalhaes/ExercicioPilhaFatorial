package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		FatController fc = new FatController();
		int valor = 0;
		do {
		valor = Integer.parseInt(JOptionPane.showInputDialog("insira um valor de 0 a 10: "));
		} while (valor <= 0 || valor >= 10);
		
		int rst = fc.Pilhar(valor);
		
		System.out.println("O fatorial de " + valor + " é: " + rst);
	}

}

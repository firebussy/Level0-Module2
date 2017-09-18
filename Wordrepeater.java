package extra;

import javax.swing.JOptionPane;

public class Wordrepeater {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Write a number");
		String word = JOptionPane.showInputDialog("Write a word");
		long numb = Integer.parseInt(num);
		for (long n = 0; n < numb; n++) {
System.out.println(word);
		}
	}
}

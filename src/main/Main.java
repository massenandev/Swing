package main;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		String grade1 = JOptionPane.showInputDialog("Provide your first grade ");
		String grade2 = JOptionPane.showInputDialog("Provide your second grade ");
		String grade3 = JOptionPane.showInputDialog("Provide your third grade ");
		String grade4 = JOptionPane.showInputDialog("Provide your fourth grade ");
		
		double  dGrade1 = Double.parseDouble(grade1);
		double  dGrade2 = Double.parseDouble(grade2);
		double  dGrade3= Double.parseDouble(grade3);
		double  dGrade4 = Double.parseDouble(grade4);
		
		double average = (dGrade1 + dGrade2 + dGrade3 + dGrade4) / 4;
		
		if(average >= 50) {
			if(average >= 70) {
				JOptionPane.showMessageDialog(null, "Your average grade is " + average + " and you are approved.");
			} else {
				JOptionPane.showMessageDialog(null, "Your average grade is " + average + " and you failed.");
			}
		}
	}
}
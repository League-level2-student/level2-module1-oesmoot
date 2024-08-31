package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton button1;
	JButton button2;
	ArrayList<String> names = new ArrayList<String>();
	public void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("add name");
		button2.setText("view names");
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.setup();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)arg0.getSource();
		if(buttonClicked == button1) {
			names.add(JOptionPane.showInputDialog("please enter a neme"));
		}
		
	}
}

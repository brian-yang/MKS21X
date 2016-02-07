import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.io.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("Temperature Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("Convert to C");
	b.addActionListener(this);
	b.setActionCommand("ConvertC");
	JButton b2 = new JButton("Convert to F");
	b2.addActionListener(this);
	b2.setActionCommand("ConvertF");

	t = new JTextField(10);
	j = new JLabel("Temperature");
	
	pane.add(j);
	pane.add(t);
	pane.add(b);
	pane.add(b2);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	String s = t.getText();
	double temp; 
	if(event.equals("ConvertF")){
	    try {
		temp = Double.parseDouble(s);
		j.setText(Double.toString(Temperature.CtoF(temp)));
	    } catch(NumberFormatException m) {
		j.setText("Not a number!");
	    }
	}

	if(event.equals("ConvertC")){
	    try {
		temp = Double.parseDouble(s);
		j.setText(Double.toString(Temperature.FtoC(temp)));
	    } catch(NumberFormatException n) {
		j.setText("Not a number!");
	    }
	} 
    }

}

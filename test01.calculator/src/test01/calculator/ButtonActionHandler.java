package test01.calculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ButtonActionHandler implements ActionListener{

	TextField enterTextField;
	Button b1;
	
	public ButtonActionHandler(Button b1,TextField enterTextField) {
		super();
		this.enterTextField = enterTextField;
		this.b1 = b1;
		
	}

//	public ButtonActionHandler(int value) {
//		// TODO Auto-generated constructor stub
//		enterTextField.setText(value);
//	}

	public ButtonActionHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = b1.getName();
		System.out.println(s);
		
	
	}
}

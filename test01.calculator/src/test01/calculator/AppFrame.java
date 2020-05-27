package test01.calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;



public class AppFrame extends Frame {

	public AppFrame() {
  	  CreateUI();
    }
	// Logic 1
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	TextField enterText;
	
	//Logic 2
	Button b[] = new Button[16];
	String sum[] = {"+","-","*","/","="};
 	
	private void CreateUI()
	{
		setLayout(new BorderLayout());
		
		this.setTitle("Calculator");

		Panel leftpanel=new Panel();
				
		enterText=new TextField();
		enterText.setBounds(20, 100, 100, 20);
		
		this.add(enterText,"NORTH");
		
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b16=new Button("/");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b15=new Button("X");
		b1=new Button("1");		
		b2=new Button("2");
		b3=new Button("3");
		b14=new Button("-");
		
		b11=new Button("+/-");
		b10=new Button("0");
		b12=new Button(".");
			
		b13=new Button("+");		
		
		
		b17=new Button("=");
		
		
		ButtonActionHandler buttonHandler = new ButtonActionHandler(b1,enterText);
		b1.addActionListener(buttonHandler);
		
		
		leftpanel.add(enterText);
		leftpanel.add(b7);
		leftpanel.add(b8);
		leftpanel.add(b9);
		leftpanel.add(b16);
		
		
		leftpanel.add(b4);
		leftpanel.add(b5);
		leftpanel.add(b6);
		leftpanel.add(b15);
		
		leftpanel.add(b1);
		leftpanel.add(b2);
		leftpanel.add(b3);
		leftpanel.add(b14);
		
		leftpanel.add(b10);
		leftpanel.add(b11);
		leftpanel.add(b12);
		leftpanel.add(b13);		
				
		leftpanel.add(b17);
		
		this.add(leftpanel);
		setSize(100,200);
		
		
	}
}
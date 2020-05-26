package test01.calculator;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionListener;


public class AppFrame extends Frame {

	public AppFrame() {
  	  CreateUI();
    }
	// Logic 1
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,exitButton;
	TextField enterText;
	
	//Logic 2
	Button b[] = new Button[16];
	String sum[] = {"+","-","*","/","="};
 	
	private void CreateUI()
	{
		setLayout(new FlowLayout());
		
		this.setTitle("Calculator");

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
		
		
		this.add(enterText);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b16);
		
		
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b15);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b14);
		
		this.add(b10);
		this.add(b11);
		this.add(b12);
		this.add(b13);		
				
		this.add(b17);
		
		setSize(100,200);
		
		
	}
}
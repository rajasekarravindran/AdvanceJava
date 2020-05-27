package demo09.calculatorapp;

public class Functionality {

	String operator;
	double first;
	double second;
	
	Functionality(double first,double second,String operator)
	{
		 this.operator=operator;
		 this.first=first;
		 this.first=first;
	}
	
	double functional()
	{
		if(operator.contentEquals("+"))
			return first+second;
		
		else if(operator.contentEquals("-"))
			return first-second;
		
		else if(operator.contentEquals("x"))
			return first * second;
		
		else if(operator.contentEquals("/"))
			return first / second;
		return 0;
	}
}

package codingdojo.calculadora;

public class Calculadora {
	private double OperandOne;
	private double OperandTwo;
	private char Operation;
	private double Result;
	
	// setters
	public void setOperandOne(double a) {
		OperandOne = a;
	}
	public void setOperandTwo(double a) {
		OperandTwo = a;
	}
	public void setOperation(char a) {
		Operation = a;
	}
	
	public void performOperation() {
		if(Operation=='+') {
			Result=OperandOne+OperandTwo;
		}
		else if(Operation=='-') {
			Result=OperandOne-OperandTwo;
		}
		else {
			System.out.println("Sorry, wrong operation");
		}
	}
	
	public double getResult() {
		return Result;
	}
}

package codingdojo.calculadora;
public class CalculadoraTest{
	public static void main(String[] args) {
		Calculadora b = new Calculadora();
		b.setOperandOne(10.5);
		b.setOperation('+');
		b.setOperandTwo(5.2);
		b.performOperation();
		System.out.println(b.getResult());
	}
}

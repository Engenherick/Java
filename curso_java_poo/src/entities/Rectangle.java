package entities;

public class Rectangle {

	public double largura;
	public double altura;

	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return (largura + altura) * 2.0;
	}

	public double hipotenusa() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
	public String toString() {
		return "Area = " + String.format("%.2f", area())  
			 + "\nPerimetro = " + String.format("%.2f", perimetro()) 
			 + "\nHipotenusa = " + String.format("%.2f", hipotenusa());
	}
}

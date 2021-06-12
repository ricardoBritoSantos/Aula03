import java.util.Scanner;


public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro lado do triângulo");
		int lado1 = leitor.nextInt();
		System.out.println("Digite o segundo lado do triângulo");
		int lado2 = leitor.nextInt();
		System.out.println("Digite o terceiro lado do triângulo");
		int lado3 = leitor.nextInt();
		
		if(((lado1 + lado2) > lado3)  && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
			System.out.print("Triangulo: ");
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.print("Equilatero");
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.print("Isosceles");
			}else {
				System.out.print("Escaleno");
			}
		}else {
			System.out.println("Não formam um triangulo ");
		}
		
		leitor.close();
	}

}

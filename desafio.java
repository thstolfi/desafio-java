package trabalho;

import javax.swing.JOptionPane;

public class trabalho {

	public static void main(String[] args) {
		int numero,media,i;
		int totalnumeros = 0;
		int somanumeros = 0;
		int contanum2 = 0;
		int maiornum = 0;
		int qtdprimos = 0;
		String entrada;
		entrada = JOptionPane.showInputDialog("Informe o numero:");
		numero = Integer.parseInt(entrada);
		while(numero <= 15) {
			totalnumeros++;
			somanumeros = somanumeros + numero;
			// Verifica se o numero eh primo
			boolean primo = true;
			if(numero < 2) {
				primo = false;
				System.out.println("O numero nao eh primo");
			}
			else {
				for(i = 2; i < numero; i++) {
					if(numero % i == 0) {
						primo = false;
						break;
					}
				}
				if(primo) {
					System.out.println("O numero eh primo");
					qtdprimos++;
				}
				else {
					System.out.println("O numero nao eh primo");
				}
			}
			// Verifica se o numero eh par ou impar
			if((numero % 2) == 0) {
				System.out.println("O numero eh par");
			}
			else {
				System.out.println("O numero eh impar");
			}
			// Verifica se o numero informado foi 2 e acrescenta no contador
			if(numero == 2) {
				contanum2++;
			}
			// Verificar se eh o maior numero informado
			if(numero > maiornum) {
				maiornum = numero;
			}
			// Verifica qual eh o fatorial
			int fatorial = 1;
			for(i = 1; i <= numero; i++) {
				fatorial *= i;
			}
			System.out.println("O fatorial do numero informado eh "+ fatorial);
			//Verifica o numero novamente
			entrada = JOptionPane.showInputDialog("Informe o numero:");
			numero = Integer.parseInt(entrada);
		}
		media = somanumeros / totalnumeros;
		System.out.println("O numero 2 foi informado "+ contanum2 +" vezes");
		System.out.println("Maior numero informado: "+ maiornum);
		System.out.println("Media aritmetica dos numeros informados: "+ media);
		System.out.println("Quantidade de numeros primos informados: "+ qtdprimos);
		
	}

}

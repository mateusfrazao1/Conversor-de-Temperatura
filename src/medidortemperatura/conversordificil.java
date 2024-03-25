package medidortemperatura;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DateFormat;

public class conversordificil {
    public static void main(String[] args) {
        final double Multiplicador = 5 / 9.0;
        final double Valor1 = 32;
        //pegando as informações do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em Fahrenhei:  ");
        int Fahrenhei = scanner.nextInt();
        //definindo a variavel Ceulsius
        double Ceulsius = Fahrenhei - Valor1 * Multiplicador;
        //Criando o objeto para Varriavel Ceulsius ter somente duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        //formatando a variavel Ceulsius
        String ceulsius = df.format(Ceulsius);
        System.out.println("Está fazendo atualmente: " + ceulsius + " Graus C");
        scanner.close();
    }
}

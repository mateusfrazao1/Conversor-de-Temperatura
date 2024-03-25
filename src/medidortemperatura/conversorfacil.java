package medidortemperatura;

public class conversorfacil {
    public static void main(String[] args) {

          final double Multiplicador = 5/9.0;
          final double Valor1 = 32;
          double fahrenhei = 50 - Valor1;
          double Ceulsius = Valor1 * Multiplicador;
          System.out.println("Está fazendo atualmente" + Ceulsius + "Graus C");
     }
}
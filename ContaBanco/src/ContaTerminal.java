
/*
 * @author Luis Palmeira
 * @version 1.0
 * @since 22/09/2023
 */

 //1.Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
 //2.Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {       
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner teclado = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Por favor, digite o número da conta !");
        numero = teclado.nextInt();
        System.out.println("Por favor, digite o nome da agência !");
        agencia = teclado.nextLine();
        agencia = teclado.nextLine();
        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = teclado.nextLine();
        System.out.println("Por favor, digite o saldo da conta !");
        saldo = teclado.nextDouble();

        System.out.print("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia));
        System.out.println(", conta "+numero+" e o seu saldo "+saldo+" já está disponível para saque.");
        
    }
}

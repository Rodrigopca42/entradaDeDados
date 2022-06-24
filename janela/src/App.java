
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
       
    

        Scanner tecla = new Scanner(System.in);
//o replace é usado para o uso da vírgula e do ponto em caso de números com casas decimais.
        System.out.println("Digite o 1º salário: R$");
        String sal1 = tecla.nextLine().replace("," , ".");

        System.out.println("Digite o 2º salário: R$");
        String sal2 = tecla.nextLine().replace("," , ".");;

        System.out.println("Digite o 3º salário: R$");
        String sal3 = tecla.nextLine().replace("," , ".");;

        tecla.close();

    //    System.out.printf(sal1 +" " +  sal2 +" "+ sal3);
        Double salario1 = Double.parseDouble(sal1);
        Double salario2 = Double.parseDouble(sal2);
        Double salario3 = Double.parseDouble(sal3);
        
  
       
        Double soma = salario1 + salario2 + salario3;
        Double media = soma /3;

        System.out.println("O valor da soma é: R$"+soma);
        System.out.printf("O valor da media é: R$%.2f",media );
    }
}

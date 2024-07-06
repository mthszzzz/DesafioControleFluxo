import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int parametroUm, parametroDois;
    
        System.out.println("Digite o primeiro parametro: ");
        parametroUm = scanner.nextInt();
        
        System.out.println("Digte o segundo parametro: ");
        parametroDois = scanner.nextInt();

        try {

            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero: "+ i);
        }
    }
}

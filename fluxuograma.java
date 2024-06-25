import java.util.Scanner;
/*
 * Escreva um algoritmo que receba o número de votos brancos, nulos e
válidos de um município. Calcule e escreva o percentual que cada um
representa em relação ao total de votos computados. Caso o percentual de
votos válidos seja superior a 50%, imprimir a mensagem eleição encerrada,
caso contrário imprimir mensagem informando que haverá nova eleição
 */

public class fluxuograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosBrancos, votosNulos, votosValidos;
        boolean test;

        votosBrancos = sc.nextInt();
        votosNulos = sc.nextInt();
        votosValidos = sc.nextInt();

        while (true) {
            int votosTotais = 0;
            if (votosBrancos != 0) {
                votosTotais = votosBrancos + votosNulos + votosValidos;
                System.out.println("Votos Brancos " + votosBrancos);
                System.out.println("Votos Nulos " + votosNulos);
                System.out.println("Votos Validos " + votosValidos);

                // percentual de votos brancos
                double percentualBrancos = ((double) votosBrancos / votosTotais) * 100;
                System.out.println("Percentual de votos Brancos: " + percentualBrancos);
                
                // percentual de votos nulos
                double percentualNulos = ((double) votosNulos / votosTotais) * 100;
                System.out.println("Percentual de votos Nulos: " + percentualNulos);

                // percentual de votos validos
                double percentualValidos = ((double) votosValidos / votosTotais) * 100;
                System.out.println("Percentual de votos Validos: " + percentualValidos);

                if(percentualValidos > 50.0){
                    System.out.println("Eleição encerrada");
                } else{
                    System.out.println("Haverá outra eleição");
                }
                break;
            }
        }

    }
}
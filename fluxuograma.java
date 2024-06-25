import java.util.Scanner;

/*Escreva um algoritmo que receba o número de votos brancos, nulos e
válidos de um município. Calcule e escreva o percentual que cada um
representa em relação ao total de votos computados. Caso o percentual de
votos válidos seja superior a 50%, imprimir a mensagem eleição encerrada,
caso contrário imprimir mensagem informando que haverá nova eleição
*/
public class fluxuograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosBrancos, votosNulos, votosValidos;
        boolean test;
        votosBrancos = scanner.nextInt();
        votosNulos = scanner.nextInt();
        votosValidos = scanner.nextInt();

        while (true) {
            int votosTotais = 0;
            if (votosBrancos != 0) {
                votosTotais = votosBrancos + votosNulos + votosValidos;
                System.out.println("Votos Brancos " + votosBrancos);
                System.out.println("Votos Nulos " + votosNulos);
                System.out.println("Votos Validos " + votosValidos);
                System.out.println("Soma: " + votosTotais);
                System.out.println("Vamos calcular agora o percentual: ");
                
            }  if(votosBrancos != 0){
                votosBrancos = votosBrancos / votosTotais;
            }
            
        }
        
            
            
    }
}
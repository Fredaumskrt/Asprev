import java.util.Scanner;

/*
 * Escrever um programa em fluxo que lê 2 conjuntos, nome e altura do aluno
em centímetros. Encontrar o aluno mais alto e o mais baixo e escrever na
tela seus nomes e altura na ordem decrescente.
 */
public class fluxuograma3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentA, studentB;
        Double heightA, heightB;

        System.out.println("Informe nome e altura do primero aluno: ");
        studentA = sc.nextLine();
        heightA = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe nome e altura do segundo aluno: ");
        studentB = sc.nextLine();
        heightB = sc.nextDouble();

        if (heightA > heightB) { // mais alto -> mais baixo
            System.out.println("Aluno mais alto: " + studentA + " " + heightA + " " + " cm");
            System.out.println("Aluno mais baixo: " + studentB + " " + heightB + " " + " cm");

        } else if (heightA < heightB) { //  mais baixo estudante B e estudante A
            System.out.println("Aluno mais alto: " + studentB + " " + heightB + " " + " cn");
            System.out.println("Aluno mais baixo: " + studentA + " " + heightA + "cn");
        }
        sc.close();

    }
}

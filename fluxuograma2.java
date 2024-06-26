import java.util.Scanner;

public class fluxuograma2 {
    /*
     * Em uma feira, as maçãs custam R$ 1.30 cada se vendida uma quantidade
     * inferior ou igual a uma dúzia, R$ 1.00 cada se vendida uma quantidade
     * acima de uma dúzia e R$ 0.80 centavos se vendida uma quantidade igual
     * ou acima de 10 dúzias. Portanto escreva um algoritmo que receba o total
     * de maçãs vendidas e calcule o preço total da compra, apresentando-o na
     * tela.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precomaca = 1.30;
        System.out.println("Qual foi a quantidade de Macas vendidas? ");

        int qtdMaca = sc.nextInt();
        int duzia = 12;
        boolean test;
        if (qtdMaca <= duzia) {
            System.out.println("O valor da maca eh R$1,30 ");
        } else if (qtdMaca < 120) { // 10 x 12 (120)
            precomaca = 1.00;
        } else {
            precomaca = 0.80;
        }

        double precoTotal = precomaca * qtdMaca;
        System.out.println("O preco total foi R$: " + precoTotal);

    }
}

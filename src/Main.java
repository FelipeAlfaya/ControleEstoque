import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Peca[] estoque = new Peca[5];

            estoque[0] = new RoupaTamanhoUnico("Camisa", 10, 5, 20);
            estoque[1] = new RoupaTamanhoUnico("Saia", 15, 7, 25);
            estoque[2] = new Acessorio("Cinto", 20, 8, 30);
            estoque[3] = new Acessorio("Pulseira", 12, 6, 18);
            estoque[4] = new RoupaPMG("Saída de praia", 8, 4, 15, 3, 3, 2);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Menu:");
                for (int i = 0; i < estoque.length; i++) {
                    System.out.println(i + " - " + estoque[i].getDescricao());
                }
                System.out.println(estoque.length + " - Sair do sistema");

                System.out.println("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                if (opcao == estoque.length) {
                    break;
                }

                if (opcao >= 0 && opcao < estoque.length) {
                    estoque[opcao].venda();
                    estoque[opcao].reposicaoEstoque();
                } else {
                    System.out.println("Opção inválida.");
                }
            }

            System.out.println("Estoque Final:");
            for (Peca peca : estoque) {
                System.out.println(peca.getDescricao() + ": " + peca.getQuantidade());
            }
        }
}
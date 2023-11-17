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
            System.out.println("Menu Principal:");
            System.out.println("1 - Adicionar ao Estoque");
            System.out.println("2 - Remover do Estoque");
            System.out.println("3 - Visualizar Estoque");
            System.out.println("4 - Sair do Sistema");

            System.out.println("Escolha uma opção: ");
            int opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    // Adicionar ao Estoque
                    System.out.println("Escolha o produto para adicionar ao estoque:");
                    for (int i = 0; i < estoque.length; i++) {
                        System.out.println(i + " - " + estoque[i].getDescricao());
                    }
                    int opcaoAdicionar = scanner.nextInt();
                    if (opcaoAdicionar >= 0 && opcaoAdicionar < estoque.length) {
                        System.out.println("Informe a quantidade a ser adicionada ao estoque: ");
                        int quantidadeAdicionar = scanner.nextInt();
                        estoque[opcaoAdicionar].setQuantidade(estoque[opcaoAdicionar].getQuantidade() + quantidadeAdicionar);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    // Remover do Estoque
                    System.out.println("Escolha o produto para remover do estoque:");
                    for (int i = 0; i < estoque.length; i++) {
                        System.out.println(i + " - " + estoque[i].getDescricao());
                    }
                    int opcaoRemover = scanner.nextInt();
                    if (opcaoRemover >= 0 && opcaoRemover < estoque.length) {
                        estoque[opcaoRemover].venda();
                        estoque[opcaoRemover].reposicaoEstoque();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    // Visualizar Estoque
                    System.out.println("Estoque Atual:");
                    for (Peca peca : estoque) {
                        System.out.println(peca.getDescricao() + ": " + peca.getQuantidade());
                    }
                    break;
                case 4:
                    // Sair do Sistema
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
import java.util.Scanner;

public class RoupaPMG extends Peca {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo,
                    int quantidadeP, int quantidadeM, int quantidadeG) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do item (P, M ou G): ");
        char tamanho = scanner.next().charAt(0);

        switch (tamanho) {
            case 'P':
                quantidadeP--;
                break;
            case 'M':
                quantidadeM--;
                break;
            case 'G':
                quantidadeG--;
                break;
            default:
                System.out.println("Tamanho inválido.");
        }
    }

    @Override
    public void reposicaoEstoque() {
        super.reposicaoEstoque();
        if (quantidadeP < getEstoqueMinimo()) {
            quantidadeP = getEstoqueMaximo();
        }
        if (quantidadeM < getEstoqueMinimo()) {
            quantidadeM = getEstoqueMaximo();
        }
        if (quantidadeG < getEstoqueMinimo()) {
            quantidadeG = getEstoqueMaximo();
        }
    }
}
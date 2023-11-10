import java.util.Scanner;

public class Acessorio extends Peca {
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade vendida do acessório '" + getDescricao() + "': ");
        int quantidadeVendida = scanner.nextInt();
        setQuantidade(getQuantidade() - quantidadeVendida);
    }
}

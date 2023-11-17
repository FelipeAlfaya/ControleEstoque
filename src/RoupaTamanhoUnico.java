public class RoupaTamanhoUnico extends Peca {
        public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
                super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
        }

        @Override
        public void venda() {
                setQuantidade(getQuantidade() - 1);
        }

        @Override
        public void reposicao() {
                setQuantidade(getQuantidade() + 1);
        }
}

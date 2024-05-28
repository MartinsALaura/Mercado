public class Mercado{
    private Prateleira prateleira1, prateleira2;

    public Mercado(Prateleira prateleira1, Prateleira prateleira2) {
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }

    public Prateleira getPrateleira1() {
        return prateleira1;
    }

    public Prateleira getPrateleira2() {
        return prateleira2;
    }

    public double mediaValorProdutos(){
        int qtdProdutos = 0;
        double somaPrecos = 0.0;

        // verifica se há produtos nas prateleiras e, caso haja, soma seus preços e conta a quantidade
        if (prateleira1.getProduto1() != null) {
            qtdProdutos++;
            somaPrecos += prateleira1.getProduto1().getPreco();
        }
        if (prateleira1.getProduto2() != null) {
            qtdProdutos++;
            somaPrecos += prateleira1.getProduto2().getPreco();
        }
        if (prateleira1.getProduto3() != null) {
            qtdProdutos++;
            somaPrecos += prateleira1.getProduto3().getPreco();
        }
        
        if (prateleira2.getProduto1() != null) {
            qtdProdutos++;
            somaPrecos += prateleira2.getProduto1().getPreco();
        }
        if (prateleira2.getProduto2() != null) {
            qtdProdutos++;
            somaPrecos += prateleira2.getProduto2().getPreco();
        }
        if (prateleira2.getProduto3() != null) {
            qtdProdutos++;
            somaPrecos += prateleira2.getProduto3().getPreco();
        }

        // calcula a média dos preços, ou retorna zero caso não haja produtos nas prateleiras
        if (qtdProdutos == 0) {
            return 0;
        } else {
            return somaPrecos / qtdProdutos;
        }
    }
}
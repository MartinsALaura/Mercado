public class Produto {
    private String nome;
    private double preco;
    private Data validade;
    
    public Produto(String nome, double preco, Data validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", validade=" + validade + "]";
    }

    public boolean verificarodutoVencido(Data data){
        return data.toString() == this.validade.toString();
    }
}

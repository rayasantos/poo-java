public class Arte {
    private String titulo;
    private String descricao;
    private String autor;
    private double preco;
    private String categoria;

    public Arte(String titulo, String descricao, String autor, double preco, String categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void listarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: $" + preco);
        System.out.println("Categoria: " + categoria);
    }

    public void adicionarAoCarrinho(CarrinhoDeCompras carrinho) {
        carrinho.adicionarItem(this);
        System.out.println("Arte '" + titulo + "' adicionada ao carrinho.");
    }

    public void comprar() {
        System.out.println("Arte '" + titulo + "' comprada com sucesso.");
    }

    public double getPreco() {
        return 0;
    }

    public char[] getTitulo() {
        return null;
    }
}

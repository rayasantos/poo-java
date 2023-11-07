public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", "joao@email.com", "senha123");

        Arte arte1 = new Arte("Paisagem", "Uma bela paisagem", "Artista 1", 50.0, "Pintura");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Artista artista1 = new Artista("Artista 1");

        Galeria galeria1 = new Galeria("Galeria 1");

        usuario1.cadastrarConta();

        usuario1.fazerLogin();

        usuario1.visualizarPerfil();

        arte1.listarDetalhes();

        arte1.adicionarAoCarrinho(carrinho);

        arte1.comprar();

        artista1.criarObra(arte1);

        artista1.listarObras();

        galeria1.adicionarObra(arte1);

        galeria1.listarObrasEmExposicao();
    }
}

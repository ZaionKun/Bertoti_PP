public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("nome",  "senha", 2);
        Produto produto = new Produto("teste", "teste");
        
        produto.cadastrarProduto(produto, usuario);
    }
}
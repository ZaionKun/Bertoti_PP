import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nomeProduto;
    private String descricaoProduto;
    private List<Produto>produtos = new ArrayList<>();

    public Produto(String nomeProduto, String descricaoProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public void cadastrarProduto(Produto produto, Usuario usuario){
        AcessoUsuario acesso = AcessoUsuario.getAcessoUsuario();
        acesso.validarAcesso(usuario.getTipo())){}
        produtos.add(produto);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    
}

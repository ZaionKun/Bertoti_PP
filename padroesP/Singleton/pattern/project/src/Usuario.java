import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String senha;
    private int tipo;
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public Usuario(String nome, String senha, int tipo) {
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
    }

    public void addUsuario(Usuario usuario, Usuario usuarioNovo){
        if(AcessoUsuario.getInstancia(usuario.getTipo())){
        usuarios.add(usuarioNovo);
    } 
} 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}

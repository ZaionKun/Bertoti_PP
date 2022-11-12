public class AcessoUsuario {
    
    private String nomeUsuario;
    private String tipoUsuario;
    private String mensagemUsario;

    private static AcessoUsuario acessoUsuario = new AcessoUsuario();

    public AcessoUsuario(){

    }

    public AcessoUsuario(String nomeUsuario, String tipoUsuario, String mensagemUsario) {
        this.nomeUsuario = nomeUsuario;
        this.tipoUsuario = tipoUsuario;
        this.mensagemUsario = mensagemUsario;
    }

    public String validarAcesso(Usuario usuario){

        if(usuario.getTipo() == 1){
            return "Usuário Admin";
        }
        else if(usuario.getTipo() == 2){
            return "Usuário cliente";
        }
        else return "Usuário sem permissão";
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getMensagemUsario() {
        return mensagemUsario;
    }

    public static AcessoUsuario getAcessoUsuario() {
        return acessoUsuario;
    }
    

    
}

public class AcessoUsuario {
    
    private static AcessoUsuario acessoUsuario = new AcessoUsuario();

    public  AcessoUsuario(){
    }

    public static boolean  getInstancia(int validarAcesso) {
        return acessoUsuario.validarAcesso(validarAcesso);
    }

    public boolean validarAcesso(int  identificacao){

        if(identificacao == 1){
            System.out.println("usuário admin");
            return true;
        }
        else if(identificacao == 2){
            System.out.println("usuário cliente");
            return true;
        }
        else 
        System.out.println("usuário sem acesso");
        return false;
    }

    public static AcessoUsuario getAcessoUsuario() {
        return acessoUsuario;
    }
    

    
}
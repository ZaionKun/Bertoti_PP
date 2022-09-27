public class Gerente extends Supervisor{
    public Gerente(String nomeDoSupervisor) {
        super(nomeDoSupervisor)
        this.nomeFuncionario = nomeDoSupervisor;
    }

    @Override
    public void printNomeDoFuncionario(){
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionarioTmp : Funcionario){
            funcionarioTmp.printNomeDoFuncionario();
        }
    }

    @Override
    public void adicionar(Funcionario novoFuncionario){

    }

    @Override
    protected void remover(Funciorio funciorio){

    }
}
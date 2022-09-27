public class main{
    public static void main(String[] args){
        Funcionario gerente = new Gerente("Zaion Arruda");
        Funcionario atendente = new Gerente("José Maria");
        Funcionario caixa = new Gerente("Antonio Zago");

        gerente.adicionar(atendente);
        gerente.printNomeDoFuncionario();
        gerente.adicionar(caixa);
        gerente.printNomeDoFuncionario();
        gerente.remover(atendente);
    }
}
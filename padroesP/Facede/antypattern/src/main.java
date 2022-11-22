package facede;

class UsuarioExemplo {
    public static void main(String[] args) {
        
        DiscoRigido  discoRigido = new DiscoRigido();
        discoRigido.leDado();

        Memoria memoria = new Memoria();
        memoria.carregaDado();

        UnidadeCentralDeProcessamento unidadeCentraldeProcessamento = new UnidadeCentralDeProcessamento();
        unidadeCentraldeProcessamento.processaDado();

    }
}
package strategypattern;

public class Carro extends TipoCnh {
    private String verificaCnh;
    @Override
    public void dirigir(String tipoCnh){
        if(tipoCnh == "A"){
            System.out.println("Habilitado para Moto");
        }
        else if(tipoCnh == "B"){
            System.out.println("Habilitado para Carro");
        }
        else{
            System.out.println("Não pode dirigir");
        }
        }
    }



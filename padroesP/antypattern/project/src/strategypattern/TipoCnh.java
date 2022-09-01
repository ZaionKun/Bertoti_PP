package strategypattern;

public class TipoCnh {
    private String dirigi;
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



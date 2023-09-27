public class Autodromo {
    public static void main(String[] args) {
        Carro carro = new Carro();
//        carro.confereCambio();
//        carro.confereCombustivel();
        carro.setChassi("151515151");
        carro.ligar();

        Moto moto = new Moto();
        moto.setChassi("1515151");
        moto.ligar();

//        Veiculo coringa = carro;
//        coringa.ligar();
    }
}

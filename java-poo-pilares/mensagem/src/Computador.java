public class Computador {
    public static void main(String[] args) {
        /*System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
//        msn.validarConectadoInternet();
        msn.enviarMensagem();
//        msn.salvarHistoricoMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        FacebookMessenger face = new FacebookMessenger();
        face.enviarMensagem();
        face.receberMensagem();

        System.out.println("Telegram");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();*/

        // Polimorfismo - não quem é mas vai rodar
        ServicoMensagemInstantanea smi = null;
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if(appEscolhido.equals("face")) {
            smi = new FacebookMessenger();
        } else if(appEscolhido.equals("telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}

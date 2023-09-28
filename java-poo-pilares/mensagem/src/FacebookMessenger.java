public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook...");
    }

    @Override
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo Facebook...");
    }

    /*public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook...");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook...");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens do Facebook...");
    }*/
}

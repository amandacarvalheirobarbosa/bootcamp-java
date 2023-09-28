public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo telegram...");
    }

    @Override
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo telegram...");
    }

    /*public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo telegram...");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram...");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens do telegram...");
    }*/
}

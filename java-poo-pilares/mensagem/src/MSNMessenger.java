public class MSNMessenger  extends  ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo msn...");
    }

    @Override
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo msn...");
    }

    /*// Encapsulamento - validar o que realmente precisa estar publico.

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo msn...");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo msn...");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens do msn...");
    }*/
}

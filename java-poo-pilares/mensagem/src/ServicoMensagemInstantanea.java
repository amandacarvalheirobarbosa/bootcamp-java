public abstract class ServicoMensagemInstantanea {
    /*// Herança - criação de uma classe pai (servicos mensagem instantanea)

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem ... ");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem ... ");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão internet ... ");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens ... ");
    }*/

    // Abstração - todos precisam enviar e receber mensagens mas cada um da sua maneira.
    public abstract void enviarMensagem(); // não tem corpo
    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Validando se está conectado a internet.");
    }
}

package smartv;

public class Usuario {
  public static void main(String[] args) {
    Smartv smartv = new Smartv();

    System.out.println("Tv ligada? " + smartv.ligada);
    System.out.println("Canal Atual: " + smartv.canal);
    System.out.println("Volume Atual: " + smartv.volume);

    smartv.ligar();
    System.out.println("Novo status -> Tv ligada? " + smartv.ligada);

    smartv.desligar();
    System.out.println("Novo status -> Tv ligada? " + smartv.ligada);

    smartv.diminuirVolume(); // 24
    smartv.diminuirVolume(); // 23
    smartv.diminuirVolume(); // 22
    smartv.aumentarCanal(); // 23
    System.out.println("Novo status -> Volume Atual: " + smartv.volume);

    smartv.mudarCanal(13);
    System.out.println("Novo status -> Canal atual: " + smartv.canal);

    smartv.aumentarCanal();
    smartv.aumentarCanal();
    smartv.aumentarCanal();
    smartv.diminuirCanal();
    System.out.println("Novo status -> Canal atual: " + smartv.canal);
  }
}

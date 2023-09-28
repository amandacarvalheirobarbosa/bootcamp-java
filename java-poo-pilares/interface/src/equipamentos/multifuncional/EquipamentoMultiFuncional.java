package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

// Não permite herança multipla por isso uso de interfaces
public class EquipamentoMultiFuncional  implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}

import equipamentos.impressora.Laserjet;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
//        Impressora impressora = new Deskjet();
//        Impressora impressora = new Laserjet();
//        Impressora impressora = new EquipamentoMultiFuncional();
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}

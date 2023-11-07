import java.util.List;
import java.util.ArrayList;

public class Galeria {
    private String nomeGaleria;
    private List<Arte> obrasEmExposicao = new ArrayList<>();

    public Galeria(String nomeGaleria) {
        this.nomeGaleria = nomeGaleria;
    }

    public void adicionarObra(Arte arte) {
        obrasEmExposicao.add(arte);
    }

    public void listarObrasEmExposicao() {
        System.out.println("Obras em exposição na galeria " + nomeGaleria + ":");
        for (Arte obra : obrasEmExposicao) {
            System.out.println(obra.getTitulo());
        }
    }
}

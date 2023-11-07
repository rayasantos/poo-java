import java.util.List;
import java.util.ArrayList;

public class Artista {
    private String nomeArtista;
    private List<Arte> obras = new ArrayList<>();
    
    public Artista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void criarObra(Arte arte) {
        obras.add(arte);
    }

    public void listarObras() {
        System.out.println("Obras do artista " + nomeArtista + ":");
        for (Arte obra : obras) {
            System.out.println(obra.getTitulo());
        }
    }
}

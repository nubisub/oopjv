import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Buat ArrayList Untuk Menampung Data Yang berhasil disimpan
        ArrayList<Model> m = new ArrayList();
        // GUI
        View v = new View();
        // Controller (GUI to Model/Data)
        Controller c = new Controller(m, v);
        // Simpan button + Rule Validation
        c.inputvalidation();
        // Reset button
        c.resetform();
    }
}

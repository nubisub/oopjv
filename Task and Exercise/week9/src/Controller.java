import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller {
    private Model model;
    private View view;
    private ArrayList<Model> modelList;

    // Constructor
    public Controller(ArrayList<Model> m, View view) {
        modelList = m;
        this.view = view;
    }

    // Pass Input Validation
    public void saveAll(){
        String nim = view.getNimTextField().getText();
        String fNama = view.getFNamaTextField().getText();
        String lNama = view.getLNamaTextField().getText();
        String nama = fNama + " " + lNama;
        String umur = view.getUmurTextField().getText();
        String asal = view.getAsalComboBox().getSelectedItem().toString();
        model = new Model(nim, nama, Integer.parseInt(umur), asal);
        modelList.add(model);
    }
    // View Data
    public String viewallmodel(){
        String output = "Daftar NIM dan Nama Mahasiswa yang telah berhasil disimpan :";
        for (int i = 0; i < modelList.size(); i++) {
            output += "\n" + modelList.get(i).getNim() + " - " + modelList.get(i).getNama();
        }
        return output;
    }
    // Reset Button
    public void resetform(){
        view.getResetButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusForm();
            }
        });
    }
    // Reset Form
    public void hapusForm(){
        view.getNimTextField().setText("");
        view.getFNamaTextField().setText("");
        view.getLNamaTextField().setText("");
        view.getUmurTextField().setText("");
        view.getAsalComboBox().setSelectedItem("Jakarta");
    }
    // Simpan Button + Input Validation
    public void inputvalidation() {
        view.getSimpanButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (view.getNimTextField().getText().equals("") || view.getFNamaTextField().getText().equals("") || view.getLNamaTextField().getText().equals("") || view.getUmurTextField().getText().equals("") || view.getAsalComboBox().getSelectedItem().equals("")) {
                        throw new Exception("Data tidak boleh kosong");
                    }
                    if (isnama() && isnim() && isumur()) {
                        saveAll();
                        view.showMessage(viewallmodel());
                        hapusForm();
                    }   
                } catch (Exception error) {
                    view.showWarning("Terjadi Kesalahan Input Pada : "+ error.getMessage());
                }
            }
        });
    }
    // nama harus < 50 karakter
    public boolean isnama() throws Exception{
        String nama = view.getFNamaTextField().getText() + " " + view.getLNamaTextField().getText();
        if (nama.length() > 50) {
            throw new Exception("Nama tidak boleh lebih dari 50 karakter");
        } else {
            return true;
        }
    }
    // nim harus < 6 karakter
    public boolean isnim() throws Exception{
        String nim = view.getNimTextField().getText();
        if (nim.length() != 6) {
            throw new Exception("Nim harus 6 digit");
        } else {
            return true;
        }
    }
    // umur harus angka
    public boolean isumur() throws Exception{
        String umur = view.getUmurTextField().getText();
        if (umur.matches("[0-9]+")) {
            return true;
        } else {
            throw new Exception("Umur harus angka");
        }        
    }
}

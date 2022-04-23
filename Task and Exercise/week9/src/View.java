import java.awt.*;

import javax.swing.*;

public class View {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JFrame frame;
    private Container pane;
    private Container buttonpane;
    private JPanel panel = new JPanel();

    private JLabel nimLabel;
    private JLabel namaLabel;
    private JLabel umurLabel;
    private JLabel asalLabel;

    private JTextField nimTextField;
    private JTextField fNamaTextField;
    private JTextField lNamaTextField;
    private JTextField umurTextField;
    private JComboBox asalComboBox;

    private JButton resetButton;
    private JButton simpanButton;


    public void makeFrame(){
        frame = new JFrame("Student Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 200);
        frame.setResizable(false);
        pane = frame.getContentPane();
	    pane.setLayout(new GridBagLayout());

    }
    public void addComponents(){

	    GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 4;

        nimLabel = new JLabel("Nim :");
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 0, 80);
        pane.add(nimLabel, c);    

        nimTextField = new JTextField(8);
        c.anchor = GridBagConstraints.LINE_END;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 0, 0);
        pane.add(nimTextField, c);

        namaLabel = new JLabel("Nama :");
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 0, 0, 80);
        c.gridx = 0;
        c.gridy = 1;
        pane.add(namaLabel, c);

        fNamaTextField = new JTextField(14);
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        pane.add(fNamaTextField, c);

        lNamaTextField = new JTextField(7);
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 2;
        c.gridy = 1;
        pane.add(lNamaTextField, c);

        umurLabel = new JLabel("Umur :");
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 0, 0, 80);
        c.gridx = 0;
        c.gridy = 2;
        pane.add(umurLabel, c);

        umurTextField = new JTextField(2);
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        pane.add(umurTextField, c);

        asalLabel = new JLabel("Asal :");
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 0, 0, 80);
        c.gridx = 0;
        c.gridy = 3;
        pane.add(asalLabel, c);

        String[] asal = {"Jakarta", "Bandung", "Surabaya", "Semarang"};
        asalComboBox = new JComboBox(asal);
        asalComboBox.setPreferredSize(new Dimension(150, 25));
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        pane.add(asalComboBox, c);

        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth =2;
        c.insets = new Insets(20, 5, 5, 5);
        pane.add(panel, c);
        panel.setLayout(new GridBagLayout());
        resetButton = new JButton("Reset");

        GridBagConstraints c2 = new GridBagConstraints();
        c2.weightx = 0.5;
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.anchor = GridBagConstraints.LINE_START;
        c2.gridx = 0;
        c2.gridy = 0;
          resetButton.setPreferredSize(new Dimension(140, 30)); 
        c2.insets = new Insets(0, 0, 0, 0);
        resetButton.setSize(30, 30);
        panel.add(resetButton, c2);

        simpanButton = new JButton("Simpan");
        simpanButton.setPreferredSize(new Dimension(140, 30)); 
        c2.insets = new Insets(0, 0, 0, 0);
        c2.gridx = 1;
        c2.gridy = 0;
        panel.add(simpanButton, c2);

    }

    public View() {
        makeFrame();
        addComponents();
        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public Container getPane() {
        return this.pane;
    }

    public void setPane(Container pane) {
        this.pane = pane;
    }

    public Container getButtonpane() {
        return this.buttonpane;
    }

    public void setButtonpane(Container buttonpane) {
        this.buttonpane = buttonpane;
    }

    public JPanel getPanel() {
        return this.panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getNimLabel() {
        return this.nimLabel;
    }

    public void setNimLabel(JLabel nimLabel) {
        this.nimLabel = nimLabel;
    }

    public JLabel getNamaLabel() {
        return this.namaLabel;
    }

    public void setNamaLabel(JLabel namaLabel) {
        this.namaLabel = namaLabel;
    }

    public JLabel getUmurLabel() {
        return this.umurLabel;
    }

    public void setUmurLabel(JLabel umurLabel) {
        this.umurLabel = umurLabel;
    }

    public JLabel getAsalLabel() {
        return this.asalLabel;
    }

    public void setAsalLabel(JLabel asalLabel) {
        this.asalLabel = asalLabel;
    }

    public JTextField getNimTextField() {
        return this.nimTextField;
    }

    public void setNimTextField(JTextField nimTextField) {
        this.nimTextField = nimTextField;
    }

    public JTextField getFNamaTextField() {
        return this.fNamaTextField;
    }

    public void setFNamaTextField(JTextField fNamaTextField) {
        this.fNamaTextField = fNamaTextField;
    }

    public JTextField getLNamaTextField() {
        return this.lNamaTextField;
    }

    public void setLNamaTextField(JTextField lNamaTextField) {
        this.lNamaTextField = lNamaTextField;
    }

    public JTextField getUmurTextField() {
        return this.umurTextField;
    }

    public void setUmurTextField(JTextField umurTextField) {
        this.umurTextField = umurTextField;
    }

    public JComboBox getAsalComboBox() {
        return this.asalComboBox;
    }

    public void setAsalComboBox(JComboBox asalComboBox) {
        this.asalComboBox = asalComboBox;
    }

    public JButton getResetButton() {
        return this.resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

    public JButton getSimpanButton() {
        return this.simpanButton;
    }

    public void setSimpanButton(JButton simpanButton) {
        this.simpanButton = simpanButton;
    }

    public void showMessage(String message) {
        JTextArea textArea = new JTextArea(message,5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane);
    }
        public void showWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
    }
}
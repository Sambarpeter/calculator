import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener {
    JLabel lblValue1 = new JLabel("Input Value1:");
    JTextField txtValue1 = new JTextField(10);
    JLabel lblValue2 = new JLabel("Input value2:");
    JTextField txtValue2 = new JTextField(10);
    JLabel lblResults = new JLabel("Compute result:");
    JTextField txtResults = new JTextField(10);
    JButton btnAdd = new JButton("Add");
    JButton btnMultiply = new JButton("Multiply");
    JButton btnDifference = new JButton("Difference");
    Calculator() {
        super("Calculator");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(200, 200);
        add(lblValue1);
        add(txtValue1);
        add(lblValue2);
        add(txtValue2);
        add(lblResults);
        add(txtResults);
        add(btnAdd);
        add(btnMultiply);
        add(btnDifference);
        txtResults.setEditable(false);
        btnAdd.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDifference.addActionListener(this);
    }
    public static void main(String[] args){
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Add")){
            int value1 = Integer.parseInt(txtValue1.getText());
            int value2 = Integer.parseInt(txtValue2.getText());
            int sum = value1 + value2;
            txtResults.setText(Integer.toString(sum));

        }
        if(e.getSource() == btnMultiply){
            int value1 = Integer.parseInt(txtValue1.getText());
            int value2 = Integer.parseInt(txtValue2.getText());
            int product = value1 * value2;
            txtResults.setText(Integer.toString(product));
        }
        if(e.getActionCommand().equals("Difference")){
            int value1 = Integer.parseInt(txtValue1.getText());
            int value2 = Integer.parseInt(txtValue2.getText());
            int Difference = value1 - value2;
            txtResults.setText(Integer.toString(Difference));

        }

    }
}

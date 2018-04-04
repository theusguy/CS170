import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MileageTest {
JFrame frame;
JLabel label1;
JLabel label2;
JLabel label3;
JTextField tankSize;
JTextField miles;
JButton calculate;
JTextField mileage;
public MileageTest() {
frame = new JFrame("Mileage Calculator");
label1 = new JLabel("Enter Tank Size (Gallons): ");
label2 = new JLabel("No.of Miles with Full tank: ");
label3= new JLabel("Mileage: ");
tankSize = new JTextField(5);
miles = new JTextField(5);
calculate = new JButton(" Calculate Mileage ");
mileage = new JTextField(5);
frame.add(label1);
frame.add(tankSize);
frame.add(label2);
frame.add(miles);
frame.add(calculate);
frame.add(label3);
frame.add(mileage);
frame.setSize(250,200);
frame.setLayout(new FlowLayout());
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
calculate.addActionListener(new ActionListener() {

//Override
public void actionPerformed(ActionEvent arg0) {
double size = Double.parseDouble(tankSize.getText());
double milesTravelled = Double.parseDouble(miles.getText());
DecimalFormat dc =new DecimalFormat("0.00");
mileage.setText("" + dc.format((milesTravelled/size)));

}
});


}
public static void main(String[] args) {

new MileageTest();
}

}
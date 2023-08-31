

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeCal {
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtMarks4;
    private JTextField txtMarks5;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton calButton;
    private JPanel Main;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Grade Calculator");
        frame.setContentPane(new StudentGradeCal().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(550, 200, 500, 400);
//        frame.pack();
        frame.setVisible(true);
    }

    public StudentGradeCal(){
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1, m2, m3, m4, m5, total;
                double avg;

                m1 = Integer.parseInt(txtMarks1.getText());
                m2 = Integer.parseInt(txtMarks2.getText());
                m3 = Integer.parseInt(txtMarks3.getText());
                m4 = Integer.parseInt(txtMarks4.getText());
                m5 = Integer.parseInt(txtMarks5.getText());

                total = m1 + m2 + m3 + m4 + m5;
                txtTotal.setText(String.valueOf(total));

                avg = total/5;
                txtAvg.setText(String.valueOf(avg));

                if (avg < 40){
                    txtGrade.setText("FAIL");
                } else if (40 < avg  && avg < 60) {
                    txtGrade.setText("D");
                } else if (60 < avg  && avg < 70) {
                    txtGrade.setText("C");
                } else if (70 < avg  && avg < 80) {
                    txtGrade.setText("C");
                } else if (80 < avg  && avg < 90) {
                    txtGrade.setText("B");
                } else if (90 < avg  && avg < 100) {
                    txtGrade.setText("A");
                }
            }
        });
    }


}

package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setTitle("My app");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,400);

        frame.setLayout(null);

        JButton button = new JButton();

        button.setText("Push me");
        button.setSize(120,20);


        frame.add(button);
        button.setLocation(40,40);

        JLabel lbl = new JLabel("Name");
        JTextField field = new JTextField();
        lbl.setBounds(40,65,120,20);
        field.setBounds(40,90,120,20);

        frame.add(lbl);
        frame.add(field);




        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Date()+": click");
                String name = field.getText();
                System.out.println("hello  " + name);

                JLabel lblHello = new JLabel(" ");
                lblHello.setBounds(40,115,150,20);
                frame.add(lblHello);

                lblHello.setText("hello  " + name);

            }
        });
        frame.setVisible(true);
    }
}

package observer_pattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame=new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(o-> System.out.println("하지 마! 아마 후회티비"));
        button.addActionListener(new DevilLister());
        button.setBounds(0, 0, 200, 100);

        frame.add(button);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    static class DevilLister implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷!!!");
        }
    }


}

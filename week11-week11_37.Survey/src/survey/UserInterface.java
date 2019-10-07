package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        this.frame = new JFrame("Survey");
        this.frame.setPreferredSize(new Dimension(200,300));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(new JLabel("Are you?"));
        JCheckBox Yes = new JCheckBox("Yes!");
        JCheckBox No = new JCheckBox("No!");
        container.add(Yes);
        container.add(No);
        container.add(new JLabel("Why?"));
        JRadioButton optionOne = new JRadioButton("No reason.");
        JRadioButton optionTwo = new JRadioButton("Because it is fun!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(optionOne);
        buttonGroup.add(optionTwo);
        container.add(optionOne);
        container.add(optionTwo);
        JButton button = new JButton("Done!");
        container.add(button);
    }
    
    public JFrame getFrame() {
        return frame;
    }
}

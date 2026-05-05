import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Swing Iqra");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout (important!)
        frame.setLayout(new FlowLayout());

        // Add a Label
        JLabel label = new JLabel("Enter your name:");
        frame.add(label);

        // Add a Text Field
        JTextField textField = new JTextField(15);
        frame.add(textField);

        // Add a Button
        JButton button = new JButton("Click Me");
        frame.add(button);
        
        /*component.add<EventType>Listener(new ListenerType() {
        public void methodName(EventObject e) */
        button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("ok");
        }
    });
        

        // Make frame visible
        frame.setVisible(true);
    }
}
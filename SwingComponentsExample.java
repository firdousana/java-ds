import javax.swing.*;
public class SwingComponentsExample {
public static void main(String[] args) {
 JFrame frame = new JFrame("Swing Components Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(300, 200);
frame.setLayout(new
BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
 JLabel label = new JLabel("Hello, I am a JLabel!");
 frame.add(label);
 ImageIcon icon = new ImageIcon("\"C:\\Users\\sanas\\Desktop\\cat.webp\"");
 JLabel imageLabel = new JLabel(icon);
 frame.add(imageLabel);
 JTextField textField = new JTextField(20);
 frame.add(textField);
 JButton button = new JButton("Click me!");
 frame.add(button);
 String[] listData = {"Item 1", "Item 2", "Item 3"};
 JList<String> list = new JList<>(listData);
 JScrollPane scrollPane = new JScrollPane(list);
 frame.add(scrollPane);
 String[] comboBoxData = {"Option 1", "Option 2", "Option 3"};
 JComboBox<String> comboBox = new JComboBox<>(comboBoxData);
 frame.add(comboBox);
 frame.setVisible(true);
 }
}

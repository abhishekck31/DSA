import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayToLinkedListUI extends JFrame {
    private JTextField inputField;
    private JButton convertButton;
    private JLabel resultLabel;

    public ArrayToLinkedListUI() {
        setTitle("Array to Linked List Converter");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter Array (comma separated):"));
        inputField = new JTextField(15);
        inputPanel.add(inputField);

        convertButton = new JButton("Convert");
        inputPanel.add(convertButton);

        add(inputPanel, BorderLayout.NORTH);

        resultLabel = new JLabel("Result will appear here", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(resultLabel, BorderLayout.CENTER);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (input == null || input.trim().isEmpty()) {
                    resultLabel.setText("Please enter some numbers.");
                    return;
                }
                try {
                    String[] parts = input.split(",");
                    int[] arr = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        arr[i] = Integer.parseInt(parts[i].trim());
                    }
                    Node head = arraytolinkedlist.arraytolinked(arr, 0);
                    
                    StringBuilder sb = new StringBuilder();
                    Node curr = head;
                    while (curr != null) {
                        sb.append(curr.data).append(" -> ");
                        curr = curr.next;
                    }
                    sb.append("null");
                    resultLabel.setText(sb.toString());
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter integers separated by commas.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Set system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            new ArrayToLinkedListUI().setVisible(true);
        });
    }
}

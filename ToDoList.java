import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        JTextField taskField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");

        taskField.setBounds(20, 20, 250, 30);
        addButton.setBounds(280, 20, 80, 30);
        scrollPane.setBounds(20, 60, 340, 150);
        removeButton.setBounds(20, 220, 100, 30);

        frame.add(taskField);
        frame.add(addButton);
        frame.add(scrollPane);
        frame.add(removeButton);

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) listModel.addElement(task);
            taskField.setText("");
        });

        removeButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) listModel.remove(selectedIndex);
        });

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package views;

import javax.swing.*;
import java.awt.*;

public class TaskManagerPanel extends JPanel{
    private JTextField titleField;
    private JTextArea descriptionArea;
    private JButton addButton;
    private final Font PREFERRED_FONT = new Font("MV Boli", Font.PLAIN, 12);

    public TaskManagerPanel(){
        this.setLayout(new GridLayout(3, 2));

        JLabel title = new JLabel("Title: ");
        title.setFont(PREFERRED_FONT);
        this.add(title);

        this.titleField = new JTextField();
        this.add(titleField);

        JLabel description = new JLabel("Description: ");
        description.setFont(PREFERRED_FONT);
        this.add(description);

        this.descriptionArea = new JTextArea();
        this.add(new JScrollPane(descriptionArea));

        this.addButton = new JButton("Add New Task");
        addButton.setFont(PREFERRED_FONT);
        this.add(addButton);
        
    }
}

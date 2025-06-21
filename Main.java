import javax.swing.*;

import data.TaskManager;
import views.TaskManagerPanel;

public class Main {

     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            TaskManagerPanel panel = new TaskManagerPanel();

            JFrame frame = new JFrame("Smart Study Planner");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(panel);
            frame.setVisible(true);

        });
     }
}
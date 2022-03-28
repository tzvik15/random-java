
/**
 * @author Nester, Daniel
 *         Today's date: 03/15/2022
 *         Class: CMSC335/7382
 *         IDE: VS Code
 *         Assignment: Project 2 - GUI and Swing
 *         This file: 
 */

import javax.swing.*;
import java.awt.*;

public class RunShapesGUI {

    private static void makeShapes(String num1, String num2) {
        System.out.println(num1);
        // System.out.println(num2);

        if (num2.equals("") || num2.isEmpty()) {
            System.out.println("num2 is empty");
        } else
            System.out.println(num2);
    }

    public static void main(String[] args) {
        Header h = new Header();
        h.display();

        JFrame frame = new JFrame();
        JPanel content = new JPanel(new GridBagLayout());

        JLabel question = new JLabel("Please select the shape you wish to create");
        GridBagConstraints questionC = new GridBagConstraints();
        questionC.gridx = 1;
        questionC.gridy = 0;
        content.add(question, questionC);

        JLabel dynamicLabel = new JLabel();
        GridBagConstraints dlConstraints = new GridBagConstraints();
        dlConstraints.gridx = 1;
        dlConstraints.gridy = 2;
        dynamicLabel.setVisible(false);
        content.add(dynamicLabel, dlConstraints);

        JTextField dynamicInputField1 = new JTextField(10);
        GridBagConstraints dynamicInputField1C = new GridBagConstraints();
        dynamicInputField1C.gridx = 2;
        dynamicInputField1C.gridy = 2;
        dynamicInputField1.setVisible(false);
        content.add(dynamicInputField1, dynamicInputField1C);

        JLabel dynamicLabel2 = new JLabel();
        GridBagConstraints dl2Constraints = new GridBagConstraints();
        dl2Constraints.gridx = 1;
        dl2Constraints.gridy = 3;
        dynamicLabel.setVisible(false);
        content.add(dynamicLabel2, dl2Constraints);

        JTextField dynamicInputField2 = new JTextField(10);
        GridBagConstraints dynamicInputField2C = new GridBagConstraints();
        dynamicInputField2C.gridx = 2;
        dynamicInputField2C.gridy = 3;
        dynamicInputField2.setVisible(false);
        content.add(dynamicInputField2, dynamicInputField2C);

        JButton submit = new JButton("Select");
        GridBagConstraints submitC = new GridBagConstraints();
        submitC.gridx = 1;
        submitC.gridy = 4;
        submit.setVisible(false);
        submit.addActionListener(a -> {
            String st1 = dynamicInputField1.getText();
            String st2 = dynamicInputField2.getText();
            makeShapes(st1, st2);
        });
        content.add(submit, submitC);

        String[] shapesList = { "-choose a shape", "Circle", "Cone", "Cube", "Cylinder", "Rectangle", "Sphere",
                "Square", "Torus",
                "Triangle" };
        JComboBox<String> choice = new JComboBox<String>(shapesList);
        GridBagConstraints choiceC = new GridBagConstraints();
        choiceC.gridx = 1;
        choiceC.gridy = 1;
        choice.addActionListener(e -> {
            JComboBox<String> cb = (JComboBox<String>) e.getSource();
            String shapeChoice = (String) cb.getSelectedItem();

            switch (shapeChoice) {
                case "-choose a shape":
                    dynamicLabel.setVisible(false);
                    dynamicInputField1.setVisible(false);
                    dynamicLabel2.setVisible(false);
                    dynamicInputField2.setVisible(false);
                    submit.setVisible(false);
                    break;
                case "Circle":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter circle radius: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(false);
                    dynamicInputField2.setVisible(false);
                    submit.setVisible(true);
                    break;
                case "Cube":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter cube edge: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(false);
                    dynamicInputField2.setVisible(false);
                    submit.setVisible(true);
                    break;
                case "Cone":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter cone radius: ");
                    dynamicLabel2.setText("Enter cone height: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(true);
                    dynamicInputField2.setVisible(true);
                    submit.setVisible(true);
                    break;
                case "Cylinder":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter cylinder radius: ");
                    dynamicLabel2.setText("Enter cylinder height: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(true);
                    dynamicInputField2.setVisible(true);
                    submit.setVisible(true);
                    break;
                case "Rectangle":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter rectangle base: ");
                    dynamicLabel2.setText("Enter rectangle height: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(true);
                    dynamicInputField2.setVisible(true);
                    submit.setVisible(true);
                    break;
                case "Sphere":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter sphere radius: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(false);
                    dynamicInputField2.setVisible(false);
                    submit.setVisible(true);
                    break;
                case "Square":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter square base: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(false);
                    dynamicInputField2.setVisible(false);
                    submit.setVisible(true);
                    break;
                case "Torus":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter torus major radius: ");
                    dynamicLabel2.setText("Enter torus minor radius: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(true);
                    dynamicInputField2.setVisible(true);
                    submit.setVisible(true);
                    break;
                case "Triangle":
                    dynamicLabel.setText("");
                    dynamicLabel.setText("Enter triangle base: ");
                    dynamicLabel2.setText("Enter triangle height: ");
                    dynamicLabel.setVisible(true);
                    dynamicInputField1.setVisible(true);
                    dynamicLabel2.setVisible(true);
                    dynamicInputField2.setVisible(true);
                    submit.setVisible(true);
                    break;
                default:
                    dynamicLabel.setVisible(false);
                    dynamicInputField1.setVisible(false);
                    dynamicLabel2.setVisible(false);
                    dynamicInputField2.setVisible(false);
                    submit.setVisible(false);
                    break;
            }

        });
        content.add(choice, choiceC);

        // set visibility
        frame.setTitle("Shapes GUI - Project 2, Daniel Nester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(content);
        frame.setSize(600, 400);
        frame.setLocation(150, 150);
        frame.setVisible(true);
    }
}

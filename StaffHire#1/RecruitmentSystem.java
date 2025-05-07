import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RecruitmentSystem extends JFrame implements ActionListener {

    private JTextField vacancyField, designationField, jobTypeField, staffNameField, qualificationField, salaryField,
            joiningDateField, appointedByField, workingHoursField, wagesField, shiftsField;
    private JCheckBox joinedCheckBox;

    private JButton addFullTimeBtn, addPartTimeBtn, addSalaryBtn, addShiftBtn, displayBtn, terminateBtn, clearBtn;

    public RecruitmentSystem() {
        setTitle("Recruitment System");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Font labelFont = new Font("Arial", Font.PLAIN, 16);
        Dimension fieldSize = new Dimension(400, 30);

        // --- Personal Info Panel ---
        JPanel personalPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        personalPanel.setBorder(BorderFactory.createTitledBorder("Personal Information"));
        staffNameField = addLabeledField("Staff Name:", personalPanel, labelFont, fieldSize);
        qualificationField = addLabeledField("Qualification:", personalPanel, labelFont, fieldSize);
        appointedByField = addLabeledField("Appointed By:", personalPanel, labelFont, fieldSize);
        contentPanel.add(personalPanel);

        // --- Job Info Panel ---
        JPanel jobPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        jobPanel.setBorder(BorderFactory.createTitledBorder("Job Details"));
        vacancyField = addLabeledField("Vacancy No:", jobPanel, labelFont, fieldSize);
        designationField = addLabeledField("Designation:", jobPanel, labelFont, fieldSize);
        jobTypeField = addLabeledField("Job Type:", jobPanel, labelFont, fieldSize);
        salaryField = addLabeledField("Salary:", jobPanel, labelFont, fieldSize);
        contentPanel.add(jobPanel);

        // --- Employment Details Panel ---
        JPanel employmentPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        employmentPanel.setBorder(BorderFactory.createTitledBorder("Employment Info"));
        joiningDateField = addLabeledField("Joining Date:", employmentPanel, labelFont, fieldSize);
        workingHoursField = addLabeledField("Working Hours:", employmentPanel, labelFont, fieldSize);
        wagesField = addLabeledField("Wages Per Hour:", employmentPanel, labelFont, fieldSize);
        contentPanel.add(employmentPanel);

        // --- Shift Panel ---
        JPanel shiftPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        shiftPanel.setBorder(BorderFactory.createTitledBorder("Shift Info"));
        shiftsField = addLabeledField("Shifts:", shiftPanel, labelFont, fieldSize);
        joinedCheckBox = new JCheckBox("Joined");
        joinedCheckBox.setFont(labelFont);
        shiftPanel.add(joinedCheckBox);
        contentPanel.add(shiftPanel);

        // --- Buttons Panel ---
        JPanel buttonPanel = new JPanel(new GridLayout(2, 4, 10, 10));
        addFullTimeBtn = new JButton("Add Full-Time");
        addPartTimeBtn = new JButton("Add Part-Time");
        addSalaryBtn = new JButton("Add Salary");
        addShiftBtn = new JButton("Add Working Shifts");
        displayBtn = new JButton("Display");
        terminateBtn = new JButton("Terminate");
        clearBtn = new JButton("Clear");

        buttonPanel.add(addFullTimeBtn);
        buttonPanel.add(addPartTimeBtn);
        buttonPanel.add(addSalaryBtn);
        buttonPanel.add(addShiftBtn);
        buttonPanel.add(displayBtn);
        buttonPanel.add(terminateBtn);
        buttonPanel.add(clearBtn);

        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(buttonPanel);

        // --- Scroll Pane for All Content ---
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        setContentPane(scrollPane);

        // --- Action Listeners (empty for now) ---
        addFullTimeBtn.addActionListener(this);
        addPartTimeBtn.addActionListener(this);
        addSalaryBtn.addActionListener(this);
        addShiftBtn.addActionListener(this);
        displayBtn.addActionListener(this);
        terminateBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    private JTextField addLabeledField(String labelText, JPanel panel, Font font, Dimension size) {
        JLabel label = new JLabel(labelText);
        label.setFont(font);
        JTextField textField = new JTextField();
        textField.setPreferredSize(size);
        textField.setFont(font);
        panel.add(label);
        panel.add(textField);
        return textField;
    }

    public void actionPerformed(ActionEvent e) {
        // Placeholder for button logic
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RecruitmentSystem());
    }
}

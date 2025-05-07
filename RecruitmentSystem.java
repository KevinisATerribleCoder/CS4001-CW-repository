import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecruitmentSystem extends JFrame {
    private JButton btnAddFullTime, btnAddPartTime, btnSetSalary, btnSetShift, btnTerminate, btnDisplay, btnClear, btnHelp;
    private ArrayList<StaffHire> staffList;
    private JTextField txtVacancy, txtDesignation, txtJobType, txtStaffName, txtJoinDate, txtQualification, txtAppointedBy, txtSalary, txtWeeklyHours, txtWorkingHours, txtWagePerHour, txtShifts, txtDisplayNumber;

    private JCheckBox checkJoin;

    public RecruitmentSystem() {
        staffList = new ArrayList<StaffHire>();

        setTitle("Recruitment Management System");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);
        inputBox();
        buttonBox();
        setVisible(true);
    }

    private void inputBox() {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0, 2, 10, 5));

        Font ogFont = new Font("Arial", Font.PLAIN, 18);

        JLabel lblVacancy = new JLabel("Vacancy Number:");
        lblVacancy.setFont(ogFont);
        lblVacancy.setHorizontalAlignment(SwingConstants.CENTER);
        txtVacancy = new JTextField();
        txtVacancy.setFont(ogFont);
        txtVacancy.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblVacancy);
        inputPanel.add(txtVacancy);

        
        JLabel lblDesignation = new JLabel("Designation:");
        lblDesignation.setFont(ogFont);
        lblDesignation.setHorizontalAlignment(SwingConstants.CENTER);
        txtDesignation = new JTextField();
        txtDesignation.setFont(ogFont);
        txtDesignation.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblDesignation);
        inputPanel.add(txtDesignation);

        JLabel lblJobType = new JLabel("Job Type:");
        lblJobType.setFont(ogFont);
        lblJobType.setHorizontalAlignment(SwingConstants.CENTER);
        txtJobType = new JTextField();
        txtJobType.setFont(ogFont);
        txtJobType.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblJobType);
        inputPanel.add(txtJobType);

        JLabel lblStaffName = new JLabel("Staff Name:");
        lblStaffName.setFont(ogFont);
        lblStaffName.setHorizontalAlignment(SwingConstants.CENTER);
        txtStaffName = new JTextField();
        txtStaffName.setFont(ogFont);
        txtStaffName.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblStaffName);
        inputPanel.add(txtStaffName);

        JLabel lblJoinDate = new JLabel("Join Date:");
        lblJoinDate.setFont(ogFont);
        lblJoinDate.setHorizontalAlignment(SwingConstants.CENTER);
        txtJoinDate = new JTextField();
        txtJoinDate.setFont(ogFont);
        txtJoinDate.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblJoinDate);
        inputPanel.add(txtJoinDate);

        JLabel lblQualification = new JLabel("Qualification:");
        lblQualification.setFont(ogFont);
        lblQualification.setHorizontalAlignment(SwingConstants.CENTER);
        txtQualification = new JTextField();
        txtQualification.setFont(ogFont);
        txtQualification.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblQualification);
        inputPanel.add(txtQualification);

        JLabel lblAppointedBy = new JLabel("Appointed By:");
        lblAppointedBy.setFont(ogFont);
        lblAppointedBy.setHorizontalAlignment(SwingConstants.CENTER);
        txtAppointedBy = new JTextField();
        txtAppointedBy.setFont(ogFont);
        txtAppointedBy.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblAppointedBy);
        inputPanel.add(txtAppointedBy);

        JLabel lblSalary = new JLabel("Salary:");
        lblSalary.setFont(ogFont);
        lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
        txtSalary = new JTextField();
        txtSalary.setFont(ogFont);
        txtSalary.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblSalary);
        inputPanel.add(txtSalary);

        JLabel lblWeeklyHours = new JLabel("Weekly Hours:");
        lblWeeklyHours.setFont(ogFont);
        lblWeeklyHours.setHorizontalAlignment(SwingConstants.CENTER);
        txtWeeklyHours = new JTextField();
        txtWeeklyHours.setFont(ogFont);
        txtWeeklyHours.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblWeeklyHours);
        inputPanel.add(txtWeeklyHours);

        JLabel lblWorkingHours = new JLabel("Working Hours:");
        lblWorkingHours.setFont(ogFont);
        lblWorkingHours.setHorizontalAlignment(SwingConstants.CENTER);
        txtWorkingHours = new JTextField();
        txtWorkingHours.setFont(ogFont);
        txtWorkingHours.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblWorkingHours);
        inputPanel.add(txtWorkingHours);

        JLabel lblWagePerHour = new JLabel("Wage Per Hour:");
        lblWagePerHour.setFont(ogFont);
        lblWagePerHour.setHorizontalAlignment(SwingConstants.CENTER);
        txtWagePerHour = new JTextField();
        txtWagePerHour.setFont(ogFont);
        txtWagePerHour.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblWagePerHour);
        inputPanel.add(txtWagePerHour);

        JLabel lblShifts = new JLabel("Shifts:");
        lblShifts.setFont(ogFont);
        lblShifts.setHorizontalAlignment(SwingConstants.CENTER);
        txtShifts = new JTextField();
        txtShifts.setFont(ogFont);
        txtShifts.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblShifts);
        inputPanel.add(txtShifts);

        JLabel lblDisplayNumber = new JLabel("Display Number:");
        lblDisplayNumber.setFont(ogFont);
        lblDisplayNumber.setHorizontalAlignment(SwingConstants.CENTER);
        txtDisplayNumber = new JTextField();
        txtDisplayNumber.setFont(ogFont);
        txtDisplayNumber.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(lblDisplayNumber);
        inputPanel.add(txtDisplayNumber);

        
        JPanel joinedPanel = new JPanel();
        joinedPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel joinedLabel = new JLabel("Joined:");
        checkJoin = new JCheckBox();
        joinedPanel.add(joinedLabel);
        joinedPanel.add(checkJoin);

        
        inputPanel.add(joinedPanel);

        
        add(inputPanel, BorderLayout.CENTER);
    }

    private void buttonBox() {
        
        btnAddFullTime = new JButton("Add Full-Time");
        btnAddPartTime = new JButton("Add Part-Time");
        btnSetSalary = new JButton("Set Salary");
        btnSetShift = new JButton("Set Shift");
        btnTerminate = new JButton("Terminate");
        btnDisplay = new JButton("Display");
        btnClear = new JButton("CLEAR");
        btnHelp = new JButton("HELP");

        
        JPanel row1 = new JPanel();
        row1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        row1.add(btnAddFullTime);
        row1.add(btnSetSalary);
        row1.add(btnTerminate);
        row1.add(btnHelp);

        
        JPanel row2 = new JPanel();
        row2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        row2.add(btnAddPartTime);
        row2.add(btnSetShift);
        row2.add(btnDisplay);
        row2.add(btnClear);

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1, 5, 5));
        buttonPanel.add(row1);
        buttonPanel.add(row2);

        
        btnAddFullTime.setPreferredSize(new Dimension(160, 40));
        btnAddPartTime.setPreferredSize(new Dimension(160, 40));
        btnSetSalary.setPreferredSize(new Dimension(160, 40));
        btnSetShift.setPreferredSize(new Dimension(160, 40));
        btnTerminate.setPreferredSize(new Dimension(160, 40));
        btnDisplay.setPreferredSize(new Dimension(160, 40));
        btnClear.setPreferredSize(new Dimension(160, 40));
        btnHelp.setPreferredSize(new Dimension(160, 40));

        
        add(buttonPanel, BorderLayout.SOUTH);

        
        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showHelp();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayInfo();
            }
        });

        btnTerminate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                terminateStaff();
            }
        });

        btnSetShift.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setShifts();
            }
        });

        btnSetSalary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setSalary();
            }
        });

        btnAddPartTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addPartTime();
            }
        });

        btnAddFullTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addFullTime();
            }
        });
    }

    private int getDisplayIndex() {
        
        try {
            int index = Integer.parseInt(txtDisplayNumber.getText());
            if (index >= 0 && index < staffList.size()) {
                return index;
            } else {
                JOptionPane.showMessageDialog(this, "Display Number is out of range.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Display Number.");
        }
        return -1;
    }

    private void addFullTime() {
        
        try {
            
            String vacancyText = txtVacancy.getText();
            String designationText = txtDesignation.getText();
            String jobTypeText = txtJobType.getText();
            String staffNameText = txtStaffName.getText();
            String joinDateText = txtJoinDate.getText();
            String qualificationText = txtQualification.getText();
            String appointedByText = txtAppointedBy.getText();
            String weeklyHoursText = txtWeeklyHours.getText();

            
            int vacancy = Integer.parseInt(vacancyText);
            boolean joined = checkJoin.isSelected();
            int weeklyHours = Integer.parseInt(weeklyHoursText);

            
            FullTimeStaff staff = new FullTimeStaff(vacancy, designationText, jobTypeText, staffNameText, joinDateText, qualificationText, appointedByText, joined, weeklyHours);
            staffList.add(staff);

            
            JOptionPane.showMessageDialog(this, "Full-Time Staff Added Successfully!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for required fields.");
        }
    }

    private void addPartTime() {
        
        try {
            
            String vacancyText = txtVacancy.getText();
            String designationText = txtDesignation.getText();
            String jobTypeText = txtJobType.getText();
            String staffNameText = txtStaffName.getText();
            String joinDateText = txtJoinDate.getText();
            String qualificationText = txtQualification.getText();
            String appointedByText = txtAppointedBy.getText();
            String workingHoursText = txtWorkingHours.getText();
            String wageText = txtWagePerHour.getText();
            String shiftsText = txtShifts.getText();

            
            int vacancy = Integer.parseInt(vacancyText);
            boolean joined = checkJoin.isSelected();
            int workingHours = Integer.parseInt(workingHoursText);
            double wage = Double.parseDouble(wageText);

            
            PartTimeStaff staff = new PartTimeStaff(vacancy, designationText, jobTypeText, staffNameText, joinDateText, qualificationText, appointedByText, joined, workingHours, wage, shiftsText);
            staffList.add(staff);

            
            JOptionPane.showMessageDialog(this, "Part-Time Staff Added Successfully!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for required fields.");
        }
    }

    private void setSalary() {
        
        int index = getDisplayIndex();
        if (index != -1) {
            StaffHire staff = staffList.get(index);
            if (staff instanceof FullTimeStaff) {
                
                String salaryText = txtSalary.getText();
                double salary = Double.parseDouble(salaryText);

                
                ((FullTimeStaff) staff).setSalary(salary);
                JOptionPane.showMessageDialog(this, "Salary Updated Successfully!");
            }
        }
    }

    private void setShifts() {
        
        int index = getDisplayIndex();
        if (index != -1) {
            StaffHire staff = staffList.get(index);
            if (staff instanceof PartTimeStaff) {
                
                String shiftsText = txtShifts.getText();

                
                ((PartTimeStaff) staff).setShifts(shiftsText);
                JOptionPane.showMessageDialog(this, "Shifts Updated Successfully!");
            }
        }
    }

    private void terminateStaff() {
        
        int index = getDisplayIndex();
        if (index != -1) {
            StaffHire staff = staffList.get(index);
            if (staff instanceof PartTimeStaff) {
                
                ((PartTimeStaff) staff).terminate();
                JOptionPane.showMessageDialog(this, "Part-Time Staff Terminated Successfully!");
            }
        }
    }

    private void displayInfo() {
        
        int index = getDisplayIndex();
        if (index != -1) {
            
            StaffHire staff = staffList.get(index);
            staff.display();
        }
    }

    private void clearFields() {
        
        txtVacancy.setText("");
        txtDesignation.setText("");
        txtJobType.setText("");
        txtStaffName.setText("");
        txtJoinDate.setText("");
        txtQualification.setText("");
        txtAppointedBy.setText("");
        txtSalary.setText("");
        txtWeeklyHours.setText("");
        txtWorkingHours.setText("");
        txtWagePerHour.setText("");
        txtShifts.setText("");
        txtDisplayNumber.setText("");
        checkJoin.setSelected(false);
    }

    private void showHelp() {
        
        JOptionPane.showMessageDialog(this,
                "Instructions:\n" +
                        "1. To add a full-time staff member, fill in all the fields including salary and weekly hours, then click 'Add Full-Time'.\n" +
                        "2. To add a part-time staff member, fill in all the fields including working hours and shifts, then click 'Add Part-Time'.\n" +
                        "3. To update the salary of a full-time staff member, enter the new salary and the display number, then click 'Set Salary'.\n" +
                        "4. To update the shifts of a part-time staff member, enter the new shifts and the display number, then click 'Set Shift'.\n" +
                        "5. To terminate a part-time staff member, enter the display number and click 'Terminate'.\n" +
                        "6. To display information about a staff member, enter the display number and click 'Display'.\n" +
                        "7. To clear all the input fields, click 'Clear'.\n" +
                        "8. To see this help message again, click 'Help'.");
    }

    public static void main(String[] args)
    {
        new RecruitmentSystem();
    }
}

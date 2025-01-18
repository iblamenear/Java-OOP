package Praktikum.PraktikumPBO.Sesi14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class HospitalSystemGUI extends JFrame {
    private Map<Integer, Doctor> doctorRecords;
    private Map<Integer, Patient> patientRecords;
    private Map<Integer, Nurse> nurseRecords;
    private JTextArea displayArea;

    public HospitalSystemGUI() {
        doctorRecords = new HashMap<>();
        patientRecords = new HashMap<>();
        nurseRecords = new HashMap<>();

        setTitle("Hospital Management System");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        JButton addDoctorButton = new JButton("Add Doctor");
        JButton addPatientButton = new JButton("Add Patient");
        JButton addNurseButton = new JButton("Add Nurse");
        JButton searchDoctorButton = new JButton("Search Doctor");
        JButton searchPatientButton = new JButton("Search Patient");
        JButton searchNurseButton = new JButton("Search Nurse");
        JButton removeDoctorButton = new JButton("Remove Doctor");
        JButton removePatientButton = new JButton("Remove Patient");
        JButton removeNurseButton = new JButton("Remove Nurse");

        inputPanel.setLayout(new GridLayout(3, 3));
        inputPanel.add(addDoctorButton);
        inputPanel.add(addPatientButton);
        inputPanel.add(addNurseButton);
        inputPanel.add(searchDoctorButton);
        inputPanel.add(searchPatientButton);
        inputPanel.add(searchNurseButton);
        inputPanel.add(removeDoctorButton);
        inputPanel.add(removePatientButton);
        inputPanel.add(removeNurseButton);
        add(inputPanel, BorderLayout.SOUTH);

        // Add action listeners
        addDoctorButton.addActionListener(e -> addDoctor());
        addPatientButton.addActionListener(e -> addPatient());
        addNurseButton.addActionListener(e -> addNurse());
        searchDoctorButton.addActionListener(e -> searchDoctor());
        searchPatientButton.addActionListener(e -> searchPatient());
        searchNurseButton.addActionListener(e -> searchNurse());
        removeDoctorButton.addActionListener(e -> removeDoctor());
        removePatientButton.addActionListener(e -> removePatient());
        removeNurseButton.addActionListener(e -> removeNurse());

        setVisible(true);
    }

    private void addDoctor() {
        try {
            String name = JOptionPane.showInputDialog(this, "Enter Doctor's Name:");
            int age = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Doctor's Age:"));
            String specialty = JOptionPane.showInputDialog(this, "Enter Doctor's Specialty:");
            int doctorID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Doctor's ID:"));

            Doctor doctor = new Doctor(name, age, specialty, doctorID);
            doctorRecords.put(doctorID, doctor);
            displayRecords();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void addPatient() {
        try {
            String name = JOptionPane.showInputDialog(this, "Enter Patient's Name:");
            int age = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Patient's Age:"));
            String illness = JOptionPane.showInputDialog(this, "Enter Patient's Illness:");
            int patientID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Patient's ID:"));

            Patient patient = new Patient(name, age, illness, patientID);
            patientRecords.put(patientID, patient);
            displayRecords();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void addNurse() {
        try {
            String name = JOptionPane.showInputDialog(this, "Enter Nurse's Name:");
            int age = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Nurse's Age:"));
            int nurseID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Nurse's ID:"));
            String department = JOptionPane.showInputDialog(this, "Enter Department:");

            Nurse nurse = new Nurse(name, age, nurseID, department);
            nurseRecords.put(nurseID, nurse);
            displayRecords();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void searchDoctor() {
        try {
            int doctorID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Doctor's ID to Search:"));
            Doctor doctor = doctorRecords.get(doctorID);
            if (doctor != null) {
                JOptionPane.showMessageDialog(this, doctor.getDetails());
            } else {
                JOptionPane.showMessageDialog(this, "Doctor not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void searchPatient() {
        try {
            int patientID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Patient's ID to Search:"));
            Patient patient = patientRecords.get(patientID);
            if (patient != null) {
                JOptionPane.showMessageDialog(this, patient.getDetails());
            } else {
                JOptionPane.showMessageDialog(this, "Patient not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void searchNurse() {
        try {
            int nurseID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Nurse's ID to Search:"));
            Nurse nurse = nurseRecords.get(nurseID);
            if (nurse != null) {
                JOptionPane.showMessageDialog(this, nurse.getDetails());
            } else {
                JOptionPane.showMessageDialog(this, "Nurse not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void removeDoctor() {
        try {
            int doctorID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Doctor's ID to Remove:"));
            if (doctorRecords.remove(doctorID) != null) {
                JOptionPane.showMessageDialog(this, "Doctor removed.");
                displayRecords();
            } else {
                JOptionPane.showMessageDialog(this, "Doctor not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void removePatient() {
        try {
            int patientID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Patient's ID to Remove:"));
            if (patientRecords.remove(patientID) != null) {
                JOptionPane.showMessageDialog(this, "Patient removed.");
                displayRecords();
            } else {
                JOptionPane.showMessageDialog(this, "Patient not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void removeNurse() {
        try {
            int nurseID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Nurse's ID to Remove:"));
            if (nurseRecords.remove(nurseID) != null) {
                JOptionPane.showMessageDialog(this, "Nurse removed.");
                displayRecords();
            } else {
                JOptionPane.showMessageDialog(this, "Nurse not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }

    private void displayRecords() {
        displayArea.setText("");
        displayArea.append("Doctors:\n");
        for (Doctor doctor : doctorRecords.values()) {
            displayArea.append(doctor.getDetails() + "\n");
        }
        
        displayArea.append("\nPatients:\n");
        for (Patient patient : patientRecords.values()) {
            displayArea.append(patient.getDetails() + "\n");
        }
        
        displayArea.append("\nNurses:\n");
        for (Nurse nurse : nurseRecords.values()) {
            displayArea.append(nurse.getDetails() + "\n");
        }
    }
}
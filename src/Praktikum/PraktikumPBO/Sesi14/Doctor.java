package Praktikum.PraktikumPBO.Sesi14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doctor extends Person {
    private String specialty;
    private int doctorID;

    public Doctor(String name, int age, String specialty, int doctorID) {
        super(name, age);
        this.specialty = specialty;
        this.doctorID = doctorID;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getDoctorID() {
        return doctorID;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Doctor ID: " + doctorID + ", Specialty: " + specialty;
    }
}

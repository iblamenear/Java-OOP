package Praktikum.PraktikumPBO.Sesi14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Patient extends Person {
    private String illness;
    private int patiendID;

    public Patient(String name, int age, String illness, int patientID) {
        super(name, age);
        this.illness = illness;
        this.patiendID = patientID;
    }

    public String getIllness() {
        return illness;
    }

    public int getPatientID() {
        return patiendID;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Patient ID: " + patiendID + ", Illness:" + illness;
    }
}

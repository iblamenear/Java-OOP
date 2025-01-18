package Praktikum.PraktikumPBO.Sesi14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nurse extends Person {
    private int nurseID;
    private String department;

    public Nurse(String name, int age, int nurseID, String department) {
        super(name, age);
        this.nurseID = nurseID;
        this.department = department;
    }

    public int getNurseID() {
        return nurseID;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Nurse ID: " + nurseID + ", Department: " + department;
    }
}

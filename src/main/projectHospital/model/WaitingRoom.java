package projet1.projectHospital.model;

import java.util.LinkedHashMap;

public class WaitingRoom {

    private LinkedHashMap<Integer, Patient> patient;

    public WaitingRoom(LinkedHashMap<Integer, Patient> patient) {
        this.patient = patient;
    }

    public Patient pullNext() {

        Patient p = new Patient(1, "lName", "fName", 13);
        return p;
    }

    public Patient getNext() {

        Patient p = new Patient(1, "lName", "fName", 13);
        return p;
    }

    public boolean add(Patient patient) {
        return true;

    }

    public boolean clear() {
        return true;

    }

    @Override
    public String toString() {
        return "WaitingRoom [patient=" + patient + "]";
    }

    public LinkedHashMap<Integer, Patient> getPatient() {
        return patient;
    }

    public void setPatient(LinkedHashMap<Integer, Patient> patient) {
        this.patient = patient;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((patient == null) ? 0 : patient.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WaitingRoom other = (WaitingRoom) obj;
        if (patient == null) {
            if (other.patient != null)
                return false;
        } else if (!patient.equals(other.patient))
            return false;
        return true;
    }
}

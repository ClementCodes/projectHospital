package projet1.projectHospital.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import javax.naming.PartialResultException;

public class Hospital {

    private LinkedHashMap<Integer, Employee> employee;
    private LinkedHashMap<Integer, Visit> visit;
    private ArrayList<MedicalRoom> medicalRoom;

    @Override
    public String toString() {
        return "Hospital [employee=" + employee + ", medicalRoom=" + medicalRoom + ", visit=" + visit + "]";
    }

    public Hospital(LinkedHashMap<Integer, Employee> employee, LinkedHashMap<Integer, Visit> visit,
            ArrayList<MedicalRoom> medicalRoom) {
        this.employee = employee;
        this.visit = visit;
        this.medicalRoom = medicalRoom;
    }

    public void remainingVisit() {

    }

    public MedicalRoom getRoom(int medic) {
        Patient p = new Patient(12, "lName", "fName", 12);
        MedicalRoom l = new MedicalRoom(12, true, p);
        return l;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((employee == null) ? 0 : employee.hashCode());
        result = prime * result + ((medicalRoom == null) ? 0 : medicalRoom.hashCode());
        result = prime * result + ((visit == null) ? 0 : visit.hashCode());
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
        Hospital other = (Hospital) obj;
        if (employee == null) {
            if (other.employee != null)
                return false;
        } else if (!employee.equals(other.employee))
            return false;
        if (medicalRoom == null) {
            if (other.medicalRoom != null)
                return false;
        } else if (!medicalRoom.equals(other.medicalRoom))
            return false;
        if (visit == null) {
            if (other.visit != null)
                return false;
        } else if (!visit.equals(other.visit))
            return false;
        return true;
    }

}

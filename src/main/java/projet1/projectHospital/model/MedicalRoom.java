package projet1.projectHospital.model;

public class MedicalRoom {

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public MedicalRoom(int idRoom, boolean busy, Patient patient) {
        this.idRoom = idRoom;
        this.busy = busy;
        this.patient = patient;
    }

    public int idRoom;
    public boolean busy;
    public Patient patient;

    public boolean pullPatient() {
        return true;
    }

    public boolean putPatient() {
        return true;
    }

    public void emptyRoom() {

    }

    @Override
    public String toString() {
        return "MedicalRoom [busy=" + busy + ", idRoom=" + idRoom + ", patient=" + patient + "]";
    }

}

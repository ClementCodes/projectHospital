package projet1.projectHospital.model;

public class Secretary extends Employee {

    private Patient patient;

    public Secretary(String login, String nom, Patient patient) {
        super(login, nom);
        this.patient = patient;
    }

    public boolean addPatientToDb() {

        return true;

    }

    public Patient getPatientFromDb(int id) {

        return patient;
    }

    public Patient getNextPatient() {

        return patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Secretary [patient=" + patient + "]";
    }

}

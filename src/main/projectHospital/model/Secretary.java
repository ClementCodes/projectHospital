package projet1.projectHospital.model;

public class Secretary extends Employee {
    // Les opérations de la secrétaire :
    // 1. Rajouter a la file d’attente un patient :-------addPatientToDb()
    // a. si existant, dans ce cas il faut le récupérer de la base
    // b. s’il est nouveau il faudra l’inscrire en base (nom, prenom , age et en
    // option adresse/telephone) 2. Afficher la file d’attente
    // 3. Afficher le prochain patient de la file (sans le retirer): getPatient
    // 4. Sortir de ce menu et revenir au menu principal

    private Patient patient;

    public Secretary(String login, String nom, Patient patient) {
        super(login, nom);
        this.patient = patient;
    }

    public boolean addPatientToDb(Patient patient) {
        if (patient != null) {
            // DaoPatients.create();
            System.out.println("DaoPatients.create()");
            return true;
        }
        return false;

    }

    public Patient getPatientFromDb(int id) {
        DaoPatient.selectAll();
        return patient;
    }

    public Patient getNextPatient() {

        return patient;
    }

    public Patient getPatient() {
        DaoPatient.selectById();
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Secretary [patient=" + addPatientToDb(patient) + "]";
    }

}

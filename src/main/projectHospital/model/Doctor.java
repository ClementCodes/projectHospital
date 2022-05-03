package projet1.projectHospital.model;

public class Doctor extends Employee {

    public Doctor(String login, String nom, int job, MedicalRoom medicalRoom) {
        super(login, nom);
        this.job = job;
        this.medicalRoom = medicalRoom;
    }

    private int job;
    private MedicalRoom medicalRoom;

    public void nextPatient() {
        // (il fait quitter le patient actuel et le prochain patient arrive
        // automatiquement) On affichera alors les infos du nouveau patient arrivé
    }

    public void clearRoom() {
        // IL METTRE La mediacRoom en non busy
        // sortir le patient de la salle et donc mettr la propriete e Patient a null
        MedicalRoom.setBusy(false);

    }

    public void freeTheRoom() {

    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public MedicalRoom getMedicalRoom() {
        return medicalRoom;
    }

    public void setMedicalRoom(MedicalRoom medicalRoom) {
        this.medicalRoom = medicalRoom;
    }

    @Override
    public String toString() {
        return "Doctor [job=" + job + ", medicalRoom=" + medicalRoom + "]";
    }

}

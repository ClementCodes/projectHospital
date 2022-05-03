package projet1.projectHospital.model;

public class Doctor extends Employee {

    private int job;
    private Salle salle;

    public Doctor(String login, String nom, int job, Salle salle) {
        super(login, nom);
        this.job = job;
        this.salle = salle;
    }

    public void nextPatient() {

    }

    public void clearRoom() {

    }

    public void freeTheRoom() {

    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Doctor [job=" + job + ", salle=" + salle + "]";
    }

}

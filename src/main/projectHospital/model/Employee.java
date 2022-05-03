package projet1.projectHospital.model;

public class Employee {

    private String login;
    private String nom;

    public Employee(String login, String nom) {
        this.login = login;
        this.nom = nom;
    }

    public String printWaitingRoom() {
        String st = " ";
        return st;
    }

    public boolean endWork() {
        return true;
    }

    @Override
    public String toString() {
        return "Employee [login=" + login + ", nom=" + nom + "]";
    }

}

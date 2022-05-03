package projet1.projectHospital.model;

public class Patient {

    public Patient(int idPatient, String lName, String fName, int age, Adress adress) {
        this.idPatient = idPatient;
        this.lName = lName;
        this.fName = fName;
        this.age = age;
        this.adress = adress;
    }

    public Patient(int idPatient, String lName, String fName, int age, Adress adress, Phone phone) {
        this.idPatient = idPatient;
        this.lName = lName;
        this.fName = fName;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
    }

    public int idPatient;
    public String lName;
    public String fName;
    public int age;
    public Adress adress;
    public Phone phone;

    public Patient(int idPatient, String lName, String fName, int age) {
        this.idPatient = idPatient;
        this.lName = lName;
        this.fName = fName;
        this.age = age;
    }

}

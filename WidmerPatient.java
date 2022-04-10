public class WidmerPatient {
    int idNumber;
    int age;
    String bloodType;
    char rh;

    public WidmerPatient(int idNumber, int age, String bloodType, char rh) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodType = bloodType;
        this.rh = rh;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public char getRh() {
        return rh;
    }
}

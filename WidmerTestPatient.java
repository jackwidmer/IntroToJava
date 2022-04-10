public class WidmerTestPatient {
    public static void main(String[] args) {
        WidmerPatient patient = new WidmerPatient(0,0,"O",'+');
        System.out.println("ID number: " + patient.idNumber);
        System.out.println("Age: " + patient.age);
        System.out.println("BloodType: " + patient.bloodType);
        System.out.println("RH: " + patient.rh);
    }
}

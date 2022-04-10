public class WidmerStudent {
    int idNumber;
    int creditHours;
    float nbrPoints;
    float gpa;

    public WidmerStudent() {
        this.idNumber = 9999;
        this.creditHours = 3;
        this.nbrPoints = 12;
        this.computeGPA();
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setNbrPoints(float nbrPoints) {
        this.nbrPoints = nbrPoints;
    }
    public void computeGPA(){
        gpa = nbrPoints / creditHours;
    }
    public void displayIdNumber(){
        System.out.println("The student id: " + idNumber);
    }
    public void displayCreditHours(){
        System.out.println("Number of credit hours: " + creditHours);
    }
    public void displayNbrPoints(){
        System.out.println("Number of points: " + nbrPoints);
    }
    public void displayGpa(){
        System.out.println("GPA: " + gpa);
    }
}


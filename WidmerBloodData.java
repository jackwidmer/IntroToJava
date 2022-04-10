public class WidmerBloodData {
    String bloodType;
    char rh;

    WidmerBloodData(String bloodType,char rh){
        this.bloodType = bloodType;
        this.rh = rh;
    }
    WidmerBloodData() {
        this.bloodType = "O";
        this.rh = '+';
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRh(char rh) {
        this.rh = rh;
    }

    public char getRh() {
        return rh;
    }

    public String getBloodType() {
        return bloodType;
    }
}

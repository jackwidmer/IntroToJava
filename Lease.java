public class Lease {
    private String tenantName;
    private int apartNum;
    private float monthlyRent;
    private int termLengthMonths;

    public Lease() {
        this.tenantName = "XXX";
        this.apartNum = 0;
        this.monthlyRent = 1000;
        this.termLengthMonths = 12;
    }

    //Sets
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
    public void setApartNum(int apartNum) {

        this.apartNum = apartNum;
    }
    public void setMonthlyRent(float monthlyRent) {

        this.monthlyRent = monthlyRent;
    }
    public  void setTermLengthMonths(int termLengthMonths){
        this.termLengthMonths = termLengthMonths;
    }

    //Gets
    public int getApartNum(){
        return this.apartNum;
    }
    public String getTenantName(){
        return this.tenantName;
    }
    public float getMonthlyRent(){
        return this.monthlyRent;
    }
    public int getTermLengthMonths(){
        return this.termLengthMonths;
    }

    //Displays
    public void displayTenantName(){
        System.out.println("Tenant Name: " + tenantName);
    }
    public void displayCreditHours(){
        System.out.println("Apartment Number: " + apartNum);
    }
    public void displayNbrPoints(){
        System.out.println("Rent per Month: " + monthlyRent);
    }
}

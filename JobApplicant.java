public class JobApplicant {
    private String name;
    private long phone;
    private boolean word;
    private boolean excel;
    private boolean db;
    private boolean graphics;
    JobApplicant(String name, long phone, boolean word, boolean excel, boolean db, boolean graphics){
        this.name = name;
        this.phone = phone;
        this.word = word;
        this.excel = excel;
        this.db = db;
        this.graphics = graphics;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public boolean isWord() {
        return word;
    }

    public boolean isExcel() {
        return excel;
    }

    public boolean isDb() {
        return db;
    }

    public boolean isGraphics() {
        return graphics;
    }
}

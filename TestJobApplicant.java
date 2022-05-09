public class TestJobApplicant {
    public static void main(String[] args) {
        var applicant1 = new JobApplicant("Joe", 3204446666L,true,false,false,false);
        var applicant2 = new JobApplicant("Sue", 3205685294L,true,true,true,false);
        if (checkApplicant1(applicant1)){
            System.out.println(applicant1.getName() + " is qualified!");
        }
        else {
            System.out.println(applicant1.getName() + " is NOT qualified!");
        }

        if (checkApplicant2(applicant2)){
        System.out.println(applicant2.getName() + " is qualified!");
    }
        else {
        System.out.println(applicant2.getName() + " is NOT qualified!");
    }
}

    private static boolean checkApplicant1(JobApplicant applicant1) {
        int skillCount = 0;
        if (applicant1.isDb()){
            skillCount = skillCount + 1;
        }
        if (applicant1.isExcel()){
            skillCount = skillCount + 1;
        }
        if (applicant1.isWord()){
            skillCount = skillCount + 1;
        }
        if (applicant1.isGraphics()){
            skillCount = skillCount + 1;
        }
        return (skillCount > 2);
    }
    private static boolean checkApplicant2(JobApplicant applicant2){
        int skillCount = 0;
        if (applicant2.isDb()){
            skillCount = skillCount + 1;
        }
        if (applicant2.isExcel()){
            skillCount = skillCount + 1;
        }
        if (applicant2.isWord()){
            skillCount = skillCount + 1;
        }
        if (applicant2.isGraphics()){
            skillCount = skillCount + 1;
        }
        return (skillCount > 2);
    }
}

package preparation.revise_1.capsule;

public class FlexibilityDemo {

    public static void main(String[] args) {
        School school = new School(8);
        System.out.println(school.getStudentFee());
    }

    static class School {

        private final int studentClass ;

        public School(int studentClass){
            this.studentClass = studentClass;
        }

        public double getStudentFee(){
            int baseFee;
            if(studentClass <= 6){
                baseFee = studentClass * 1000;
            }else {
                baseFee = studentClass * 2000;
            }
            return baseFee;
        }

    }
}

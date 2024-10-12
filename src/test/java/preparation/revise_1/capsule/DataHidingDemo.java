package preparation.revise_1.capsule;

public class DataHidingDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(29);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }

    static class Student {

        private String name;
        private int age;

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}



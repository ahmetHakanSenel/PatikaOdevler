public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int task;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int task = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacherInfo();
            System.out.println("Eklendi!");
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }


    }

    void printTeacherInfo(){
        this.teacher.print();
    }


}

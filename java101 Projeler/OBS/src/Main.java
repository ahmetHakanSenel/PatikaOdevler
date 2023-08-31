public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Harun", "555", "TRH");
        Teacher t2 = new Teacher("Adil", "500", "FZK");
        Teacher t3 = new Teacher("Tarık", "570", "BIO");
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Hakan", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,80,50);
        s1.addTaskNote(60,40,80);
        s1.printNote();
        s1.isPass();
    }
}
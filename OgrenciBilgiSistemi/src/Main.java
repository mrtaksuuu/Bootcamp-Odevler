public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher( "Mert Aksu", "TRH", "555");
        Teacher t2 = new Teacher( "Can Hoca", "FZK", "0000");
        Teacher t3 = new Teacher( "Ahmet Hoca", "BIO", "1111");

        Course tarih = new Course("Tarih" , "101" , "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Fatih Ataseven","11112222","4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,40,60);
        s1.isPass();

        Student s2 = new Student("Burak Elmas","11113333","3", tarih, fizik, biyo);
        s1.addBulkExamNote(80,40,70);
        s1.isPass();

        Student s3 = new Student("Ceren Gider","11114444","4", tarih, fizik, biyo);
        s1.addBulkExamNote(40,20,80);
        s1.isPass();

    }
}

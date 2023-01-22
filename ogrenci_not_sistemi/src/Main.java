public class Main {
    public static void main(String[] args) {
        Teacher tch1 = new Teacher("Azra Kahya","507-795-95-78","FZK");
        Teacher tch2 = new Teacher("Berkay","752-65-65","MAT");
        Teacher tch3 = new Teacher("Selman","533-45-23","TRH");

        Course fizik = new Course("Fizik",1202,"FZK");
        fizik.addTeacher(tch1);

        Course mat = new Course("Matematik",1202,"MAT");
        mat.addTeacher(tch2);

        Course tarih = new Course("Tarih",1202,"TRH");
        tarih.addTeacher(tch3);


        Student fatih = new Student("Fatih","801",fizik,mat,tarih);
        Student ali = new Student("Ali","212",fizik,mat,tarih);

        fatih.addBulkExamNote(70,50,20);
        ali.addBulkExamNote(90,25,65);
        fatih.printNote();
        //  ali.printNote();
        fatih.calcAverage();
        fatih.İsPass();


    }
}
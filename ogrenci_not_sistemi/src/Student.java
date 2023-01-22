public class Student {
    String name;
    String stuNo;
    Course c1;
    Course c2;
    Course c3;
    int note1;
    int note2;
    int note3;
    int avarage;
    boolean isPass;

    Student(String name, String stuNo, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
    }

    void addBulkExamNote(int notec1, int notec2, int notec3){
        this.note1 = notec1;
        this.note2= notec2;
        this.note3 = notec3;

    }

    void İsPass() {
        if(avarage>= 50){
            this.isPass = true;
            System.out.println("Sınıfı Geçti!");
        }
        else {
            this.isPass = false;
            System.out.println("Sınıfı Geçemedi!");
        }

    }

    void calcAverage(){
        this.avarage = (this.note1 + this.note3 + this.note2)/3;
        System.out.println("Ortalamanız :" + avarage);

    }

    void printNote(){
        System.out.println(c1.name + " Notu:" + this.note1);
        System.out.println(c2.name + " Notu:" + this.note2);
        System.out.println(c3.name + " Notu:" + this.note3);

    }
}

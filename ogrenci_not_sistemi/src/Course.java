public class Course {
    Teacher teacher;
    String name;
    int code;
    String prefix;
    int note;

    Course(String name, int code, String prefix){

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else System.out.println("Öğretmenin alanı ile ders alanı uyuşmuyor!");

    }

    void printTeacher(){
        teacher.print();

    }
}

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print (){
        System.out.println("Adı:" + name);
        System.out.println("Telefon Numarası:" + mpno);
        System.out.println("Dal:" + branch);
    }
}

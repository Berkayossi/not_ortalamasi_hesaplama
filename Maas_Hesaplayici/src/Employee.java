public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary > 1000){
            double taxAmount = this.salary * 3/100;
            return taxAmount;
        }
        return 0;
    }

    int bonus() {
        if (this.workHours > 30) {
            int bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    double raiseSalary(){
        double raiseAmount;
        int workYears = 2021 - hireYear;
        if(workYears<10){
            raiseAmount = this.salary * 5/100;
            return raiseAmount;
        }
        else if(20>workYears && workYears >9 ){
            raiseAmount = this.salary * 10/100;
            return raiseAmount;
        }
        else if (workYears>19) {
            raiseAmount = this.salary * 15/100;
            return raiseAmount;
        }
        return 0;
    }

     void print(){
         System.out.println("Adı : \t" + this.name);
         System.out.println("Çalışma saati : \t" + this.workHours);
         System.out.println("Başlangıç Yılı : \t" + hireYear);
         System.out.println("Vergi Miktarı : \t" + tax());
         System.out.println("Mesai Bonusu : \t" + bonus());
         System.out.println("Zam Miktarı : \t" + raiseSalary());
         System.out.println("Net Maaş : \t" + (salary - tax() + bonus()));

    }

}

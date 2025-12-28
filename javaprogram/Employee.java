import java.util.Scanner;

class Constructor {
    float salary, result;

    Constructor(float salary) {
        this.salary = salary;
    }

    float getsalary() {
        return result;
    }

    void setsalary() {
        result = salary + (salary * (float)0.01);
    }
}

class Employee {
    public static void main(String[] args) {
        float sal;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE SALARY OF THE EMPLOYEE");
        sal = s.nextFloat();
        Constructor c = new Constructor(sal);
        c.setsalary();
       
        System.out.println(c.getsalary());

    }
}
public class Employee {
    private String Name;
    private int Salary;
    public Employee(String name,int salary){
        this.Name=name;
        this.Salary=salary;
    }
    public String getName(){
        return Name;
    }
    public int getSalary(){
        return Salary;
    }
    public int setSalary(){
        return Salary=Salary+10000;
    }
}
class empoye {
    public static void main(String[] args) {
        Employee obj=new Employee("Ajay",20000);
        System.out.println(obj.getName());
        System.out.println(obj.setSalary());
    }
}
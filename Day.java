import java.util.Scanner;

    class Employee {
    private int id;
    private String name;
    private int salary;
    public Employee(){

    }
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
    public class Day{
        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER OF EMPLOYS");

            int n=scan.nextInt();
            scan.nextLine();
            Employee []store=new Employee[n];
            for(int i=0;i<n;i++){

            Employee e=new Employee();
            System.out.println("enter the details");
            String details=scan.nextLine();
            String []arr=details.split(",");

           e.setId(Integer.parseInt(arr[0]));
            e.setName(arr[1]);
            e.setSalary(Integer.parseInt(arr[2]));
            store[i]=e;


        }
        for(int i=0;i<store.length;i++){
            System.out.println(store[i].getId()+" "+store[i].getName()+" "+store[i].getSalary());
        }
    }
}
    

    
 
    


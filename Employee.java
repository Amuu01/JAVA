
import java.util.*;

interface interface1{
    void setData();
    void updateDetails();
}
interface interface2{
    void getDetails();
}
class Emp implements interface1, interface2{
    private  int id;
    private long mob;
    private float salary;
    private String name,email,city,deparment,gen;

    Scanner sc = new Scanner(System.in);



        Emp() {
        /*id=0;
        salary=0.0f;
        mob=0;
        name="NULL";
        email="NULL";
        city="NULL";
        deparment="NULL";
        gen='M';*/

        System.out.println("----Enter The Details Of Employee----");
        System.out.println("Initiate Employee ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Employee Name: ");
        name = sc.nextLine();
        System.out.println("Gender(M/F) : ");
        gen = sc.nextLine();
        System.out.println("City: ");
        city = sc.nextLine();
        System.out.println("Department: ");
        deparment = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Mobile Number: ");
        mob = Long.parseLong(sc.nextLine());
        System.out.println("Salary: ");
        salary = Float.parseFloat(sc.nextLine());
    }

        @Override
        public void setData () {

       /* try (Scanner sc = new Scanner(System.in)) {
            System.out.println("----Enter The Details Of Employee----");
            System.out.println("Initiate Employee ID: ");
            id=sc.nextInt();
            System.out.println("Employee Name: ");
            name=sc.nextLine();
            System.out.println("Gender(M/F) : ");
            gen=sc.next().charAt(0);
            System.out.println("City: ");
            city=sc.nextLine();
            System.out.println("Department: ");
            deparment=sc.nextLine();
            System.out.println("Email: ");
            email=sc.nextLine();
            System.out.println("Mobile Number: ");
            mob=sc.nextLong();
            System.out.println("Salary: ");
            salary=sc.nextFloat();
        }*/

    }

        @Override
        public void updateDetails ()
        {

            System.out.println("*******UPDATE THE RECORD********");
            System.out.println("Employee Name: ");
            name = sc.nextLine();
            System.out.println("Gender(M/F) : ");
            gen = sc.nextLine();
            System.out.println("City: ");
            city = sc.nextLine();
            System.out.println("Department: ");
            deparment = sc.nextLine();
            System.out.println("Email: ");
            email = sc.nextLine();
            System.out.println("Mobile Number: ");
            mob = Long.parseLong(sc.nextLine());
            System.out.println("Salary: ");
            salary = Float.parseFloat(sc.nextLine());

       }

        @Override
        public void getDetails () {
        System.out.println("----The Details Of The Employee----");
        System.out.println("Initiate Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Gender(M/F) : " + gen);
        System.out.println("City: " + city);
        System.out.println("Department: " + deparment);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + mob);
        System.out.println("Salary: " + salary);

    }

        int getId () {
        return id;
    }
        String getName () {
        return name;
    }
        String getGen () {
        return gen;
    }
        String getDeparment () {
        return deparment;
    }
        float getSalary () {
        return salary;
    }


}
public class Employee {
    public static void main(String[] args) {
        int n = 0, ch,id,size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Records You Want to Store: ");
        size=sc.nextInt();
        Emp[] obj = new Emp[size];
        do {
            System.out.print("===========MENU==========\n");
            System.out.print("1.ADD RECORD\n2.DISPLAY ALL RECORD\n3.DETAILS OF AN EMPLOYEE\n");
            System.out.print("4.UPDATE DETAILS\n5.DELETE DETAILS\n6.E X I T\n");
            System.out.print("Choose any of the above: ");
            int flag=0;

                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        obj[n]=new Emp();
                        n++;
                        break;
                    case 2:
                        if (n > 0) {
                            Formatter fmt=new Formatter();
                            try (Formatter formatter = fmt.format("%15s %15s %15s %15s %15s\n", "Emp_Id", "Name", "Gen", "Department", "Salary")) {
                                for (int i = 0; i <n ; i++) {
                                    fmt.format("%14s %14s %17s %14s %14s\n",obj[i].getId(),obj[i].getName(),obj[i].getGen(),obj[i].getDeparment(),obj[i].getSalary());
                                }
                                System.out.println(fmt);
                            }
                        }
                        else {
                            System.out.println("Nothing To Display!!!!!");
                        }
                        break;
                    case 3:
                        if (n > 0) {
                            System.out.println("Enter The Employee ID: ");
                            id= sc.nextInt();
                            for (int i = 0; i <n; i++) {
                                if (id == obj[i].getId()) {
                                    obj[i].getDetails();
                                    flag++;
                                }
                            }
                            if (flag==0){
                                System.out.println("No Such ID Found!!!!");
                            }
                        }
                        else {
                            System.out.println("Nothing To Display!!!!!");
                        }
                        break;
                    case 4:
                        if (n > 0) {
                            System.out.println("Enter The Employee ID: ");
                            id= sc.nextInt();
                            for (int i = 0; i <n; i++) {
                                if (id == obj[i].getId()) {
                                    System.out.println("====Following Details Will Be Updated====");
                                    obj[i].getDetails();
                                    obj[i].updateDetails();
                                    flag++;
                                }
                            }
                            if (flag==0){
                                System.out.println("No Such ID Found!!!!");
                            }
                        }
                        else {
                            System.out.println("Nothing To Display!!!!!");
                        }
                        break;
                    case 5:
                        if (n > 0) {
                            int i,pos=1;
                            System.out.println("Enter The Employee ID: ");
                            id=sc.nextInt();
                            for ( i = 0; i <n; i++) {
                                if (id == obj[i].getId()) {
                                    System.out.println("++++The Following Details is Deleted++++");
                                    obj[i].getDetails();
                                    pos=i;
                                    flag++;
                                    break;
                                }
                            }
                            for (i = pos; i < n-1 ; i++) {
                                obj[i]=obj[i+1];
                            }
                            if(flag>0){
                                n--;
                            }
                            if (flag==0){
                                System.out.println("No Such ID Found!!!!");
                            }
                        }
                        else {
                            System.out.println("Nothing To Display!!!!!");
                        }
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("You Choose Wrong Number!!!!");
                        break;
                }


        }while (ch != 6) ;
        sc.close();
    }
}
import java.util.*;
interface modify {
    void updateDetails();
}
interface show {
    void getDetails();
}

class Emp1 implements modify, show
{
    private int eid;
    private long phone;
    private float salary;
    private String fname,lname, email, city, deparment, gender;

    Scanner sc = new Scanner(System.in);

    Emp1()
    {
        System.out.println("Enter Basic Details Of Employee");
        System.out.println("-------------------------------");
        System.out.print("Employee ID: ");
        eid = Integer.parseInt(sc.nextLine());
        System.out.print("Employee First Name: ");
        fname = sc.nextLine();
        System.out.print("Employee Last Name: ");
        lname = sc.nextLine();
        System.out.print("Gender(M/F/O) : ");
        gender = sc.nextLine();
        System.out.print("City: ");
        city = sc.nextLine();
        System.out.print("Department: ");
        deparment = sc.nextLine();
        System.out.print("Email Id: ");
        email = sc.nextLine();
        System.out.print("Mobile Number: ");
        phone = Long.parseLong(sc.nextLine());
        System.out.print("Salary: ");
        salary = Float.parseFloat(sc.nextLine());
    }

       @Override
       public void updateDetails()
       {
            Scanner sc1 = new Scanner(System.in);
            int ch1;
            do
            {
                System.out.println("\n***UPDATE THE RECORD***");
                System.out.println("--------------------------\n");
                System.out.println("1. Update First Name");
                System.out.println("2. Update Last Name");
                System.out.println("3. Update Gender[M/F/O]");
                System.out.println("4. Update City");
                System.out.println("5. Update Department");
                System.out.println("6. Update Email");
                System.out.println("7. Update Phone");
                System.out.println("8. Update Salary");
                System.out.println("9. Go Back to Menu");
                System.out.println("--------------------------\n");  
                System.out.print("Enter Choice:");

                ch1 = sc1.nextInt();
                switch(ch1)
                {
                    case 1:
                        System.out.print("New First Name: ");
                        fname = sc1.next();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 2:
                        System.out.print("New Last Name: ");
                        lname = sc1.next();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 3:
                        System.out.print("New Gender: ");
                        gender = sc1.next();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 4:
                        System.out.print("New City: ");
                        city = sc1.next();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 5:
                        System.out.print("New Department: ");
                        deparment = sc1.next();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 6:
                        System.out.print("New Email: ");
                        email = sc1.next();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 7:
                        System.out.print("New Mobile Number: ");
                        phone = sc1.nextLong();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 8:
                        System.out.print("New Salary: ");
                        salary = sc1.nextFloat();
                        System.out.println("Record Updated successfully\n");
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Wrong Choice");
                }
            }while(ch1!=9);
            sc1.close();
        }

    @Override
    public void getDetails() 
    {
        //Scanner sc = new Scanner(System.in);
        System.out.println("----Employee Details----");
        System.out.println("-----------------------------------");
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + fname + " " + lname );
        System.out.println("Gender(M/F/O) : " + gender);
        System.out.println("City: " + city);
        System.out.println("Department: " + deparment);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + phone);
        System.out.println("Salary: " + salary + " ");
    }

    int get_Id() {
        return eid;
    }

    String get_fName() {
        return fname;
    }
    String get_lName() {
        return lname;
    }
    String get_Gen() {
        return gender;
    }

    String get_Deparment() {
        return deparment;
    }

    float get_Salary() {
        return salary;
    }

}

public class Employeee {
    public static void main(String[] args) {
        int n = 0, ch, id, size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Records You Want to Store: ");
        size = sc.nextInt();
        Emp1[] obj = new Emp1[size];
        do {
            System.out.print("Employee Management System\n");
            System.out.println("--------------------------");
            System.out.print("1. ADD NEW RECORD\n2. DISPLAY ALL RECORD\n3. DETAILS OF AN EMPLOYEE\n");
            System.out.print("4. UPDATE DETAILS\n5. DELETE DETAILS\n6. EXIT\n");
            System.out.println("--------------------------");
            System.out.print("Choose from(1-6): ");
            int flag = 0;

            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj[n] = new Emp1();
                    n++;
                    break;
                case 2:
                    if (n > 0) {
                        Formatter fmt = new Formatter();
                        try (Formatter formatter = fmt.format("%15s %15s %15s %15s %15s %15s\n", "Emp Id", "First Name","Last Name" ,"Gender",
                                "Department", "Salary")) {
                            for (int i = 0; i < n; i++) {
                                fmt.format("%14s %16s %16s %14s %14s %14s\n", obj[i].get_Id(), obj[i].get_fName(),
                                    obj[i].get_lName(),obj[i].get_Gen(), obj[i].get_Deparment(), obj[i].get_Salary());
                            }
                            System.out.println(fmt);
                        }
                    } else {
                        System.out.println("No Record Found");
                    }
                    break;
                case 3:
                    if (n > 0) {
                        System.out.println("Enter The Employee ID: ");
                        id = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            if (id == obj[i].get_Id()) {
                                obj[i].getDetails();
                                flag++;
                            }
                        }
                        if (flag == 0) {
                            System.out.println("Id Doesn't Exist");
                        }
                    } else {
                        System.out.println("No Record Found");
                    }
                    break;
                case 4:
                    if (n > 0) {
                        System.out.println("Enter The Employee ID: ");
                        id = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            if (id == obj[i].get_Id()) {
                                //System.out.println("====Following Details Will Be Updated====");
                                //obj[i].getDetails();
                                obj[i].updateDetails();
                                flag++;
                            }
                        }
                        if (flag == 0) {
                            System.out.println("Id Doesn't Exist");
                        }
                    } else {
                        System.out.println("No Record Found");
                    }
                    break;
                case 5:
                    if (n > 0) {
                        int i, pos = 1;
                        System.out.println("Enter The Employee ID: ");
                        id = sc.nextInt();
                        for (i = 0; i < n; i++) {
                            if (id == obj[i].get_Id()) {
                                System.out.println("++++The Following Details is Deleted++++");
                                obj[i].getDetails();
                                System.out.println("Record Deleted Successfully");
                                pos = i;
                                flag++;
                                break;
                            }
                        }
                        for (i = pos; i < n - 1; i++) {
                            obj[i] = obj[i + 1];
                        }
                        if (flag > 0) {
                            n--;
                        }
                        if (flag == 0) {
                            System.out.println("Id Doesn't Exist");
                        }
                    } else {
                        System.out.println("No Record Found.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong Choice, Try again");
            }

        }while (ch != 6);
        sc.close();
    }
}
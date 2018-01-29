package universitymanagementsystem;

import java.util.Scanner;

class Student {

    int IndexNo;
    String Name;
    int Age;
    String Address;
    double ZScore;
    String FacultyName;

    public int getIndexNo() {
        return IndexNo;
    }

    public void setIndexNo(int IndexNO) {
        this.IndexNo = IndexNO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getZScore() {
        return ZScore;
    }

    public void setZScore(double ZScore) {
        this.ZScore = ZScore;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String FacultyName) {
        this.FacultyName = FacultyName;
    }
}

class Lecturer {

    String Name;
    String Faculty;
    double MonthlySalary;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double MonthlySalary) {
        this.MonthlySalary = MonthlySalary;
    }
}

class DegreeProgrammes {

    public String DegreeName;
    public String Department;
    public String Faculty;

    public String getDegreeName() {
        return DegreeName;
    }

    public void setDegreeName(String DegreeName) {
        this.DegreeName = DegreeName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }
}

public class UniversityManagementSystem {

    Student[] getStudentDetails() {
        Scanner s = new Scanner(System.in);
        Student[] array = new Student[1];
        for (int i = 0; i < array.length; i++) {
            Student a = new Student();

            System.out.println("");
            System.out.println("Enter Student Information!");
            System.out.println("");

            System.out.print("Index No:");
            a.setIndexNo(s.nextInt());

            System.out.print("Name:");
            a.setName(s.next());

            System.out.print("Age:");
            a.setAge(s.nextInt());

            System.out.print("Address:");
            a.setAddress(s.next());

            System.out.print("Z-Score:");
            a.setZScore(s.nextDouble());

            System.out.print("Faculty Name:");
            a.setFacultyName(s.next());

            array[i] = a;
        }
        return array;
    }

    Lecturer[] getLecturerDetails() {
        Scanner s = new Scanner(System.in);
        Lecturer[] lec = new Lecturer[1];

        for (int i = 0; i < lec.length; i++) {
            Lecturer b = new Lecturer();

            System.out.println("");
            System.out.println("Enter Lecturer Information!");
            System.out.println("");
            System.out.print("Name:");
            b.setName(s.next());

            System.out.print("Faculty:");
            b.setFaculty(s.next());

            System.out.print("Monthly Salary:");
            b.setMonthlySalary(s.nextDouble());
            lec[i] = b;
        }
        return lec;
    }

    DegreeProgrammes[] getDegreeProgrammesDetails() {
        Scanner s = new Scanner(System.in);
        DegreeProgrammes[] deg = new DegreeProgrammes[1];

        for (int i = 0; i < deg.length; i++) {
            DegreeProgrammes c = new DegreeProgrammes();

            System.out.println("");
            System.out.println("Enter DegreeProgramme Information!");
            System.out.println("");
            System.out.print("Degree Name:");
            c.setDegreeName(s.next());

            System.out.print("Department:");
            c.setDepartment(s.next());

            System.out.print("Faculty:");
            c.setFaculty(s.next());


            deg[i] = c;
        }
        return deg;
    }

    void StudentReport(Student[] arr) {

        System.out.println("");
        System.out.println("==============================================================================");
        System.out.println("Student Name    Index NO    Age     Address     Z-Score     Faculty Name  ");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("  " + "" + arr[i].getName() + "             " + arr[i].getIndexNo() + "       " + arr[i].getAge() + "      " + arr[i].getAddress() + "        " + arr[i].getZScore() + "     " + arr[i].getFacultyName());

        }
        System.out.println("==============================================================================");
        System.out.println("");
        System.out.println("");
    }

    void LecturerReport(Lecturer[] le) {

        System.out.println("");
        System.out.println("==============================================================================");
        System.out.println("Lecturer Name    Faculty        Monthly Salary  ");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < le.length; i++) {
            System.out.println("    " + le[i].getName() + "         " + le[i].getFaculty() + "      " + le[i].getMonthlySalary());

        }
        System.out.println("==============================================================================");
        System.out.println("");
        System.out.println("");
    }

    void DegreeProgrammesReport(DegreeProgrammes[] de) {

        System.out.println("");
        System.out.println("==============================================================================");
        System.out.println("Degree Name    Department        Faculty  ");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < de.length; i++) {
            System.out.println("    " + de[i].getDegreeName() + "         " + de[i].getDepartment() + "      " + de[i].getFaculty());

        }
        System.out.println("==============================================================================");
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (;;) {

            System.out.println("");
            System.out.println("...WelCome To University Management System...");
            System.out.println("");
            System.out.println("To Enter the Students informations-1");
            System.out.println("To Enter the Lecturer informations-2");
            System.out.println("To Enter the Degree Programme informations-3");
            System.out.println("");
            System.out.print("Enter the Number:");


            int input = s.nextInt();


            if (input == 1) {

                UniversityManagementSystem ums = new UniversityManagementSystem();
                Student[] x = ums.getStudentDetails();
                ums.StudentReport(x);



            } else if (input == 2) {

                UniversityManagementSystem ums = new UniversityManagementSystem();
                Lecturer[] y = ums.getLecturerDetails();
                ums.LecturerReport(y);

            } else if (input == 3) {

                UniversityManagementSystem ums = new UniversityManagementSystem();
                DegreeProgrammes[] z = ums.getDegreeProgrammesDetails();
                ums.DegreeProgrammesReport(z);

            }
            System.out.println("");
            System.out.print("Exit(Y/N):");
            String Exit = s.next();
            if (Exit.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Thank You for using Programme.....");
                break;
            } else if (Exit.equalsIgnoreCase("N")) {
                continue;
            }
        }
    }
}

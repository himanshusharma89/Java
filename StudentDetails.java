import java.util.Scanner;

class Details
{
    public static void main(String[] args) {
        String name;char gender;
        int rollNo;long phoneNo;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Name");
        name=scan.nextLine();
        System.out.println("Enter Gender");
        gender=scan.next().charAt(0);
        System.out.println("Enter Roll Number");
        rollNo=scan.nextInt();
        System.out.println("Enter Phone Number");
        phoneNo=scan.nextLong();
        System.out.println("Student Details");
        System.out.println(name);
        System.out.println(gender);
        System.out.println(rollNo);
        System.out.println(phoneNo);
        scan.close();
    }
}
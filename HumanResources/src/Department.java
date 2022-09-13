public class Department {
    String departmentID;
    String departmentName;
    int memberNumber;

    public Department(String departmentID, String departmentName, int memberNumber){
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.memberNumber = memberNumber;
    }

    public void displayInfo(){
        System.out.println("Department ID       : " + departmentID);
        System.out.println("Department's name   : " + departmentName);
        System.out.println("Number of member    : " + memberNumber);
    }
}

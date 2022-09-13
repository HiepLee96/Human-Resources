import java.util.ArrayList;
import java.util.Scanner;

public class HumanResoucres {
    static ArrayList<Staff> allEmployee = new ArrayList<>();
    static ArrayList<Staff> allManager = new ArrayList<>();
    static ArrayList<Double> allPayroll = new ArrayList<>();
    static ArrayList<Department> allDepartment = new ArrayList<>();
    static ArrayList<Staff> all = new ArrayList<>();

    public static void main(String[] args) {
        Department inputDe1 = new Department("OPE", "Operation Staff    ", 0);
        Department inputDe2 = new Department("FIN", "Financial Team     ", 0);
        Department inputDe3 = new Department("SAL", "Sales Team         ", 0);
        Department inputDe4 = new Department("ACC", "Accounting Team    ", 0);
        Department inputDe5 = new Department("ITE", "IT Engineers       ", 0);
        allDepartment.add(inputDe1);
        allDepartment.add(inputDe2);
        allDepartment.add(inputDe3);
        allDepartment.add(inputDe4);
        allDepartment.add(inputDe5);

        Staff num1 = new Manager("CEO001    ", "Iron Man        ", 45, 5.3,
                "11/12/1999", allDepartment.get(0).departmentName, 21, "Business Leader     ");
        Staff num2 = new Manager("GER002    ", "Hulk            ", 46, 4.3,
                "17/12/2000", allDepartment.get(1).departmentName, 19, "Project  Leader     ");
        Staff num3 = new Manager("GER003    ", "Dr.Strange      ", 56, 4.3,
                "17/12/2000", allDepartment.get(4).departmentName, 20, "Technical Leader    ");
        allManager.add(num1);
        allManager.add(num2);
        allManager.add(num3);
        //Operation Staff
        Staff no1 = new Employee("OPE0001   ", "Bruce Lee      ", 25, 2.8,
                "11/10/1996", allDepartment.get(0).departmentName, 11, 15);
        Staff no2 = new Employee("OPE0002   ", "Ant Man        ", 35, 2.4,
                "11/01/2010", allDepartment.get(0).departmentName, 10, 5);
        Staff no3 = new Employee("OPE0003   ", "Beckham Bernie ", 32, 2.3,
                "01/02/2021", allDepartment.get(0).departmentName, 7, 0);
        //Financial Team
        Staff no4 = new Employee("FIN0001   ", "Clinton Cobin  ", 28, 2.4,
                "01/12/2018", allDepartment.get(1).departmentName, 4, 0);
        Staff no5 = new Employee("FIN0002   ", "Elian Finn     ", 29, 2.4,
                "09/11/2020", allDepartment.get(1).departmentName, 7, 20);
        //Sales Team
        Staff no6 = new Employee("SAL0001   ", "Otis Rory      ", 23, 2.0,
                "09/05/2017", allDepartment.get(2).departmentName, 0, 10);
        Staff no7 = new Employee("SAL0002   ", "Saint Silas    ", 24, 2.0,
                "09/05/2017", allDepartment.get(2).departmentName, 0, 11);
        Staff no8 = new Employee("SAL0003   ", "Zane Anselm    ", 22, 2.0,
                "09/05/2017", allDepartment.get(2).departmentName, 0, 12);
        Staff no9 = new Employee("SAL0004   ", "Basil Benedict ", 21, 2.0,
                "09/05/2017", allDepartment.get(2).departmentName, 0, 13);
        Staff no10 = new Employee("SAL0005   ", "Carwyn Dai     ", 20, 2.0,
                "09/05/2017", allDepartment.get(2).departmentName, 0, 14);
        //Accounting Team
        Staff no11 = new Employee("ACC0001   ", "Darius Dominic ", 30, 4.0,
                "09/05/2017", allDepartment.get(3).departmentName, 10, 12);
        Staff no12 = new Employee("ACC0002   ", "Galvin Gwyn    ", 40, 4.5,
                "09/05/2017", allDepartment.get(3).departmentName, 10, 20);
        //IT Engineers
        Staff no13 = new Employee("ITE0001   ", "Otis Patrick   ", 25, 3.2,
                "09/05/2017", allDepartment.get(4).departmentName, 10, 25);
        Staff no14 = new Employee("ITE0002   ", "Aidan Egan     ", 23, 3.0,
                "09/05/2017", allDepartment.get(4).departmentName, 11, 35);
        allEmployee.add(no1);
        allEmployee.add(no2);
        allEmployee.add(no3);
        allEmployee.add(no4);
        allEmployee.add(no5);
        allEmployee.add(no6);
        allEmployee.add(no7);
        allEmployee.add(no8);
        allEmployee.add(no9);
        allEmployee.add(no10);
        allEmployee.add(no11);
        allEmployee.add(no12);
        allEmployee.add(no13);
        allEmployee.add(no14);

        Scanner input = new Scanner(System.in);
        int pickNumber;
        String continueOrNot = "Yes";
        do {
            System.out.println("1. Display the list of employees in the company");
            System.out.println("2. Show departments in the company");
            System.out.println("3. Show employees by department");
            System.out.println("4. Add new employees to the company");
            System.out.println("5. Search for employee's information by name or employee's ID");
            System.out.println("6. Display payroll of employees throughout the company");
            System.out.println("7. Display employee payroll in ascending order");
            System.out.println("8. Display employee payroll in descending order");
            System.out.println("0. Exit");
            System.out.print("What function do you want to use: ");
            pickNumber = input.nextInt();

            if (pickNumber == 0) break;
            else if (pickNumber < 1 || pickNumber > 8) System.out.println("Invalid Option!!!");
            else {
                switch (pickNumber) {
                    case 1 -> displayInfoOfTheWholeCompany();
                    case 2 -> showDepartments();
                    case 3 -> showEmployeeByDepartment();
                    case 4 -> addNewEmployee();
                    case 5 -> searchEmployee();
                    case 6 -> displayPayrollOfWholeCompany();
                    case 7 -> displayPayrollInAscendingOrder();
                    case 8 -> displayPayrollInDescendingOrder();
                }
            }
            System.out.print("Do you want to continue use this program (Yes/No)? ");
            continueOrNot = input.next();

        } while (continueOrNot.startsWith("y")  ||
                continueOrNot.startsWith("Y")  ||
                continueOrNot.compareToIgnoreCase("yes") == 0);
    }

    //1. Hiển thị danh sách nhân viên hiện có trong công ty
    public static void displayInfoOfTheWholeCompany(){
        System.out.println("ID        Staff's name       title             Department           Age     Coefficients salary     First day of work    Leave day number");
        System.out.println("________________________________________________________________________________________________________________________________________");
        for (int i=0; i<allManager.size(); i++){
            allManager.get(i).displayInformation();
        }
        for (int i=0; i<allEmployee.size(); i++){
            allEmployee.get(i).displayInformation();
        }
    }
    //2. Hiển thị các bộ phận trong công ty
    public static void showDepartments(){
        for (int i=0; i<allDepartment.size(); i++){
            allDepartment.get(i).memberNumber = 0;
        }
        for (int i=0; i<allEmployee.size(); i++){
            for (int j=0; j<allDepartment.size(); j++){
                if (allEmployee.get(i).department.compareTo(allDepartment.get(j).departmentName) == 0){
                    allDepartment.get(j).memberNumber++;
                }
            }
        }
        for (int i=0; i<allManager.size(); i++){
            for (int j=0; j<allDepartment.size(); j++){
                if (allManager.get(i).department.compareTo(allDepartment.get(j).departmentName) == 0){
                    allDepartment.get(j).memberNumber++;
                }
            }
        }
        for (int i=0; i<allDepartment.size(); i++){
            allDepartment.get(i).displayInfo();
            System.out.println();
        }
    }
    //3. Hiển thị các nhân viên theo từng bộ phận
    public static void showEmployeeByDepartment(){
        for (int i=0; i<allDepartment.size(); i++){
            System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println(allDepartment.get(i).departmentName);
            System.out.println("ID        Staff's name       title             Department           Age     Coefficients salary     First day of work    Leave day number");
            System.out.println("________________________________________________________________________________________________________________________________________");
            for (int j=0; j<allEmployee.size(); j++){
                if (allDepartment.get(i).departmentName.compareTo(allEmployee.get(j).department) == 0 ){
                    allEmployee.get(j).displayInformation();
                }
            }
            System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        }
    }
    //4. Thêm nhân viên mới vào công ty
    public static void addNewEmployee(){
        Scanner input = new Scanner(System.in);
        int userAnswer = 0;
        String continueAddOrNot = "YES";
        int managerOrEmployee = 99;
        do {
            while(managerOrEmployee != 1 && managerOrEmployee != 2){
                System.out.println("Do you want to add new Manager or Employee?");
                System.out.println("1. Manager");
                System.out.println("2. Employee");
                managerOrEmployee = input.nextInt();
            }

            if (managerOrEmployee == 1){
                System.out.println("Which department do you want to add new manager to?");
                for (int i = 0; i < allDepartment.size(); i++) {
                    System.out.printf("%d. %s\n", i + 1, allDepartment.get(i).departmentName);
                }
                System.out.print("Your answer is: ");
                userAnswer = input.nextInt();
                if (userAnswer < 1 || userAnswer > 5) {
                    System.out.println("Invalid option!!!\n");
                } else {
                    System.out.print("Manager's ID? ");
                    String inputStaffID = input.next();
                    System.out.print("Manager's name? ");
                    String inputStaffName = input.next();
                    System.out.print("Manager's old? ");
                    int inputStaffAge = input.nextInt();
                    System.out.print("Manager's coefficients salary? ");
                    double inputCoe = input.nextDouble();
                    System.out.print("Manager's first day of work? ");
                    String inputDate = input.next();
                    System.out.print("Leave day? ");
                    int inputLeaveDay = input.nextInt();
                    System.out.print("Manager's title? ");
                    String inputTitle = input.next();
                    Staff inputNewStaff = new Manager(inputStaffID + "      ", inputStaffName + "   ", inputStaffAge, inputCoe,
                            inputDate, allDepartment.get(userAnswer - 1).departmentName, inputLeaveDay, inputTitle+"    ");
                    allManager.add(inputNewStaff);
                    System.out.print("Do you want to continue add new manager (Yes/No)? ");
                    continueAddOrNot = input.next();
                }
            } else {
                System.out.println("Which department do you want to add new employee to?");
                for (int i = 0; i < allDepartment.size(); i++) {
                    System.out.printf("%d. %s\n", i + 1, allDepartment.get(i).departmentName);
                }
                System.out.print("Your answer is: ");
                userAnswer = input.nextInt();
                if (userAnswer < 1 || userAnswer > 5) {
                    System.out.println("Invalid option!!!\n");
                } else {
                    System.out.print("Employee's ID? ");
                    String inputStaffID = input.next();
                    System.out.print("Employee's name? ");
                    String inputStaffName = input.next();
                    System.out.print("Employee's old? ");
                    int inputStaffAge = input.nextInt();
                    System.out.print("Employee's coefficients salary? ");
                    double inputCoe = input.nextDouble();
                    System.out.print("Employee's first day of work? ");
                    String inputDate = input.next();
                    System.out.print("Leave day? ");
                    int inputLeaveDay = input.nextInt();
                    System.out.print("Employee's overtime hours? ");
                    int inputOverTimeHours = input.nextInt();
                    Staff inputNewStaff = new Employee(inputStaffID + "   ", inputStaffName + "   ", inputStaffAge, inputCoe, inputDate,
                            allDepartment.get(userAnswer - 1).departmentName, inputLeaveDay, inputOverTimeHours);
                    allEmployee.add(inputNewStaff);
                    System.out.print("Do you want to continue add new employee (Yes/No)? ");
                    continueAddOrNot = input.next();
                }
            }
        }while(userAnswer<1 || userAnswer>5 || continueAddOrNot.startsWith("y") ||
                continueAddOrNot.startsWith("Y") ||
                continueAddOrNot.compareToIgnoreCase("yes") == 0);
    }
    //5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
    public static void searchEmployee(){
        Scanner input = new Scanner(System.in);
        String search;
        System.out.print("Enter Employee's name or Employee's ID: ");
        search = input.next();

        ArrayList<Integer> mark = new ArrayList<>();
        /*
        for (int i=0; i<allEmployee.size(); i++){
            if (allEmployee.get(i).staffName.startsWith(search) ||
                    allEmployee.get(i).staffName.compareToIgnoreCase(search) == 0 ||
                    allEmployee.get(i).staffID.startsWith(search) ||
                    allEmployee.get(i).staffID.compareToIgnoreCase(search) == 0 ||){
                mark.add(i);
            }
        }
         */
        all.clear();
        for (int i=0; i<allEmployee.size(); i++){
            allEmployee.get(i).setTotalSalary();        //Goi gam setTotalSalary de luu luong vao bien totalSalary
            all.add(allEmployee.get(i));
        }
        for (int j=0; j<allManager.size(); j++){
            allManager.get(j).setTotalSalary();
            all.add(allManager.get(j));
        }
        for (int i=0; i<all.size(); i++){
            if (all.get(i).staffName.startsWith(search) ||
                all.get(i).staffName.compareToIgnoreCase(search) == 0 ||
                all.get(i).staffID.startsWith(search) ||
                all.get(i).staffID.compareToIgnoreCase(search) == 0){
                mark.add(i);
            }
        }
        if (!mark.isEmpty()){
            for (int j=0; j<mark.size(); j++){
                allEmployee.get(mark.get(j)).displayInformation();
            }
        }else{
            System.out.printf("There are no %s in this company\n", search);
        }
    }
    //6. Hiển thị bảng lương của nhân viên toàn công ty
    public static void displayPayrollOfWholeCompany(){
        System.out.printf("The payroll of the whole company is: \n\n");
        System.out.println("ID         Staff's name       title             Department           Age     Coefficients salary     First day of work    Leave day number  Salary");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________");
        for (int j=0; j<allManager.size(); j++){
            allManager.get(j).setTotalSalary();
            allManager.get(j).displaySalary();
        }
        for (int i=0; i<allEmployee.size(); i++){
            allEmployee.get(i).setTotalSalary();
            allEmployee.get(i).displaySalary();

        }

    }
    //7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
    public static void displayPayrollInAscendingOrder(){
        System.out.println("Employee payroll in ascending order is:\n");
        System.out.println("ID         Staff's name       title             Department           Age     Coefficients salary     First day of work    Leave day number  Salary");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________");
        //Luu tat ca nhan vien vao 1 mang duy nhat de tien dung thuat toan sap xep
        all.clear();
        for (int i=0; i<allEmployee.size(); i++){
            allEmployee.get(i).setTotalSalary();        //Goi gam setTotalSalary de luu luong vao bien totalSalary
            all.add(allEmployee.get(i));
        }
        for (int j=0; j<allManager.size(); j++){
            allManager.get(j).setTotalSalary();
            all.add(allManager.get(j));
        }

        for (int i=0; i<all.size()-1; i++){
            for (int j=i+1; j<all.size(); j++){
                if (all.get(i).totalSalary > all.get(j).totalSalary){
                    Staff temp = all.get(i);
                    all.set(i, all.get(j));
                    all.set(j, temp);
                }
            }
        }
        for (int k=0; k<all.size(); k++){
            all.get(k).displaySalary();
        }

        for (int i=0; i<all.size(); i++){

            ((ICalculator)(all.get(i))).calculateSalary();
        }

    }
    //8. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần
    public static void displayPayrollInDescendingOrder(){
        System.out.println("Employee payroll in ascending order is:\n");
        System.out.println("ID         Staff's name       title             Department           Age     Coefficients salary     First day of work    Leave day number  Salary");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________");
        //Luu tat ca nhan vien vao 1 mang duy nhat de tien dung thuat toan sap xep
        all.clear();
        for (int i=0; i<allEmployee.size(); i++){
            allEmployee.get(i).setTotalSalary();        //Goi gam setTotalSalary de luu luong vao bien totalSalary
            all.add(allEmployee.get(i));
        }
        for (int j=0; j<allManager.size(); j++){
            allManager.get(j).setTotalSalary();
            all.add(allManager.get(j));
        }

        for (int i=0; i<all.size()-1; i++){
            for (int j=i+1; j<all.size(); j++){
                if (all.get(i).totalSalary < all.get(j).totalSalary){
                    Staff temp = all.get(i);
                    all.set(i, all.get(j));
                    all.set(j, temp);
                }
            }
        }
        for (int k=0; k<all.size(); k++){
            all.get(k).displaySalary();
        }
    }



}


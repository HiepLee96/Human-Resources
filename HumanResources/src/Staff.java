public abstract class Staff {
    public String  staffID;
    public String  staffName;
    public int     staffAge;
    public double  coefficientsSalary;
    public String  firstDayOfWork;
    public String  department;
    public int     leaveDay;
    public double totalSalary;


    public Staff(String staffID, String staffName, int staffAge, double coefficientsSalary, String firstDayOfWork, String department, int leaveDay){
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffAge = staffAge;
        this.coefficientsSalary = coefficientsSalary;
        this.firstDayOfWork = firstDayOfWork;
        this.department = department;
        this.leaveDay = leaveDay;
    }
    public abstract void displayInformation();
    public abstract void setTotalSalary();
    public abstract void displaySalary();

}


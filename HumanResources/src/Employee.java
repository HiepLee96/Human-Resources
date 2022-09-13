public class Employee extends Staff implements ICalculator{
    int overtimeHour;

    public Employee(String staffID, String staffName, int staffAge, double coefficientsSalary, String firstDayOfWork, String department, int leaveDay, int overtimeHour){
        super(staffID, staffName, staffAge, coefficientsSalary, firstDayOfWork, department, leaveDay);
        this.overtimeHour = overtimeHour;
    }

    @Override
    public double calculateSalary(){
        return coefficientsSalary*3000000 + overtimeHour*200000;
    }
    @Override
    public void setTotalSalary(){
        totalSalary = calculateSalary();
    }
    @Override
    public void displayInformation(){
        System.out.printf ("%s%s   Employee            %s  %d           %.1f                    %s         %d\n", staffID, staffName, department, staffAge, coefficientsSalary, firstDayOfWork, leaveDay);
        System.out.println("________________________________________________________________________________________________________________________________________");
    }
    @Override
    public void displaySalary(){
       System.out.printf ("%s%s   Employee            %s  %d           %.1f                    %s         %d              %.0f VND\n", staffID, staffName, department, staffAge, coefficientsSalary, firstDayOfWork, leaveDay, calculateSalary());
       System.out.println("_______________________________________________________________________________________________________________________________________________________________");
   }


}

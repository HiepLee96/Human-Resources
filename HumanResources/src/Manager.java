public class Manager extends Staff implements ICalculator{
    String title;

    public Manager(String staffID, String staffName, int staffAge, double coefficientsSalary, String firstDayOfWork, String department, int leaveDay, String title) {
        super(staffID, staffName, staffAge, coefficientsSalary, firstDayOfWork, department, leaveDay);
        this.title = title;
    }

    @Override
    public double calculateSalary(){
        double x = coefficientsSalary*5000000;
        if (title.startsWith("Business Leader")){
            x += 8000000;
        }else if (title.startsWith("Project Leader")){
            x += 5000000;
        }else if (title.startsWith("Technical Leader")){
            x += 6000000;
        }
        return x;
    }
    @Override
    public void setTotalSalary(){
        totalSalary = calculateSalary();
    }

    @Override
    public void displayInformation(){
        System.out.printf ("%s%s  %s%s  %d           %.1f                    %s         %d\n", staffID, staffName, title, department, staffAge, coefficientsSalary, firstDayOfWork, leaveDay);
        System.out.println("________________________________________________________________________________________________________________________________________");
    }
    @Override
    public void displaySalary(){
        System.out.printf ("%s%s  %s%s  %d           %.1f                    %s         %d              %.0f VND\n", staffID, staffName, title, department, staffAge, coefficientsSalary, firstDayOfWork, leaveDay,calculateSalary());
        System.out.println("_______________________________________________________________________________________________________________________________________________________________");
    }


}

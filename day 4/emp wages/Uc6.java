package EmployeeWage;

public class Uc6 {
    public static final int IS_PART_TIME =1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;
    public static void main(String[] args) {
        int empHrs = 0;
        int totalEmpWage = 0;
        int eWage = 0;
        int totalWorkingDays=0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++ ;
            double empcheck= Math.floor(Math.random() *10) % 3;
            switch ((int)empcheck){
                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                case IS_PART_TIME:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;

            }
            totalEmpHrs = totalEmpHrs +  empHrs;
            eWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += eWage;
            System.out.println("Emp WAge: " + eWage);
        }
        System.out.println("Total Emp WAge: " + totalEmpWage);
    }

}

public class EmployeeWage {
    int Wage_per_Hour=20;
    int Full_Day_Hour=8;
    int Part_Time=4;
    public void employee_wage_calculation(){
        double num=Math.random();
        int randomCheck=((int) (num *10))%3;
        System.out.println("Random check value:"+randomCheck);
        if(randomCheck==2)
        {
            System.out.println("employee is present");
            int employee_Daily_wage=Wage_per_Hour*Full_Day_Hour;

            System.out.println("employee wage is:" +employee_Daily_wage);
        }else if(randomCheck==1)
        {
            System.out.println("employee is present halfday");
            int employee_Daily_wage=Wage_per_Hour*Part_Time;
            System.out.println("employee wage is:" +employee_Daily_wage);
        }else {
            System.out.println("employee is absent");
        }
    }
    public  static void main(String args[]){
        EmployeeWage obj1=new EmployeeWage();
        obj1.employee_wage_calculation();
    }
}

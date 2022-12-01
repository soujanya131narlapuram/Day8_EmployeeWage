public class EmployeeWage {
    int Wage_per_Hour=20;
    int Full_Day_Hour=8;
    public void employee_wage_calculation(){
        double num=Math.random();
        int randomCheck=((int) (num *10))%2;
        System.out.println("Random check value:"+randomCheck);
        if(randomCheck==1) {
            System.out.println("employee is present");
            int employee_wage=Wage_per_Hour*Full_Day_Hour;
            System.out.println("employee wage is:" +employee_wage);
        }else if(randomCheck==0) {
            System.out.println("employee is absent");
        }
    }
    public  static void main(String args[]){
        EmployeeWage obj1=new EmployeeWage();
        obj1.employee_wage_calculation();
    }
}

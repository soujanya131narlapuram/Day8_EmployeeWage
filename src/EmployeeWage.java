public class EmployeeWage {
    public void employee_absent_or_present(){
        double num=Math.random();
        int randomCheck=((int) (num *10))%2;
        System.out.println("Random check value:"+randomCheck);
        if(randomCheck==1) {
            System.out.println("employee is present");
        }else if(randomCheck==0) {
            System.out.println("employee is absent");
        }
    }
    public  static void main(String args[]){
        EmployeeWage obj1=new EmployeeWage();
        obj1.employee_absent_or_present();
    }
}

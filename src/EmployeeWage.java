public class EmployeeWage {

    int Full_Time = 8;
    int Part_Time = 4;
    int employee_wage_per_month;
    int a_count = 0;//absent days count
    int ft_count = 0;//fulltime days count
    int pt_count = 0;//part time days count
     int Wage_per_Hour = 20;
     int Working_Days_per_month = 20;
     int randomCheck;

    public EmployeeWage() {
    }

    public void calculation_of_wage()
    {

        for (int i = 0; i < 30; i++) {
            double  randomCheck = Math.floor(Math.random() * 10) % 3;
            System.out.print("Random check value:" + randomCheck);
            switch ((int) randomCheck) {
                case 0:
                    System.out.print("A-");
                    a_count++;
                    break;
                case 1:
                    System.out.print("FT-");
                    ft_count++;
                    break;
                case 2:
                    System.out.print("PT-");
                    pt_count++;
                    break;
                default:
                    System.out.println("not  usable");
            }
            if (((ft_count + pt_count) >= Working_Days_per_month) || ((pt_count * 4 + ft_count * 8) >= 100)) {
                break;
            }
            System.out.println();
        }
    }

    public void DisplayResult() {
        employee_wage_per_month = (pt_count * Part_Time * Wage_per_Hour) + (ft_count * Full_Time * Wage_per_Hour);
        System.out.println("total absent days =" + a_count);
        System.out.println("total full time days =" + ft_count);
        System.out.println("total part time days =" + pt_count);
        System.out.println("total wage per month =" + employee_wage_per_month);
        //* Working_Days_per_month;
    }

    public static void main(String[] args)
    {
        EmployeeWage ob1=new EmployeeWage();
        ob1.calculation_of_wage();
        ob1.DisplayResult();
    }
}

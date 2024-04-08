import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Employee employee = new Employee(020304, "Oratiwe", "Mokoena", 5222);
        System.out.println(employee.empNo + "  " + employee.name + "  " + employee.surname + "  " + employee.salary);



        employee.setEmpNo(1);

        ArrayList<Integer>myList =new ArrayList<>();
        myList.add(12);
        myList.add(18);
        myList.add(24);
        myList.remove(0);
        System.out.println(myList);





    }
}
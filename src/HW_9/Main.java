package HW_9;

import HW_9.License.LicensePlateMaker;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee();
        tim.setName("Tim");
        tim.setAge(30);
        tim.setSex('m');
        tim.setDaySalary(100.0);

        System.out.println(tim.getSalary(MonthUtils.ALL_MONTH));

        Manager tom = new Manager();
        tom.setName("Tom");
        tom.setAge(35);
        tom.setSex('m');
        tom.setDaySalary(150.0);
        tom.setAmountSub(3);

        System.out.println(tom.getSalary(MonthUtils.SUMMER));

//        LicensePlateMaker caMaker = new LicensePlateMaker("CA", 0);
//        System.out.println(caMaker.makeNextPlate().getPlate());
//        System.out.println(caMaker.makeNextPlate().getPlate());
//        System.out.println(caMaker.makeNextPlate().getPlate());

    }
}

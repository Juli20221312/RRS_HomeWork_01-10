package HW_9;



public class MonthUtils {
//     я сделала массив вручную, чтобы работало - нужны public переменные в классе Month
//        public static void main(String[] args) {
//
//
//        Month JANUARY = new Month();
//        JANUARY.monthName = "January";
//        JANUARY.amountDays = 31;
//        JANUARY.amountWorkDays = 17;
//
//        Month FEBRUARY = new Month();
//        FEBRUARY.monthName = "February";
//        FEBRUARY.amountDays = 29;
//        FEBRUARY.amountWorkDays = 20;
//
//        Month MARCH = new Month();
//        MARCH.monthName = "March";
//        MARCH.amountDays = 31;
//        MARCH.amountWorkDays = 20;
//
//        Month APRIL = new Month();
//        APRIL.monthName = "April";
//        APRIL.amountDays = 30;
//        APRIL.amountWorkDays = 21;
//
//        Month MAY = new Month();
//        MAY.monthName = "May";
//        MAY.amountDays = 31;
//        MAY.amountWorkDays = 20;
//
//        Month JUNE = new Month();
//        JUNE.monthName = "June";
//        JUNE.amountDays = 30;
//        JUNE.amountWorkDays = 19;
//
//        Month JULY = new Month();
//        JULY.monthName = "July";
//        JULY.amountDays = 31;
//        JULY.amountWorkDays = 23;
//
//        Month AUGUST = new Month();
//        AUGUST.monthName = "August";
//        AUGUST.amountDays = 31;
//        AUGUST.amountWorkDays = 22;
//
//        Month SEPTEMBER = new Month();
//        SEPTEMBER.monthName = "September";
//        SEPTEMBER.amountDays = 30;
//        SEPTEMBER.amountWorkDays = 21;
//
//        Month OCTOBER = new Month();
//        OCTOBER.monthName = "October";
//        OCTOBER.amountDays = 31;
//        OCTOBER.amountWorkDays = 23;
//
//        Month NOVEMBER = new Month();
//        NOVEMBER.monthName = "November";
//        NOVEMBER.amountDays = 30;
//        NOVEMBER.amountWorkDays = 21;
//
//        Month DECEMBER = new Month();
//        DECEMBER.monthName = "December";
//        DECEMBER.amountDays = 31;
//        DECEMBER.amountWorkDays = 21;
//
//
//        Month[] ALL_MONTH = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
//    }

    public static Month JANUARY = new Month("January", 31, 17);
    public static Month FEBRUARY = new Month("February", 29, 20);
    public static Month MARCH = new Month("March", 31, 20);
    public static Month APRIL = new Month("April", 30, 21);
    public static Month MAY = new Month("May", 31, 20);
    public static Month JUNE = new Month("June", 30, 19);
    public static Month JULY = new Month("July", 31, 23);
    public static Month AUGUST = new Month("August", 31, 22);
    public static Month SEPTEMBER = new Month("September", 30, 21);
    public static Month OCTOBER = new Month("October", 31, 23);
    public static Month NOVEMBER = new Month("November", 30, 21);
    public static Month DECEMBER = new Month("December", 31, 21);

    public static Month[] ALL_MONTH = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    public static Month[] SUMMER = {JUNE, JULY, AUGUST};

}

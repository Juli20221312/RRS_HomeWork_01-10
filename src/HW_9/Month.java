package HW_9;
//Задача №1.
// Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней. Создать класс MonthUtils
// который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
public class Month {
   private String monthName;
   private int amountDays;
   private int amountWorkDays;

   public Month(String monthName, int amountDays, int amountWorkDays) {
      this.monthName = monthName;
      this.amountDays = amountDays;
      this.amountWorkDays = amountWorkDays;
   }

   public String getMonthName() {
      return monthName;
   }

   public int getAmountDays() {
      return amountDays;
   }

   public int getAmountWorkDays() {
      return amountWorkDays;
   }
}

package enums;

import java.util.Arrays;

public class EnumEx {
    public static void main(String[] args) {
        System.out.println(EnumDays.MONDAY); // MONDAY
        System.out.println(EnumDays.SUNDAY); // SUNDAY

        System.out.println(EnumDays.MONDAY.getDescription()); // on work
        System.out.println(EnumDays.SUNDAY.getDescription()); // on holiday

        EnumDays.MONDAY.setDescription("editedMonday");
        EnumDays.SUNDAY.setDescription("editedSunday");
        System.out.println(EnumDays.MONDAY.getDescription()); // editedMonday
        System.out.println(EnumDays.SUNDAY.getDescription()); // editedSunday

        /* часто используемые методы: valueOf, values
        valueOf - позволяет получать элемент enum из какого-то String значения
        value - возвращает массив элементов-констант enum'а
         */
        EnumDays day1 = EnumDays.valueOf("MONDAY");
        System.out.println(day1); // MONDAY
        EnumDays[] days = EnumDays.values();
        System.out.println(Arrays.toString(days)); // [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
    }
}

enum EnumDays{
    /*
    * конструктор enum нельзя создать вручную с помощью new, конструктор срабатывает автоматически
    * в enum можно:
    * 1) создавать такие "константы"
    * 2) задавать конструктор (всегда private),
    * 3) создавать обычные поля/методы
    * 4) enum'ы не наследуются
    * 5) можно задавать несколько конструкторов
    * */

    SUNDAY("on holiday"),
    MONDAY("on work"),
    TUESDAY("on work"),
    WEDNESDAY("on work"),
    THURSDAY("on work"),
    FRIDAY("on work"),
    SATURDAY("on holiday");

    private String description;
    // конструктор всегда private, можно не писать, идет по-дефолту
    EnumDays(String description){
        this.description = description;
    }
    EnumDays(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

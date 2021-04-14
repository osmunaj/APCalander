public class APCalander {
    public static void main(String[] args){
        System.out.println(isLeapYear(2003));
        System.out.println(numberOfLeapYears(2000, 2020));

    }

    private static boolean isLeapYear(int year){
        return (year % 4 == 0);
    }

    public static int numberOfLeapYears(int year1, int year2){
        int total = 0;
        for(int i = year1; i <= year2; i++){
            if(isLeapYear(i)){
                total++;
            }
        }
        return total;
    }
    private static int firstDayOfYear(int year){

    }
    private static int dayOfYear(int month, int day, int year){

    }

    public static int dayOfWeek(int month, int day, int year){
        return (dayOfYear(month, day, year) + firstDayOfYear(year)) % 7;
    }
}

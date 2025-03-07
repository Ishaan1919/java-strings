import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        input.close();
        
        displayCalendar(month, year);

        // Enter month (1-12): 6
        // Enter year: 2003
        
        //  June 2003
        // Sun Mon Tue Wed Thu Fri Sat
        //   1   2   3   4   5   6   7 
        //   8   9  10  11  12  13  14
        //  15  16  17  18  19  20  21
        //  22  23  24  25  26  27  28
        //  29  30
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = daysInMonth[month - 1];
        
        System.out.println("\n " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }
}

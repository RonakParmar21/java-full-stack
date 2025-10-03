package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program7_CustomDateFormat {
    public static void main(String[] args) {
        LocalDate date	=	LocalDate.of(2023,	7,	24);
        DateTimeFormatter formatter	=	DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String	formattedDate	=	date.format(formatter);
        System.out.println("Formatted	Date:	"	+	formattedDate);
    }
}

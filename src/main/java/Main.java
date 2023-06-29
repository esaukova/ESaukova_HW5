import ru.netology.esaukova.hw5.services.VacationCalculatorService;

public class Main {
    public static void main(String[] args) {

        VacationCalculatorService service = new VacationCalculatorService();

        // income = 10_000 доход
        // expenses = 3_000 расход
        // threshold = 20_000 лимит на счету, чтобы взять отпуск

        int expected = 3;
        int actual = service.calculateVacation(10_000, 3_000, 20_000);

        System.out.println(expected + " == ? == " + actual);

        // income = 100_000 доход
        // expenses = 60_000 расход
        // threshold = 150_000 лимит на счету, чтобы взять отпуск

        expected = 2;
        actual = service.calculateVacation(100_000, 60_000, 150_000);

        System.out.println(expected + " == ? == " + actual);

    }
}

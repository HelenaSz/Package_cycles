import ru.netology.javaqa.javaqamvn.services.RestService;

public class Main {
    public static void main(String[] args) {
        int income = 100_000; // изначальная сумма
        int expenses = 60_000; // потраченная сумма
        int threshold = 150_000; // порог

        RestService service = new RestService();
        System.out.println(service.calcRestService(income, expenses, threshold));
    }
}
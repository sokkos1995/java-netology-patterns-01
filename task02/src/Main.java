import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        int maxValue = 100;

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        logger.log("Введите размер списка: ");
        int arrayLength = scanner.nextInt();
        logger.log("Введите верхнюю границу для значений: ");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);

        logger.log("Создаём и наполняем список");

        List<Integer> source = new ArrayList<>(arrayLength);
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            source.add(random.nextInt(maxValue));
        }

        logger.log("Вот случайный список: " + source);

        logger.log("Запускаем фильтрацию");
        List<Integer> result = filter.filterOut(source);
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Выводим результат на экран: " + result);
    }
}

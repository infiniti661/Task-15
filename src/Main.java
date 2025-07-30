import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> queue = new LinkedList<>(firstClients); // создаём очередь и заполняем

        while (!queue.isEmpty()) {
            String client = queue.poll(); // извлекаем из начала очереди
            System.out.println(client + " сделала новый маникюр.");

            // с вероятностью 50% добавляем друга
            if (Math.random() < 0.5) {
                String friendName = "a friend of " + client;
                queue.add(friendName);
            }
        }
    }
}
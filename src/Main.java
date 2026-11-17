import java.io.Console;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static class Player {
        private String nickName;
        private int score;
        private int level;

        public Player(String nickName, int score, int level) {
            this.nickName = nickName;
            this.score = score;
            this.level = level;
        }

        public String getNickName() {
            return nickName;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getInfo() {
            return "Нік: " + nickName + ", Рахунок: " + score + ", Рівень: " + level;
        }
    }

    public static class PlayerDatabase {
        private Map<String, Player> players = new HashMap<>();

        public void addPlayer(Player player) {
            if (!players.containsKey(player.getNickName())) {
                players.put(player.getNickName(), player);
            }
        }

        public Player findPlayer(String nickName) {
            return players.get(nickName); // Вернёт объект Player или null, если не найден
        }

        public boolean removePlayer(String nickName) {
            return players.remove(nickName) != null; // Вернёт true, если удалил, и false, если игрока не было
        }

        public void getAllPlayers() {
            if (players.isEmpty()) {
                System.out.println("Список гравців порожній.");
                return;
            }

            System.out.println("Список всіх гравців:");
            for (Player player : players.values()) {
                System.out.println(player.getInfo());
            }
        }
    }
    public static void main(String[] args){

            PlayerDatabase playerDB = new PlayerDatabase();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Для того щоб добавити гравця, натисніть 1, щоб знайти гравця, натисніть 2, щоб видалити гравця, натисніть 3, щоб показати всіх гравців, натисніть 4, щоб вийти, натисніть 0:");
                int input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1:
                        System.out.print("Введіть нік гравця: ");
                        String nickName = scanner.nextLine();

                        System.out.print("Введіть рахунок гравця: ");
                        int score = Integer.parseInt(scanner.nextLine());

                        System.out.print("Введіть рівень гравця: ");
                        int level = Integer.parseInt(scanner.nextLine());

                        Player newPlayer = new Player(nickName, score, level);
                        playerDB.addPlayer(newPlayer);
                        break;

                    case 2:
                        System.out.print("Введіть нік гравця для пошуку: ");
                        String name = scanner.nextLine();

                        Player found = playerDB.findPlayer(name);
                        if (found != null) {
                            System.out.println(found.getInfo());
                        } else {
                            System.out.println("Гравець не знайдений.");
                        }
                        break;

                    case 3:
                        System.out.print("Введіть нік гравця для видалення: ");
                        String nick = scanner.nextLine();

                        boolean removed = playerDB.removePlayer(nick);
                        if (removed) {
                            System.out.println("Гравець успішно видалений.");
                        } else {
                            System.out.println("Гравець не знайдений.");
                        }
                        break;

                    case 4:
                        playerDB.getAllPlayers();
                        break;

                    case 0:
                        exit = true;
                        break;

                    default:
                        System.out.println("Невірний вибір. Спробуйте ще раз.");
                        break;
                }
            }
        }}

package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());

        Treasure treasure  =  new Treasure(scanner.nextLine().split("\\s+"));

        Bag bag = new Bag(capacity);

        for (var entry : treasure) {

        }

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long count = Long.parseLong(safe[i + 1]);

            String kvoE = "";

            if (name.length() == 3) {
                kvoE = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                kvoE = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                kvoE = "Gold";
            }

            if (kvoE.equals("")) {
                continue;
            } else if (capacity < torba.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (kvoE) {
                case "Gem":
                    if (!torba.containsKey(kvoE)) {
                        if (torba.containsKey("Gold")) {
                            if (count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (torba.get(kvoE).values().stream().mapToLong(e -> e).sum() + count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!torba.containsKey(kvoE)) {
                        if (torba.containsKey("Gem")) {
                            if (count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (torba.get(kvoE).values().stream().mapToLong(e -> e).sum() + count > torba.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!torba.containsKey(kvoE)) {
                torba.put((kvoE), new LinkedHashMap<String, Long>());
            }

            if (!torba.get(kvoE).containsKey(name)) {
                torba.get(kvoE).put(name, 0L);
            }


            torba.get(kvoE).put(name, torba.get(kvoE).get(name) + count);

        }

        for (var x : torba.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}
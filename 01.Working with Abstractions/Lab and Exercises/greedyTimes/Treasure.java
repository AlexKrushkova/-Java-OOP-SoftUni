package greedyTimes;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Treasure implements Iterable<Map<String,Long>> {
    private String [] goods;

    public Treasure(String[] goods){
        this.goods = goods;
    }


    @Override
    public Iterator<Map<String,Long>> iterator() {
        return new Iterator<Map<String, Long>>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index<goods.length;
            }

            @Override
            public Map<String, Long> next() {
                String item = goods[index++];
                Long value = Long.parseLong(goods[index++]);
                return Map.of(item,value);
            }
        };

    }

    @Override
    public void forEach(Consumer<? super Map<String, Long>> action) {

    }

    @Override
    public Spliterator<Map<String, Long>> spliterator() {
        return null;
    }
}

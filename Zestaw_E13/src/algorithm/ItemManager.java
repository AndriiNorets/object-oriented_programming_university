package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ItemManager<T>{
    private List<T> items;

    public ItemManager(List<T> items) {
        this.items = items;
    }

    void addItem(T item){
        items.add(item);
    }
    T getItem(int index){
        return items.get(index);
    }
    int getItemCount(){
        return items.size();
    }


}
class main{
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        // Создаем экземпляр ItemManager с использованием списка integerList
        ItemManager<Integer> itemManager = new ItemManager<>(integerList);
        System.out.println(itemManager.getItem(3));
    }
}

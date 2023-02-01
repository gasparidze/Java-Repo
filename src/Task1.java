import java.util.*;

public class Task1 {
    private static final int LIST_SISE = 1000000;
    private List<Double> arrayList;
    private List<Double> linkedList;

    public Task1() {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.compare2Lists();
    }

    public void compare2Lists(){
        addElements();
        Map<Long, String> result = compare(retrieveArrayListElements(), retrieveLinkedListElements());
        System.out.println("result: " + result.entrySet());
    }

    private void addElements(){
        for(int i = 0; i < LIST_SISE; i++){
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
    }

    public long retrieveArrayListElements(){
        long start = System.currentTimeMillis();
        for(int i = 0; i < LIST_SISE; i++){
            arrayList.get((int)Math.random());
        }

        return System.currentTimeMillis() - start;
    }

    public long retrieveLinkedListElements(){
        long start = System.currentTimeMillis();
        for(int i = 0; i < LIST_SISE; i++){
            linkedList.get((int)Math.random());
        }

        return System.currentTimeMillis() - start;
    }

    public Map<Long, String> compare(Long arrayList, Long linkedList){
        Map<Long, String> result = new HashMap<>();
        Long time = Math.abs(arrayList - linkedList);
        String winner = arrayList > linkedList ? "LinkedListIsFaster" : "ArrayListIsFaster";
        result.put(time, winner);

        return result;
    }
}

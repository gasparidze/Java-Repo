package collections;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        String str = "madam";
        LinkedList<Character> stringList = new LinkedList<>();
        
        Iterator<Character> s = stringList.iterator();
        for(char ch : str.toCharArray()){
            stringList.add(ch);
        }
        System.out.println(stringList);

        //listIterator может использоваться также и с ArrayList
        //у listIterator есть hasPrevious, previous, set методы
        ListIterator<Character> listIterator = stringList.listIterator();
        ListIterator<Character> reverseIterator = stringList.listIterator(stringList.size());
        boolean isPalindrom = true;
        while (listIterator.hasNext() && reverseIterator.hasPrevious()){
            if(listIterator.next() != reverseIterator.previous()){
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom);
        System.out.println(listIterator.hasNext()); //false

        //SET
        //set просто заменит один символ на другой.
        //чтобы оно сработало надо поставить вместо madam что-н другое
        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.set('2');
        }
        System.out.println(stringList);

        //QUEUE//
        Queue<Integer> queueList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        queueList.add(4);
        queueList.add(6);
        queueList.add(1);
        queueList.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);
        //разницы в выводе нет
        System.out.println(queueList);
        System.out.println(list);

        //методы add и offer (Queue)
        //если наша очередь ограничена, например, 4мя людьми и мы добавляем эл-т с помощью метода add
        //то выбросится исключение, что очередь полная и мест нет. Но если добавлять с помощью offer exception
        //не вылетит, мы просто не сможем добавить элемент в очередь. Вот вся разница между add и offer.

        System.out.println("element= " + queueList.element()); // element= 4, если элемента нет, выбрасывает exception
        //если в очерели ничего не осталось, то выводит null, не выбрасывает exception
        System.out.println(queueList.peek()); // element= 4

        //remove//
        System.out.println(queueList.remove()); //будет удален элемент с начала очереди, выведится - 4
        queueList.remove();
        queueList.remove();
        queueList.remove();
        //при 5ом remove вылетит NoSuchElementException
        //queueList.remove();
        //но если удалять с помощью poll, то exception'а не будет, просто выведится null
        System.out.println(queueList.poll()); // null
    }
}

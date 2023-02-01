package sortingAlgorithms;

// На скорость алгоритма влияет не только количество проходов, но и количество перестановок, которые потребуется совершить.
// сложность алгоритма - N^2
public class Bubble {
    public static void main(String[] args) {
        int[] testArr = new int[]{6,3,8,2,6,9,4,11,1};
        bubbleSort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }

    public static void  bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
}

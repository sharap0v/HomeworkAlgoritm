package lesson2;

public class Homework2 {
    private static long timeStart;
    public static void main(String[] args) {
        //1. Создать массив большого размера (миллион элементов).
        MyArrayList<Double> arrayList = new MyArrayList<>(1000000);
        //2. Заполнить массив случайными числами.
        for(int i = 0; i<1000000; i++){
            arrayList.add(Math.random()*100);
        }
        timeStart = System.currentTimeMillis();
        System.out.println("selectionSort ");
        arrayList.selectionSort();
        System.out.println("selectionSort "+(System.currentTimeMillis()-timeStart));
        System.out.println("bubbleSort ");
        timeStart = System.currentTimeMillis();
        arrayList.bubbleSort();
        System.out.println("bubbleSort "+(System.currentTimeMillis()-timeStart));
        System.out.println("insertionSort ");
        timeStart = System.currentTimeMillis();
        arrayList.insertionSort();
        System.out.println("insertionSort "+(System.currentTimeMillis()-timeStart));
    }
}

import java.util.*;

class Transaction {
    String id;
    double fee;
    String timestamp;

    Transaction(String id, double fee, String timestamp) {
        this.id = id;
        this.fee = fee;
        this.timestamp = timestamp;
    }

    public String toString() {
        return id + ":" + fee + "@" + timestamp;
    }
}

public class Question1 {
    public static void bubbleSort(Transaction arr[]) {
        int n = arr.length;
        boolean swapped;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].fee > arr[j + 1].fee) {
                    Transaction temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Bubble Sorted:");
        for (Transaction t : arr) System.out.println(t);
        System.out.println("Swaps = " + swaps);
    }

    public static void insertionSort(Transaction arr[]) {
        for (int i = 1; i < arr.length; i++) {
            Transaction key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].fee > key.fee) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("Insertion Sorted:");
        for (Transaction t : arr) System.out.println(t);
    }

    public static void highFee(Transaction arr[]) {
        System.out.println("High Fee Outliers:");
        for (Transaction t : arr) {
            if (t.fee > 50)
                System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Transaction arr[] = {
                new Transaction("id1", 10.5, "10:00"),
                new Transaction("id2", 25.0, "09:30"),
                new Transaction("id3", 5.0, "10:15")
        };

        bubbleSort(arr);
        insertionSort(arr);
        highFee(arr);
    }
}
package com.github.vedeshkin.tasks;

public class Main {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(100000);
        Action bubbleSort = (data) -> {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (data[j] > data[j + 1]) {
                        int tmp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = tmp;
                    }
                }
            }


        };
        Action selectSort = (data) -> {
            int pos;
            for (int i = 0; i < data.length; i++) {
                pos = i;
                for (int j = i; j < data.length; j++) {
                    if (data[j] < data[pos]) {
                        pos = j;
                    }
                }
                int tmp = data[i];
                data[i] = data[pos];
                data[pos] = tmp;

            }

        };
        Action insertSort = (data)->{
            int j;
            for(int i = 1;i< data.length;i++){
                int temp = data[i];
                j = i;
                while(j > 0 && data [j-1] >=temp){
                    data[j] = data[j-1];
                    --j;
                }
                data[j] = temp;
            }

        };






        System.out.println("Bubble sort");
        myArray.sort(bubbleSort);
        System.out.println("Select sort");
        myArray.sort(selectSort);
        System.out.println("Insert sort");
        myArray.sort(insertSort);
    }
}

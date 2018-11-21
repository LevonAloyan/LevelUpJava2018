package armen.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class MergSort  {

    public static ArrayList<Integer> merg(ArrayList<Integer> list1, ArrayList<Integer> list2){

        ArrayList<Integer> newList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                newList.add(list1.get(i++));
            }
            else{
                newList.add(list2.get(j++));
            }
        }
        while (i < list1.size()){
            newList.add(list1.get(i));
        }
        while (j < list2.size()){
            newList.add(list2.get(j));
        }
        return newList;
    }

    public static void mergSort(ArrayList<Integer> list){

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        if(list.size() <= 1){
            return;
        }
        for(int i = 0; i < list.size(); i++){
            if(i < list.size() / 2){
                a.add(i);
            }
            else{
                b.add(i);
            }
        }
        mergSort(a);
        mergSort(b);
        list = merg(a, b);
    }

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/levon/newText.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        String[] numbers = reader.readLine().split(",");

//        Integer num = Integer.parseInt()
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }
        Collections.sort(list);
      //  int j = 0;
      //  while (list.size() != 0){
       //     writer.write(list.get(j++));
      //  }
        for (Integer aList : list) {
            System.out.println(aList);
        }
        reader.close();
        writer.close();
    }
}
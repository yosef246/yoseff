package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Numbers {

    public static void main() {

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        Iterator<Integer> key = map.keySet().iterator();
        Iterator<ArrayList<Integer>> valiu = map.values().iterator();


        map.put(1,init());
        map.put(2,init());
        map.put(3,init());
        map.put(4,init());
        map.put(5,init());

        while (key.hasNext()){
            ArrayList<Integer> sum = isPrime(valiu.next());
            Iterator<Integer> it1 = sum.iterator();

            while (it1.hasNext()){
              Integer i = key.next();
            if(i < 10) {
                key.remove();
               }
            }
        }
        System.out.println(map);
    }


    public static ArrayList init(){
        int size;
        Random r = new Random();
        size = r.nextInt(10)+1;
        ArrayList<Integer> res = new ArrayList<>();
        while (size > 0){
            res.add(r.nextInt(1000));
            size--;
        }
        return res;
    }


    public static ArrayList isPrime(ArrayList<Integer> a){

        Iterator<Integer> it = a.iterator();

        int sum = it.next();

        for(int i = 0; i < sum/2; i++){
            if(it.next() % i == 0){
                if(it.next() < 10){
                    it.remove();
                }
            }
        }
        return a;
    }
}

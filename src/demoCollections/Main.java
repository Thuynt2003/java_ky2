package demoCollections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<String> hsStr = new HashSet<>();
        hsStr.add("Hello");
        hsStr.add("world");
        hsStr.add("Hello");

        for (String s: hsStr){
            System.out.println(s);
        }

        HashMap<String,String> hm = new HashMap<>();
        hm.put("name","Nguyễn Văn An");
        hm.put("email","annv@gmail.com");
        System.out.println("Ten SV: "+hm.get("name"));

        PriorityQueue<Integer> pi = new PriorityQueue<>();
        pi.add(9);
        pi.add(4);
        pi.add(8);
        pi.add(2);
        while (!pi.isEmpty()){
            System.out.println(pi.poll());// peek()
        }
        Car c1 = new Car("Toyota Camry",2015);
        Car c2 = new Car("Huyndai Santafe",2020);
        Car c3= new Car("BMV X7",2021);
        PriorityQueue<Car>  pc = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrduceYear()-o2.getPrduceYear();
            }
        });
        pc.add(c1);
        pc.add(c2);
        pc.add(c3);
        while (!pc.isEmpty()){
            Car c = pc.poll();
            System.out.println(c.getBrand());
        }

    }
}
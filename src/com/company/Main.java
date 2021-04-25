package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("list-a");
        //list A
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        Collections.sort(listA);
        Iterator<String> iterator = listA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("list-b");
        //list B
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listB = new ArrayList<>();
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        Collections.sort(listB);
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }




        System.out.println("list-c");
        //list C
        ArrayList<String> listC = new ArrayList<>();
        int i = 0;
        while (listC.size() < listA.size()+listB.size()){
            listC.add(listA.get(i));
            listC.add(listB.get(i));
            i++;
        }


        //  System.out.println("----");
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        printList(listC);
    }
    static void printList(ArrayList list){
        Iterator<String> pr = list.iterator();
        while (pr.hasNext()){
            System.out.println(pr.next());
        }
    }
}

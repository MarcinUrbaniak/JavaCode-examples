package com.hurtownia;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java podstawy", 50);
        Book book2 = new Book("Java rusz głową", 10);
        Book book3 = new Book("Java kompednium wiedzy", 5);
        Book book4 = new Book("Java samouczek", 100);


        List<Book> bookList = new ArrayList<>();
        Collections.addAll(bookList, book1,book2, book3, book4);

        Wholesale wholesale = new Wholesale(bookList);


        String city = "GDANSK";




        Map<Book, Integer> bookIntegerMap1 = new HashMap<>();
        bookIntegerMap1.put(book1, 2);
        bookIntegerMap1.put(book2, 1);
        Map<Book, Integer> bookIntegerMap2 = new HashMap<>();
        bookIntegerMap2.put(book1, 1);
        bookIntegerMap2.put(book3, 1);
        Map<Book, Integer> bookIntegerMap3 = new HashMap<>();
        bookIntegerMap3.put(book1, 1);
        bookIntegerMap3.put(book4, 1);


        Order order3 = new Order(bookIntegerMap1, 1, ListOfBookstore.GDANSK);
        Order order2 = new Order(bookIntegerMap2, 1, ListOfBookstore.GDANSK);
        Order order1 = new Order(bookIntegerMap3, 2, ListOfBookstore.KRAKOW);


        order3.setOrderStatus(OrderStatus.ZAMOWIONE);
        order1.setOrderStatus(OrderStatus.ZAMOWIONE);
        order2.setOrderStatus(OrderStatus.ANULOWANE);



        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders, order1,order2,order3 );



        ListOfBookstore listOfBookstore[] = ListOfBookstore.values();
        for(int month = 1; month <= 12; month ++) {
            for (ListOfBookstore l : listOfBookstore
            ) {
                double sum = Raport.getSumOfCostPerMonthAndCity(orders, l, month);
                int quantity = Raport.getQuantityOfBooks(orders,l,month );
                System.out.println("Księgarnia: " + l + " w miesiącu " + month + " sprzedała książki za sumę: " + sum + " ilośc książek: " + quantity);


            }
        }



    }


}

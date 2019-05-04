package com.hurtownia;

import java.util.List;
import java.util.Objects;

public class Raport {

    private List<Order> orders;
    private ListOfBookstore city;
    private int month;


    public Raport(List<Order> orders) {
        this.orders = orders;
    }

    public Raport() {

    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }


    public  static double getSumOfCostPerMonthAndCity(List<Order> orders, ListOfBookstore city, int month ){

        int size = orders.size();
        
        double sumOfCosts = 0;
        for (Order order: orders) {

            if(order.getMonth() == month && order.getCity().equals(city)){
                sumOfCosts += order.costOfOrder();
            }
        }

        return sumOfCosts;
    }

    public static int getQuantityOfBooks(List<Order> orders, ListOfBookstore city, int month){

        int quantityOfBooks = 0;
        for (Order order: orders) {

            if(order.getMonth() == month && order.getCity().equals(city)){
                quantityOfBooks += order.getBooksAndQuantity().size();
            }
        }


        return  quantityOfBooks;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Raport raport = (Raport) o;
        return Objects.equals(orders, raport.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "Raport{" +
                "orders=" + orders +
                '}';
    }
}

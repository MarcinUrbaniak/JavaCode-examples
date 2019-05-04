package com.hurtownia;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Order {


    private Map<Book, Integer> booksAndQuantity;
    private int month;
    private ListOfBookstore city;
    private OrderStatus orderStatus;




    public Order(Map<Book, Integer> booksAndQuantity, int month, ListOfBookstore city) {
        this.booksAndQuantity = booksAndQuantity;
        this.month = month;
        this.city = city;
    }





    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public ListOfBookstore getCity() {
        return city;
    }

    public void setCity(ListOfBookstore city) {
        this.city = city;
    }

    public void setOrderStatus(OrderStatus orderStatus){
        this.orderStatus = orderStatus;

    }

    public OrderStatus getOrderStatus(){
        return orderStatus;
    }

    public Map<Book, Integer> getBooksAndQuantity() {
        return booksAndQuantity;
    }

    public void setBooksAndQuantity(Map<Book, Integer> booksAndQuantity) {
        this.booksAndQuantity = booksAndQuantity;
    }

    public double costOfOrder(){
        double costOfTransport = city.getCostOfTransport();
        double cost = 0;
        Set<Book> keySet = booksAndQuantity.keySet();
        for (Book key: keySet
             ) {
            cost += key.getPrice() * booksAndQuantity.get(key);
        }

        return cost + costOfTransport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return month == order.month &&
                Objects.equals(booksAndQuantity, order.booksAndQuantity) &&
                Objects.equals(city, order.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash( booksAndQuantity, month, city);
    }

    @Override
    public String toString() {
        return "Order{" +
                ", booksAndQuantity=" + booksAndQuantity +
                ", month=" + month +
                ", city='" + city + '\'' +
                '}';
    }
}

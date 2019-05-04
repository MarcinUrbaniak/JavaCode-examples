package com.hurtownia;

import java.util.List;
import java.util.Objects;

public class Orders {

    private List<Order> orderList;

    public Orders(List<Order> orderList) {
        this.orderList = orderList;
    }


    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Objects.equals(orderList, orders.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderList);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderList=" + orderList +
                '}';
    }
}

package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;
@Getter
@ToString
public class Order {
    private final int orderId;
    private final LocalTime timeOfAcquisition;
    @Setter
    private Table orderTable;
    @Setter
    private int services;
    @Setter
    private List<Item> orderItems;
    private double totalCost;
    @Setter
    private OrderStatus status;

    public Order(int orderId, Table orderTable, int services, List<Item> orderItems) {
        this.orderId = orderId;
        this.timeOfAcquisition = LocalTime.now();
        this.orderTable = orderTable;
        this.services = services;
        this.orderItems = orderItems;
        this.totalCost = setTotalCost(this.orderItems);
        this.status = OrderStatus.PREPARING;
    }

    public double setTotalCost(List<Item> orderItems) {
        double tot = 0;
        if (orderItems != null) {
            for (Item item : orderItems) {
                tot += item.getPrice();
            }
        }
        return tot;
    }
}

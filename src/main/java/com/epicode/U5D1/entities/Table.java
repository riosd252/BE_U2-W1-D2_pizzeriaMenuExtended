package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.TableStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Table {
    private final int tableNumber;
    private final int maxCapacity;
    @Setter
    private TableStatus status;

    public Table(int tableNumber, int maxCapacity) {
        this.tableNumber = tableNumber;
        this.maxCapacity = maxCapacity;
        this.status = TableStatus.EMPTY;
    }

}

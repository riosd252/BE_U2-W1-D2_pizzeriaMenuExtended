package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.TableStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
public class Table {
    private final int tableNumber;
    private final int maxCapacity;
    @Setter
    private TableStatus status;

    public Table(@Qualifier("table1") int tableNumber,@Qualifier("table1Capacity") int maxCapacity) {
        this.tableNumber = tableNumber;
        this.maxCapacity = maxCapacity;
        this.status = TableStatus.EMPTY;
    }

}

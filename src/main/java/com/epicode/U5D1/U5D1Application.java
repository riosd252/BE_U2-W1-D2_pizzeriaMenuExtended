package com.epicode.U5D1;

import com.epicode.U5D1.entities.Item;
import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.Order;
import com.epicode.U5D1.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class U5D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();

		List<Item> items = new ArrayList<>(){{
			add((Item) ctx.getBean("pizza_margherita"));
		}};

		Order o = new Order(1, LocalTime.now(), (Table) ctx.getBean("table"), 4, items);

		Order o2 = new Order(2, LocalTime.now(), (Table) ctx.getBean("table2"), 3, items);

		Order o3 = new Order(3, LocalTime.now(), (Table) ctx.getBean("table3"), 2, items);

		Order o4 = new Order(4, LocalTime.now(), (Table) ctx.getBean("table4"), 1, items);

		System.out.println(o);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);

		ctx.close();
	}

}

package sec13.pkg1;

import entities.Order;
import entities.enuns.OrderStatus;
import java.util.Date;

public class Sec131 {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        
        System.out.println(order.toString());
        
        OrderStatus os1 = OrderStatus.DELIVERED;
        
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);
    }

}

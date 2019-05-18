package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class OrderStatus {

    private String orderStatus;

    @OneToMany(mappedBy = "orderStatus")
    @JsonIgnoreProperties("orderStatus")
    private Set<OrderItem> orderItems;

    public OrderStatus(String orderStatus, Set<OrderItem> orderItems) {
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}

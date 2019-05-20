package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String orderId;

    private Date orderDeadline;
    private Date startDate;
    private Date endDate;

    @OneToMany(mappedBy = "orderId")
    @JsonIgnoreProperties("orderId")
    private Set<OrderItem> orderItems;

    public Order(Date orderDeadline, Date startDate, Date endDate, Set<OrderItem> orderItems) {
        this.orderDeadline = orderDeadline;
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderItems = orderItems;

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDeadline() {
        return orderDeadline;
    }

    public void setOrderDeadline(Date orderDeadline) {
        this.orderDeadline = orderDeadline;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}

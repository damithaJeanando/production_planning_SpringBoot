package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String orderItemId;

    private int quantity;

    @ManyToOne
    private Order orderId;

    @OneToOne
    private Inspection inspectionId;

    @ManyToOne
    private Product productId;

    @ManyToOne
    private OrderStatus orderStatus;

    public OrderItem(int quantity, Order orderId, Inspection inspectionId, Product productId, OrderStatus orderStatus) {
        this.quantity = quantity;
        this.orderId = orderId;
        this.inspectionId = inspectionId;
        this.productId = productId;
        this.orderStatus = orderStatus;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Inspection getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Inspection inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}

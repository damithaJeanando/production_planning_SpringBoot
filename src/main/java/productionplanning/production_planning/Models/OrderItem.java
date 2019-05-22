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
    private OrderSales orderSalesId;

    @OneToOne
    private Inspection inspectionId;

    @ManyToOne
    private Product productId;

    @ManyToOne
    private OrderStatus orderStatusId;

    public OrderItem(int quantity, OrderSales orderSalesId, Inspection inspectionId, Product productId, OrderStatus orderStatusId) {
        this.quantity = quantity;
        this.orderSalesId = orderSalesId;
        this.inspectionId = inspectionId;
        this.productId = productId;
        this.orderStatusId = orderStatusId;
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

    public OrderSales getOrderSalesId() {
        return orderSalesId;
    }

    public void setOrderSalesId(OrderSales orderSalesId) {
        this.orderSalesId = orderSalesId;
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

    public OrderStatus getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(OrderStatus orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
}

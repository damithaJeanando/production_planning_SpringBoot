package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class BillItem {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String billItemId;

    private int quantity;

    @OneToOne
    private RawMaterials materialId;

    @ManyToOne
    private BOM bomId;

    @ManyToOne
    private BillItemStatus billItemStatus;

    public BillItem(int quantity, RawMaterials materialId, BOM bomId, BillItemStatus billItemStatus) {
        this.quantity = quantity;
        this.materialId = materialId;
        this.bomId = bomId;
        this.billItemStatus = billItemStatus;
    }

    public String getBillItemId() {
        return billItemId;
    }

    public void setBillItemId(String billItemId) {
        this.billItemId = billItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public RawMaterials getMaterialId() {
        return materialId;
    }

    public void setMaterialId(RawMaterials materialId) {
        this.materialId = materialId;
    }

    public BOM getBomId() {
        return bomId;
    }

    public void setBomId(BOM bomId) {
        this.bomId = bomId;
    }

    public BillItemStatus getBillItemStatus() {
        return billItemStatus;
    }

    public void setBillItemStatus(BillItemStatus billItemStatus) {
        this.billItemStatus = billItemStatus;
    }
}

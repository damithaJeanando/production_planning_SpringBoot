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
    private BIStatus biStatus;

    public BillItem(int quantity, RawMaterials materialId, BOM bomId, BIStatus biStatus) {
        this.quantity = quantity;
        this.materialId = materialId;
        this.bomId = bomId;
        this.biStatus = biStatus;
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

    public BIStatus getBiStatus() {
        return biStatus;
    }

    public void setBiStatus(BIStatus biStatus) {
        this.biStatus = biStatus;
    }
}

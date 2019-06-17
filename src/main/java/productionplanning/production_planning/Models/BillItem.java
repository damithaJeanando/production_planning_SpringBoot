package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnoreProperties("billItems")
    private BOM bomId;





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


}

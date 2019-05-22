package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class PDItem {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String designItemId;

    private int quantity;

    @ManyToOne
    private ProductDesign designId;

    @OneToOne
    private RawMaterials materialId;

    public PDItem(int quantity, ProductDesign designId, RawMaterials materialId) {
        this.quantity = quantity;
        this.designId = designId;
        this.materialId = materialId;
    }

    public String getDesignItemId() {
        return designItemId;
    }

    public void setDesignItemId(String designItemId) {
        this.designItemId = designItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDesign getDesignId() {
        return designId;
    }

    public void setDesignId(ProductDesign designId) {
        this.designId = designId;
    }

    public RawMaterials getMaterialId() {
        return materialId;
    }

    public void setMaterialId(RawMaterials materialId) {
        this.materialId = materialId;
    }
}

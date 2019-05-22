package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class BIStatus {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String biStatusId;

    private String billItemStatus;

    @OneToMany(mappedBy = "biStatus")
    @JsonIgnoreProperties("biStatus")
    private Set<BillItem> billItems;

    public BIStatus(String biStatusId, String billItemStatus, Set<BillItem> billItems) {
        this.biStatusId = biStatusId;
        this.billItemStatus = billItemStatus;
        this.billItems = billItems;
    }

    public String getBiStatusId() {
        return biStatusId;
    }

    public void setBiStatusId(String biStatusId) {
        this.biStatusId = biStatusId;
    }

    public String getBillItemStatus() {
        return billItemStatus;
    }

    public void setBillItemStatus(String billItemStatus) {
        this.billItemStatus = billItemStatus;
    }

    public Set<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(Set<BillItem> billItems) {
        this.billItems = billItems;
    }


}

package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class RNStatus {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String rnStatus_id;

    private String rnStatus;

    @OneToMany(mappedBy = "rnStatus")
    @JsonIgnoreProperties("rnStatus")
    private Set<RejectionNotice> rejectionNotices;

    public RNStatus(String rnStatus_id, String rnStatus, Set<RejectionNotice> rejectionNotices) {
        this.rnStatus_id = rnStatus_id;
        this.rnStatus = rnStatus;
        this.rejectionNotices = rejectionNotices;
    }

    public String getRnStatus() {
        return rnStatus;
    }

    public void setRnStatus(String rnStatus) {
        this.rnStatus = rnStatus;
    }

    public Set<RejectionNotice> getRejectionNotices() {
        return rejectionNotices;
    }

    public void setRejectionNotices(Set<RejectionNotice> rejectionNotices) {
        this.rejectionNotices = rejectionNotices;
    }
}

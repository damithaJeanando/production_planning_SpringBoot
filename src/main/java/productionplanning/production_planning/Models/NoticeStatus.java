package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class NoticeStatus {

    private String noticeStatus;

    @OneToMany(mappedBy = "noticeStatus")
    @JsonIgnoreProperties("noticeStatus")
    private Set<RejectionNotice> rejectionNotices;

    public NoticeStatus(String noticeStatus, Set<RejectionNotice> rejectionNotices) {
        this.noticeStatus = noticeStatus;
        this.rejectionNotices = rejectionNotices;
    }

    public String getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Set<RejectionNotice> getRejectionNotices() {
        return rejectionNotices;
    }

    public void setRejectionNotices(Set<RejectionNotice> rejectionNotices) {
        this.rejectionNotices = rejectionNotices;
    }
}

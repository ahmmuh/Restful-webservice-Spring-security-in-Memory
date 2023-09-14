package se.codeanytime.issueTracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@EntityScan
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int issueId;
    private String issueName;
    private String issueRapporter;
    private String issueDecription;
    private Boolean closed;
    private String issueType;
    private Boolean open;
  @Temporal(TemporalType.DATE)
  @Column(nullable = false)
  private Date registerDate;
}

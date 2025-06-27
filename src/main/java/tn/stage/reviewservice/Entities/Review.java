package tn.stage.reviewservice.Entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReview;
    String comment;
    String type;
    int page;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    Date created;
    Long bookId;
}

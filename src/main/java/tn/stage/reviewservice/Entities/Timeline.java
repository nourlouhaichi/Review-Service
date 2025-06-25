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
public class Timeline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idTime;
    int currentpage;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    Date date;
    Long bookId;
}

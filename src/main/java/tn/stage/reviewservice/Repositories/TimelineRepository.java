package tn.stage.reviewservice.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.stage.reviewservice.Entities.Timeline;

import java.util.List;

@Repository
public interface TimelineRepository extends JpaRepository<Timeline,Long> {
    public List<Timeline> findByBookId(Long bookId);
}

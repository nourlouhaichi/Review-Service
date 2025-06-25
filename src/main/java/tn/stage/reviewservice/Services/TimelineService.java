package tn.stage.reviewservice.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;
import tn.stage.reviewservice.Entities.Timeline;
import tn.stage.reviewservice.Repositories.TimelineRepository;
import java.util.List;

@Service
public class TimelineService implements ITimelineService{

    @Autowired
    TimelineRepository timelineRepository;

    @Override
    public Timeline addTimeline(Timeline timeline) {
        return timelineRepository.save(timeline);
    }

    @Override
    public Timeline updateTimeline(Timeline timeline) {
        return timelineRepository.save(timeline);
    }

    @Override
    public void deleteTimeline(Long id) {
        timelineRepository.deleteById(id);
    }

    @Override
    public List<Timeline> retreiveAllTimeline() {
        return timelineRepository.findAll();
    }

    @Override
    public Timeline retreiveTimeline(long id) {
        return timelineRepository.findById(id).get();
    }

    @Override
    public List<Timeline> retreiveTimelineByBookId(Long bookId) {
        return timelineRepository.findByBookId(bookId);
    }
}

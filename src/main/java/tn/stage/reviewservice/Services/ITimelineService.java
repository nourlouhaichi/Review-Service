package tn.stage.reviewservice.Services;
import tn.stage.reviewservice.Entities.Timeline;
import java.util.List;

public interface ITimelineService {
    public Timeline addTimeline(Timeline timeline);
    public Timeline updateTimeline(Timeline timeline);
    public void deleteTimeline(Long id);
    public List<Timeline> retreiveAllTimeline();
    public Timeline retreiveTimeline(long id);

    public List<Timeline> retreiveTimelineByBookId(Long bookId);
}

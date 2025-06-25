package tn.stage.reviewservice.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.stage.reviewservice.Entities.Timeline;
import tn.stage.reviewservice.Services.ITimelineService;

import java.util.List;

@RestController
@RequestMapping("/timeline")
public class TimelineController {

    @Autowired
    ITimelineService timelineService;

    @PostMapping("/addTimeline")
    public Timeline addTimeline(@RequestBody Timeline timeline) {
        return timelineService.addTimeline(timeline);
    }

    @PutMapping("/updateTimeline/{bookId}")
    public Timeline updateTimeline(@RequestBody Timeline timeline) {
        return timelineService.updateTimeline(timeline);
    }

    @GetMapping("/retreiveAllTimeline")
    public List<Timeline> retreiveAllTimeline() {
        return timelineService.retreiveAllTimeline();
    }

    @GetMapping("/retreiveTimeline/{id}")
    public Timeline retreiveTimeline(@PathVariable long id) {
        return timelineService.retreiveTimeline(id);
    }

    @DeleteMapping("/deleteTimeline/{id}")
    public void deleteTimeline(@PathVariable long id){
        timelineService.deleteTimeline(id);
    }

    @GetMapping("/retrieveByBook/{bookId}")
    public List<Timeline> getTimelineByBookId(@PathVariable Long bookId) {
        return timelineService.retreiveTimelineByBookId(bookId);
    }
}

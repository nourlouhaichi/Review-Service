package tn.stage.reviewservice.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.stage.reviewservice.Entities.Review;
import tn.stage.reviewservice.Services.IReviewService;
import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    IReviewService reviewService;

    @PostMapping("/addReview/{bookId}")
    public Review addReview(@RequestBody Review review, @PathVariable Long bookId) {
        return reviewService.addReview(review, bookId);
    }

    @PutMapping("/updateReview/{bookId}")
    public Review updateReview(@RequestBody Review review, @PathVariable Long bookId) {
        return reviewService.updateReview(review, bookId);
    }

    @GetMapping("/retreiveAllReviews")
    public List<Review> retreiveAllReviews() {
        return reviewService.retreiveAllReviews();
    }

    @GetMapping("/retreiveReview/{id}")
    public Review retreiveReview(@PathVariable long id) {
        return reviewService.retreiveReview(id);
    }

    @DeleteMapping("/deleteReview/{id}")
    public void deleteReview(@PathVariable long id){
        reviewService.deleteReview(id);
    }

    @GetMapping("/book/{bookId}")
    public List<Review> getReviewsByBookId(@PathVariable Long bookId) {
        return reviewService.retreiveReviewsByBookId(bookId);
    }
}

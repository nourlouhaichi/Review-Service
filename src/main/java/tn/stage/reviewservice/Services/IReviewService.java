package tn.stage.reviewservice.Services;
import tn.stage.reviewservice.Entities.Review;
import java.util.List;

public interface IReviewService {

    public Review addReview(Review review, Long bookId);
    public Review updateReview(Review review, Long bookId);
    public void deleteReview(Long id);
    public List<Review> retreiveAllReviews();
    public Review retreiveReview(long id);

    public List<Review> retreiveReviewsByBookId(Long bookId);

}

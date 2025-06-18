package tn.stage.reviewservice.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.stage.reviewservice.Entities.Review;
import tn.stage.reviewservice.Repositories.ReviewRepository;
import java.util.List;

@Service
public class ReviewService implements IReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review, Long bookId) {
        review.setBookId(bookId);
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Review review, Long bookId) {
        review.setBookId(bookId);
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public List<Review> retreiveAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review retreiveReview(long id) {
        return reviewRepository.findById(id).get();
    }

    @Override
    public List<Review> retreiveReviewsByBookId(Long bookId) {
        return reviewRepository.findByBookId(bookId);
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_score_when_tenth_frame_first_throw_hit_is_two_more_throw(){
        BowlingGame bowlingGame=new BowlingGame();
        int score=bowlingGame.score(new int[]{10, 10, 10, 10,10,10,10,10,10,10,4,5});
        assertEquals(199,score);
    }

}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_score_when_tenth_frame_is_strike(){
        BowlingGame bowlingGame=new BowlingGame();
        int score=bowlingGame.score(new int[]{10, 10, 10, 10,10,10,10,10,10,10,4,5});
        assertEquals(283,score);
    }

    @Test
    void should_return_score_when_in_one_frame_is_not_hit_ten_pin(){
        BowlingGame bowlingGame=new BowlingGame();
        int score=bowlingGame.score(new int[]{8, 1, 3, 4,10,5,4,10,10,10,10,10,10,4,5});
        assertEquals(207,score);
    }

    @Test
    void should_return_score_when_in_one_frame_except_tenth_is_spare(){
        BowlingGame bowlingGame=new BowlingGame();
        int score=bowlingGame.score(new int[]{8, 1, 3, 4,10,5,4,6,4,10,7,3,10,10,10,4,5});
        assertEquals(177,score);
    }

    @Test
    void should_return_score_when_tenth_frame_is_spare(){
        BowlingGame bowlingGame=new BowlingGame();
        int score=bowlingGame.score(new int[]{8, 1, 3, 4,10,5,4,6,4,10,7,3,10,10,6,4,5});
        assertEquals(165,score);
    }

    @Test
    void should_return_score_when_tenth_frame_is_not_hit_ten_pin(){
        BowlingGame bowlingGame=new BowlingGame();
        int score=bowlingGame.score(new int[]{8, 1, 3, 4,10,5,4,6,4,10,7,3,10,10,3,4});
        assertEquals(151,score);
    }

}

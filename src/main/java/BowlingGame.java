public class BowlingGame {

    public int score(int[] pin_score) {
        int score=0;
        int length=pin_score.length;
        int frame_num=0;
        for(int i=0;i<length&&frame_num<10;i++,frame_num++){
            if(pin_score[i]==10){
                score+= 10 + pin_score[i + 1]+pin_score[i+2];
            }else{
                if(pin_score[i]+pin_score[i+1]==10){
                    score+=10+pin_score[i+2];

                }else{
                    score+=pin_score[i]+pin_score[i+1];
                }
                i++;
            }
        }
        return score;
    }
}

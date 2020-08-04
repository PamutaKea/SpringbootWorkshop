public class TennisGame2 {
    public int player1Point;
    public int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String [] textScores = {"Love","Fifteen","Thirty","Forty"};
        String player1Result = "";
        String player2Result = "";
        String score = "";

        //เสมอกัน
        boolean sameScoreAll = player1Point == player2Point && player1Point < 3;
        if (sameScoreAll)
        {
            return textScores[player1Point]+"-All";

        }

        //Deuce
        boolean isDeuce = player1Point == player2Point && player1Point >= 3;
        if (isDeuce) {
            return "Deuce";
        }


        // Normal case

        if (player1Point > player2Point && player1Point < 4)
        {
            score = textScores[player1Point] + "-" + textScores[player2Point];
        }
        if (player2Point > player1Point && player2Point < 4)
        {
            score = textScores[player1Point] + "-" + textScores[player2Point];
        }

        // Advantage (ได้เปรียบ)
        if (player1Point > player2Point && player2Point >= 3)
        {
            score = "Advantage "+ player1Name;
        }

        if (player2Point > player1Point && player1Point >= 3)
        {
            score = "Advantage "+player2Name;
        }

        // Winner
        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            score = "Win for "+player1Name;
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            score = "Win for "+player2Name;
        }
        return score;
    }

    public void p1Score(){
        player1Point++;
    }

    public void p2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1")){
            p1Score();
        }else{
            p2Score();
        }

    }
}


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
        String [] textScores = {"Love","Fifteen","Thirty"};
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
        if (isDeuce)
            score = "Deuce";

        // Normal case
        if (player1Point > 0 && player2Point ==0)
        {
            if (player1Point ==1)
                player1Result = "Fifteen";
            if (player1Point ==2)
                player1Result = "Thirty";
            if (player1Point ==3)
                player1Result = "Forty";

            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > 0 && player1Point ==0)
        {
            if (player2Point ==1)
                player2Result = "Fifteen";
            if (player2Point ==2)
                player2Result = "Thirty";
            if (player2Point ==3)
                player2Result = "Forty";

            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point && player1Point < 4)
        {
            if (player1Point ==2)
                player1Result="Thirty";
            if (player1Point ==3)
                player1Result="Forty";
            if (player2Point ==1)
                player2Result="Fifteen";
            if (player2Point ==2)
                player2Result="Thirty";
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > player1Point && player2Point < 4)
        {
            if (player2Point ==2)
                player2Result="Thirty";
            if (player2Point ==3)
                player2Result="Forty";
            if (player1Point ==1)
                player1Result="Fifteen";
            if (player1Point ==2)
                player1Result="Thirty";
            score = player1Result + "-" + player2Result;
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


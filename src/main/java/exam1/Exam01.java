package exam1;

public class Exam01 {
    int playerAWin = 0;
    int playerBWin = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        playerAWin++;
    }

    public void playerBWin() {
        playerBWin++;
    }

    public String getScore() {

        if (playerAWin==1)
            return "Fifteen-Love";
        else if (playerAWin==2)
            return "Thirty-Love";
        else if (playerAWin==3)
            return "Forty-Love";
        else if (playerAWin==4)
            return "Win for Player A";
        else if (playerBWin==1)
            return "Love-Fifteen";
        else if (playerBWin==2)
            return "Love-Thirty";
        else if (playerBWin==3)
            return "Love-Forty";
        else if (playerBWin==4)
            return "Win for Player B";
        return "Love-All";
    }

}

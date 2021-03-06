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
        //win after Deuce
        if (Math.abs(playerAWin-playerBWin)==2 && (playerAWin>=4 && playerBWin>=4)){
            if (playerAWin > playerBWin)
                return "Win for Player A";
            return "Win for Player B";
        }
        //advantage after Deuce
        if (Math.abs(playerAWin-playerBWin)==1 && (playerAWin>=4 || playerBWin>=4)){
            if (playerBWin-playerAWin==1)
                return "Advantage Player B";
            else if (playerAWin-playerBWin ==1)
                return "Advantage Player A";
        }
        //equal scores case
        if (playerAWin==playerBWin)
            if (playerAWin>=3)
                return "Deuce";
            else if (playerAWin==1)
                return "Fifteen-All";
            else if (playerAWin==2)
                return "Thirty-All";
        //normal win
        if (playerAWin==4 || playerBWin==4){
            if (playerAWin==4)
                return "Win for Player A";
            return "Win for Player B";
        }
        //other case
        if (playerAWin==1 && playerBWin==0)
            return "Fifteen-Love";
        else if (playerAWin==1 && playerBWin==2)
            return "Fifteen-Thirty";
        else if (playerAWin==1 && playerBWin==3)
            return "Fifteen-Forty";
        else if (playerAWin==2 && playerBWin==0)
            return "Thirty-Love";
        else if (playerAWin==2 && playerBWin==1)
            return "Thirty-Fifteen";
        else if (playerAWin==2 && playerBWin==3)
            return "Thirty-Forty";
        else if (playerAWin==3 && playerBWin==0)
            return "Forty-Love";
        else if (playerAWin==3 && playerBWin==1)
            return "Forty-Fifteen";
        else if (playerAWin==3 && playerBWin==2)
            return "Forty-Thirty";
        else if (playerBWin==1)
            return "Love-Fifteen";
        else if (playerBWin==2)
            return "Love-Thirty";
        else if (playerBWin==3)
            return "Love-Forty";

        return "Love-All";
    }

}

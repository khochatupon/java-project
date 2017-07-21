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
        return "Love-All";
    }

}

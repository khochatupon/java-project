package exam1;

public class Exam01 {
    Boolean playerAWin = false;
    Boolean playerBWin = false;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        playerAWin = true;
    }

    public void playerBWin() {
    }

    public String getScore() {

        if (playerAWin)
            return "Fifteen-Love";
        return "Love-All";
    }

}

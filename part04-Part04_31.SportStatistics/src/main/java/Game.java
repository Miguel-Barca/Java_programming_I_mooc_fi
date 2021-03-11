/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Game {
    private String team1;
    private String team2;
    private int points1;
    private int points2;
   
    public Game(String team1, String team2, int points1, int points2){
        this.team1=team1;
        this.team2=team2;
        this.points1=points1;
        this.points2=points2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getPoints1() {
        return points1;
    }

    public void setPoints1(int points1) {
        this.points1 = points1;
    }

    public int getPoints2() {
        return points2;
    }

    public void setPoints2(int points2) {
        this.points2 = points2;
    }
   
    public String toString(){
        return this.team1 + ", " + this.team2 + ", "+ this.points1 + ", " + this.points2;
    }
}

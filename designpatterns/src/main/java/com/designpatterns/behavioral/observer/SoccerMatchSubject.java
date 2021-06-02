package com.designpatterns.behavioral.observer;

// Concrete Subject
public class SoccerMatchSubject implements ScoresObserver {

  private final String teamA;
  private final Integer teamAScore;
  private final Integer numberOfFoulsTeamA;
  private final String teamB;
  private final Integer teamBScore;
  private final Integer numberOfFoulsTeamB;

  // Constructor
  public SoccerMatchSubject(String teamA, Integer teamAScore, Integer numberOfFoulsTeamA,
      String teamB, Integer teamBScore, Integer numberOfFoulsTeamB) {
    this.teamA = teamA;
    this.teamAScore = teamAScore;
    this.numberOfFoulsTeamA = numberOfFoulsTeamA;
    this.teamB = teamB;
    this.teamBScore = teamBScore;
    this.numberOfFoulsTeamB = numberOfFoulsTeamB;
  }

  @Override
  public String getTheMatchScores() {
    return "The match scores are: "
        + "Team " + this.teamA + " has score=" + this.teamAScore
        + " and number of fouls=" + this.numberOfFoulsTeamA
        + " && Team " + this.teamB + " has score=" + this.teamBScore
        + " and number of fouls=" + this.numberOfFoulsTeamB;
  }

  // Getter and Setter methods
}
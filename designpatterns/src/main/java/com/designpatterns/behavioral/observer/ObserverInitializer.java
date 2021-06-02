package com.designpatterns.behavioral.observer;

import java.util.Observable;

/**
 * @author prachi.shah
 */
public class ObserverInitializer {

  public static void main(String[] args) {
    SoccerSportsFansWebsiteObserver soccerSportsFansWebsiteObserver = new SoccerSportsFansWebsiteObserver();
    SoccerIsTheBestWebsiteObserver soccerIsTheBestWebsiteObserver = new SoccerIsTheBestWebsiteObserver();

    final String teamA = "Chelsea";
    final Integer teamAScore = 2;
    final Integer numberOfFoulsTeamA = 2;
    final String teamB = "Liverpool";
    final Integer teamBScore = 1;
    final Integer numberOfFoulsTeamB = 1;
    SoccerMatchSubject soccerMatchSubject = new SoccerMatchSubject(
        teamA, teamAScore, numberOfFoulsTeamA, teamB, teamBScore, numberOfFoulsTeamB);
    SoccerMatchObservable soccerMatchObservable = new SoccerMatchObservable();
    soccerMatchObservable.setMatchScores(soccerMatchSubject.getTheMatchScores());
    soccerMatchObservable.addObserver(soccerSportsFansWebsiteObserver);
    soccerMatchObservable.addObserver(soccerIsTheBestWebsiteObserver);

    soccerMatchObservable.updateAllObservers(new Observable());

    soccerMatchObservable.removeObserver(soccerIsTheBestWebsiteObserver);

    final Integer teamBScoreUpdated = 3;
    SoccerMatchSubject soccerMatchSubjectUpdated = new SoccerMatchSubject(
        teamA, teamAScore, numberOfFoulsTeamA, teamB, teamBScoreUpdated, numberOfFoulsTeamB);
    soccerMatchObservable.setMatchScores(soccerMatchSubjectUpdated.getTheMatchScores());

    System.out.println("-----Match scores updated-----");
    soccerMatchObservable.updateAllObservers(new Observable());
  }
}
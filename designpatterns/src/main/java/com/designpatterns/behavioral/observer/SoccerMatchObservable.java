package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

// Observable or Subject
public class SoccerMatchObservable implements ScoresObserver {

  private String matchScores;

  private final List<Observer> observers = new ArrayList<Observer>();

  public SoccerMatchObservable() {
  }

  public SoccerMatchObservable(String matchScores) {
    this.matchScores = matchScores;
  }

  public void addObserver(Observer observer) {
    this.observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  public void updateAllObservers(Observable observable) {
    final String matchScores = this.getTheMatchScores();
    for (Observer observer : this.observers) {
      observer.update(observable, matchScores);
    }
  }

  @Override
  public String getTheMatchScores() {
    return this.matchScores;
  }

  public String getMatchScores() {
    return this.matchScores;
  }

  public void setMatchScores(String matchScores) {
    this.matchScores = matchScores;
  }
}
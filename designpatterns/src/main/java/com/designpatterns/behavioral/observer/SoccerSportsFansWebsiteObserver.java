package com.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

// Concrete Observer
public class SoccerSportsFansWebsiteObserver implements Observer {

  private String matchScores;

  @Override
  public void update(Observable o, Object matchScores) {
    this.matchScores = (String) matchScores;
    System.out.println("SoccerSportsFansWebsiteObserver: \n" + this.matchScores);
  }
}
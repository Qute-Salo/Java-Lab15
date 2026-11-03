package org.example;

import java.util.List;

public class Coach {
    private String id;
    private String name;
    private String sport;
    private int level;
    private List<Integer> athleteRatings;

    public Coach(String id, String name, String sport, int level, List<Integer> athleteRatings) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.level = level;
        this.athleteRatings = athleteRatings;
    }

    public double getAverageRating() {
        if (athleteRatings == null || athleteRatings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int rating : athleteRatings) {
            sum += rating;
        }
        return sum / athleteRatings.size();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }
}
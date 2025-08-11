package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    PowerSupply psu;

    public Computer(PowerSupply psu){
        this.psu = psu;
        installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled){
        this.psu = psu;
        this.installedGames = preInstalled;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(String game) {
        for (Game g : this.installedGames) {
            if (g.name.equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}

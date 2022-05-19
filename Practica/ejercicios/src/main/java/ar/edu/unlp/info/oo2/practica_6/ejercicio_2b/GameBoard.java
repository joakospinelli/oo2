package ar.edu.unlp.info.oo2.practica_6.ejercicio_2b;

import java.util.List;
import java.util.ArrayList;

public class GameBoard {
    private List<Robot> robots = new ArrayList<>();
    private boolean playing = false;

    public void runUntilStopped(){
        playing = true;
    }

    public void stop(){
        playing = false;
    }

    public boolean isPlaying(){
        return playing;
    }

    public void addRobot(Robot r){
        this.robots.add(r);
    }
}
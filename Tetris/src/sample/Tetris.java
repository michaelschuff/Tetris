package sample;

import javafx.scene.Node;

import java.util.ArrayList;

public class Tetris {
    public int startx = 0;
    public int starty = 0;
    public int width = 0;
    public int height = 0;

    private ArrayList<Node> shapes = new ArrayList<Node>();
    public Tetris(int startx, int starty, int width, int height) {
        this.startx = startx;
        this.starty = starty;
        this.width = width;
        this.height = height;
    }
}

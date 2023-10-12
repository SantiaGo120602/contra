package model;

public abstract class Entity {
    private Sprite sprite;
    private Coords coords;
    private Dimension dimension;

    public Entity(Sprite sprite, Coords coords, Dimension dimension) {
        this.sprite = sprite;
        this.coords = coords;
        this.dimension = dimension;
    }

    public void draw(){

    }

    public void move(Coords change){
        this.coords.setX(this.coords.getX() + change.getX());
        this.coords.setY(this.coords.getY() + change.getY());
    }
    
    public abstract void update(GameState gameState);
}

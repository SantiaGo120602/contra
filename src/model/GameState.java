package model;

import java.util.ArrayList;

public class GameState {
    private ArrayList<Entity> entities;
    private static GameState gameInstance = null;
    
    private GameState(){

    }

    public static synchronized GameState getInstance(){
        if (gameInstance == null){
            gameInstance = new GameState();
        }
        return gameInstance;
    }

    public void registerEntity(Entity entity){
        this.entities.add(entity);
    }

    public void unregisterEntity(Entity entity){
        this.entities.remove(entity);
    }

    public void notifyEntities(){
        for (Entity entity: entities){
            entity.update(this);
        }
    }
}

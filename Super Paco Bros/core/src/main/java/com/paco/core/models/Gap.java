package com.paco.core.models;

import com.badlogic.gdx.maps.MapObject;
import com.paco.core.gui.Graphics;

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 */
public class Gap extends ModelBase {
    public Gap(Graphics screen, MapObject obj) {super(screen, obj);}
    
    @Override
    public void initialize() {}
    
    @Override
    public void dispose() {}

    @Override
    public void update(float delta) {}

    @Override
    public void onCollision() {}
    
    @Override public void onCollision(Player pl) {pl.kill();}
    @Override public void onCollision(String val) {}
}

package com.paco.core.controller.controls;

import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.Manifold;
import com.paco.core.models.ModelBase;
import com.paco.core.models.Player;

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 */
public class Contact implements ContactListener {
    Fixture fixtureOnContactA;
    Fixture fixtureOnContactB;
    
    @Override
    public void beginContact(com.badlogic.gdx.physics.box2d.Contact contact) {
        fixtureOnContactA = contact.getFixtureA();
        fixtureOnContactB = contact.getFixtureB();
        
        if (fixtureOnContactA.getUserData() != "fist") {
            ((ModelBase) fixtureOnContactA.getUserData()).onCollision((Player) fixtureOnContactB.getUserData());
        } else {
            ((ModelBase) fixtureOnContactB.getUserData()).onCollision((String) fixtureOnContactA.getUserData());
        }
    }

    @Override
    public void endContact(com.badlogic.gdx.physics.box2d.Contact contact) {
        //System.out.println("com.paco.core.controller.controls.Contact.endContact()");
    }

    @Override
    public void preSolve(com.badlogic.gdx.physics.box2d.Contact contact, Manifold oldManifold) {
        //System.out.println("com.paco.core.controller.controls.Contact.preSolve()");
    }

    @Override
    public void postSolve(com.badlogic.gdx.physics.box2d.Contact contact, ContactImpulse impulse) {
        //System.out.println("com.paco.core.controller.controls.Contact.postSolve()");
    }
    
}

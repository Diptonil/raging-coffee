package com.ragingcoffee.designpatterns.builder;

public final class CharacterBuilder {
    
    public final String name;
    public Weapon weapon;
    public PlayerClass playerClass;
    public EyeColour eye;

    CharacterBuilder(String name) {
        this.name = name;
    }

    public CharacterBuilder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public CharacterBuilder withEyeColour(EyeColour eyeColour) {
        this.eye = eyeColour;
        return this;
    }

    public CharacterBuilder withPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
        return this;
    }
}

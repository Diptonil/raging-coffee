package com.ragingcoffee.designpatterns.builder;

public final class Hero {
    
    final String name;
    final Weapon weapon;
    final PlayerClass playerClass;
    final EyeColour eye;

    Hero(CharacterBuilder characterBuilder) {
        this.name = characterBuilder.name;
        this.weapon = characterBuilder.weapon;
        this.playerClass = characterBuilder.playerClass;
        this.eye = characterBuilder.eye;
    }

    // More character game logic.
}

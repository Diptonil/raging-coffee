package com.ragingcoffee.designpatterns.builder;

public final class CharacterCreator {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        CharacterBuilder characterBuilder = new CharacterBuilder("Diana Prince").withEyeColour(EyeColour.BLUE).withPlayerClass(PlayerClass.WARRIOR).withWeapon(Weapon.SWORD);
        Hero hero = new Hero(characterBuilder);

        // More game logic code
    }
}
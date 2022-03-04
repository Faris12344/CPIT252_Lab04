package com.mycompany.factorybuilder;
//Faris Mohammed Alnahdi
//1935595
public class App {

    public static void main(String[] args) {
        try {
            var knight = CharacterFactory.createCharacter(CharacterTypes.KNIGHT, "Aragorn");
            System.out.println(knight.toString());

            var archer = CharacterFactory.createCharacter(CharacterTypes.ARCHER, "Legolas");
            System.out.println(archer.toString());

            var flagBearer = CharacterFactory.createCharacter(CharacterTypes.FLAG_BEARER,"Frodo");
            System.out.println(flagBearer.toString());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

    }
}

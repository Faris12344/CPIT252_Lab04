
package com.mycompany.factorybuilder;


public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    public static Characters createCharacter(CharacterTypes type, String name){
        if (type.toString().equals("knight")) {
            return new Knight(name);
        }
       else if (type.toString().equals("flag_bearer")) {
            return new FlagBearer(name);
        }
       else if (type.toString().equals("archer") ) {
            return new Archer(name);
        }
       return null;
        
        
    }
    
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author memphmane86
 */
public class DogFactory {
  
    public static Dog getDog(String Criteria)
    {
        if (Criteria.equals("small"))
            return new Poodle();
        
        else if (Criteria.equals("big"))
            return new RottWeiler();
        
        else if (Criteria.equals("large"))
            return new PittBull();
        
        return null;
    }
}

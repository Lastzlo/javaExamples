package org.example.oop.inheritanceAndTypeConversion.TestCase2;

import org.junit.jupiter.api.Test;

public class Plant {
    public void smell(){
        System.out.println("Smells");
    }
}

class Rose extends Plant {
    public void prick() {
        System.out.println("Pricks");
    }
}

class Camomile extends Rose {
    public void cure(){
        System.out.println("Cures");
    }


    @Test
    public void whatWillBeResult() {
        Plant[] plants = new Plant[]{new Rose(), new Camomile()};
        for(Plant plant : plants) {
            if (plant instanceof Rose) {
                ( (Camomile)plant).prick();
                plant.smell();
            }

        }

    }

}

package Oops.Encapsulation.OtherPackageForTesting;

import Oops.Encapsulation.Q1EncapsulationPublicModifier;

public class SubclassEncapsulation extends Q1EncapsulationPublicModifier {
    public void display() {
        System.out.println(a); // public variable can be accessed from different package sub class
        System.out.println(b); // protected variable can be accessed from different package sub-class
        //System.out.println(c);
        // default variable cannot be accessed from different package sub class

        //System.out.println(d);
        //private

        getterName();
    }
}

package Oops.Encapsulation.OtherPackageForTesting;

import Oops.Encapsulation.Q1EncapsulationPublicModifier;

public class EncapsulationObjectClass {
    public static void main(String[] args) {
        Q1EncapsulationPublicModifier ss = new Q1EncapsulationPublicModifier();
        System.out.println(ss.a); // public variable a can be accessed from different package and not sub class
        //System.out.println(ss.b);
        //b cannot be accessed as it is protected

        //System.out.println(ss.c);
        // c cannot be accessed as it default access modifier

        //System.out.println(ss.d);
        // private

        ss.getterName();
    }
}

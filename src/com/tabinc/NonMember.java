package com.tabinc;

public class NonMember extends Passenger {

    public NonMember(String name, int age){
        super(name, age);
    }

    @Override
    public double getDiscount() {
        if(this.getAge() > 65){
            return 0.1;
        }

        else{
            return 1;
        }
    }
}

package com.tabinc;

public class Member extends Passenger {
    private int yearsOfMembership;

    public Member(String name, int age, int yrsofmembership){
        super(name, age);
        this.yearsOfMembership = yrsofmembership;
    }

    @Override
    public double getDiscount() {
        if( yearsOfMembership >= 5 ){
            return 0.5;
        }

        else if( yearsOfMembership >= 1 && yearsOfMembership < 5 ) {
            return 0.1;
        }

        else{
            return 1;
        }
    }
}

package com.company.generics.bounds;

class Parcel<T extends Gift> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public void shipParcel() {
        if (t.getWeight() > 10)
            System.out.println("Ship by courier ABC");
        else
            System.out.println("Ship by courier XYZ");
    }
}
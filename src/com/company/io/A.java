package com.company.io;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class A extends Student {
    private String aName;
    private String aLastName;
    private int aAge;

    @Override
    public String toString() {
        return "A{" +
                "aName='" + aName + '\'' +
                ", aLastName='" + aLastName + '\'' +
                ", aAge=" + aAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        A a = (A) o;
        return aAge == a.aAge &&
                Objects.equals(aName, a.aName) &&
                Objects.equals(aLastName, a.aLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), aName, aLastName, aAge);
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaLastName() {
        return aLastName;
    }

    public void setaLastName(String aLastName) {
        this.aLastName = aLastName;
    }

    public int getaAge() {
        return aAge;
    }

    public void setaAge(int aAge) {
        this.aAge = aAge;
    }

    private void readObject(ObjectInputStream in) throws NotSerializableException {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream out) throws NotSerializableException {
        throw new NotSerializableException();
    }
}

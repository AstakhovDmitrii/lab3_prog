package com.company;

public class Followed extends Actions {
    public Followed() {
    }

    @Override
    public String toString() {
        return null;
    }

    public String FollowedTo() {
        return "неотрывно следили за фантомами";
    }

    public String NotFollowed() {
        return "не следили за фантомами";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}
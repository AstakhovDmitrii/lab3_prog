package com.company;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        GeorgeGammell G = new GeorgeGammell("George");
        Leik L = new Leik("Лейк");
        MatrosLarsen ML = new MatrosLarsen("Матрос Ларсен");
        MassMedia SMI = new MassMedia();
        See see = new See();
        new CutThrough();
        new Followed();
        Mountains mount = new Mountains();
        Plane plane = new Plane();
        Amunsden A = new Amunsden("Амундсен");
        Denfort D = new Denfort("Дэнфорт");
        AllGuys all = new AllGuys("Мы");
        Newspapers npp = new Newspapers();
        Moment moment = new Moment();
        Feelings feelings = new Feelings();
        JaggedLine JL = new JaggedLine();
        Rushed rush = new Rushed();
        IceDust id = new IceDust();
        RoseLight rl = new RoseLight();
        Wonder womnder = new Wonder();
        Permeate perm = new Permeate();
        Illuminator illum = new Illuminator();
        AdequatlyOrMadly adequatly = AdequatlyOrMadly.Adequatly;
        AdequatlyOrMadly madly = AdequatlyOrMadly.Madly;
        AheadOrBehind Ahead = AheadOrBehind.AHEAD;
        AheadOrBehind Behind = AheadOrBehind.BEHIND;
        GloomyLight gloomy = GloomyLight.GLOOMY;
        GloomyLight light = GloomyLight.LIGHT;


        G.LosePeaceAndQuiet();
        all.GandD(G.toString(), D.toString());
        all.AlldontTell();
        npp.Print();
        moment.MomentStart();
        all.CantTransfer(adequatly.getTranslation(), feelings.toString());
        ML.SeeLine(see.FirstSee(), Ahead.getTranslation(), JL.toString());
        ML.Scream(all.vse(), rush.toString(), illum.toString());
        mount.nesmotrya(plane.toString());
        mount.GrewGradually(gloomy.getTranslation());
        all.miracle(perm.toString(),womnder.toString(), rl.toString(), mount.bigMount(), id.toString());



    }
}

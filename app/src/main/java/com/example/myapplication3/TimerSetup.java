package com.example.myapplication3;

import android.widget.CheckBox;

public class TimerSetup {
    private long SUM_SPELL_CD_MILLIS;

    private static int dictionary() ss_list{"flash":300, "tp":360, "clarity":240, "heal":240, "cleanse":210,
    "exhaust":210, "barrier":180, "ghost":180, "ignite":180};

    public void hasInsight(CheckBox box){
        return box.isChecked();
    }

    private boolean hasBoots(CheckBox box){
        return box.isChecked();
    }

    private  void set_SS_CD(String ss){ //fix millisecond conversion later
        if (ss.equals("flash")) SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("tp")) SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("clarity")) SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("heal")) SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("cleanse")) SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("exhaust")) SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("barrier")) SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("ghost") SUM_SPELL_CD_MILLIS = 600000;
        if (ss.equals("ignite") SUM_SPELL_CD_MILLIS = 600000;
        if (ss.hasInsight()) SUM_SPELL_CD_MILLIS *= .05;
        if (ss.hasBoots()) SUM_SPELL_CD_MILLIS *= .1;
    }



}

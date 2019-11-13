package dev.didgeridoomh.critcheck.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class Character extends BaseObservable {
    private String name;
    private String race;
    private String type;
    private String campaign;

    private String deity;
    private String alignment;
    private String background;

    private int level;
    private int currentExp;
    private int nextLevel;

    @Bindable
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
        notifyPropertyChanged(BR.race);
    }

    @Bindable
    public String getType() { return this.type; }

    public void setType(String type) {
        this.type = type;
        notifyPropertyChanged(BR.type);
    }

    @Bindable
    public String getCampaign() { return this.campaign; }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
        notifyPropertyChanged(BR.campaign);
    }

    @Bindable
    public String getDeity() { return this.deity; }

    public void setDeity(String deity) {
        this.deity = deity;
        notifyPropertyChanged(BR.deity);
    }

    @Bindable
    public String getAlignment() { return this.alignment; }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
        notifyPropertyChanged(BR.alignment);
    }

    @Bindable
    public String getBackground() { return this.background; }

    public void setBackground(String background) {
        this.background = background;
        notifyPropertyChanged(BR.background);
    }

    @Bindable
    public int getLevel() { return this.level; }

    public void setLevel(int level) {
        this.level = level;
        notifyPropertyChanged(BR.level);
    }

    @Bindable
    public int getCurrentExp() { return this.currentExp; }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
        notifyPropertyChanged(BR.currentExp);
    }

    @Bindable
    public int getNextLevel() { return nextLevel; }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
        notifyPropertyChanged(BR.nextLevel);
    }
}

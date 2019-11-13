package dev.didgeridoomh.critcheck.models;

public class CharacterContract {
    public interface Presenter {
        void onShowInfo(Character character);
    }

    public interface View {
        void showInfo(Character character);
    }
}

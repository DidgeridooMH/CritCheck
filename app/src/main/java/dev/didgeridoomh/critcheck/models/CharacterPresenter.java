package dev.didgeridoomh.critcheck.models;

import android.content.Context;

public class CharacterPresenter implements CharacterContract.Presenter {
    private CharacterContract.View view;
    private Context context;

    public CharacterPresenter(CharacterContract.View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void onShowInfo(Character character) {
        view.showInfo(character);
    }
}

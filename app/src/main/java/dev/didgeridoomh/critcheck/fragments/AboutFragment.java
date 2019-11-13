package dev.didgeridoomh.critcheck.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import dev.didgeridoomh.critcheck.R;
import dev.didgeridoomh.critcheck.databinding.AboutFragmentBinding;
import dev.didgeridoomh.critcheck.models.Character;

public class AboutFragment extends Fragment implements View.OnClickListener {
    private Character character;

    @Nullable
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        character = new Character();
        character.setName("Rhogar");
        character.setType("Wizard");
        character.setRace("Dragonborn");
        character.setCampaign("Into the Abyss");
        character.setDeity("Aasterinian");
        character.setAlignment("Chaotic Neutral");
        character.setBackground("Sage/Apprentice");
        character.setLevel(2);
        character.setCurrentExp(801);
        character.setNextLevel(900);
    }

    public void addExperience(int exp) {
        int newExp = this.character.getCurrentExp() + exp;
        if(newExp > this.character.getNextLevel()) {
            this.character.setLevel(this.character.getLevel() + 1);
            this.character.setNextLevel(this.character.getNextLevel() + 300);
        }
        this.character.setCurrentExp(newExp);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_add_exp:
                addExperience(10);
                break;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        AboutFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.about_fragment,
                container, false);
        View view = binding.getRoot();
        binding.setCharacter(character);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button addExpButton = view.findViewById(R.id.button_add_exp);
        addExpButton.setOnClickListener(this);
    }
}

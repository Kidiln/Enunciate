package com.jcb.enunciate.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.jcb.enunciate.EnConstants;
import com.jcb.enunciate.R;
import com.jcb.enunciate.fragments.MainMenuFragment;


public class EnMainActivity extends EnBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_en_main);

        handleFragments(EnConstants.FRAG_TYPE.MAIN);
    }

    private void handleFragments(int fragmentType) {

        Fragment fr = null;
        if (fragmentType == EnConstants.FRAG_TYPE.MAIN) {
            fr = new MainMenuFragment();
        } else if (fragmentType == EnConstants.FRAG_TYPE.SETTINGS) {
            fr = new MainMenuFragment();
        } else if (fragmentType == EnConstants.FRAG_TYPE.HOWTOSPEAK) {
            fr = new MainMenuFragment();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.lnrltContainer, fr);
        fragmentTransaction.commit();

    }


}


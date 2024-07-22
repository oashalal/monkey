package com.oashalal.android;

import com.oashalal.game.App;
import com.jme3.app.AndroidHarness;

public class AndroidLauncher extends AndroidHarness {

    public AndroidLauncher() {
        appClass = App.class.getCanonicalName();
    }
}

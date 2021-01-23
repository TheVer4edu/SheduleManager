package ru.thever4.iit.shedulemanager.feature.rootwindow.control;

import ru.thever4.iit.shedulemanager.feature.rootwindow.enums.Feature;
import ru.thever4.iit.shedulemanager.feature.rootwindow.view.RootWindow;
import ru.thever4.iit.shedulemanager.model.SavedInstance;

public class RootWindowController {

    private RootWindow window;

    public RootWindowController(RootWindow window) {
        this.window = window;
        window.display();
    }

    public void saveInstance(SavedInstance instance, Feature feature) {
        //TODO
    }

    public SavedInstance getSavedInstance(Feature feature) {
        return null; //TODO
    }
}

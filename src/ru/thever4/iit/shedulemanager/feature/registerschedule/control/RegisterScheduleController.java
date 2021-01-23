package ru.thever4.iit.shedulemanager.feature.registerschedule.control;

public class RegisterScheduleController {
    private final RegisterScheduleView view;

    public RegisterScheduleController(RegisterScheduleView view) {
        this.view = view;
        view.setView();
    }
}

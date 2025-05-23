package command;

import manager.ManagementSystem;
import miscellaneous.Ui;

public class ExitCommand extends Command {

    @Override
    public void execute(ManagementSystem manager, Ui ui) {
        ui.showBye();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}

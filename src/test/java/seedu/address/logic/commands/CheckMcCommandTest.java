package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalModules.getTypicalGradPad;
import static seedu.address.testutil.TypicalModules.getTypicalTotalMc;

import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

public class CheckMcCommandTest {
    private Model model = new ModelManager(getTypicalGradPad(), new UserPrefs());
    private Model expectedModel = new ModelManager(getTypicalGradPad(), new UserPrefs());

    @Test
    public void execute_checkmc_success() {
        assertCommandSuccess(new CheckMcCommand(), model, CheckMcCommand.MESSAGE_SUCCESS
                        + getTypicalTotalMc(), expectedModel);
    }
}
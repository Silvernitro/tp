package seedu.address.logic.commands;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class RemarkCommand extends Command {
    public static final String COMMAND_WORD = "remark";
    
    public static final String MESSAGE_USAGE = COMMAND_WORD
           + ": Edits the remark of the person identified "
           + "by the index number used in the last person listing. "
           + "Existing remark will be overwritten by the input.\n"
           + "Parameters: INDEX (must be a positive integer) "
           + "r/ [REMARK]\n"
           + "Example: " + COMMAND_WORD + " 1 "
           + "r/ Likes to swim.";
    
    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "Remark command not implemented yet";
    public static final String MESSAGE_ARGUMENTS = "Index: %1$d, Remark: %2$s";
    
    private final Index targetIndex;
    private final String remark;

    public RemarkCommand(Index targetIndex, String remark) {
        requireAllNonNull(targetIndex, remark);
        
        this.targetIndex = targetIndex;
        this.remark = remark;
    }
    
    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException(String.format(MESSAGE_ARGUMENTS, targetIndex.getOneBased(), remark));
    }
    
    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }
        
        // instanceof handles nulls
        if (!(other instanceof RemarkCommand)) {
            return false;
        }
        
        // state check
        RemarkCommand e = (RemarkCommand) other;
        return targetIndex.equals(e.targetIndex)
                       && remark.equals(e.remark);
    }
}

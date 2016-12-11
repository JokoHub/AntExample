import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;

/**
 * Created by Joko on 11.12.2016.
 */
public class CustomTask extends Task {

    String message;
    @Override
    public void execute() throws BuildException {
        log("Message: " + message, Project.MSG_INFO);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
//TODO Create custom task to AntProjectExampleq
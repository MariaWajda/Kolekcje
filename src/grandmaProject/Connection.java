package grandmaProject;

import java.io.IOException;

public class Connection {

    public void whatNext() throws IOException {
        GrandmasList grandmasList = new GrandmasList();
        String list = grandmasList.readFile();
        grandmasList.splitListToArray(list);

    }
}

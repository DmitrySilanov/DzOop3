import java.util.List;

public class StreamService {

    private final List<Stream> listStreams;

    public StreamService(List<Stream> listStreams) {
        this.listStreams = listStreams;
    }

    public void sortStudentsStreamBySize() {
        listStreams.sort(new StreamComparator());
    }
}


package lambda_and_stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamOfObjectsTest {

    StreamOfObjects stream = new StreamOfObjects();

    @Test
    void search() {
        stream.search();
        stream.compareWithComparator();
    }
}
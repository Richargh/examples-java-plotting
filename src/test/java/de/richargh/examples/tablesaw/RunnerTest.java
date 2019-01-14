package de.richargh.examples.tablesaw;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class RunnerTest {

    @Test
    public void simple_script_should_() throws IOException {
        // arrange
        File file = new File(getClass().getResource("executionrun-old.csv").getFile());
        Runner runner = new Runner();

        // act
        runner.doSth(file);

        // assert
    }
}

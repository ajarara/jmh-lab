package io.ajarara.jmh;

import io.ajarara.Prufer;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.Arrays;
import java.util.Collections;

public class PruferBenchmark {

    @Benchmark
    public void pruferOfSimpleTree() {
        Prufer.of(Arrays.asList(
                0, 5, 12, 20, 17,
                14, 11, 20, 8, 13,
                22, 14, 14, 0, 15,
                14, 1, 17, 24, 16,
                19, 19, 22, 16, 0
        ));
    }
}

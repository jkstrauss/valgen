package com.github.jkstrauss;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class PrimitiveValueGeneratorTest {

    @Test
    public void shouldReturnString() {
        assertThat(1).isEqualTo(2);
    }
}

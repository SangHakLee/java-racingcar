package com.racing;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("split: `1,2` -> ['1', '2'] ")
    void split() {
        String input = "1,2";
        String[] result = stringUtil.split(input);

        assertThat(result)
            .isNotEmpty()
            .isInstanceOf(String[].class)
            .contains("1", "2")
            .containsExactly("1", "2")
        ;
    }
}
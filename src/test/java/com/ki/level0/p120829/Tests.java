package com.ki.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("70도가 입력되면 결과는 1 나와야해")
    void t1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91도가 입력되면 결과는 3 나와야해")
    void t2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("92도가 입력되면 결과는 3 나와야해")
    void t3() {
        assertThat(new Solution().solution(92)).isEqualTo(3);
    }

    @Test
    @DisplayName("180도가 입력되면 결과는 4 나와야해")
    void t4() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("90도가 입력되면 결과는 2 나와야해")
    void t5() {
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }

}

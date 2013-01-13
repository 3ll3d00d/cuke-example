package org.ell3d00d.junit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/** @author khanmat */
public class MySecondTest {
    @Test
    public void secondFirst() {

    }

    @Test
    public void secondSecond() {

    }

    @Test
    public void secondThird() {
        assertThat(true, is(false));
    }
}

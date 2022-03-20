package com.misout;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class LogTest {

    @Test
    public void test_jcl() {
        Log log = LogFactory.getLog("jcl");

        log.info("abc");
    }

}

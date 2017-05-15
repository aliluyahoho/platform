package com.epcc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.Logger;

/**
 * Unit test for simple AliaApplication.
 */
public class Log4jTest extends TestCase
{
    private static Logger logger = Logger.getLogger(Test.class);
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Log4jTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Log4jTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        // 记录debug级别的信息
        logger.debug("This is debug message.");

        // 记录warn级别的信息
        logger.warn("This is warn message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
        // 记录fatal级别的信息
        logger.fatal("This is fatal message.");

        assertTrue( true );
    }


}

package com.mkyong.core;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	
	/**
     * Rigourous Test :-), F#3, S103
     */
    public void testAppManager()
    {
        assertTrue( true );
    }
	
	
	/**
     * Increasing coverage Test :-), F#3, S24.1-103
     */
    public void testAppManager()
    {
        assertTrue( true );
    }
}

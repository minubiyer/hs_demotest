package com.mkyong.service;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PersonServiceTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PersonServiceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PersonServiceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPService()
    {
        assertTrue( true );
    }
	
    public void testAppService()
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

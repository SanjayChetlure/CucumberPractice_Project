package Hooks1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class appHooks1
{
	@Before("@sanity")
	public void before() 
	{
		System.out.println("----running before hook--->>");
	}
	
	@After("@regression")
	public void after() 
	{
		System.out.println("<<----running after hook----");
	}

}

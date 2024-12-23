package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class appHooks 
{
	@Before
	public void before() 
	{
		System.out.println("--running before hook-->>");
	}
	
	@After
	public void after() 
	{
		System.out.println("<<--running after hook--");
	}

}

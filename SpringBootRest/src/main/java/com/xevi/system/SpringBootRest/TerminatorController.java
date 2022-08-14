package com.xevi.system.SpringBootRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Terminator")
@Api(value="Terminator")
public class TerminatorController 
{
	@ApiOperation(
			value = "Sayonara, baby",
			notes = "Hasta la vista, baby")
	@RequestMapping(method = RequestMethod.POST, value = "killMe")
	public void killMe() throws Exception
	{
		System.out.println("Sayonara, baby");
		System.out.println("Hasta la vista, baby");

		new Thread(() -> 
		{
			try 
			{
				System.out.println("Killed");
				Thread.sleep(1000);
				System.exit(0);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace(System.err);
			}
		}).start();
		
	}
}

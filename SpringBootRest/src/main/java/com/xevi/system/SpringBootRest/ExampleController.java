package com.xevi.system.SpringBootRest;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * Example Rest Controller
 * @author xevi
 */
@RestController
@RequestMapping("/Example")
@Api(value="Example", description="Example Operations")
public class ExampleController 
{
	/**
	 * http://localhost:8080/Example/lastDigitOfPI
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "lastDigitOfPI")
	public Character lastDigitOfPI()
	{
		return '7';
	}

	/**
	 * http://localhost:8080/Example/getInfoServer
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.GET, value = "getInfoServer")
	public String getInfoServer() throws Exception
	{
		try
		{
			return InetAddress.getLocalHost().getHostAddress() + " " + InetAddress.getLocalHost().getCanonicalHostName();
		}
		catch(Exception e)
		{
			return System.getenv("HOSTNAME");
		}
	}
}
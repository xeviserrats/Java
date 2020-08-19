package com.xevi.system.SpringBootRest;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * http://localhost:8080/Math/lastDigitOfPI
 * @author xevi
 */
@RestController
@RequestMapping("/Math")
@Api(value="Math", description="Math Operations")
public class MathController 
{
	@RequestMapping(method = RequestMethod.GET, value = "lastDigitOfPI")
	public Character lastDigitOfPI()
	{
		return 'X';
	}

	@RequestMapping(method = RequestMethod.GET, value = "lastDigitOfPI")
	public String getInfoServer() throws Exception
	{
		return InetAddress.getLocalHost().getHostAddress() + " " + InetAddress.getLocalHost().getCanonicalHostName();
	}
}
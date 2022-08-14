package com.xevi.system.SpringBootRest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@RestController
@RequestMapping("/health")
@Api(value="health", tags = {"Health", "HealthCheck"} )
@OpenAPIDefinition()
public class HealthController 
{
	private String status = "OK";

	@ApiOperation(value = "Obtener el estado 'health'. 'OK' : estado válido.")
	@RequestMapping(method = RequestMethod.GET, value = "status")
	public String getHealthStatus()
	{
		return status;
	}

	@PostMapping(value = "/status/{status}")
	@ApiOperation(value = "Modificar el estado del 'health'.",notes = "Modificar el estado del 'health'.")
	public void setHealthStatus(
			@ApiParam(value = "Estado del servicio", required = true)
			@PathVariable("status")
			String pStatus)
	{
		status = pStatus;
	}
}

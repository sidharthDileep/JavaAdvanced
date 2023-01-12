package com.cts.microservice.microservice.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceContoller {

	/*
	 * @Autowired private DiscoveryClient discoveryClient;
	 * 
	 * @RequestMapping("/service-instances/{applicationName}") public
	 * List<ServiceInstance> serviceInstancesByApplicationName(
	 * 
	 * @PathVariable String applicationName) { return
	 * this.discoveryClient.getInstances(applicationName); }
	 */

	@GetMapping("/")
	public String message(Principal name) {
		return "Hi " + name.getName();
	}

}

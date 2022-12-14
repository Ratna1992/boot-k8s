package com.boot.k8s.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker/k8s")
public class BootK8SController {
	
	@GetMapping("/details")
	public Map<String, Object> getDetails() {

		Map<String, Object> hashMap = new LinkedHashMap<String, Object>();
		hashMap.put("name", "Ratna Srinivasa Rao Karicherla");
		hashMap.put("subject", "Docker Kubernetes");
		hashMap.put("goal", "Mastering Kubernetes with docker ....");
		hashMap.put("confidence", "***");
		return hashMap;
	}

}

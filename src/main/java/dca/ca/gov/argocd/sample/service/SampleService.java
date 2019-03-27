/**
 * 
 */
package dca.ca.gov.argocd.sample.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dca.ca.gov.argocd.sample.model.SampleRequest;
import dca.ca.gov.argocd.sample.model.SampleResponse;

/**
 * @author ISHDOAN
 *
 */
@Service
public class SampleService {
	public SampleResponse buildSamplePostResponse(SampleRequest request) {
		String requestId = request.getId();
		final String responseMessage = "This is a POST request with id = " + requestId;
		
		SampleResponse response = new SampleResponse();
		response.setRequestId(requestId);
		response.setResponseMessage(responseMessage);
		
		return response;
	}
	
	public SampleResponse buildSampleGetResponse() {
		final String requestId = "0";
		final String responseMessage = "This is a GET request";
		
		SampleResponse response = new SampleResponse();
		response.setRequestId(requestId);
		response.setResponseMessage(responseMessage);
		
		return response;
	}
	
	public SampleResponse buildSampleStackedPostResponse(SampleRequest request) {
		String requestId = request.getId();
		
		RestTemplate restTemplate = new RestTemplate();
		SampleResponse response = restTemplate.getForObject(request.getDownstreamWS(), SampleResponse.class);
		
		response.setRequestId(requestId);
		
		return response;
	}
}

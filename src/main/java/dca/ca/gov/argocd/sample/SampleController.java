/**
 * 
 */
package dca.ca.gov.argocd.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dca.ca.gov.argocd.sample.model.SampleRequest;
import dca.ca.gov.argocd.sample.model.SampleResponse;
import dca.ca.gov.argocd.sample.service.SampleService;

/**
 * @author ISHDOAN
 *
 */
@RestController
public class SampleController {
	@Autowired
	private SampleService sampleService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = { "/samplePost" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.POST }, consumes = { "application/json",
					"application/xml" }, produces = { "application/json", "application/xml" })
	public SampleResponse getSamplePostResponse(@Validated @RequestBody SampleRequest request,
			BindingResult bindingResult, @RequestHeader HttpHeaders headers) {
		logger.info("Inside POST Controller");
		SampleResponse sampleResponse = sampleService.buildSamplePostResponse(request);
		
		return sampleResponse;
	}
	
	@RequestMapping(value = { "/sampleGet" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.GET }, consumes = { "application/json",
					"application/xml" }, produces = { "application/json", "application/xml" })
	public SampleResponse getSampleGetResponse() {
		logger.info("Inside GET Controller");
		SampleResponse sampleResponse = sampleService.buildSampleGetResponse();
		
		return sampleResponse;
	}
	
	@RequestMapping(value = { "/sampleStackedPost" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.POST }, consumes = { "application/json",
					"application/xml" }, produces = { "application/json", "application/xml" })
	public SampleResponse getSampleStackedPostResponse(@Validated @RequestBody SampleRequest request,
			BindingResult bindingResult, @RequestHeader HttpHeaders headers) {
		logger.info("Inside POST Controller");
		SampleResponse sampleResponse = sampleService.buildSampleStackedPostResponse(request);
		
		return sampleResponse;
	}
}

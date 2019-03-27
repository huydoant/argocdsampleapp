/**
 * 
 */
package dca.ca.gov.argocd.sample.model;

/**
 * @author ISHDOAN
 *
 */
public class SampleRequest {
	private String id;
	private String callMultipleWS;
	private String downstreamWS;

	/**
	 * @return the downstreamWS
	 */
	public String getDownstreamWS() {
		return downstreamWS;
	}

	/**
	 * @param downstreamWS the downstreamWS to set
	 */
	public void setDownstreamWS(String downstreamWS) {
		this.downstreamWS = downstreamWS;
	}

	/**
	 * @return the callMultipleWS
	 */
	public String getCallMultipleWS() {
		return callMultipleWS;
	}

	/**
	 * @param callMultipleWS the callMultipleWS to set
	 */
	public void setCallMultipleWS(String callMultipleWS) {
		this.callMultipleWS = callMultipleWS;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}

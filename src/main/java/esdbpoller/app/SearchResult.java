package esdbpoller.app;
/**
 *
 */

import org.elasticsearch.common.unit.TimeValue;

/**
 * @author Aydan Rende, DFKI
 *
 */
public class SearchResult {
	private int totalShards;
	private float maxScore;
	private long totalHits;
	private TimeValue took;
	private long tookInMillis;
	private int successfulShard;
	private int failedShard;

	/**
	 * @return the totalShards
	 */
	public int getTotalShards() {
		return totalShards;
	}

	/**
	 * @param totalShards
	 *            the totalShards to set
	 */
	public void setTotalShards(int totalShards) {
		this.totalShards = totalShards;
	}

	/**
	 * @return the maxScore
	 */
	public float getMaxScore() {
		return maxScore;
	}

	/**
	 * @param maxScore
	 *            the maxScore to set
	 */
	public void setMaxScore(float maxScore) {
		this.maxScore = maxScore;
	}

	/**
	 * @return the totalHits
	 */
	public long getTotalHits() {
		return totalHits;
	}

	/**
	 * @param totalHits
	 *            the totalHits to set
	 */
	public void setTotalHits(long totalHits) {
		this.totalHits = totalHits;
	}

	/**
	 * @return the took
	 */
	public TimeValue getTook() {
		return took;
	}

	/**
	 * @param took
	 *            the took to set
	 */
	public void setTook(TimeValue took) {
		this.took = took;
	}

	/**
	 * @return the tookInMillis
	 */
	public long getTookInMillis() {
		return tookInMillis;
	}

	/**
	 * @param tookInMillis
	 *            the tookInMillis to set
	 */
	public void setTookInMillis(long tookInMillis) {
		this.tookInMillis = tookInMillis;
	}

	/**
	 * @return the successfulShard
	 */
	public int getSuccessfulShard() {
		return successfulShard;
	}

	/**
	 * @param successfulShard
	 *            the successfulShard to set
	 */
	public void setSuccessfulShard(int successfulShard) {
		this.successfulShard = successfulShard;
	}

	/**
	 * @return the failedShard
	 */
	public int getFailedShard() {
		return failedShard;
	}

	/**
	 * @param failedShard
	 *            the failedShard to set
	 */
	public void setFailedShard(int failedShard) {
		this.failedShard = failedShard;
	}

}

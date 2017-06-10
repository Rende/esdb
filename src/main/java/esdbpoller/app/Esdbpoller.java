package esdbpoller.app;

import org.apache.log4j.Logger;

/**
 *
 */

/**
 * @author Aydan Rende, DFKI
 *
 */
public class Esdbpoller {

	/**
	 * @param args
	 */
	public static final Logger logger = Logger.getLogger(Esdbpoller.class);

	public static void main(String[] args) {
		ElasticsearchService esService = new ElasticsearchService();
		SearchResult result;
		while (true) {
			result = esService.pollDB();
			logger.debug("Total hits: " + result.getTotalHits() + " took: "
					+ result.getTook() + " total shards: "
					+ result.getTotalShards() + " succesful shards: "
					+ result.getSuccessfulShard() + " failed shards: "
					+ result.getFailedShard());
			System.out.println("Total hits: " + result.getTotalHits()
					+ " took: " + result.getTook() + " total shards: "
					+ result.getTotalShards() + " succesful shards: "
					+ result.getSuccessfulShard() + " failed shards: "
					+ result.getFailedShard());
			try {
				Thread.sleep(10 * // seconds to a minute
				1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

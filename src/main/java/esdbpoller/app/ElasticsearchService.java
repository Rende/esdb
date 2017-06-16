package esdbpoller.app;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import esdbpoller.util.preferences.Config;

/**
 *
 */

/**
 * @author Aydan Rende, DFKI
 *
 */
public class ElasticsearchService {
	Client client;
	String allField = "_all";

	public void setClient() {
		Settings settings = Settings
				.settingsBuilder()
				.put(Config.CLUSTER_NAME,
						Config.getInstance().getString(Config.CLUSTER_NAME))
				.build();

		try {
			client = TransportClient
					.builder()
					.settings(settings)
					.build()
					.addTransportAddress(
							new InetSocketTransportAddress(InetAddress
									.getByName(Config.getInstance().getString(
											Config.HOST)), Config.getInstance()
									.getInt(Config.PORT)));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

	public Client getInstance() {
		if (client == null) {
			setClient();
		}
		return client;
	}

	public SearchResult pollDB() {

		SearchResult result = new SearchResult();
		try {
			SearchResponse response = getInstance().prepareSearch(allField)
					.setSize(0).execute().actionGet();

			result.setTotalHits(response.getHits().totalHits());
			result.setTookInMillis(result.getTookInMillis());
			result.setSuccessfulShard(result.getSuccessfulShard());
			result.setFailedShard(result.getFailedShard());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Esdbpoller.logger.error("pollDB method: " + e.getMessage());
		}

		return result;
	}

}

/**
 *
 */
package esdbpoller.util.preferences;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author Aydan Rende, DFKI
 *
 */
public class Config {

	public static final String HOST = "host";
	public static final String PORT = "port";
	public static final String ELASTICSEARCH_INDEX = "elasticsearch.index";
	public static final String ELASTICSEARCH_TYPE = "elasticsearch.type";
	public static final String CLUSTER_NAME = "cluster.name";
	public static final String LOCALHOST = "localhost";
	public static final String USUAL_CLUSTER_NAME = "usualcluster.name";
	private static PropertiesConfiguration config;

	private Config() {

	}

	private static void loadProps() {
		try {
			config = new PropertiesConfiguration("config.properties");
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

	public static PropertiesConfiguration getInstance() {

		if (config == null) {
			loadProps();
		}
		return config;
	}
}

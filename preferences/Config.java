/**
 *
 */
package dfki.vaadinui.util.preferences;

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
	public static final String MULTIQUERY_PARAM1 = "multiquery.param1";
	public static final String MULTIQUERY_PARAM2 = "multiquery.param2";
	public static final String FIELDSORT_PARAM = "fieldsort.param";
	public static final String FIELD_URL = "url";
	public static final String FIELD_TITLE = "title";
	public static final String FIELD_SENTENCE = "sentence";
	public static final String FIELD_INDEX = "index";
	public static final String FUZZINESS_PREFIX = "fuzziness.prefix";
	public static final String SEARCH_INPUT_PROMPT = "Search by keywords";

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

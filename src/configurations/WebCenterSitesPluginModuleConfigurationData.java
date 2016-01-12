package configurations;

import java.util.HashMap;

/**
 * Created by NB20308 on 28/12/2015.
 */
public class WebCenterSitesPluginModuleConfigurationData {

    public static String workspace;
    public static String username;
    public static String password;
    public static String port;
    public static String host;
    public static String contextPath;
    public static String dataStoreName;
    private static String webContextPath;
    private static String moduleName;
    private static boolean pluginActive;
    private static boolean configValid;
    private static String instance;

    public static HashMap<String, String> processInstanceString(String instance) {
        HashMap<String, String> hashMap = new HashMap<>();
        if(instance.toLowerCase().startsWith("http://") ){
            String _aux=instance.replace("http://","");
            String[] splittedByDots = _aux.split(":");
            String[] splittedByBar= splittedByDots[1].split("/");
            hashMap.put("host", splittedByDots[0]);
            hashMap.put("port", splittedByBar[0]);
            hashMap.put("webcontextpath", splittedByBar[1]);

        }else if (instance.toLowerCase().startsWith("https://")){
            String _aux=instance.replace("https://","");
            String[] splittedByDots = _aux.split(":");
            String[] splittedByBar= splittedByDots[1].split("/");
            hashMap.put("host", splittedByDots[0]);
            hashMap.put("port", splittedByBar[0]);
            hashMap.put("webcontextpath", splittedByBar[1]);
        }
        return hashMap;
    }

    public static String getWorkspace() {
        return workspace;
    }

    public static void setWorkspace(String workspace) {
        WebCenterSitesPluginModuleConfigurationData.workspace = workspace;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        WebCenterSitesPluginModuleConfigurationData.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        WebCenterSitesPluginModuleConfigurationData.password = password;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        WebCenterSitesPluginModuleConfigurationData.port = port;
    }

    public static String getHostName() {
        return host;
    }

    public static void setHost(String host) {
        WebCenterSitesPluginModuleConfigurationData.host = host;
    }

    public static String getSitesContextPath() {
        return contextPath;
    }

    public static void setContextPath(String contextPath) {
        WebCenterSitesPluginModuleConfigurationData.contextPath = contextPath;
    }

    public static String getDataStoreName() {
        return dataStoreName;
    }

    public static void setDataStoreName(String dataStoreName) {
        WebCenterSitesPluginModuleConfigurationData.dataStoreName = dataStoreName;
    }

    public static String getWebContextPath() {
        return webContextPath;
    }

    public static void setWebContextPath(String webContextPath) {
        WebCenterSitesPluginModuleConfigurationData.webContextPath = webContextPath;
    }

    public static String getModuleName() {
        return moduleName;
    }

    public static void setModuleName(String moduleName) {
        WebCenterSitesPluginModuleConfigurationData.moduleName = moduleName;
    }

    public static String getInstance() {
        return instance;
    }

    public static void setInstance(String instance) {
        HashMap<String, String> processedInstanceString = processInstanceString(instance);
        setHost(processedInstanceString.get("host"));
        setPort(processedInstanceString.get("port"));
        setWebContextPath(processedInstanceString.get("webcontextpath"));
        WebCenterSitesPluginModuleConfigurationData.instance = instance;

    }

    public static boolean isPluginActive() {
        return pluginActive;
    }

    public static void setPluginActive(boolean pluginActive) {
        WebCenterSitesPluginModuleConfigurationData.pluginActive = pluginActive;
    }

    public static boolean isConfigValid() {
        return configValid;
    }

    public static void setConfigValid(boolean configValid) {
        WebCenterSitesPluginModuleConfigurationData.configValid = configValid;
    }
}

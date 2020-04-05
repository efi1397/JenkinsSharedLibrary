@Singleton(strict = false)
class ProjectConfiguration {
    // public
    Map config

    ProjectConfiguration() {
        // defaultConfigurationArgs
        config = [
                build  : "buildArgs",
                test   : "testArgs",
                timeout: 10
        ]
    }

    // Single arg
    void loadArgs(String key, Object value) {
        config.put(key, value)
    }

    // Multi args - overWrite default configuration
    void loadArgs(Map arguments) {
        config = config.plus(arguments)
    }

    boolean isExists(key) {
        if (config[key])
            return true
        return false
    }
}
def call() {
    def scmDetails = checkout([$class: 'GitSCM', branches: [[name: 'dev']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/efi1397/JenkinsSharedLibrary.git']]])
    println(scmDetails.toString())
}
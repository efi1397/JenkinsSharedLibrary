def call(serverLabel) {
    def label = serverLabel ?: "windows"
    node(label) {
        //def scmVars = checkout scm
        def scmVars = checkout([$class: 'GitSCM', branches: [[name: '*/dev']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'fa992e88-b598-4c23-ad84-5126a3ad39f1', url: 'https://gitlab.com/Cmenow/jenkinssharedlibrary.git']]])
        println(scmVars.toString())
    }
}

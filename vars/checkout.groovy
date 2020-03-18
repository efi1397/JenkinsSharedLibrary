def call() {
    node('windows') {
        echo("checkout: ")
        def scmDetails = checkout([$class: 'GitSCM', branches: [[name: '*/dev']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'fa992e88-b598-4c23-ad84-5126a3ad39f1', url: 'https://gitlab.com/Cmenow/jenkinssharedlibrary.git']]])
        echo(scmDetails.toString())
    }
}

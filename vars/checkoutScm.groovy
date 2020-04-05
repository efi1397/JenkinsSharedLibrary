def call() {
    node('windows') {
        echo("checkout: ")
        def scmDetails = checkout scm
        echo(scm.toString())
        echo(scmDetails.toString())
        return scmDetails
    }
}
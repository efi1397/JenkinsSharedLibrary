def call() {
    node('windows') {
        echo("checkout: ")
        def scmDetails = checkout scm
        echo(scmDetails.toString())
    }
}

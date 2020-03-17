def call() {
    node {
        def scm = checkout.call()
        echo(scm.toString())
    }
}

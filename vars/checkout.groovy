def call(serverLabel) {
    def label = serverLabel ?: "windows"
    node(label) {
        def scmVars = checkout scm
        println(scmVars.toString())
    }
}

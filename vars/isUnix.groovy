def call(serverLabel) {
    def label = serverLabel ?: "windows"
    node(label){
        isUnix()
            return true
        return false
    }
}

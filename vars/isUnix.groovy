def call(serverLabel) {
    def label = serverLabel ?: "windows"
    node(label){
        if(isUnix())
            return true
        return false
    }
}

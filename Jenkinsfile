library "JenkinsSharedLibrary@${env.BRANCH_NAME}"

println(ProjectConfiguration.instance.config.toString())
def myArgs = [build:"newBuildArgs", moreDetails: "newDetails"]
ProjectConfiguration.instance.loadArgs(myArgs)
println(ProjectConfiguration.instance.config.toString())
ProjectConfiguration.instance.loadArgs("singleArg", "singleArg")
println(ProjectConfiguration.instance.config.toString())
println(ProjectConfiguration.instance.isExists('singleArg'))
println(ProjectConfiguration.instance.isExists('singled'))

node('windows'){
    git branch: env.BRANCH_NAME, url: 'https://github.com/efi1397/JenkinsSharedLibrary.git'
    bat script: 'gradlew test'
    cleanWs()
    
}
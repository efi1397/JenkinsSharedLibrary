def jenkinsLibrary = "JenkinsSharedLibrary@${env.BRANCH_NAME}"
echo(jenkinsLibrary) 

@Library(jenkinsLibrary) _

node('windows'){
    git branch: env.BRANCH_NAME, url: 'https://github.com/efi1397/JenkinsSharedLibrary.git'
    bat script: 'gradlew test'
    cleanWs()
    
}
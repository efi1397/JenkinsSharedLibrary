@Library('JenkinsSharedLibrary@feature-create_test') _

node('windows'){
    git branch: env.BRANCH_NAME, url: 'https://github.com/efi1397/JenkinsSharedLibrary.git'
    bat script: 'gradlew test'
    cleanWs()
    
}
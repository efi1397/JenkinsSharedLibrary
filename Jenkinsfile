library "JenkinsSharedLibrary@${env.BRANCH_NAME}"

podTemplate(
  containers: [
    containerTemplate(name: 'jnlp',image: 'jenkinsci/jnlp-slave:3.10-1-alpine',args: '${computer.jnlpmac} ${computer.name}'),
    containerTemplate(name: 'gradle', image: 'gradle:latest', ttyEnabled: true, command: 'cat')
  ])
{
    node(POD_LABEL) {
        stage('Run shell') {
          container('jnlp') {
              git branch: env.BRANCH_NAME, url: 'https://github.com/efi1397/JenkinsSharedLibrary.git'
          }
          container('gradle') {
              def gradlew = findFiles excludes: '', glob: '**/gradlew'
              gradlew = gradlew[0]
              sh "chmod +x $gradlew"
              sh "./${gradlew} test"
              def xmlReports = findFiles excludes: '', glob: '**/TEST*'
              echo "$xmlReports"
              for (test in xmlReports){
                  junit "$test"
              }
          }
        }
    }
}

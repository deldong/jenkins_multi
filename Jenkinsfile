node(){

    def mvnHome
    stage("SCM"){
        git "https://github.com/deldong/helloworld.git"
        mvnHome = tool 'mvn'
    }
    stage("Build&Test"){
        sh "${mvnHome}/bin/mvn clean test"
    }
    stage("Mail Notification"){
        mail bcc: '', body: 'just test', cc: '', from: 'noreply@xueqiu.com', replyTo: '', subject: 'Test pipeline', to: 'dongzheng@xueqiu.com'
    }

}

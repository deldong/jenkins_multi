node(){

    stage("SCM"){
        git "https://github.com/deldong/helloworld.git"
    }
    stage("Mail Notification"){
        mail bcc: '', body: 'just test', cc: '', from: '', replyTo: '', subject: 'Test pipeline', to: 'dongzheng@xueqiu.com'
    }

}

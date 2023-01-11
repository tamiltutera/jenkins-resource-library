def call(Map config=[:]){
    loadLinuxScript(name: "hello-world.sh"
    sh "sh ./hello-world.sh ${config.name} ${config.monthOfTheYear}"
}

def call() {   
     // Define mvn cmd to be executed
    //  def mavenCommand = 'mvn package -DskipTests=true'      
    // // Execute mvn cmd in sh
    //  sh script: mavenCommand, returnStatus: true
sh 'mvn package -DskipTests=true'  
}

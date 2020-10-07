node {
      stage('init') {
        checkout scm
      }
      stage('build') {
        sh 'mvn -f service/pom.xml clean package'
      }
      stage('deploy') {
        withCredentials([azureServicePrincipal('azure_service_principal')]) {
          // login to Azure
          sh '''
            az login --service-principal -u $AZURE_CLIENT_ID -p $AZURE_CLIENT_SECRET -t $AZURE_TENANT_ID
            az account set -s $AZURE_SUBSCRIPTION_ID
          '''  
          // Set default resource group name and service name. Replace <resource group name> and <service name> with the right values
          sh 'az configure --defaults group=kroger-rg'
          sh 'az configure --defaults spring-cloud=service-kr'
          // Deploy applications
          sh 'az spring-cloud app deploy -n service --jar-path ./service/target/b2b-3PO-service-1.0-SNAPSHOT.jar'
          sh 'az logout'
        }
      }
      stage('2e2 test') {
        sh 'mvn -f e2e/pom.xml clean verify'
      }
    }

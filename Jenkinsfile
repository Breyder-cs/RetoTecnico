import java.text.SimpleDateFormat
import java.util.Date

pipeline {

  agent { label 'slave_continuous' }

  options{
	    sendSplunkConsoleLog()
	    splunkinsJobOption enableDiagram: true
	    skipDefaultCheckout()
    }

  environment {
    SCM_URL = "https://vostpmde37.proteccion.com.co:10443/CALCULOS_PENSIONALES_DEV/prv-cpr-calculos-web-frontend-certificacion.git"
    SCM_CREDENTIALS = "Master_User"; //Credenciales
    SCM_BRANCH = "certification"; //Rama git
  }



  stages {
    stage('Obtener fuentes'){
      steps{
        sh "git config --global --replace-all http.sslVerify false";
        checkout scm:([$class: 'GitSCM', branches: [[name: "${SCM_BRANCH}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: "${SCM_CREDENTIALS}", url: "${SCM_URL}"]]]);
      }
    }

    stage('Ejecutar pruebas'){
      steps{
       script {
             withCredentials([usernamePassword(credentialsId: 'Artifactory-reader', usernameVariable: 'ARTIFACTORY_USER', passwordVariable: 'ARTIFACTORY_PWD')])
             {
          catchError{
                echo "RUNNING CLEAN"
                sh "pwd"
                sh "chmod +x ./src/test/resources/driver/chromedriverLinux"
                sh "chmod +x gradlew"               
                echo "RUNNING TEST"
                sh "./gradlew clean test --info"
                script {
                  currentBuild.result = 'SUCCESS'
                }
                echo "El resultado de la prueba es : '${currentBuild.result}'"
            }
        }
      }
    }
}

  }
}



def buildApp(){
      echo 'building app'
			echo " User env variable : ${something}"
			
}

def testApp(){
          echo 'testing app'
			    echo "Branch name: ${GIT_BRANCH}"
			    input('CONTINUE?')
			    echo "${secret}"
}

def deployApp(){
   echo 'deploying app'
  echo "Deploying Version: ${params.VERSION}"
}

return this

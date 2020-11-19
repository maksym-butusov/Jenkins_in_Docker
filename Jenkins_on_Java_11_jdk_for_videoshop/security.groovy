#!groovy

import jenkins.model.*
import hudson.util.*;
import jenkins.install.*;
import hudson.security.*



def instance = Jenkins.getInstance()

def hudsonRealm = new HudsonPrivateSecurityRealm(false)

hudsonRealm.createAccount("admin","admin")
instance.setSecurityRealm(hudsonRealm)
instance.save()



instance.setInstallState(InstallState.INITIAL_SETUP_COMPLETED)



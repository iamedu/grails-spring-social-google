package grails.plugins.springsocial.google

import org.springframework.social.google.api.Google

class SpringSocialGoogleController {
  def google
  def connectionRepository

  def beforeInterceptor = [action: this.&auth, except: 'login']

  def index = {
    def model = ["profile": google.plusOperations().getGoogleProfile()]
    render(view: "/springsocial/google/index", model: model)
  }

  def login = {
    render(view: pluginConfig.page.connect)
  }

  def auth() {
    if (!isConnected()) {
      redirect(action: 'login')
      return false
    }   
  }

  Boolean isConnected() {
    connectionRepository.findPrimaryConnection(Google)
  }

}

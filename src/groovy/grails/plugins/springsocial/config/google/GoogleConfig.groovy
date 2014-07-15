package grails.plugins.springsocial.config.twitter

import javax.inject.Inject
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.social.connect.ConnectionFactory
import org.springframework.social.connect.ConnectionRepository
import org.springframework.social.google.api.Google
import org.springframework.social.google.api.impl.GoogleTemplate
import org.springframework.social.google.connect.GoogleConnectionFactory
import org.springframework.util.Assert

import org.grails.plugin.platform.config.PluginConfiguration

@Configuration
class GoogleConfig {
  @Inject
  ConnectionRepository connectionRepository

  @Inject
  PluginConfiguration pluginConfiguration

  @Bean
  ConnectionFactory googleConnectionFactory() {
    println "Configuring SpringSocial Google"
    // def twitterConfig = SpringSocialTwitterUtils.config.twitter
    ConfigObject googleConfig = pluginConfiguration.getPluginConfig("springSocialGoogle")
    String consumerKey = googleConfig.consumerKey ?: ""
    String consumerSecret = googleConfig.consumerSecret ?: ""
    Assert.hasText(consumerKey, "The Google consumerKey is necessary, please add to the Config.groovy as follows: plugin.springSocialGoogle.consumerKey ='yourConsumerKey'")
    Assert.hasText(consumerSecret, "The Google consumerSecret is necessary, please add to the Config.groovy as follows: plugin.springSocialGoogle.consumerSecret='yourConsumerSecret'")
    new GoogleConnectionFactory(consumerKey, consumerSecret)
  }

  @Bean
  @Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
  Google google() {
    def google = connectionRepository.findPrimaryConnection(Google)
    google != null ? google.getApi() : new GoogleTemplate()
  }

}

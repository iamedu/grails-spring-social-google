class SpringSocialGoogleGrailsPlugin {
    // the plugin version
    def version = "0.1.0-SNAPSHOT"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.3 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Spring Social Google Plugin" // Headline display name of the plugin
    def author = "Eduardo Diaz"
    def authorEmail = "iamedu@gmail.com"
    def description = '''\
Brief summary/description of the plugin.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/spring-social-google"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
//    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithSpring = {
      xmlns context: "http://www.springframework.org/schema/context"
      context.'component-scan'('base-package': "grails.plugins.springsocial.config.google")
    }

    def doWithConfig = { config ->
      springSocialGoogle {
        page.connect = "/springsocial/google/connect"
        page.connectedHome = "/springSocialGoogle/index"
        page.profile = "/springSocialGoogle/index"
        page.timeLine = "/springsocial/google/timeline"
        page.profiles = "/springsocial/google/profiles"
        page.directMessages = "/springsocial/google/messages"
        page.trends = "/springsocial/google/trends"
        page.deniedHome = "/springSocialGoogle/login"
      }
      def doWithConfigOptions = {
        clientId(type: String)
        clientSecret(type: String)
      }
    }
}

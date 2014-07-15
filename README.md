Spring Social Google Grails Plugin
==================================

Getting Started
-------------------------

### Installation

You can install this plugin in one of two ways:

1) Install the plugin by running the install-plugin command. In addition to installing the spring-social-googlet plugin, you need to install both the spring-social-core plugin

        grails install-plugin spring-social-core
        grails install-plugin spring-social-google

OR

2) Add *compile ":spring-social-core:0.2.0.BUILD-SNAPSHOT"* and *compile ":spring-social-google:0.1.0"* to your BuildConfig.groovy file's *plugins* bloc in the conf directory. _You probably have to change the version value to match this plugin's current version._

        plugins {
                compile ":spring-social-core:0.2.0.BUILD-SNAPSHOT"
        compile ":spring-social-google:0.1.0-SNAPSHOT"
    }

### Configuration

Add your Google web browser public key and secret to the Config.groovy file in the conf directory.

    plugin.springsocialGoogle.consumerKey='googleconsumerkey'
    plugin.springsocialGoogle.consumerSecret='googlesecret'

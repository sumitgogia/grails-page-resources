import org.grails.plugin.resources.page.PageResourcesInterceptor

class PageResourcesGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "1.3 > *"
    def dependsOn = [resources: "1.2-RC1"]
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Page Resources Plugin"
    def author = "David M. Carr"
    def authorEmail = "david@carrclan.us"
    def description = '''\
Enhances the resources plugin by allowing for creation of "page" resource modules using convention over configuration.
'''

    def documentation = "http://grails.org/plugin/page-resources"

    def license = "APACHE"

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.grails-plugins.codehaus.org/browse/grails-plugins/" ]

    def doWithSpring = {
        pageResourcesInterceptor(PageResourcesInterceptor)
    }
}
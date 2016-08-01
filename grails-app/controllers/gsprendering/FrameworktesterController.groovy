package gsprendering

class FrameworktesterController {

    def index() {
        render view: 'maintestpage'
    }

    //doesn't work, below worked on grails 2.3.11 and grails 1.3.7
    def testpageA() {
        request.pageTitle = "Page A"
    }

    //works
    def testpageB() {}

    //works
    def testpageC() {
        request.pageTitle = "Page C"
        render view: 'testPageC'
    }

    //work around could be adding [:] to end
}

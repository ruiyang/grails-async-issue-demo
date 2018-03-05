package demo332

import static grails.async.Promises.*
import grails.async.PromiseList

class HelloWorldController {

    def index() {
        def (domainChangeActions) = getTasks("abc").get()
        log.info(domainChangeActions)
        render view: "index.gsp", model: [id: domainChangeActions]
    }

    private PromiseList getTasks(eventType)
	  {
		    def tasks = new PromiseList()
		    def getDomainChangeActions = { getDomainChangeActions() }
			  tasks << getDomainChangeActions
		    tasks
	  }


	  private def getDomainChangeActions(){
        params.id
	  }


}

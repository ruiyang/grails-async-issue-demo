# Grails Upgrading - Async Issue
This is a demo project to demonstrate different async behavior between grails 2.5.4 and grails 3.3.2.
Please have SDKMAN installed and then install both grails 2.5.4 and 3.3.2 version.

To reproduce:
- Open a terminal
- run `sdkman use grails 2.5.4`
- `cd demo254`
- `grails -Dserver.port=8888 run-app`

it will start the app. And then navigate to 'http://localhost:8888/demo254/helloWorld?id=123'. You will see that the query param '123' is showed in the page.

- Open a terminal
- run `sdkman use grails 3.3.2`
- `cd demo332`
- `grails run-app`

it will start the app. And then navigate to http://localhost:8068/helloWorld?id=123. You will see a page with exceptions.

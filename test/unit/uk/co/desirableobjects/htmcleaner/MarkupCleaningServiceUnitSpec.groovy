package uk.co.desirableobjects.htmcleaner

import grails.plugin.spock.UnitSpec

public class MarkupCleaningServiceUnitSpec extends UnitSpec {

    MarkupCleaningService markupCleaningService = new MarkupCleaningService()

    void 'Cleaning service parses and cleans html snippet correctly'() {

        when:
            String output = markupCleaningService.cleanHtml(snippet)

        then:
            output.replaceAll('\n', '') == expectedOutput

        where:
            snippet                                               | expectedOutput
            '<html><head><body><body><h1 /><h2>Title</h3></body>' | '<?xml version="1.0" encoding="utf-8"?><html><head></head><body><h1></h1><h2>Title</h2></body></html>'

    }

    void 'Cleaning service parses and cleans xml snippet correctly'() {

        when:
            String output = markupCleaningService.cleanXml(snippet)

        then:
            output.replaceAll('\n', '') == expectedOutput

        where:
            snippet                                          | expectedOutput
            '<a><little</person><messed><>this</up>'         | ''

    }


}

package uk.co.desirableobjects.htmcleaner.markup

import spock.lang.Unroll
import grails.plugin.spock.UnitSpec
import static uk.co.desirableobjects.htmcleaner.markup.MarkupType.*
import org.htmlcleaner.XmlSerializer

class ToolsProviderUnitSpec extends UnitSpec {

    @Unroll("Cleaner of type")
    def test0() {

        given:
            ToolsProvider provider = ToolsProvider.toolsFor(markupType)

        then:
            provider.class == toolsProviderType

        where:
            markupType  | toolsProviderType
            XML         | XmlToolsProvider
            HTML        | HtmlToolsProvider

    }

}

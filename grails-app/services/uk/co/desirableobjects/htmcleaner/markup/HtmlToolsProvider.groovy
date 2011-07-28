package uk.co.desirableobjects.htmcleaner.markup

import org.htmlcleaner.SimpleHtmlSerializer
import org.htmlcleaner.CleanerProperties
import org.htmlcleaner.HtmlCleaner
import org.htmlcleaner.Serializer

class HtmlToolsProvider implements ToolsProvider {

    @Override
    def getCleaner() {
        return new HtmlCleaner()
    }

    @Override
    Serializer getSerializer(CleanerProperties properties) {
        new SimpleHtmlSerializer(properties)
    }


}

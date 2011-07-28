package uk.co.desirableobjects.htmcleaner.markup

import org.htmlcleaner.CleanerProperties
import org.htmlcleaner.Serializer

interface ToolsProvider {

    private MarkupType markupType

    getCleaner()

    Serializer getSerializer(CleanerProperties properties)

}

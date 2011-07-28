package uk.co.desirableobjects.htmcleaner

import org.apache.commons.lang.NotImplementedException
import org.htmlcleaner.HtmlCleaner
import org.htmlcleaner.CleanerProperties
import org.htmlcleaner.TagNode
import org.htmlcleaner.XPather
import org.htmlcleaner.XmlSerializer
import org.htmlcleaner.SimpleXmlSerializer
import org.htmlcleaner.HtmlSerializer
import org.htmlcleaner.SimpleHtmlSerializer
import org.htmlcleaner.Serializer

class MarkupCleaningService {

    String clean(URL url) {

        throw new NotImplementedException()

    }

    String cleanHtml(String html) {

        HtmlCleaner cleaner = new HtmlCleaner()
        HtmlSerializer serializer = new SimpleHtmlSerializer(props)
        clean(html, serializer)
    }

    String cleanXml(String xml) {

    }

    private String clean(String markup, Serializer serializer) {

        CleanerProperties props = cleaner.properties
        props.setTranslateSpecialEntities(true)

        TagNode node = cleaner.clean(markup)

        return serialize(node, props)

    }

    private String serialize(TagNode node, CleanerProperties props) {

        StringWriter captured = new StringWriter()
        serializer.write(node, captured, 'utf-8')

        return serializer.toString()

    }

}

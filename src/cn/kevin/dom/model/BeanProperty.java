package cn.kevin.dom.model;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import org.jetbrains.annotations.NotNull;

/**
 * @author yongkang.zhang
 */
public interface BeanProperty extends DomElement {

    @NotNull
    @Attribute("name")
    public GenericAttributeValue<String> getName();

    @NotNull
    @Attribute("value")
    public GenericAttributeValue<String> getValue();
}


package gex.newsml.v12;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;

import lombok.ToString;

/**
 * A container for news objects, used to identify the role of news objects in
 * relation to one another, and to ascribe metadata to them. The Essential
 * attribute indicates whether the provider considers that this NewsComponent is
 * essential to the meaning of the NewsComponent within which it is contained.
 * The EquivalentsList attribute indicates whether or not the NewsItems or
 * NewsItemRefs, NewsComponents or ContentItems contained within this one are
 * equivalent to one another in content and/or meaning
 * 
 * <p>
 * Java class for NewsComponentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="NewsComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *         &lt;element name="TopicSet" type="{http://iptc.org/std/NewsML/2003-10-10/}TopicSetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Role" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BasisForChoice" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                 &lt;attribute name="Rank" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NewsLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;sequence>
 *                     &lt;element name="HeadLine">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                             &lt;/choice>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="SubHeadLine" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                             &lt;/choice>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element name="ByLine">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                             &lt;/choice>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ByLineTitle" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                             &lt;/choice>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;element name="DateLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                           &lt;/choice>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CreditLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                           &lt;/choice>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CopyrightLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                           &lt;/choice>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RightsLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                           &lt;/choice>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SeriesLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                           &lt;/choice>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SlugLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                           &lt;/choice>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="KeywordLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                           &lt;/choice>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NewsLine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NewsLineType">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NewsLineText" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdministrativeMetadata" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *                   &lt;element name="FileName" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SystemIdentifier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Provider" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Creator" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
 *                             &lt;element name="Contribution" type="{http://iptc.org/std/NewsML/2003-10-10/}ContributionType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Source" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Contributor" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
 *                             &lt;element name="Contribution" type="{http://iptc.org/std/NewsML/2003-10-10/}ContributionType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RightsMetadata" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *                   &lt;element name="Copyright" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="CopyrightHolder">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CopyrightDate">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UsageRights" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UsageType" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Geography" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RightsHolder" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Limitations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="StartDate" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EndDate" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DescriptiveMetadata" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *                   &lt;element name="Language" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Genre" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SubjectCode" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;choice>
 *                               &lt;element name="Subject">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="SubjectMatter">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="SubjectDetail">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                             &lt;element name="SubjectQualifier" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OfInterestTo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Relevance" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DateLineDate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDate">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TopicOccurrence" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                           &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Metadata" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *                   &lt;element name="MetadataType">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element name="NewsItem" type="{http://iptc.org/std/NewsML/2003-10-10/}NewsItemType"/>
 *             &lt;element name="NewsItemRef">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                     &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/choice>
 *           &lt;element name="NewsComponent" type="{http://iptc.org/std/NewsML/2003-10-10/}NewsComponentType" maxOccurs="unbounded"/>
 *           &lt;element name="ContentItem" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *                     &lt;element name="MediaType" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Format" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="MimeType" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Notation" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Characteristics" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="SizeInBytes" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;simpleContent>
 *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                                       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;/extension>
 *                                   &lt;/simpleContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}data"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                   &lt;attribute name="Href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *       &lt;attribute name="Essential" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EquivalentsList" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsComponentType", propOrder = { "comment", "catalog", "topicSet", "role", "basisForChoice",
		"newsLines", "administrativeMetadata", "rightsMetadata", "descriptiveMetadata", "metadata",
		"newsItemOrNewsItemRef", "newsComponent", "contentItem" })
@ToString
public class NewsComponentType {

	@XmlElement(name = "Comment")
	protected List<CommentType> comment;
	@XmlElement(name = "Catalog")
	protected CatalogType catalog;
	@XmlElement(name = "TopicSet")
	protected List<TopicSetType> topicSet;
	@XmlElement(name = "Role")
	protected NewsComponentType.Role role;
	@XmlElement(name = "BasisForChoice")
	protected List<NewsComponentType.BasisForChoice> basisForChoice;
	@XmlElement(name = "NewsLines")
	protected NewsComponentType.NewsLines newsLines;
	@XmlElement(name = "AdministrativeMetadata")
	protected NewsComponentType.AdministrativeMetadata administrativeMetadata;
	@XmlElement(name = "RightsMetadata")
	protected NewsComponentType.RightsMetadata rightsMetadata;
	@XmlElement(name = "DescriptiveMetadata")
	protected NewsComponentType.DescriptiveMetadata descriptiveMetadata;
	@XmlElement(name = "Metadata")
	protected List<NewsComponentType.Metadata> metadata;
	@XmlElements({ @XmlElement(name = "NewsItem", type = NewsItemType.class),
			@XmlElement(name = "NewsItemRef", type = NewsComponentType.NewsItemRef.class) })
	protected List<Object> newsItemOrNewsItemRef;
	@XmlElement(name = "NewsComponent")
	protected List<NewsComponentType> newsComponent;
	@XmlElement(name = "ContentItem")
	protected List<NewsComponentType.ContentItem> contentItem;
	@XmlAttribute(name = "Essential")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String essential;
	@XmlAttribute(name = "EquivalentsList")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String equivalentsList;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "language")
	protected String lang;
	@XmlAttribute(name = "Duid")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String duid;
	@XmlAttribute(name = "Euid")
	protected String euid;

	/**
	 * Gets the value of the comment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the comment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getComment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CommentType }
	 * 
	 * 
	 */
	public List<CommentType> getComment() {
		if (comment == null) {
			comment = new ArrayList<CommentType>();
		}
		return this.comment;
	}

	/**
	 * Gets the value of the catalog property.
	 * 
	 * @return possible object is {@link CatalogType }
	 * 
	 */
	public CatalogType getCatalog() {
		return catalog;
	}

	/**
	 * Sets the value of the catalog property.
	 * 
	 * @param value
	 *            allowed object is {@link CatalogType }
	 * 
	 */
	public void setCatalog(CatalogType value) {
		this.catalog = value;
	}

	/**
	 * Gets the value of the topicSet property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the topicSet property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTopicSet().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TopicSetType }
	 * 
	 * 
	 */
	public List<TopicSetType> getTopicSet() {
		if (topicSet == null) {
			topicSet = new ArrayList<TopicSetType>();
		}
		return this.topicSet;
	}

	/**
	 * Gets the value of the role property.
	 * 
	 * @return possible object is {@link NewsComponentType.Role }
	 * 
	 */
	public NewsComponentType.Role getRole() {
		return role;
	}

	/**
	 * Sets the value of the role property.
	 * 
	 * @param value
	 *            allowed object is {@link NewsComponentType.Role }
	 * 
	 */
	public void setRole(NewsComponentType.Role value) {
		this.role = value;
	}

	/**
	 * Gets the value of the basisForChoice property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the basisForChoice property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBasisForChoice().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link NewsComponentType.BasisForChoice }
	 * 
	 * 
	 */
	public List<NewsComponentType.BasisForChoice> getBasisForChoice() {
		if (basisForChoice == null) {
			basisForChoice = new ArrayList<NewsComponentType.BasisForChoice>();
		}
		return this.basisForChoice;
	}

	/**
	 * Gets the value of the newsLines property.
	 * 
	 * @return possible object is {@link NewsComponentType.NewsLines }
	 * 
	 */
	public NewsComponentType.NewsLines getNewsLines() {
		return newsLines;
	}

	/**
	 * Sets the value of the newsLines property.
	 * 
	 * @param value
	 *            allowed object is {@link NewsComponentType.NewsLines }
	 * 
	 */
	public void setNewsLines(NewsComponentType.NewsLines value) {
		this.newsLines = value;
	}

	/**
	 * Gets the value of the administrativeMetadata property.
	 * 
	 * @return possible object is
	 *         {@link NewsComponentType.AdministrativeMetadata }
	 * 
	 */
	public NewsComponentType.AdministrativeMetadata getAdministrativeMetadata() {
		return administrativeMetadata;
	}

	/**
	 * Sets the value of the administrativeMetadata property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link NewsComponentType.AdministrativeMetadata }
	 * 
	 */
	public void setAdministrativeMetadata(NewsComponentType.AdministrativeMetadata value) {
		this.administrativeMetadata = value;
	}

	/**
	 * Gets the value of the rightsMetadata property.
	 * 
	 * @return possible object is {@link NewsComponentType.RightsMetadata }
	 * 
	 */
	public NewsComponentType.RightsMetadata getRightsMetadata() {
		return rightsMetadata;
	}

	/**
	 * Sets the value of the rightsMetadata property.
	 * 
	 * @param value
	 *            allowed object is {@link NewsComponentType.RightsMetadata }
	 * 
	 */
	public void setRightsMetadata(NewsComponentType.RightsMetadata value) {
		this.rightsMetadata = value;
	}

	/**
	 * Gets the value of the descriptiveMetadata property.
	 * 
	 * @return possible object is {@link NewsComponentType.DescriptiveMetadata }
	 * 
	 */
	public NewsComponentType.DescriptiveMetadata getDescriptiveMetadata() {
		return descriptiveMetadata;
	}

	/**
	 * Sets the value of the descriptiveMetadata property.
	 * 
	 * @param value
	 *            allowed object is {@link NewsComponentType.DescriptiveMetadata
	 *            }
	 * 
	 */
	public void setDescriptiveMetadata(NewsComponentType.DescriptiveMetadata value) {
		this.descriptiveMetadata = value;
	}

	/**
	 * Gets the value of the metadata property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the metadata property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMetadata().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link NewsComponentType.Metadata }
	 * 
	 * 
	 */
	public List<NewsComponentType.Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new ArrayList<NewsComponentType.Metadata>();
		}
		return this.metadata;
	}

	/**
	 * Gets the value of the newsItemOrNewsItemRef property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the newsItemOrNewsItemRef property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNewsItemOrNewsItemRef().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link NewsItemType } {@link NewsComponentType.NewsItemRef }
	 * 
	 * 
	 */
	public List<Object> getNewsItemOrNewsItemRef() {
		if (newsItemOrNewsItemRef == null) {
			newsItemOrNewsItemRef = new ArrayList<Object>();
		}
		return this.newsItemOrNewsItemRef;
	}

	/**
	 * Gets the value of the newsComponent property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the newsComponent property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNewsComponent().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link NewsComponentType }
	 * 
	 * 
	 */
	public List<NewsComponentType> getNewsComponent() {
		if (newsComponent == null) {
			newsComponent = new ArrayList<NewsComponentType>();
		}
		return this.newsComponent;
	}

	/**
	 * Gets the value of the contentItem property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the contentItem property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getContentItem().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link NewsComponentType.ContentItem }
	 * 
	 * 
	 */
	public List<NewsComponentType.ContentItem> getContentItem() {
		if (contentItem == null) {
			contentItem = new ArrayList<NewsComponentType.ContentItem>();
		}
		return this.contentItem;
	}

	/**
	 * Gets the value of the essential property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEssential() {
		if (essential == null) {
			return "no";
		} else {
			return essential;
		}
	}

	/**
	 * Sets the value of the essential property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEssential(String value) {
		this.essential = value;
	}

	/**
	 * Gets the value of the equivalentsList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEquivalentsList() {
		if (equivalentsList == null) {
			return "no";
		} else {
			return equivalentsList;
		}
	}

	/**
	 * Sets the value of the equivalentsList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEquivalentsList(String value) {
		this.equivalentsList = value;
	}

	/**
	 * Gets the value of the lang property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		this.lang = value;
	}

	/**
	 * Gets the value of the duid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDuid() {
		return duid;
	}

	/**
	 * Sets the value of the duid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDuid(String value) {
		this.duid = value;
	}

	/**
	 * Gets the value of the euid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEuid() {
		return euid;
	}

	/**
	 * Sets the value of the euid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEuid(String value) {
		this.euid = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
	 *         &lt;element name="FileName" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="SystemIdentifier" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Provider" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Creator" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
	 *                   &lt;element name="Contribution" type="{http://iptc.org/std/NewsML/2003-10-10/}ContributionType" maxOccurs="unbounded" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Source" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Contributor" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
	 *                   &lt;element name="Contribution" type="{http://iptc.org/std/NewsML/2003-10-10/}ContributionType" maxOccurs="unbounded" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "catalog", "fileName", "systemIdentifier", "provider", "creator", "source",
			"contributor", "property" })
	@ToString
	public static class AdministrativeMetadata {

		@XmlElement(name = "Catalog")
		protected CatalogType catalog;
		@XmlElement(name = "FileName")
		protected NewsComponentType.AdministrativeMetadata.FileName fileName;
		@XmlElement(name = "SystemIdentifier")
		protected NewsComponentType.AdministrativeMetadata.SystemIdentifier systemIdentifier;
		@XmlElement(name = "Provider")
		protected NewsComponentType.AdministrativeMetadata.Provider provider;
		@XmlElement(name = "Creator")
		protected List<NewsComponentType.AdministrativeMetadata.Creator> creator;
		@XmlElement(name = "Source")
		protected List<NewsComponentType.AdministrativeMetadata.Source> source;
		@XmlElement(name = "Contributor")
		protected List<NewsComponentType.AdministrativeMetadata.Contributor> contributor;
		@XmlElement(name = "Property")
		protected List<PropertyType> property;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the catalog property.
		 * 
		 * @return possible object is {@link CatalogType }
		 * 
		 */
		public CatalogType getCatalog() {
			return catalog;
		}

		/**
		 * Sets the value of the catalog property.
		 * 
		 * @param value
		 *            allowed object is {@link CatalogType }
		 * 
		 */
		public void setCatalog(CatalogType value) {
			this.catalog = value;
		}

		/**
		 * Gets the value of the fileName property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.AdministrativeMetadata.FileName }
		 * 
		 */
		public NewsComponentType.AdministrativeMetadata.FileName getFileName() {
			return fileName;
		}

		/**
		 * Sets the value of the fileName property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.AdministrativeMetadata.FileName }
		 * 
		 */
		public void setFileName(NewsComponentType.AdministrativeMetadata.FileName value) {
			this.fileName = value;
		}

		/**
		 * Gets the value of the systemIdentifier property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.AdministrativeMetadata.SystemIdentifier
		 *         }
		 * 
		 */
		public NewsComponentType.AdministrativeMetadata.SystemIdentifier getSystemIdentifier() {
			return systemIdentifier;
		}

		/**
		 * Sets the value of the systemIdentifier property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.AdministrativeMetadata.SystemIdentifier
		 *            }
		 * 
		 */
		public void setSystemIdentifier(NewsComponentType.AdministrativeMetadata.SystemIdentifier value) {
			this.systemIdentifier = value;
		}

		/**
		 * Gets the value of the provider property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.AdministrativeMetadata.Provider }
		 * 
		 */
		public NewsComponentType.AdministrativeMetadata.Provider getProvider() {
			return provider;
		}

		/**
		 * Sets the value of the provider property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.AdministrativeMetadata.Provider }
		 * 
		 */
		public void setProvider(NewsComponentType.AdministrativeMetadata.Provider value) {
			this.provider = value;
		}

		/**
		 * Gets the value of the creator property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the creator property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getCreator().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.AdministrativeMetadata.Creator }
		 * 
		 * 
		 */
		public List<NewsComponentType.AdministrativeMetadata.Creator> getCreator() {
			if (creator == null) {
				creator = new ArrayList<NewsComponentType.AdministrativeMetadata.Creator>();
			}
			return this.creator;
		}

		/**
		 * Gets the value of the source property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the source property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getSource().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.AdministrativeMetadata.Source }
		 * 
		 * 
		 */
		public List<NewsComponentType.AdministrativeMetadata.Source> getSource() {
			if (source == null) {
				source = new ArrayList<NewsComponentType.AdministrativeMetadata.Source>();
			}
			return this.source;
		}

		/**
		 * Gets the value of the contributor property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the contributor property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getContributor().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.AdministrativeMetadata.Contributor }
		 * 
		 * 
		 */
		public List<NewsComponentType.AdministrativeMetadata.Contributor> getContributor() {
			if (contributor == null) {
				contributor = new ArrayList<NewsComponentType.AdministrativeMetadata.Contributor>();
			}
			return this.contributor;
		}

		/**
		 * Gets the value of the property property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the property property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProperty().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PropertyType }
		 * 
		 * 
		 */
		public List<PropertyType> getProperty() {
			if (property == null) {
				property = new ArrayList<PropertyType>();
			}
			return this.property;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
		 *         &lt;element name="Contribution" type="{http://iptc.org/std/NewsML/2003-10-10/}ContributionType" maxOccurs="unbounded" minOccurs="0"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "comment", "party", "contribution" })
		@ToString
		public static class Contributor {

			@XmlElement(name = "Comment")
			protected List<CommentType> comment;
			@XmlElement(name = "Party", required = true)
			protected List<NewsComponentType.AdministrativeMetadata.Contributor.Party> party;
			@XmlElement(name = "Contribution")
			protected List<ContributionType> contribution;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the comment property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the comment property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getComment().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link CommentType }
			 * 
			 * 
			 */
			public List<CommentType> getComment() {
				if (comment == null) {
					comment = new ArrayList<CommentType>();
				}
				return this.comment;
			}

			/**
			 * Gets the value of the party property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the party property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getParty().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link NewsComponentType.AdministrativeMetadata.Contributor.Party
			 * }
			 * 
			 * 
			 */
			public List<NewsComponentType.AdministrativeMetadata.Contributor.Party> getParty() {
				if (party == null) {
					party = new ArrayList<NewsComponentType.AdministrativeMetadata.Contributor.Party>();
				}
				return this.party;
			}

			/**
			 * Gets the value of the contribution property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the contribution property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContribution().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link ContributionType }
			 * 
			 * 
			 */
			public List<ContributionType> getContribution() {
				if (contribution == null) {
					contribution = new ArrayList<ContributionType>();
				}
				return this.contribution;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
			 *       &lt;/sequence>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
			 *       &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "property" })
			@ToString
			public static class Party {

				@XmlElement(name = "Property")
				protected List<PropertyType> property;
				@XmlAttribute(name = "Topic")
				protected String topic;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "FormalName", required = true)
				protected String formalName;
				@XmlAttribute(name = "Vocabulary")
				protected String vocabulary;
				@XmlAttribute(name = "Scheme")
				protected String scheme;

				/**
				 * Gets the value of the property property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the property
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getProperty().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link PropertyType }
				 * 
				 * 
				 */
				public List<PropertyType> getProperty() {
					if (property == null) {
						property = new ArrayList<PropertyType>();
					}
					return this.property;
				}

				/**
				 * Gets the value of the topic property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getTopic() {
					return topic;
				}

				/**
				 * Sets the value of the topic property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setTopic(String value) {
					this.topic = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the formalName property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getFormalName() {
					return formalName;
				}

				/**
				 * Sets the value of the formalName property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setFormalName(String value) {
					this.formalName = value;
				}

				/**
				 * Gets the value of the vocabulary property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVocabulary() {
					return vocabulary;
				}

				/**
				 * Sets the value of the vocabulary property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVocabulary(String value) {
					this.vocabulary = value;
				}

				/**
				 * Gets the value of the scheme property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getScheme() {
					return scheme;
				}

				/**
				 * Sets the value of the scheme property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setScheme(String value) {
					this.scheme = value;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
		 *         &lt;element name="Contribution" type="{http://iptc.org/std/NewsML/2003-10-10/}ContributionType" maxOccurs="unbounded" minOccurs="0"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "comment", "party", "contribution" })
		@ToString
		public static class Creator {

			@XmlElement(name = "Comment")
			protected List<CommentType> comment;
			@XmlElement(name = "Party", required = true)
			protected List<NewsComponentType.AdministrativeMetadata.Contributor.Party> party;
			@XmlElement(name = "Contribution")
			protected List<ContributionType> contribution;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the comment property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the comment property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getComment().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link CommentType }
			 * 
			 * 
			 */
			public List<CommentType> getComment() {
				if (comment == null) {
					comment = new ArrayList<CommentType>();
				}
				return this.comment;
			}

			/**
			 * Gets the value of the party property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the party property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getParty().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link NewsComponentType.AdministrativeMetadata.Contributor.Party
			 * }
			 * 
			 * 
			 */
			public List<NewsComponentType.AdministrativeMetadata.Contributor.Party> getParty() {
				if (party == null) {
					party = new ArrayList<NewsComponentType.AdministrativeMetadata.Contributor.Party>();
				}
				return this.party;
			}

			/**
			 * Gets the value of the contribution property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the contribution property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContribution().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link ContributionType }
			 * 
			 * 
			 */
			public List<ContributionType> getContribution() {
				if (contribution == null) {
					contribution = new ArrayList<ContributionType>();
				}
				return this.contribution;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "value" })
		@ToString
		public static class FileName {

			@XmlValue
			protected String value;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the value property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getValue() {
				return value;
			}

			/**
			 * Sets the value of the value property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setValue(String value) {
				this.value = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "comment", "party" })
		@ToString
		public static class Provider {

			@XmlElement(name = "Comment")
			protected List<CommentType> comment;
			@XmlElement(name = "Party", required = true)
			protected List<NewsComponentType.AdministrativeMetadata.Contributor.Party> party;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the comment property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the comment property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getComment().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link CommentType }
			 * 
			 * 
			 */
			public List<CommentType> getComment() {
				if (comment == null) {
					comment = new ArrayList<CommentType>();
				}
				return this.comment;
			}

			/**
			 * Gets the value of the party property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the party property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getParty().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link NewsComponentType.AdministrativeMetadata.Contributor.Party
			 * }
			 * 
			 * 
			 */
			public List<NewsComponentType.AdministrativeMetadata.Contributor.Party> getParty() {
				if (party == null) {
					party = new ArrayList<NewsComponentType.AdministrativeMetadata.Contributor.Party>();
				}
				return this.party;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "comment", "party" })
		@ToString
		public static class Source {

			@XmlElement(name = "Comment")
			protected List<CommentType> comment;
			@XmlElement(name = "Party", required = true)
			protected List<NewsComponentType.AdministrativeMetadata.Contributor.Party> party;
			@XmlAttribute(name = "NewsItem")
			protected String newsItem;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the comment property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the comment property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getComment().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link CommentType }
			 * 
			 * 
			 */
			public List<CommentType> getComment() {
				if (comment == null) {
					comment = new ArrayList<CommentType>();
				}
				return this.comment;
			}

			/**
			 * Gets the value of the party property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the party property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getParty().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link NewsComponentType.AdministrativeMetadata.Contributor.Party
			 * }
			 * 
			 * 
			 */
			public List<NewsComponentType.AdministrativeMetadata.Contributor.Party> getParty() {
				if (party == null) {
					party = new ArrayList<NewsComponentType.AdministrativeMetadata.Contributor.Party>();
				}
				return this.party;
			}

			/**
			 * Gets the value of the newsItem property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNewsItem() {
				return newsItem;
			}

			/**
			 * Sets the value of the newsItem property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNewsItem(String value) {
				this.newsItem = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "value" })
		@ToString
		public static class SystemIdentifier {

			@XmlValue
			protected String value;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the value property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getValue() {
				return value;
			}

			/**
			 * Sets the value of the value property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setValue(String value) {
				this.value = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;simpleContent>
	 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *       &lt;attribute name="Rank" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
	 *     &lt;/extension>
	 *   &lt;/simpleContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "value" })
	@ToString
	public static class BasisForChoice {

		@XmlValue
		protected String value;
		@XmlAttribute(name = "Rank")
		@XmlSchemaType(name = "positiveInteger")
		protected BigInteger rank;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the value property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Sets the value of the value property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setValue(String value) {
			this.value = value;
		}

		/**
		 * Gets the value of the rank property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getRank() {
			return rank;
		}

		/**
		 * Sets the value of the rank property.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setRank(BigInteger value) {
			this.rank = value;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
	 *         &lt;element name="MediaType" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Format" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="MimeType" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Notation" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Characteristics" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="SizeInBytes" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;simpleContent>
	 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                         &lt;/extension>
	 *                       &lt;/simpleContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}data"/>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *       &lt;attribute name="Href" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "comment", "catalog", "mediaType", "format", "mimeType", "notation",
			"characteristics", "encoding", "dataContent" })
	@ToString
	public static class ContentItem {

		@XmlElement(name = "Comment")
		protected List<CommentType> comment;
		@XmlElement(name = "Catalog")
		protected CatalogType catalog;
		@XmlElement(name = "MediaType")
		protected NewsComponentType.ContentItem.MediaType mediaType;
		@XmlElement(name = "Format")
		protected NewsComponentType.ContentItem.Format format;
		@XmlElement(name = "MimeType")
		protected NewsComponentType.ContentItem.MimeType mimeType;
		@XmlElement(name = "Notation")
		protected NewsComponentType.ContentItem.Notation notation;
		@XmlElement(name = "Characteristics")
		protected NewsComponentType.ContentItem.Characteristics characteristics;
		@XmlElement(name = "Encoding")
		protected NewsComponentType.ContentItem.Encoding encoding;
		@XmlElement(name = "DataContent")
		protected NewsComponentType.ContentItem.DataContent dataContent;
		@XmlAttribute(name = "Href")
		protected String href;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the comment property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the comment property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getComment().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link CommentType }
		 * 
		 * 
		 */
		public List<CommentType> getComment() {
			if (comment == null) {
				comment = new ArrayList<CommentType>();
			}
			return this.comment;
		}

		/**
		 * Gets the value of the catalog property.
		 * 
		 * @return possible object is {@link CatalogType }
		 * 
		 */
		public CatalogType getCatalog() {
			return catalog;
		}

		/**
		 * Sets the value of the catalog property.
		 * 
		 * @param value
		 *            allowed object is {@link CatalogType }
		 * 
		 */
		public void setCatalog(CatalogType value) {
			this.catalog = value;
		}

		/**
		 * Gets the value of the mediaType property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.ContentItem.MediaType }
		 * 
		 */
		public NewsComponentType.ContentItem.MediaType getMediaType() {
			return mediaType;
		}

		/**
		 * Sets the value of the mediaType property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.ContentItem.MediaType }
		 * 
		 */
		public void setMediaType(NewsComponentType.ContentItem.MediaType value) {
			this.mediaType = value;
		}

		/**
		 * Gets the value of the format property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.ContentItem.Format }
		 * 
		 */
		public NewsComponentType.ContentItem.Format getFormat() {
			return format;
		}

		/**
		 * Sets the value of the format property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.ContentItem.Format }
		 * 
		 */
		public void setFormat(NewsComponentType.ContentItem.Format value) {
			this.format = value;
		}

		/**
		 * Gets the value of the mimeType property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.ContentItem.MimeType }
		 * 
		 */
		public NewsComponentType.ContentItem.MimeType getMimeType() {
			return mimeType;
		}

		/**
		 * Sets the value of the mimeType property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.ContentItem.MimeType }
		 * 
		 */
		public void setMimeType(NewsComponentType.ContentItem.MimeType value) {
			this.mimeType = value;
		}

		/**
		 * Gets the value of the notation property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.ContentItem.Notation }
		 * 
		 */
		public NewsComponentType.ContentItem.Notation getNotation() {
			return notation;
		}

		/**
		 * Sets the value of the notation property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.ContentItem.Notation }
		 * 
		 */
		public void setNotation(NewsComponentType.ContentItem.Notation value) {
			this.notation = value;
		}

		/**
		 * Gets the value of the characteristics property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.ContentItem.Characteristics }
		 * 
		 */
		public NewsComponentType.ContentItem.Characteristics getCharacteristics() {
			return characteristics;
		}

		/**
		 * Sets the value of the characteristics property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.ContentItem.Characteristics }
		 * 
		 */
		public void setCharacteristics(NewsComponentType.ContentItem.Characteristics value) {
			this.characteristics = value;
		}

		/**
		 * Gets the value of the encoding property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.ContentItem.Encoding }
		 * 
		 */
		public NewsComponentType.ContentItem.Encoding getEncoding() {
			return encoding;
		}

		/**
		 * Sets the value of the encoding property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.ContentItem.Encoding }
		 * 
		 */
		public void setEncoding(NewsComponentType.ContentItem.Encoding value) {
			this.encoding = value;
		}

		/**
		 * Gets the value of the dataContent property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.ContentItem.DataContent }
		 * 
		 */
		public NewsComponentType.ContentItem.DataContent getDataContent() {
			return dataContent;
		}

		/**
		 * Sets the value of the dataContent property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.ContentItem.DataContent }
		 * 
		 */
		public void setDataContent(NewsComponentType.ContentItem.DataContent value) {
			this.dataContent = value;
		}

		/**
		 * Gets the value of the href property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHref() {
			return href;
		}

		/**
		 * Sets the value of the href property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHref(String value) {
			this.href = value;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="SizeInBytes" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;simpleContent>
		 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *               &lt;/extension>
		 *             &lt;/simpleContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "sizeInBytes", "property" })
		@ToString
		public static class Characteristics {

			@XmlElement(name = "SizeInBytes")
			protected NewsComponentType.ContentItem.Characteristics.SizeInBytes sizeInBytes;
			@XmlElement(name = "Property")
			protected List<PropertyType> property;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the sizeInBytes property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.ContentItem.Characteristics.SizeInBytes
			 *         }
			 * 
			 */
			public NewsComponentType.ContentItem.Characteristics.SizeInBytes getSizeInBytes() {
				return sizeInBytes;
			}

			/**
			 * Sets the value of the sizeInBytes property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.ContentItem.Characteristics.SizeInBytes
			 *            }
			 * 
			 */
			public void setSizeInBytes(NewsComponentType.ContentItem.Characteristics.SizeInBytes value) {
				this.sizeInBytes = value;
			}

			/**
			 * Gets the value of the property property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the property property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getProperty().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link PropertyType }
			 * 
			 * 
			 */
			public List<PropertyType> getProperty() {
				if (property == null) {
					property = new ArrayList<PropertyType>();
				}
				return this.property;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;simpleContent>
			 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *     &lt;/extension>
			 *   &lt;/simpleContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			@ToString
			public static class SizeInBytes {

				@XmlValue
				@XmlSchemaType(name = "positiveInteger")
				protected BigInteger value;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;

				/**
				 * Gets the value of the value property.
				 * 
				 * @return possible object is {@link BigInteger }
				 * 
				 */
				public BigInteger getValue() {
					return value;
				}

				/**
				 * Sets the value of the value property.
				 * 
				 * @param value
				 *            allowed object is {@link BigInteger }
				 * 
				 */
				public void setValue(BigInteger value) {
					this.value = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class DataContent {

			@XmlMixed
			@XmlAnyElement(lax = true)
			protected List<Object> content;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Element } {@link Object } {@link String }
			 * 
			 * 
			 */
			public List<Object> getContent() {
				if (content == null) {
					content = new ArrayList<Object>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice>
		 *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}data"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute name="Notation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "encoding", "dataContent" })
		@ToString
		public static class Encoding {

			@XmlElement(name = "Encoding")
			protected NewsComponentType.ContentItem.Encoding encoding;
			@XmlElement(name = "DataContent")
			protected NewsComponentType.ContentItem.DataContent dataContent;
			@XmlAttribute(name = "Notation", required = true)
			protected String notation;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the encoding property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.ContentItem.Encoding }
			 * 
			 */
			public NewsComponentType.ContentItem.Encoding getEncoding() {
				return encoding;
			}

			/**
			 * Sets the value of the encoding property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.ContentItem.Encoding }
			 * 
			 */
			public void setEncoding(NewsComponentType.ContentItem.Encoding value) {
				this.encoding = value;
			}

			/**
			 * Gets the value of the dataContent property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.ContentItem.DataContent }
			 * 
			 */
			public NewsComponentType.ContentItem.DataContent getDataContent() {
				return dataContent;
			}

			/**
			 * Sets the value of the dataContent property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.ContentItem.DataContent }
			 * 
			 */
			public void setDataContent(NewsComponentType.ContentItem.DataContent value) {
				this.dataContent = value;
			}

			/**
			 * Gets the value of the notation property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNotation() {
				return notation;
			}

			/**
			 * Sets the value of the notation property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNotation(String value) {
				this.notation = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Format {

			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;
			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class MediaType {

			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class MimeType {

			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Notation {

			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
	 *         &lt;element name="Language" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Genre" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="SubjectCode" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;choice>
	 *                     &lt;element name="Subject">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                     &lt;element name="SubjectMatter">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                     &lt;element name="SubjectDetail">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                   &lt;/choice>
	 *                   &lt;element name="SubjectQualifier" maxOccurs="unbounded" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="OfInterestTo" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Relevance" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="DateLineDate" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDate">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="TopicOccurrence" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                 &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "catalog", "language", "genre", "subjectCode", "ofInterestTo", "dateLineDate",
			"location", "topicOccurrence", "property" })
	@ToString
	public static class DescriptiveMetadata {

		@XmlElement(name = "Catalog")
		protected CatalogType catalog;
		@XmlElement(name = "Language")
		protected List<NewsComponentType.DescriptiveMetadata.Language> language;
		@XmlElement(name = "Genre")
		protected List<NewsComponentType.DescriptiveMetadata.Genre> genre;
		@XmlElement(name = "SubjectCode")
		protected List<NewsComponentType.DescriptiveMetadata.SubjectCode> subjectCode;
		@XmlElement(name = "OfInterestTo")
		protected List<NewsComponentType.DescriptiveMetadata.OfInterestTo> ofInterestTo;
		@XmlElement(name = "DateLineDate")
		protected NewsComponentType.DescriptiveMetadata.DateLineDate dateLineDate;
		@XmlElement(name = "Location")
		protected List<NewsComponentType.DescriptiveMetadata.Location> location;
		@XmlElement(name = "TopicOccurrence")
		protected List<NewsComponentType.DescriptiveMetadata.TopicOccurrence> topicOccurrence;
		@XmlElement(name = "Property")
		protected List<PropertyType> property;
		@XmlAttribute(name = "AssignedBy")
		protected String assignedBy;
		@XmlAttribute(name = "Importance")
		protected String importance;
		@XmlAttribute(name = "Confidence")
		protected String confidence;
		@XmlAttribute(name = "HowPresent")
		protected String howPresent;
		@XmlAttribute(name = "DateAndTime")
		protected String dateAndTime;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the catalog property.
		 * 
		 * @return possible object is {@link CatalogType }
		 * 
		 */
		public CatalogType getCatalog() {
			return catalog;
		}

		/**
		 * Sets the value of the catalog property.
		 * 
		 * @param value
		 *            allowed object is {@link CatalogType }
		 * 
		 */
		public void setCatalog(CatalogType value) {
			this.catalog = value;
		}

		/**
		 * Gets the value of the language property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the language property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getLanguage().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.DescriptiveMetadata.Language }
		 * 
		 * 
		 */
		public List<NewsComponentType.DescriptiveMetadata.Language> getLanguage() {
			if (language == null) {
				language = new ArrayList<NewsComponentType.DescriptiveMetadata.Language>();
			}
			return this.language;
		}

		/**
		 * Gets the value of the genre property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the genre property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getGenre().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.DescriptiveMetadata.Genre }
		 * 
		 * 
		 */
		public List<NewsComponentType.DescriptiveMetadata.Genre> getGenre() {
			if (genre == null) {
				genre = new ArrayList<NewsComponentType.DescriptiveMetadata.Genre>();
			}
			return this.genre;
		}

		/**
		 * Gets the value of the subjectCode property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the subjectCode property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getSubjectCode().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.DescriptiveMetadata.SubjectCode }
		 * 
		 * 
		 */
		public List<NewsComponentType.DescriptiveMetadata.SubjectCode> getSubjectCode() {
			if (subjectCode == null) {
				subjectCode = new ArrayList<NewsComponentType.DescriptiveMetadata.SubjectCode>();
			}
			return this.subjectCode;
		}

		/**
		 * Gets the value of the ofInterestTo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the ofInterestTo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getOfInterestTo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.DescriptiveMetadata.OfInterestTo }
		 * 
		 * 
		 */
		public List<NewsComponentType.DescriptiveMetadata.OfInterestTo> getOfInterestTo() {
			if (ofInterestTo == null) {
				ofInterestTo = new ArrayList<NewsComponentType.DescriptiveMetadata.OfInterestTo>();
			}
			return this.ofInterestTo;
		}

		/**
		 * Gets the value of the dateLineDate property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.DescriptiveMetadata.DateLineDate }
		 * 
		 */
		public NewsComponentType.DescriptiveMetadata.DateLineDate getDateLineDate() {
			return dateLineDate;
		}

		/**
		 * Sets the value of the dateLineDate property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.DescriptiveMetadata.DateLineDate
		 *            }
		 * 
		 */
		public void setDateLineDate(NewsComponentType.DescriptiveMetadata.DateLineDate value) {
			this.dateLineDate = value;
		}

		/**
		 * Gets the value of the location property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the location property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getLocation().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.DescriptiveMetadata.Location }
		 * 
		 * 
		 */
		public List<NewsComponentType.DescriptiveMetadata.Location> getLocation() {
			if (location == null) {
				location = new ArrayList<NewsComponentType.DescriptiveMetadata.Location>();
			}
			return this.location;
		}

		/**
		 * Gets the value of the topicOccurrence property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the topicOccurrence property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getTopicOccurrence().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.DescriptiveMetadata.TopicOccurrence }
		 * 
		 * 
		 */
		public List<NewsComponentType.DescriptiveMetadata.TopicOccurrence> getTopicOccurrence() {
			if (topicOccurrence == null) {
				topicOccurrence = new ArrayList<NewsComponentType.DescriptiveMetadata.TopicOccurrence>();
			}
			return this.topicOccurrence;
		}

		/**
		 * Gets the value of the property property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the property property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProperty().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PropertyType }
		 * 
		 * 
		 */
		public List<PropertyType> getProperty() {
			if (property == null) {
				property = new ArrayList<PropertyType>();
			}
			return this.property;
		}

		/**
		 * Gets the value of the assignedBy property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAssignedBy() {
			return assignedBy;
		}

		/**
		 * Sets the value of the assignedBy property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAssignedBy(String value) {
			this.assignedBy = value;
		}

		/**
		 * Gets the value of the importance property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getImportance() {
			return importance;
		}

		/**
		 * Sets the value of the importance property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setImportance(String value) {
			this.importance = value;
		}

		/**
		 * Gets the value of the confidence property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getConfidence() {
			return confidence;
		}

		/**
		 * Sets the value of the confidence property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setConfidence(String value) {
			this.confidence = value;
		}

		/**
		 * Gets the value of the howPresent property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHowPresent() {
			return howPresent;
		}

		/**
		 * Sets the value of the howPresent property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHowPresent(String value) {
			this.howPresent = value;
		}

		/**
		 * Gets the value of the dateAndTime property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDateAndTime() {
			return dateAndTime;
		}

		/**
		 * Sets the value of the dateAndTime property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDateAndTime(String value) {
			this.dateAndTime = value;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDate">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "value" })
		@ToString
		public static class DateLineDate {

			@XmlValue
			protected String value;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * The date and without time at which a piece of metadata was
			 * assigned. Uses the format YYYYMMDD (year, month, day) This is the
			 * Basic Format defined by ISO 8601. YYYY is a 4-digit year number.
			 * MM is a 2-digit month number. DD is a 2-digit day number.
			 * Example: 31st of December in 2000 would be expressed as
			 * "20001231".
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getValue() {
				return value;
			}

			/**
			 * Sets the value of the value property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setValue(String value) {
				this.value = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Genre {

			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;
			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;
			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class Language {

			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;
			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "property" })
		@ToString
		public static class Location {

			@XmlElement(name = "Property")
			protected List<PropertyType> property;
			@XmlAttribute(name = "Topic")
			protected String topic;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the property property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the property property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getProperty().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link PropertyType }
			 * 
			 * 
			 */
			public List<PropertyType> getProperty() {
				if (property == null) {
					property = new ArrayList<PropertyType>();
				}
				return this.property;
			}

			/**
			 * Gets the value of the topic property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTopic() {
				return topic;
			}

			/**
			 * Sets the value of the topic property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTopic(String value) {
				this.topic = value;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Relevance" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "relevance" })
		@ToString
		public static class OfInterestTo {

			@XmlElement(name = "Relevance")
			protected NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance relevance;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;
			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;
			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;

			/**
			 * Gets the value of the relevance property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance
			 *         }
			 * 
			 */
			public NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance getRelevance() {
				return relevance;
			}

			/**
			 * Sets the value of the relevance property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance
			 *            }
			 * 
			 */
			public void setRelevance(NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance value) {
				this.relevance = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			@ToString
			public static class Relevance {

				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;
				@XmlAttribute(name = "FormalName", required = true)
				protected String formalName;
				@XmlAttribute(name = "Vocabulary")
				protected String vocabulary;
				@XmlAttribute(name = "Scheme")
				protected String scheme;

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

				/**
				 * Gets the value of the formalName property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getFormalName() {
					return formalName;
				}

				/**
				 * Sets the value of the formalName property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setFormalName(String value) {
					this.formalName = value;
				}

				/**
				 * Gets the value of the vocabulary property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVocabulary() {
					return vocabulary;
				}

				/**
				 * Sets the value of the vocabulary property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVocabulary(String value) {
					this.vocabulary = value;
				}

				/**
				 * Gets the value of the scheme property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getScheme() {
					return scheme;
				}

				/**
				 * Sets the value of the scheme property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setScheme(String value) {
					this.scheme = value;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
		 *         &lt;choice>
		 *           &lt;element name="Subject">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *           &lt;element name="SubjectMatter">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *           &lt;element name="SubjectDetail">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *         &lt;/choice>
		 *         &lt;element name="SubjectQualifier" maxOccurs="unbounded" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "subjectOrSubjectMatterOrSubjectDetail" })
		@ToString
		public static class SubjectCode {

			@XmlElements({
					@XmlElement(name = "Subject", type = NewsComponentType.DescriptiveMetadata.SubjectCode.Subject.class),
					@XmlElement(name = "SubjectMatter", type = NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectMatter.class),
					@XmlElement(name = "SubjectDetail", type = NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectDetail.class),
					@XmlElement(name = "SubjectQualifier", type = NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectQualifier.class) })
			protected List<Object> subjectOrSubjectMatterOrSubjectDetail;
			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the subjectOrSubjectMatterOrSubjectDetail
			 * property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the
			 * subjectOrSubjectMatterOrSubjectDetail property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getSubjectOrSubjectMatterOrSubjectDetail().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link NewsComponentType.DescriptiveMetadata.SubjectCode.Subject
			 * }
			 * {@link NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectMatter
			 * }
			 * {@link NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectDetail
			 * }
			 * {@link NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectQualifier
			 * }
			 * 
			 * 
			 */
			public List<Object> getSubjectOrSubjectMatterOrSubjectDetail() {
				if (subjectOrSubjectMatterOrSubjectDetail == null) {
					subjectOrSubjectMatterOrSubjectDetail = new ArrayList<Object>();
				}
				return this.subjectOrSubjectMatterOrSubjectDetail;
			}

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			@ToString
			public static class Subject {

				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "FormalName", required = true)
				protected String formalName;
				@XmlAttribute(name = "Vocabulary")
				protected String vocabulary;
				@XmlAttribute(name = "Scheme")
				protected String scheme;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the formalName property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getFormalName() {
					return formalName;
				}

				/**
				 * Sets the value of the formalName property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setFormalName(String value) {
					this.formalName = value;
				}

				/**
				 * Gets the value of the vocabulary property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVocabulary() {
					return vocabulary;
				}

				/**
				 * Sets the value of the vocabulary property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVocabulary(String value) {
					this.vocabulary = value;
				}

				/**
				 * Gets the value of the scheme property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getScheme() {
					return scheme;
				}

				/**
				 * Sets the value of the scheme property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setScheme(String value) {
					this.scheme = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			@ToString
			public static class SubjectDetail {

				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;
				@XmlAttribute(name = "FormalName", required = true)
				protected String formalName;
				@XmlAttribute(name = "Vocabulary")
				protected String vocabulary;
				@XmlAttribute(name = "Scheme")
				protected String scheme;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

				/**
				 * Gets the value of the formalName property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getFormalName() {
					return formalName;
				}

				/**
				 * Sets the value of the formalName property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setFormalName(String value) {
					this.formalName = value;
				}

				/**
				 * Gets the value of the vocabulary property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVocabulary() {
					return vocabulary;
				}

				/**
				 * Sets the value of the vocabulary property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVocabulary(String value) {
					this.vocabulary = value;
				}

				/**
				 * Gets the value of the scheme property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getScheme() {
					return scheme;
				}

				/**
				 * Sets the value of the scheme property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setScheme(String value) {
					this.scheme = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			@ToString
			public static class SubjectMatter {

				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "FormalName", required = true)
				protected String formalName;
				@XmlAttribute(name = "Vocabulary")
				protected String vocabulary;
				@XmlAttribute(name = "Scheme")
				protected String scheme;

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the formalName property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getFormalName() {
					return formalName;
				}

				/**
				 * Sets the value of the formalName property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setFormalName(String value) {
					this.formalName = value;
				}

				/**
				 * Gets the value of the vocabulary property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVocabulary() {
					return vocabulary;
				}

				/**
				 * Sets the value of the vocabulary property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVocabulary(String value) {
					this.vocabulary = value;
				}

				/**
				 * Gets the value of the scheme property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getScheme() {
					return scheme;
				}

				/**
				 * Sets the value of the scheme property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setScheme(String value) {
					this.scheme = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			@ToString
			public static class SubjectQualifier {

				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "FormalName", required = true)
				protected String formalName;
				@XmlAttribute(name = "Vocabulary")
				protected String vocabulary;
				@XmlAttribute(name = "Scheme")
				protected String scheme;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the formalName property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getFormalName() {
					return formalName;
				}

				/**
				 * Sets the value of the formalName property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setFormalName(String value) {
					this.formalName = value;
				}

				/**
				 * Gets the value of the vocabulary property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVocabulary() {
					return vocabulary;
				}

				/**
				 * Sets the value of the vocabulary property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVocabulary(String value) {
					this.vocabulary = value;
				}

				/**
				 * Gets the value of the scheme property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getScheme() {
					return scheme;
				}

				/**
				 * Sets the value of the scheme property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setScheme(String value) {
					this.scheme = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *       &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class TopicOccurrence {

			@XmlAttribute(name = "Topic")
			protected String topic;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;
			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;

			/**
			 * Gets the value of the topic property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTopic() {
				return topic;
			}

			/**
			 * Sets the value of the topic property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTopic(String value) {
				this.topic = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
	 *         &lt;element name="MetadataType">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "catalog", "metadataType", "property" })
	@ToString
	public static class Metadata {

		@XmlElement(name = "Catalog")
		protected CatalogType catalog;
		@XmlElement(name = "MetadataType", required = true)
		protected NewsComponentType.Metadata.MetadataType metadataType;
		@XmlElement(name = "Property", required = true)
		protected List<PropertyType> property;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the catalog property.
		 * 
		 * @return possible object is {@link CatalogType }
		 * 
		 */
		public CatalogType getCatalog() {
			return catalog;
		}

		/**
		 * Sets the value of the catalog property.
		 * 
		 * @param value
		 *            allowed object is {@link CatalogType }
		 * 
		 */
		public void setCatalog(CatalogType value) {
			this.catalog = value;
		}

		/**
		 * Gets the value of the metadataType property.
		 * 
		 * @return possible object is
		 *         {@link NewsComponentType.Metadata.MetadataType }
		 * 
		 */
		public NewsComponentType.Metadata.MetadataType getMetadataType() {
			return metadataType;
		}

		/**
		 * Sets the value of the metadataType property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link NewsComponentType.Metadata.MetadataType }
		 * 
		 */
		public void setMetadataType(NewsComponentType.Metadata.MetadataType value) {
			this.metadataType = value;
		}

		/**
		 * Gets the value of the property property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the property property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProperty().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PropertyType }
		 * 
		 * 
		 */
		public List<PropertyType> getProperty() {
			if (property == null) {
				property = new ArrayList<PropertyType>();
			}
			return this.property;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class MetadataType {

			@XmlAttribute(name = "FormalName", required = true)
			protected String formalName;
			@XmlAttribute(name = "Vocabulary")
			protected String vocabulary;
			@XmlAttribute(name = "Scheme")
			protected String scheme;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the formalName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFormalName() {
				return formalName;
			}

			/**
			 * Sets the value of the formalName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFormalName(String value) {
				this.formalName = value;
			}

			/**
			 * Gets the value of the vocabulary property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVocabulary() {
				return vocabulary;
			}

			/**
			 * Sets the value of the vocabulary property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVocabulary(String value) {
				this.vocabulary = value;
			}

			/**
			 * Gets the value of the scheme property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getScheme() {
				return scheme;
			}

			/**
			 * Sets the value of the scheme property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setScheme(String value) {
				this.scheme = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *       &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "comment" })
	@ToString
	public static class NewsItemRef {

		@XmlElement(name = "Comment")
		protected List<CommentType> comment;
		@XmlAttribute(name = "NewsItem")
		protected String newsItem;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the comment property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the comment property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getComment().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link CommentType }
		 * 
		 * 
		 */
		public List<CommentType> getComment() {
			if (comment == null) {
				comment = new ArrayList<CommentType>();
			}
			return this.comment;
		}

		/**
		 * Gets the value of the newsItem property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNewsItem() {
			return newsItem;
		}

		/**
		 * Sets the value of the newsItem property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNewsItem(String value) {
			this.newsItem = value;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *         &lt;sequence>
	 *           &lt;element name="HeadLine">
	 *             &lt;complexType>
	 *               &lt;complexContent>
	 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                     &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                   &lt;/choice>
	 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                   &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                 &lt;/restriction>
	 *               &lt;/complexContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *           &lt;element name="SubHeadLine" maxOccurs="unbounded" minOccurs="0">
	 *             &lt;complexType>
	 *               &lt;complexContent>
	 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                     &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                   &lt;/choice>
	 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                   &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                 &lt;/restriction>
	 *               &lt;/complexContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *         &lt;/sequence>
	 *         &lt;sequence>
	 *           &lt;element name="ByLine">
	 *             &lt;complexType>
	 *               &lt;complexContent>
	 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                     &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                   &lt;/choice>
	 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                   &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                 &lt;/restriction>
	 *               &lt;/complexContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *           &lt;element name="ByLineTitle" maxOccurs="unbounded" minOccurs="0">
	 *             &lt;complexType>
	 *               &lt;complexContent>
	 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                     &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                   &lt;/choice>
	 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                   &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                 &lt;/restriction>
	 *               &lt;/complexContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *         &lt;/sequence>
	 *         &lt;element name="DateLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                 &lt;/choice>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="CreditLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                 &lt;/choice>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="CopyrightLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                 &lt;/choice>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="RightsLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                 &lt;/choice>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="SeriesLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                 &lt;/choice>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="SlugLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                 &lt;/choice>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="KeywordLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                 &lt;/choice>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="NewsLine">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="NewsLineType">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="NewsLineText" maxOccurs="unbounded">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/choice>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "headLineAndSubHeadLineOrByLine" })
	@ToString
	public static class NewsLines {

		@XmlElements({ @XmlElement(name = "HeadLine", type = NewsComponentType.NewsLines.HeadLine.class),
				@XmlElement(name = "SubHeadLine", type = NewsComponentType.NewsLines.SubHeadLine.class),
				@XmlElement(name = "ByLine", type = NewsComponentType.NewsLines.ByLine.class),
				@XmlElement(name = "ByLineTitle", type = NewsComponentType.NewsLines.ByLineTitle.class),
				@XmlElement(name = "DateLine", type = NewsComponentType.NewsLines.DateLine.class),
				@XmlElement(name = "CreditLine", type = NewsComponentType.NewsLines.CreditLine.class),
				@XmlElement(name = "CopyrightLine", type = NewsComponentType.NewsLines.CopyrightLine.class),
				@XmlElement(name = "RightsLine", type = NewsComponentType.NewsLines.RightsLine.class),
				@XmlElement(name = "SeriesLine", type = NewsComponentType.NewsLines.SeriesLine.class),
				@XmlElement(name = "SlugLine", type = NewsComponentType.NewsLines.SlugLine.class),
				@XmlElement(name = "KeywordLine", type = NewsComponentType.NewsLines.KeywordLine.class),
				@XmlElement(name = "NewsLine", type = NewsComponentType.NewsLines.NewsLine.class) })
		protected List<Object> headLineAndSubHeadLineOrByLine;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the headLineAndSubHeadLineOrByLine property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the headLineAndSubHeadLineOrByLine
		 * property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getHeadLineAndSubHeadLineOrByLine().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.NewsLines.HeadLine }
		 * {@link NewsComponentType.NewsLines.SubHeadLine }
		 * {@link NewsComponentType.NewsLines.ByLine }
		 * {@link NewsComponentType.NewsLines.ByLineTitle }
		 * {@link NewsComponentType.NewsLines.DateLine }
		 * {@link NewsComponentType.NewsLines.CreditLine }
		 * {@link NewsComponentType.NewsLines.CopyrightLine }
		 * {@link NewsComponentType.NewsLines.RightsLine }
		 * {@link NewsComponentType.NewsLines.SeriesLine }
		 * {@link NewsComponentType.NewsLines.SlugLine }
		 * {@link NewsComponentType.NewsLines.KeywordLine }
		 * {@link NewsComponentType.NewsLines.NewsLine }
		 * 
		 * 
		 */
		public List<Object> getHeadLineAndSubHeadLineOrByLine() {
			if (headLineAndSubHeadLineOrByLine == null) {
				headLineAndSubHeadLineOrByLine = new ArrayList<Object>();
			}
			return this.headLineAndSubHeadLineOrByLine;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class ByLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class ByLineTitle {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class CopyrightLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class CreditLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class DateLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class HeadLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class KeywordLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="NewsLineType">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="NewsLineText" maxOccurs="unbounded">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "newsLineType", "newsLineText" })
		@ToString
		public static class NewsLine {

			@XmlElement(name = "NewsLineType", required = true)
			protected NewsComponentType.NewsLines.NewsLine.NewsLineType newsLineType;
			@XmlElement(name = "NewsLineText", required = true)
			protected List<NewsComponentType.NewsLines.NewsLine.NewsLineText> newsLineText;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the newsLineType property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.NewsLines.NewsLine.NewsLineType
			 *         }
			 * 
			 */
			public NewsComponentType.NewsLines.NewsLine.NewsLineType getNewsLineType() {
				return newsLineType;
			}

			/**
			 * Sets the value of the newsLineType property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.NewsLines.NewsLine.NewsLineType
			 *            }
			 * 
			 */
			public void setNewsLineType(NewsComponentType.NewsLines.NewsLine.NewsLineType value) {
				this.newsLineType = value;
			}

			/**
			 * Gets the value of the newsLineText property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the newsLineText property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getNewsLineText().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link NewsComponentType.NewsLines.NewsLine.NewsLineText }
			 * 
			 * 
			 */
			public List<NewsComponentType.NewsLines.NewsLine.NewsLineText> getNewsLineText() {
				if (newsLineText == null) {
					newsLineText = new ArrayList<NewsComponentType.NewsLines.NewsLine.NewsLineText>();
				}
				return this.newsLineText;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class NewsLineText {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			@ToString
			public static class NewsLineType {

				@XmlAttribute(name = "FormalName", required = true)
				protected String formalName;
				@XmlAttribute(name = "Vocabulary")
				protected String vocabulary;
				@XmlAttribute(name = "Scheme")
				protected String scheme;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;

				/**
				 * Gets the value of the formalName property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getFormalName() {
					return formalName;
				}

				/**
				 * Sets the value of the formalName property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setFormalName(String value) {
					this.formalName = value;
				}

				/**
				 * Gets the value of the vocabulary property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVocabulary() {
					return vocabulary;
				}

				/**
				 * Sets the value of the vocabulary property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVocabulary(String value) {
					this.vocabulary = value;
				}

				/**
				 * Gets the value of the scheme property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getScheme() {
					return scheme;
				}

				/**
				 * Sets the value of the scheme property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setScheme(String value) {
					this.scheme = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class RightsLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class SeriesLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class SlugLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *       &lt;/choice>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "content" })
		@ToString
		public static class SubHeadLine {

			@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
			@XmlMixed
			protected List<Serializable> content;
			@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlSchemaType(name = "language")
			protected String lang;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the content property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the content property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getContent().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
			 * {@link String }
			 * 
			 * 
			 */
			public List<Serializable> getContent() {
				if (content == null) {
					content = new ArrayList<Serializable>();
				}
				return this.content;
			}

			/**
			 * Gets the value of the lang property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLang() {
				return lang;
			}

			/**
			 * Sets the value of the lang property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLang(String value) {
				this.lang = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
	 *         &lt;element name="Copyright" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
	 *                   &lt;element name="CopyrightHolder">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="CopyrightDate">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="UsageRights" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="UsageType" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Geography" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="RightsHolder" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Limitations" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="StartDate" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="EndDate" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
	 *                             &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
	 *                           &lt;/choice>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "catalog", "copyright", "usageRights", "property" })
	@ToString
	public static class RightsMetadata {

		@XmlElement(name = "Catalog")
		protected CatalogType catalog;
		@XmlElement(name = "Copyright")
		protected List<NewsComponentType.RightsMetadata.Copyright> copyright;
		@XmlElement(name = "UsageRights")
		protected List<NewsComponentType.RightsMetadata.UsageRights> usageRights;
		@XmlElement(name = "Property")
		protected List<PropertyType> property;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;
		@XmlAttribute(name = "AssignedBy")
		protected String assignedBy;
		@XmlAttribute(name = "Importance")
		protected String importance;
		@XmlAttribute(name = "Confidence")
		protected String confidence;
		@XmlAttribute(name = "HowPresent")
		protected String howPresent;
		@XmlAttribute(name = "DateAndTime")
		protected String dateAndTime;

		/**
		 * Gets the value of the catalog property.
		 * 
		 * @return possible object is {@link CatalogType }
		 * 
		 */
		public CatalogType getCatalog() {
			return catalog;
		}

		/**
		 * Sets the value of the catalog property.
		 * 
		 * @param value
		 *            allowed object is {@link CatalogType }
		 * 
		 */
		public void setCatalog(CatalogType value) {
			this.catalog = value;
		}

		/**
		 * Gets the value of the copyright property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the copyright property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getCopyright().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.RightsMetadata.Copyright }
		 * 
		 * 
		 */
		public List<NewsComponentType.RightsMetadata.Copyright> getCopyright() {
			if (copyright == null) {
				copyright = new ArrayList<NewsComponentType.RightsMetadata.Copyright>();
			}
			return this.copyright;
		}

		/**
		 * Gets the value of the usageRights property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the usageRights property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getUsageRights().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link NewsComponentType.RightsMetadata.UsageRights }
		 * 
		 * 
		 */
		public List<NewsComponentType.RightsMetadata.UsageRights> getUsageRights() {
			if (usageRights == null) {
				usageRights = new ArrayList<NewsComponentType.RightsMetadata.UsageRights>();
			}
			return this.usageRights;
		}

		/**
		 * Gets the value of the property property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the property property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProperty().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PropertyType }
		 * 
		 * 
		 */
		public List<PropertyType> getProperty() {
			if (property == null) {
				property = new ArrayList<PropertyType>();
			}
			return this.property;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

		/**
		 * Gets the value of the assignedBy property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAssignedBy() {
			return assignedBy;
		}

		/**
		 * Sets the value of the assignedBy property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAssignedBy(String value) {
			this.assignedBy = value;
		}

		/**
		 * Gets the value of the importance property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getImportance() {
			return importance;
		}

		/**
		 * Sets the value of the importance property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setImportance(String value) {
			this.importance = value;
		}

		/**
		 * Gets the value of the confidence property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getConfidence() {
			return confidence;
		}

		/**
		 * Sets the value of the confidence property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setConfidence(String value) {
			this.confidence = value;
		}

		/**
		 * Gets the value of the howPresent property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHowPresent() {
			return howPresent;
		}

		/**
		 * Sets the value of the howPresent property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHowPresent(String value) {
			this.howPresent = value;
		}

		/**
		 * Gets the value of the dateAndTime property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDateAndTime() {
			return dateAndTime;
		}

		/**
		 * Sets the value of the dateAndTime property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDateAndTime(String value) {
			this.dateAndTime = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
		 *         &lt;element name="CopyrightHolder">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="CopyrightDate">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "comment", "copyrightHolder", "copyrightDate" })
		@ToString
		public static class Copyright {

			@XmlElement(name = "Comment")
			protected List<CommentType> comment;
			@XmlElement(name = "CopyrightHolder", required = true)
			protected NewsComponentType.RightsMetadata.Copyright.CopyrightHolder copyrightHolder;
			@XmlElement(name = "CopyrightDate", required = true)
			protected NewsComponentType.RightsMetadata.Copyright.CopyrightDate copyrightDate;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;
			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;

			/**
			 * Gets the value of the comment property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the comment property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getComment().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link CommentType }
			 * 
			 * 
			 */
			public List<CommentType> getComment() {
				if (comment == null) {
					comment = new ArrayList<CommentType>();
				}
				return this.comment;
			}

			/**
			 * Gets the value of the copyrightHolder property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.Copyright.CopyrightHolder
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.Copyright.CopyrightHolder getCopyrightHolder() {
				return copyrightHolder;
			}

			/**
			 * Sets the value of the copyrightHolder property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.Copyright.CopyrightHolder
			 *            }
			 * 
			 */
			public void setCopyrightHolder(NewsComponentType.RightsMetadata.Copyright.CopyrightHolder value) {
				this.copyrightHolder = value;
			}

			/**
			 * Gets the value of the copyrightDate property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.Copyright.CopyrightDate
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.Copyright.CopyrightDate getCopyrightDate() {
				return copyrightDate;
			}

			/**
			 * Sets the value of the copyrightDate property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.Copyright.CopyrightDate
			 *            }
			 * 
			 */
			public void setCopyrightDate(NewsComponentType.RightsMetadata.Copyright.CopyrightDate value) {
				this.copyrightDate = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class CopyrightDate {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class CopyrightHolder {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="UsageType" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Geography" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="RightsHolder" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Limitations" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="StartDate" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="EndDate" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
		 *                   &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
		 *                 &lt;/choice>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "usageType", "geography", "rightsHolder", "limitations", "startDate",
				"endDate" })
		@ToString
		public static class UsageRights {

			@XmlElement(name = "UsageType")
			protected NewsComponentType.RightsMetadata.UsageRights.UsageType usageType;
			@XmlElement(name = "Geography")
			protected NewsComponentType.RightsMetadata.UsageRights.Geography geography;
			@XmlElement(name = "RightsHolder")
			protected NewsComponentType.RightsMetadata.UsageRights.RightsHolder rightsHolder;
			@XmlElement(name = "Limitations")
			protected NewsComponentType.RightsMetadata.UsageRights.Limitations limitations;
			@XmlElement(name = "StartDate")
			protected NewsComponentType.RightsMetadata.UsageRights.StartDate startDate;
			@XmlElement(name = "EndDate")
			protected NewsComponentType.RightsMetadata.UsageRights.EndDate endDate;
			@XmlAttribute(name = "AssignedBy")
			protected String assignedBy;
			@XmlAttribute(name = "Importance")
			protected String importance;
			@XmlAttribute(name = "Confidence")
			protected String confidence;
			@XmlAttribute(name = "HowPresent")
			protected String howPresent;
			@XmlAttribute(name = "DateAndTime")
			protected String dateAndTime;
			@XmlAttribute(name = "Duid")
			@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
			@XmlID
			@XmlSchemaType(name = "ID")
			protected String duid;
			@XmlAttribute(name = "Euid")
			protected String euid;

			/**
			 * Gets the value of the usageType property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.UsageRights.UsageType
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.UsageRights.UsageType getUsageType() {
				return usageType;
			}

			/**
			 * Sets the value of the usageType property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.UsageRights.UsageType
			 *            }
			 * 
			 */
			public void setUsageType(NewsComponentType.RightsMetadata.UsageRights.UsageType value) {
				this.usageType = value;
			}

			/**
			 * Gets the value of the geography property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.UsageRights.Geography
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.UsageRights.Geography getGeography() {
				return geography;
			}

			/**
			 * Sets the value of the geography property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.UsageRights.Geography
			 *            }
			 * 
			 */
			public void setGeography(NewsComponentType.RightsMetadata.UsageRights.Geography value) {
				this.geography = value;
			}

			/**
			 * Gets the value of the rightsHolder property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.UsageRights.RightsHolder
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.UsageRights.RightsHolder getRightsHolder() {
				return rightsHolder;
			}

			/**
			 * Sets the value of the rightsHolder property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.UsageRights.RightsHolder
			 *            }
			 * 
			 */
			public void setRightsHolder(NewsComponentType.RightsMetadata.UsageRights.RightsHolder value) {
				this.rightsHolder = value;
			}

			/**
			 * Gets the value of the limitations property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.UsageRights.Limitations
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.UsageRights.Limitations getLimitations() {
				return limitations;
			}

			/**
			 * Sets the value of the limitations property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.UsageRights.Limitations
			 *            }
			 * 
			 */
			public void setLimitations(NewsComponentType.RightsMetadata.UsageRights.Limitations value) {
				this.limitations = value;
			}

			/**
			 * Gets the value of the startDate property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.UsageRights.StartDate
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.UsageRights.StartDate getStartDate() {
				return startDate;
			}

			/**
			 * Sets the value of the startDate property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.UsageRights.StartDate
			 *            }
			 * 
			 */
			public void setStartDate(NewsComponentType.RightsMetadata.UsageRights.StartDate value) {
				this.startDate = value;
			}

			/**
			 * Gets the value of the endDate property.
			 * 
			 * @return possible object is
			 *         {@link NewsComponentType.RightsMetadata.UsageRights.EndDate
			 *         }
			 * 
			 */
			public NewsComponentType.RightsMetadata.UsageRights.EndDate getEndDate() {
				return endDate;
			}

			/**
			 * Sets the value of the endDate property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link NewsComponentType.RightsMetadata.UsageRights.EndDate
			 *            }
			 * 
			 */
			public void setEndDate(NewsComponentType.RightsMetadata.UsageRights.EndDate value) {
				this.endDate = value;
			}

			/**
			 * Gets the value of the assignedBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAssignedBy() {
				return assignedBy;
			}

			/**
			 * Sets the value of the assignedBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAssignedBy(String value) {
				this.assignedBy = value;
			}

			/**
			 * Gets the value of the importance property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getImportance() {
				return importance;
			}

			/**
			 * Sets the value of the importance property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setImportance(String value) {
				this.importance = value;
			}

			/**
			 * Gets the value of the confidence property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConfidence() {
				return confidence;
			}

			/**
			 * Sets the value of the confidence property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConfidence(String value) {
				this.confidence = value;
			}

			/**
			 * Gets the value of the howPresent property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowPresent() {
				return howPresent;
			}

			/**
			 * Sets the value of the howPresent property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowPresent(String value) {
				this.howPresent = value;
			}

			/**
			 * Gets the value of the dateAndTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDateAndTime() {
				return dateAndTime;
			}

			/**
			 * Sets the value of the dateAndTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDateAndTime(String value) {
				this.dateAndTime = value;
			}

			/**
			 * Gets the value of the duid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDuid() {
				return duid;
			}

			/**
			 * Sets the value of the duid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDuid(String value) {
				this.duid = value;
			}

			/**
			 * Gets the value of the euid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEuid() {
				return euid;
			}

			/**
			 * Sets the value of the euid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEuid(String value) {
				this.euid = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class EndDate {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class Geography {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class Limitations {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class RightsHolder {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class StartDate {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
			 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
			 *       &lt;/choice>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
			 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
			 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "content" })
			@ToString
			public static class UsageType {

				@XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
				@XmlMixed
				protected List<Serializable> content;
				@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlSchemaType(name = "language")
				protected String lang;
				@XmlAttribute(name = "Duid")
				@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
				@XmlID
				@XmlSchemaType(name = "ID")
				protected String duid;
				@XmlAttribute(name = "Euid")
				protected String euid;
				@XmlAttribute(name = "AssignedBy")
				protected String assignedBy;
				@XmlAttribute(name = "Importance")
				protected String importance;
				@XmlAttribute(name = "Confidence")
				protected String confidence;
				@XmlAttribute(name = "HowPresent")
				protected String howPresent;
				@XmlAttribute(name = "DateAndTime")
				protected String dateAndTime;

				/**
				 * Gets the value of the content property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the content
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getContent().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
				 * {@link String }
				 * 
				 * 
				 */
				public List<Serializable> getContent() {
					if (content == null) {
						content = new ArrayList<Serializable>();
					}
					return this.content;
				}

				/**
				 * Gets the value of the lang property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getLang() {
					return lang;
				}

				/**
				 * Sets the value of the lang property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setLang(String value) {
					this.lang = value;
				}

				/**
				 * Gets the value of the duid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDuid() {
					return duid;
				}

				/**
				 * Sets the value of the duid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDuid(String value) {
					this.duid = value;
				}

				/**
				 * Gets the value of the euid property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getEuid() {
					return euid;
				}

				/**
				 * Sets the value of the euid property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setEuid(String value) {
					this.euid = value;
				}

				/**
				 * Gets the value of the assignedBy property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAssignedBy() {
					return assignedBy;
				}

				/**
				 * Sets the value of the assignedBy property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAssignedBy(String value) {
					this.assignedBy = value;
				}

				/**
				 * Gets the value of the importance property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getImportance() {
					return importance;
				}

				/**
				 * Sets the value of the importance property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setImportance(String value) {
					this.importance = value;
				}

				/**
				 * Gets the value of the confidence property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfidence() {
					return confidence;
				}

				/**
				 * Sets the value of the confidence property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfidence(String value) {
					this.confidence = value;
				}

				/**
				 * Gets the value of the howPresent property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHowPresent() {
					return howPresent;
				}

				/**
				 * Sets the value of the howPresent property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHowPresent(String value) {
					this.howPresent = value;
				}

				/**
				 * Gets the value of the dateAndTime property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDateAndTime() {
					return dateAndTime;
				}

				/**
				 * Sets the value of the dateAndTime property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDateAndTime(String value) {
					this.dateAndTime = value;
				}

			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
	 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	@ToString
	public static class Role {

		@XmlAttribute(name = "FormalName", required = true)
		protected String formalName;
		@XmlAttribute(name = "Vocabulary")
		protected String vocabulary;
		@XmlAttribute(name = "Scheme")
		protected String scheme;
		@XmlAttribute(name = "Duid")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String duid;
		@XmlAttribute(name = "Euid")
		protected String euid;

		/**
		 * Gets the value of the formalName property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFormalName() {
			return formalName;
		}

		/**
		 * Sets the value of the formalName property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setFormalName(String value) {
			this.formalName = value;
		}

		/**
		 * Gets the value of the vocabulary property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVocabulary() {
			return vocabulary;
		}

		/**
		 * Sets the value of the vocabulary property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVocabulary(String value) {
			this.vocabulary = value;
		}

		/**
		 * Gets the value of the scheme property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getScheme() {
			return scheme;
		}

		/**
		 * Sets the value of the scheme property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setScheme(String value) {
			this.scheme = value;
		}

		/**
		 * Gets the value of the duid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDuid() {
			return duid;
		}

		/**
		 * Sets the value of the duid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDuid(String value) {
			this.duid = value;
		}

		/**
		 * Gets the value of the euid property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEuid() {
			return euid;
		}

		/**
		 * Sets the value of the euid property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEuid(String value) {
			this.euid = value;
		}

	}

}

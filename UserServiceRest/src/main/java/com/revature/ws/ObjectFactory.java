
package com.revature.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddArticle_QNAME = new QName("http://ws.revature.com/", "addArticle");
    private final static QName _AddArticleResponse_QNAME = new QName("http://ws.revature.com/", "addArticleResponse");
    private final static QName _DeleteArticle_QNAME = new QName("http://ws.revature.com/", "deleteArticle");
    private final static QName _DeleteArticleResponse_QNAME = new QName("http://ws.revature.com/", "deleteArticleResponse");
    private final static QName _GetAllArticles_QNAME = new QName("http://ws.revature.com/", "getAllArticles");
    private final static QName _GetAllArticlesResponse_QNAME = new QName("http://ws.revature.com/", "getAllArticlesResponse");
    private final static QName _GetArticlesByTitle_QNAME = new QName("http://ws.revature.com/", "getArticlesByTitle");
    private final static QName _GetArticlesByTitleResponse_QNAME = new QName("http://ws.revature.com/", "getArticlesByTitleResponse");
    private final static QName _UpdateArticle_QNAME = new QName("http://ws.revature.com/", "updateArticle");
    private final static QName _UpdateArticleResponse_QNAME = new QName("http://ws.revature.com/", "updateArticleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddArticle }
     * 
     */
    public AddArticle createAddArticle() {
        return new AddArticle();
    }

    /**
     * Create an instance of {@link AddArticleResponse }
     * 
     */
    public AddArticleResponse createAddArticleResponse() {
        return new AddArticleResponse();
    }

    /**
     * Create an instance of {@link DeleteArticle }
     * 
     */
    public DeleteArticle createDeleteArticle() {
        return new DeleteArticle();
    }

    /**
     * Create an instance of {@link DeleteArticleResponse }
     * 
     */
    public DeleteArticleResponse createDeleteArticleResponse() {
        return new DeleteArticleResponse();
    }

    /**
     * Create an instance of {@link GetAllArticles }
     * 
     */
    public GetAllArticles createGetAllArticles() {
        return new GetAllArticles();
    }

    /**
     * Create an instance of {@link GetAllArticlesResponse }
     * 
     */
    public GetAllArticlesResponse createGetAllArticlesResponse() {
        return new GetAllArticlesResponse();
    }

    /**
     * Create an instance of {@link GetArticlesByTitle }
     * 
     */
    public GetArticlesByTitle createGetArticlesByTitle() {
        return new GetArticlesByTitle();
    }

    /**
     * Create an instance of {@link GetArticlesByTitleResponse }
     * 
     */
    public GetArticlesByTitleResponse createGetArticlesByTitleResponse() {
        return new GetArticlesByTitleResponse();
    }

    /**
     * Create an instance of {@link UpdateArticle }
     * 
     */
    public UpdateArticle createUpdateArticle() {
        return new UpdateArticle();
    }

    /**
     * Create an instance of {@link UpdateArticleResponse }
     * 
     */
    public UpdateArticleResponse createUpdateArticleResponse() {
        return new UpdateArticleResponse();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArticle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddArticle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "addArticle")
    public JAXBElement<AddArticle> createAddArticle(AddArticle value) {
        return new JAXBElement<AddArticle>(_AddArticle_QNAME, AddArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArticleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddArticleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "addArticleResponse")
    public JAXBElement<AddArticleResponse> createAddArticleResponse(AddArticleResponse value) {
        return new JAXBElement<AddArticleResponse>(_AddArticleResponse_QNAME, AddArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArticle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteArticle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "deleteArticle")
    public JAXBElement<DeleteArticle> createDeleteArticle(DeleteArticle value) {
        return new JAXBElement<DeleteArticle>(_DeleteArticle_QNAME, DeleteArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArticleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteArticleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "deleteArticleResponse")
    public JAXBElement<DeleteArticleResponse> createDeleteArticleResponse(DeleteArticleResponse value) {
        return new JAXBElement<DeleteArticleResponse>(_DeleteArticleResponse_QNAME, DeleteArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllArticles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllArticles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getAllArticles")
    public JAXBElement<GetAllArticles> createGetAllArticles(GetAllArticles value) {
        return new JAXBElement<GetAllArticles>(_GetAllArticles_QNAME, GetAllArticles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllArticlesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllArticlesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getAllArticlesResponse")
    public JAXBElement<GetAllArticlesResponse> createGetAllArticlesResponse(GetAllArticlesResponse value) {
        return new JAXBElement<GetAllArticlesResponse>(_GetAllArticlesResponse_QNAME, GetAllArticlesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticlesByTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArticlesByTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getArticlesByTitle")
    public JAXBElement<GetArticlesByTitle> createGetArticlesByTitle(GetArticlesByTitle value) {
        return new JAXBElement<GetArticlesByTitle>(_GetArticlesByTitle_QNAME, GetArticlesByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticlesByTitleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArticlesByTitleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getArticlesByTitleResponse")
    public JAXBElement<GetArticlesByTitleResponse> createGetArticlesByTitleResponse(GetArticlesByTitleResponse value) {
        return new JAXBElement<GetArticlesByTitleResponse>(_GetArticlesByTitleResponse_QNAME, GetArticlesByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateArticle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "updateArticle")
    public JAXBElement<UpdateArticle> createUpdateArticle(UpdateArticle value) {
        return new JAXBElement<UpdateArticle>(_UpdateArticle_QNAME, UpdateArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateArticleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "updateArticleResponse")
    public JAXBElement<UpdateArticleResponse> createUpdateArticleResponse(UpdateArticleResponse value) {
        return new JAXBElement<UpdateArticleResponse>(_UpdateArticleResponse_QNAME, UpdateArticleResponse.class, null, value);
    }

}

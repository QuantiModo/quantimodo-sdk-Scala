package io.swagger.client.api

import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class OauthApi(val defBasePath: String = "https://localhost/api",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Access Token
   * Client provides authorization token obtained from /api/oauth2/authorize to this endpoint and receives an access token. Access token can then
   * @param responseType Response type
   * @param redirectUri Redirect uri
   * @param realm Realm
   * @param clientId Client id
   * @param scope Scope
   * @param state State
   * @return void
   */
  def oauth2AccesstokenGet (responseType: String, redirectUri: String, realm: String, clientId: String, scope: String, state: String)  = {
    // create path and map variables
    val path = "/oauth2/accesstoken".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(responseType) != "null") queryParams += "response_type" -> responseType.toString
    if(String.valueOf(redirectUri) != "null") queryParams += "redirect_uri" -> redirectUri.toString
    if(String.valueOf(realm) != "null") queryParams += "realm" -> realm.toString
    if(String.valueOf(clientId) != "null") queryParams += "client_id" -> clientId.toString
    if(String.valueOf(scope) != "null") queryParams += "scope" -> scope.toString
    if(String.valueOf(state) != "null") queryParams += "state" -> state.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Authorize
   * Ask the user if they want to allow a client applications to submit or obtain data from their QM  account.
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do.
   * @param realm Name of the realm representing the users of your distributed applications and services. A \&quot;realm\&quot; attribute MAY be included to indicate the scope of protection.
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials.
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space.
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI
   * @return void
   */
  def oauth2AuthorizeGet (clientId: String, realm: String, redirectUri: String, responseType: String, scope: String, state: String)  = {
    // create path and map variables
    val path = "/oauth2/authorize".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(clientId) != "null") queryParams += "client_id" -> clientId.toString
    if(String.valueOf(realm) != "null") queryParams += "realm" -> realm.toString
    if(String.valueOf(redirectUri) != "null") queryParams += "redirect_uri" -> redirectUri.toString
    if(String.valueOf(responseType) != "null") queryParams += "response_type" -> responseType.toString
    if(String.valueOf(scope) != "null") queryParams += "scope" -> scope.toString
    if(String.valueOf(state) != "null") queryParams += "state" -> state.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
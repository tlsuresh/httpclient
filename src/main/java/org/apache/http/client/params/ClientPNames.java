/*
 * $HeadURL$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.http.client.params;


/**
 * Parameter names for the HttpClient module.
 * This does not include parameters for informational units
 * HttpAuth, HttpCookie, or HttpConn.
 *
 * @version $Revision$
 * 
 * @since 4.0
 */
public interface ClientPNames {

    /**
     * Defines the timeout in milliseconds used when retrieving an instance of 
     * {@link org.apache.http.conn.ManagedClientConnection} from the
     * {@link org.apache.http.conn.ClientConnectionManager}.
     * <p>
     * This parameter expects a value of type {@link Long}.
     * </p>
     */ 
    public static final String CONNECTION_MANAGER_TIMEOUT = "http.connection-manager.timeout"; 

    /**
     * Defines the class name of the default {@link org.apache.http.conn.ClientConnectionManager}
     * <p>
     * This parameter expects a value of type {@link String}.
     * </p>
     */ 
    public static final String CONNECTION_MANAGER_FACTORY = "http.connection-manager.factory"; 

    /** 
     * Defines whether redirects should be handled automatically
     * <p>
     * This parameter expects a value of type {@link Boolean}.
     * </p>
     */
    public static final String HANDLE_REDIRECTS = "http.protocol.handle-redirects";

    /**
     * Defines whether relative redirects should be rejected.
     * <p>
     * This parameter expects a value of type {@link Boolean}.
     * </p>
     */
    public static final String REJECT_RELATIVE_REDIRECT = "http.protocol.reject-relative-redirect"; 

    /** 
     * Defines the maximum number of redirects to be followed. 
     * The limit on number of redirects is intended to prevent infinite loops. 
     * <p>
     * This parameter expects a value of type {@link Integer}.
     * </p>
     */
    public static final String MAX_REDIRECTS = "http.protocol.max-redirects";

    /** 
     * Defines whether circular redirects (redirects to the same location) should be allowed. 
     * The HTTP spec is not sufficiently clear whether circular redirects are permitted, 
     * therefore optionally they can be enabled
     * <p>
     * This parameter expects a value of type {@link Boolean}.
     * </p>
     */
    public static final String ALLOW_CIRCULAR_REDIRECTS = "http.protocol.allow-circular-redirects";

    /**
     * Defines whether authentication should be handled automatically.
     * <p>
     * This parameter expects a value of type {@link Boolean}.
     * </p>
     */
    public static final String HANDLE_AUTHENTICATION = "http.protocol.handle-authentication";

    /**
     * Defines whether authentication should be attempted preemptively.
     * <p>
     * This parameter expects a value of type {@link Boolean}.
     * </p>
     */
    public static final String PREEMPTIVE_AUTHENTICATION = "http.protocol.authentication-preemptive";

    /**
     * The key used to look up the list of IDs of supported
     * {@link AuthPolicy authentication schemes} in their order of preference.
     * The scheme IDs are stored in a {@link java.util.Collection} as
     * instances of {@link java.lang.String}.
     * 
     * <p>
     * If several schemes are returned in the <tt>WWW-Authenticate</tt> 
     * or <tt>Proxy-Authenticate</tt> header, this parameter defines which
     * {@link AuthPolicy authentication schemes} takes precedence over others.
     * The first item in the collection represents the most preferred 
     * {@link AuthPolicy authentication scheme}, the last item represents
     * the ID of the least preferred one.
     * </p>
     */
    public static final String AUTH_SCHEME_PRIORITY = "http.protocol-auth-scheme-priority";

    /**
     * Defines the name of the cookie specification to be used for HTTP state management.
     * <p>
     * This parameter expects a value of type {@link String}.
     * </p>
     */
    public static final String COOKIE_POLICY = "http.protocol.cookie-policy";
    
    /**
     * Defines the virtual host name.
     * <p>
     * This parameter expects a value of type {@link org.apache.http.HttpHost}. 
     * </p>
     */
    public static final String VIRTUAL_HOST = "http.virtual-host"; 

    /**
     * Defines the request headers to be sent per default with each request.
     * <p>
     * This parameter expects a value of type {@link java.util.Collection}. The 
     * collection is expected to contain {@link org.apache.http.Header}s. 
     * </p>
     */
    public static final String DEFAULT_HEADERS = "http.default-headers"; 
    
    /**
     * Defines the default host. The default value will be used if the target host is
     * not explicitly specified in the request URI.
     * <p>
     * This parameter expects a value of type {@link org.apache.http.HttpHost}.
     * </p>
     */
    public static final String DEFAULT_HOST = "http.default-host";


}


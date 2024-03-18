/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import org.openapitools.client.models.InteractionLimit
import org.openapitools.client.models.InteractionLimitResponse
import org.openapitools.client.models.InteractionsGetRestrictionsForOrg200Response
import org.openapitools.client.models.ValidationError

import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class InteractionsApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Get interaction restrictions for your public repositories
        * Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
         * @return InteractionsGetRestrictionsForOrg200Response
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun interactionsGetRestrictionsForAuthenticatedUser(): HttpResponse<InteractionsGetRestrictionsForOrg200Response> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/user/interaction-limits",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get interaction restrictions for an organization
        * Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response.
         * @param org The organization name. The name is not case sensitive. 
         * @return InteractionsGetRestrictionsForOrg200Response
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun interactionsGetRestrictionsForOrg(org: kotlin.String): HttpResponse<InteractionsGetRestrictionsForOrg200Response> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/orgs/{org}/interaction-limits".replace("{" + "org" + "}", "$org"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get interaction restrictions for a repository
        * Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @return InteractionsGetRestrictionsForOrg200Response
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun interactionsGetRestrictionsForRepo(owner: kotlin.String, repo: kotlin.String): HttpResponse<InteractionsGetRestrictionsForOrg200Response> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/interaction-limits".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Remove interaction restrictions from your public repositories
        * Removes any interaction restrictions from your public repositories.
         * @return void
        */
        open suspend fun interactionsRemoveRestrictionsForAuthenticatedUser(): HttpResponse<Unit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/user/interaction-limits",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Remove interaction restrictions for an organization
        * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
         * @param org The organization name. The name is not case sensitive. 
         * @return void
        */
        open suspend fun interactionsRemoveRestrictionsForOrg(org: kotlin.String): HttpResponse<Unit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/orgs/{org}/interaction-limits".replace("{" + "org" + "}", "$org"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Remove interaction restrictions for a repository
        * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a &#x60;409 Conflict&#x60; response and will not be able to use this endpoint to change the interaction limit for a single repository.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @return void
        */
        open suspend fun interactionsRemoveRestrictionsForRepo(owner: kotlin.String, repo: kotlin.String): HttpResponse<Unit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/repos/{owner}/{repo}/interaction-limits".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Set interaction restrictions for your public repositories
        * Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.
         * @param interactionLimit  
         * @return InteractionLimitResponse
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun interactionsSetRestrictionsForAuthenticatedUser(interactionLimit: InteractionLimit): HttpResponse<InteractionLimitResponse> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = interactionLimit

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/user/interaction-limits",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Set interaction restrictions for an organization
        * Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization.
         * @param org The organization name. The name is not case sensitive. 
         * @param interactionLimit  
         * @return InteractionLimitResponse
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun interactionsSetRestrictionsForOrg(org: kotlin.String, interactionLimit: InteractionLimit): HttpResponse<InteractionLimitResponse> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = interactionLimit

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/orgs/{org}/interaction-limits".replace("{" + "org" + "}", "$org"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Set interaction restrictions for a repository
        * Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a &#x60;409 Conflict&#x60; response and will not be able to use this endpoint to change the interaction limit for a single repository.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param interactionLimit  
         * @return InteractionLimitResponse
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun interactionsSetRestrictionsForRepo(owner: kotlin.String, repo: kotlin.String, interactionLimit: InteractionLimit): HttpResponse<InteractionLimitResponse> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = interactionLimit

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/repos/{owner}/{repo}/interaction-limits".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        }

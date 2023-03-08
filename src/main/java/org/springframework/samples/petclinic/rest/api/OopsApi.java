/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.rest.dto.RestErrorDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reactor.core.publisher.Mono;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-04T10:51:32.416450+03:00[Europe/Moscow]")
@Validated
@Tag(name = "oops", description = "Endpoint which always returns an error.")
public interface OopsApi {

    /**
     * GET /oops : Always fails
     * Produces sample error response.
     *
     * @return Never returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     */
    @Operation(
        operationId = "failingRequest",
        summary = "Always fails",
        tags = { "failing" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Never returned.", content = {
                @Content(mediaType = "text/plain", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "text/plain", schema = @Schema(implementation = RestErrorDto.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/oops",
        produces = { "text/plain", "application/json" }
    )
    default Mono<ResponseEntity<String>> failingRequest(

    ) {
        return Mono.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));

    }

}
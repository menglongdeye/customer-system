package com.lcl.galaxy.customer.service.provider.controller.graphql;

import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.execution.GraphQlSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerStaffGraphQLController {

    private GraphQL graphQL;

    @Autowired
    public CustomerStaffGraphQLController(GraphQlSource graphQlSource) {
        graphQL = graphQlSource.graphQl();
    }

    @PostMapping("/query")
    public ResponseEntity<Object> query(@RequestBody String query) {




        ExecutionResult result = graphQL.execute(query);
        return ResponseEntity.ok(result.getData());
    }

}


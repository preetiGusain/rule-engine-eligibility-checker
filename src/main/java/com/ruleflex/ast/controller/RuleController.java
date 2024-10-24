package com.ruleflex.ast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruleflex.ast.model.EvaluationResult;
import com.ruleflex.ast.model.Rule;
import com.ruleflex.ast.model.UserAttributes;
import com.ruleflex.ast.service.EvaluationService;
import com.ruleflex.ast.service.RuleService;
import javax.validation.Valid;
import java.util.List;


//The RuleController class serves as a RESTful API endpoint that manages user requests related to rules, 
//providing methods to retrieve available rules and evaluate user attributes against those rules. 
//It processes HTTP requests, validates input data, and interacts with the underlying service layer to perform business logic.

@RestController
@RequestMapping("/api")
public class RuleController {

    private RuleService ruleService;
    
    @Autowired
    private EvaluationService evaluationService;

    @GetMapping("/rules")
    public List<Rule> getRules() {
        // Logic to retrieve rules from the database
        return ruleService.getAllRules(); // example return
    }

    @PostMapping("/evaluate")
    public EvaluationResult evaluateUser(@RequestBody @Valid UserAttributes userAttributes) {
        // Logic to evaluate the user based on the rules
        return evaluationService.evaluate(userAttributes); // example return
    }
}

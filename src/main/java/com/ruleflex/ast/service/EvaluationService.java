package com.ruleflex.ast.service;

import com.ruleflex.ast.model.EvaluationResult;
import com.ruleflex.ast.model.UserAttributes;
import org.springframework.stereotype.Service;

@Service
public class EvaluationService {

    public EvaluationResult evaluate(UserAttributes userAttributes) {
        // Logic to evaluate the user based on rules
        return new EvaluationResult(true, "Evaluation successful");
    }
}

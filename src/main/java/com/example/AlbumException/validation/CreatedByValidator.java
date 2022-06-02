package com.example.AlbumException.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CreatedByValidator implements ConstraintValidator<CreatedByValidation, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s.matches("[a-z0-9 .]+")){
        return true;}
        else{
            return false;}
    }
}

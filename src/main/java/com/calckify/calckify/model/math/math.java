package com.calckify.calckify.model.math;

public class math {
    private String calcInput;
    private StringBuilder modInput;
    private int bracketCount;

    /**
     * Tries to run expression, catches and handles exceptions
     */
    public void performCalculation(){
        try{
            toCalculate(calcInput);
        }
        catch (IllegalArgumentException|ArithmeticException e){
            e.printStackTrace();
        }
    }

    /**
     * Function to format LATEX input into readable input for the compiler
     * @param input String input taking in operations in LATEX format
     * @return modified string to be evaluated
     */
    public String toCalculate(String input) throws IllegalArgumentException, ArithmeticException{
        input = calcInput;
        bracketCount = 0;

        // check for empty string input, throw exception if empty
        if(input.isEmpty()){
            throw new IllegalArgumentException("No Expression Provided");
        }

        // loop through to count number of opening and closing brackets, bracketCount+=1 for opening brackets, bracketCount-=1 for closing brackets
        // if bracketCount != 0 at end, throw exceptions
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                bracketCount += 1;
            }
            else if(input.charAt(i) == ')'){
                bracketCount -= 1;
            }
        }
        if(bracketCount != 0){
            throw new ArithmeticException("Invalid Expression provided:");
        }

        if(input.startsWith("$")){ // for expressions starting with '$' in format of $...$
            int i = 1;
            if(input.endsWith("$")){
                while(i < input.length()){
                    modInput.append(input.charAt(i));
                    i++;
                }
            }
            else{
                throw new IllegalArgumentException("Invalid LATEX argument passed");
            }
        }

        return modInput.toString();
    }
}

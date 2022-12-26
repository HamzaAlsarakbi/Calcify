package com.calckify.calckify.model.Math;

public class Math {
    private String calcInput;
    private StringBuilder modInput;
    private int bracketCount;

    /**
     * Function to format LATEX input into readable input for the compiler
     * @param input String input taking in operations in LATEX format
     * @return
     */
    public String toCalculate(String input){
        input = calcInput;
        bracketCount = 0;

        // check for empty string input, throw exception if empty

        // loop through to count number of opening and closing brackets, bracketCount+=1 for opening brackets, bracketCount-=1 for closing brackets
        // if bracketCount != 0 at end, throw exceptions

        if(input.startsWith("$")){ // for expressions starting with '$' in format of $...$
            modInput.append('(');
            int i = 1;
            int validityBool = 0;
            if(input.endsWith("$")){
                while(i < input.length()){
                    modInput.append(input.charAt(i));
                    i++;
                }
            }
            else{
                validityBool = 1; // throw exceptions here
            }
        }

        return modInput.toString();
    }
}

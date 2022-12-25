package com.calckify.calckify.Math;

public class Math {
    private String calcInput;
    private StringBuilder modInput;

    /**
     * Function to format LATEX input into readable input for the compiler
     * @param input String input taking in operations in LATEX format
     * @return
     */
    public String toCalculate(String input){
        input = calcInput;

        if(input.startsWith("\\(")){ // for expressions starting with '\(' in format of \(...)\
            modInput.append('(');
            int i = 2;
            int validityBool = 0;
            if(input.endsWith(")\\")){
                while(i < input.length()){
                    modInput.append(input.charAt(i));
                    i++;
                }
            }
            else{
                validityBool = 1;
            }
        }
        else if(input.startsWith("$")){ // for expressions starting with '$' in format of $...$
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
                validityBool = 1;
            }
        }
        else if(input.startsWith("\\begin{math}")){ // for expressions starting with '\begin{math}' in format of \begin{math}...\end{math}
            modInput.append('(');
            int i = 12;
            int validityBool = 0;
            if(input.endsWith("\\end{math}")){
                while(i < input.length()){
                    modInput.append(input.charAt(i));
                    i++;
                }
            }
            else{
                validityBool = 1;
            }
        }

        return modInput.toString();
    }
}

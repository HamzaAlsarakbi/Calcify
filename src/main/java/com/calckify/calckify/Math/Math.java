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
            while(!input.endsWith(")\\")){
                if(i >= input.length()){
                    validityBool = 1;
                    break;
                }
                modInput.append(input.charAt(i));
                i++;
            }
        }
        else if(input.startsWith("$")){ // for expressions starting with '$' in format of $...$
            modInput.append('(');
            int i = 1;
            int validityBool = 0;
            while(!input.endsWith("$")){
                if(i >= input.length()){
                    validityBool = 1;
                    break;
                }
                modInput.append(input.charAt(i));
                i++;
            }
        }
        else if(input.startsWith("\\begin{math}")){ // for expressions starting with '\begin{math}' in format of \begin{math}...\end{math}
            modInput.append('(');
            int i = 12;
            int validityBool = 0;
            while(!input.endsWith("\\end{math}")){
                if(i >= input.length()){
                    validityBool = 1;
                    break;
                }
                modInput.append(input.charAt(i));
                i++;
            }
        }

        return modInput.toString();
    }
}

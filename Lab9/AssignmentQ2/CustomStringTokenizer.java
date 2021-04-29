package lab9_assignment_q2;


import java.util.*;

class CustomStringTokenizer extends StringTokenizer{

    private int tokenCount;

    public CustomStringTokenizer(String someString) {
        super(someString);
    }

    public int countTokens(){
        int totalTokens = super.countTokens();
        tokenCount = totalTokens;
        String token;
        int i = 0;
        while(i<totalTokens){
            token = super.nextToken();
            for(int j = 0; j<token.length(); j++){
                if(Character.isDigit(token.charAt(j))){
                    tokenCount--;
                    break;
                }
            }
            i++;
        }
        return tokenCount;
    }
}

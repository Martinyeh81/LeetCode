public class App {
    public static void main(String[] args) throws Exception {
        
        String word1 = "abc";
        String word2 = "pqr";
        
        String answer1 = mergeAlternately(word1, word2);

        System.out.println(answer1);
    
    }



    public static String mergeAlternately(String word1, String word2) {
        
        StringBuilder result = new StringBuilder();
        
        int i =0;
        int j =0;
        int m = word1.length();
        int n = word2.length();

        while (i < m || j< n){
            if (i<m){
                result.append(word1.charAt(i++));
            }
            if (j<n){
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
        
    }
}

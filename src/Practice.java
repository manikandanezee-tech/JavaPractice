import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Practice {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Practice.handCricket();
    }
    public static void reversString(String word){
        System.out.println("Input : "+word);
        char [] arr=word.toCharArray();
        for(int i=0;i<arr.length/2;i++){
    char temp=arr[i];
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=temp;
        }
        System.out.println("Output : "+new String(arr));
    }
    public static void reverseNumber(int num){
        System.out.println("input : "+num);
        int temp=num,reverse=0;
        while(temp!=0){
            reverse=reverse*10+temp%10;
            temp=temp/10;
        }
        System.out.println("output : "+reverse);
    }
    public static boolean isPalindrom(String word){
        System.out.println("Input : "+word);
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        if(word.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void frequencyChar(String word){
        System.out.println("Input : "+word);
        HashMap<Character,Integer>frequency=new HashMap<>();
        for(int i=0;i<word.length();i++){
            frequency.put(word.charAt(i),frequency.getOrDefault(word.charAt(i),0)+1);
        }
        System.out.println("Output : "+frequency);
    }
    public static void firstNonRepeatingChar(String word){
        System.out.println("Input : "+word);
        HashMap<Character, Integer>map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
    for(char c:map.keySet()){
        if(map.get(c)==1){
            System.out.println("Output : "+ c);
            break;
        }
    }
    }
    public static void removeDuplicates(){
        int[] arr={1,1,2,3,4,5,4};
        System.out.println("Input : "+ Arrays.toString(arr));
        Set<Integer>set=new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println("Output : "+set);
    }
    public static void findDuplicate(){
        int[] arr={1,1,2,3,4,5,4};
        System.out.println("Input : "+ Arrays.toString(arr));
        Set<Integer>set=new HashSet<>();
        for(int value:arr){
            if(!set.add(value)){
                System.out.print(value+", ");
            }
        }
    }
    public static void secondLargestElement(){
        int[]arr={10,20,30,50,70,90,40,90};
        int max=Integer.MIN_VALUE,second=arr[0];
        System.out.println("Input : "+Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            else if (arr[i]>second && arr[i]<max) {
                second=arr[i];
            }
        }
        System.out.println("Second largest : "+second);
    }
    public static void countOfMaximumSubArray(){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(max,sum);
        }
        System.out.println("Maximum sub array count : "+ max);
    }

    public static void filterEvenOddNums(){
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,10));
        System.out.println("Input : "+list);
        List<Integer> even=list.stream().filter(n->n%2==0).toList();
        List<Integer> odd=list.stream().filter(n->n%2==1).toList();
        System.out.println("Even Numbers : "+even);
        System.out.println("Odd Numbers : "+odd);
    }
    public static void fibbanoci(){
        System.out.print("Enter nunber: ");
        int a=1,b=-1;

        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            int c=a+b;
            System.out.println(c);
            b=a;
            a=c;
        }
    }
    public static void sorting(){
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,11,5,9,6,10));
        System.out.println("Input : "+list);
        System.out.println("Sum of Array : "+list.stream().reduce(0,(a,b)->a+b));
        System.out.println("Ascending : "+list.stream().sorted().toList());
        System.out.println("Descending : "+list.stream().sorted(Collections.reverseOrder()).toList());
    }
    public static void handCricket(){
        System.out.println("Welcome to Hand Cricket");
        System.out.print("Enter the count of players : ");
        int playerCount=scanner.nextInt();
        int[]score={1,2,3,5,6,0};
        Random random=new Random();
        int teamScore=0;

        for(int i=0;i<playerCount;i++){
            boolean out=false;
            while (!out) {
                System.out.println("-----------------------------------------");
                System.out.println("Current Team Score : "+teamScore);
                int rand= score[random.nextInt(6)];
                System.out.print("Hit the Ball : ");
                int hit = scanner.nextInt();
                System.out.println("Your hit : "+hit);
                System.out.println("Opponent : "+rand);
                if (hit==rand){
                    System.out.println("You'r out....");
                    System.out.println("Team Score : "+teamScore);
                    out=true;
                }
                teamScore+=hit;
                System.out.println("-----------------------------------------");
            }
        }
    }
    public static void freqOfChars(String word){
        Map<Character,Long>map=word.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
    public static void sumOfDiagnal(){
        int[][]arr={{1,5,6},{4,7,9},{12,1,7}};
        int lToR=0,rToL=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    lToR+=arr[i][j];
                }
                if(j==arr[i].length-1-i){
                    rToL+=arr[i][j];
                }
            }
        }
        System.out.println("Input Array : ");
                        for(int[]i:arr){
            System.out.println(Arrays.toString(i));};
        System.out.println("Left to Right : "+lToR);
        System.out.println("Right to Left : "+rToL);
    }
public static void moveZeroToLast(){
        int[]arr={0,2,0,33,0,4,5};
        int index=0;
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr2[index]=arr[i];
            index++;}
        }
    System.out.println("Input : "+ Arrays.toString(arr));
    System.out.println("Output : "+Arrays.toString(arr2));
}
public static void longestSubStrNoRepeatingChars(String word){
    System.out.println("Input : "+word);
    int left=0;
    int max=0;
    Set<Character>set=new HashSet<>();
    for(int right=0;right<word.length();right++){
        while (set.contains(word.charAt(right))){
            set.remove(word.charAt(left));
            left++;
        }
        set.add(word.charAt(right));
        max=Math.max(max,right-left+1);
    }

    System.out.println("Length : "+max);
}
public static void twoSum(){
        int[]arr={1,4,6,5,8,2};
        int target=3;
        Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           int compliment=target-arr[i];
           if(map.containsKey(compliment)){
               System.out.println(map.get(compliment)+", "+i);
               break;
           }
           map.put(arr[i],i);
       }
}
public static boolean anagramCheck(){
        String word1="att";
        String word2="att";
        if(word2.length()!=word1.length()){
            return false;
        }
        else{
            int[]arr=new int[256];
            for (int i=0;i<word1.length();i++){
                arr[word1.charAt(i)]++;
                arr[word2.charAt(i)]--;
            }
            boolean isAnagram=true;
            for(int i=0;i<word1.length();i++){
                if(arr[word1.charAt(i)]!=0){
                    isAnagram=false;
                    return false;
                }

            }
            return true;
        }
}
public static void validParanthesis(){
        String paranthesis="({{[]}})";
        Stack<Character>stack=new Stack<>();
        boolean valid=true;
        for(int i=0;i<paranthesis.length();i++){
            if(paranthesis.charAt(i)=='(' ||paranthesis.charAt(i)=='{' || paranthesis.charAt(i)=='['){
                stack.push(paranthesis.charAt(i));
            }
            else{
                char top=stack.pop();
                if(paranthesis.charAt(i)==')'&& top!='(' ||
                        paranthesis.charAt(i)=='}'&& top!='{' ||
                        paranthesis.charAt(i)==']'&& top!='['){
                    valid=false;
                    break;
                }
            }
            }
    if(!stack.isEmpty()){
        valid=false;

        }
    System.out.println(valid);
}
public static void reverseArray(){
        List<Integer>list=Arrays.asList(16,3,4,7,3,8);
        for(int i=0;i<list.size()/2;i++){
            int temp= list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp);
        }

    System.out.println(list);
}
public static void longestCommonPrefix(){
        String[]arr={"right","rice","rse"};
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
    System.out.println("Longest Common prefix : "+prefix);
}
public static void longestCommonSuffix(){
    String[]arr={"higher","never","over"};
    String suffix=arr[0];
    for(int i=1;i<arr.length;i++){
        while(!arr[i].endsWith(suffix)){

            suffix=suffix.substring(1);
        }
    }
    System.out.println("Longest Common suffix : "+suffix);
}

}

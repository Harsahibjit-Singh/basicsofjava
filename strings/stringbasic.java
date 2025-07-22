package strings;
public class stringbasic{
    public static void main(String args[]){
        String name="Harsahibjit Singh";
        String newname = new String("Jaskirat Singh");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("a"));
        System.out.println(newname);
        StringBuffer str3=new StringBuffer("great");
        StringBuffer str4=new StringBuffer();
        str4.append("new");
        System.out.println(str3);
        System.out.println(str4);
        name="heleh";
        System.out.println(name);
        StringBuilder name2=new StringBuilder("helleh"); 
        StringBuilder name1=new StringBuilder(""); 
        char [] ch = name2.toString().toCharArray();
        for(int i=name2.length()-1;i>=0;i--){
            name1.append(ch[i]);
        }
        System.out.println();
        System.out.println(name1);
        if(name1.toString().equals(name2.toString())){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
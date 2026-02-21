public class ip {
    string res="";
    for(int i=0;i<address.length();i++){
        if(address.charAt(i)=='.'){
            res=res+"[.]";
        }
        else{
            res+="[.]";
        }
    }
}

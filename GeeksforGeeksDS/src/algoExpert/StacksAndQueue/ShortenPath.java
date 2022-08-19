package algoExpert.StacksAndQueue;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ShortenPath {

    public static void main(String[] args) {

        String path = "/foo/../test/../test/../foo//bar/./baz" ;
        String path1 = "/foo/bar/.." ;
        System.out.println(shortenPath(path));
    }


    public static String shortenPath(String path) {

        String[] stringArr = path.split("/");
        boolean isRoot = path.charAt(0) == '/';
        List<String> filteredList = Arrays.stream(stringArr)
                .filter(x->!x.equals("."))
                .filter(x->x.length()>0)
                .collect(Collectors.toList());
        System.out.println(filteredList.toString());
        // edge case
        Stack<String> stack = new Stack<>() ;
        if(isRoot) stack.add("");
        for(String token:filteredList){

            if(token.equals("..")){
                 if(stack.size()==0|| stack.peek().equals("..")){
                     stack.add(token);
                 } else if (!stack.peek().equals("")){
                     stack.pop();
                 }
            } else {
                stack.add(token);
            }
        }

        if(stack.size()==1 && stack.peek().equals("")) return "/";
        return String.join("/",stack);

    }
}

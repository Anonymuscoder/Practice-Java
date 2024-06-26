
//code for demonstrating StringBuffer in Java and implementing different methods

class buffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ramesh");
        System.out.println(sb);
        System.out.println("Capacity of StringBuffer :"+sb.capacity());
        System.out.println(sb.append(" Kumar"));
        System.out.println("After Appending StringBuffer Data with another String: "+ sb);
        System.out.println("Printing the charracter at index 4 in StringBuffer Data: "+sb.charAt(4));
        System.out.println("is StringBuffer Empty? "+sb.isEmpty());
        System.out.println("Inserting String at index 0..");
        System.out.println(sb.insert(0, "Hello "));
    }
}
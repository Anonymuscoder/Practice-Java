//code for demonstrating enum in java
enum Status{
    Running, Failed, Pending, Success;
}

class demo{
    public static void main(String[] args) {
        Status[] s= Status.values();
        for(int i=0;i<s.length; i++){       //accessing constants in Status Class
            System.out.println(s[i]+" : "+s[i].ordinal());
        }
        Status a = Status.Pending;
        switch (a) {        
            case Running:
                System.out.println("Running");
                break;
            
            case Pending:
                System.out.println("Pending,wait");
                break;

            case Failed:
                System.out.println("Failed, please try again"); 
                break;
        
            default:
                System.out.println("Sucessful");
                break;
        }
    }
}

//Program for demonstrating methods in java

class Computer{

    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost){
        if(cost>=10)
            System.out.println("Pen");
        return "Nothing";    
    }
}

class method{
    public static void main(String[] args) {
        
        Computer obj = new Computer();
        obj.playMusic();
        String receive = obj.getMeAPen(15);
        System.out.println(receive); 
    }
}
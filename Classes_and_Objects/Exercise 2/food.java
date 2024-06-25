//FIND TYPES OF FOOD ON THE BASIS OF STICKER

class Supply{
    int code;
    String foodname;
    String sticker;
    String foodtype;

    public void gettype(){
        if(sticker.equals("Green"))
            foodtype="Vegeterian";
        else if(sticker.equals("Yellow"))
            foodtype="Contains Egg";
        else  
            foodtype="Non-Vegeterian";
            
    }

    public void foodIn(int a, String str, String stick){
        code = a;
        foodname = str;
        sticker = stick; 
       gettype();
    }

    public void foodOut(){
        System.out.println("code :"+code+"\n"+"Food Name :"+foodname+"\n"+"Sticker :"+sticker+"\n"+"Food Type :"+foodtype);
    }
}

class food{
    public static void main(String[] args) {
        
        Supply obj = new Supply();
        obj.foodIn(101, "Rice", "Green");
        obj.foodOut();
        
    }
}
    




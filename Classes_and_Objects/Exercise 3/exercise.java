
//FIND RESULT ON THE BASIS OF SCORE


class Candidate{

    int rno;
    String name;
    float score;
    String remarks;

    public void assignrem(){
        if(score>=50)
            remarks = "Selected";
        else
            remarks = "Not Selected";
    }

    public void enter(int n, String str1, float sc){
        rno = n;
        name= str1;
        score= sc;
        assignrem();
    }

    public void display(){
        System.out.println("Roll no :"+rno);
        System.out.println("Name :"+name);
        System.out.println("Score :"+score);
        System.out.println("Remarks :"+remarks);
        System.out.println();
    }


}

class exercise{
    public static void main(String[] args) {
        
        Candidate obj = new Candidate();
        Candidate obj1 = new Candidate();
        Candidate obj2 = new Candidate();

        obj.enter(21,"Harsh", 87 );
        obj.display();

        obj.enter(53,"Ramesh", 75 );
        obj.display();

        obj.enter(22,"Kavita", 90 );
        obj.display();

        Candidate candidates[]= new Candidate[3];
        candidates[0]=obj;
        candidates[1]=obj1;
        candidates[2]=obj2;

        for(int i=0; i<candidates.length; i++){
            System.out.println(candidates);
        }
        
    }
}